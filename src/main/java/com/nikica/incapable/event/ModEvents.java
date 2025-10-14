package com.nikica.incapable.event;

import com.nikica.incapable.IncapableConfig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;


public class ModEvents {
    public static void onIncapable(PlayerEvent.BreakSpeed event) {
        Player entity = event.getEntity();
        if (entity == null || entity instanceof FakePlayer || entity.isCreative()) {
            return;
        }

        Level level = entity.level();
        BlockState blockState = event.getState();
        ItemStack item = entity.getMainHandItem();
        float destroySpeed = blockState.getDestroySpeed(level, event.getPosition().get());

        if (destroySpeed >= 1.25F) {
            boolean hasCorrectTool = item.isCorrectToolForDrops(blockState);
            boolean emptyHand = item.isEmpty();
            boolean hasDigAbility = item.canPerformAction(ItemAbilities.AXE_DIG) ||
                                    item.canPerformAction(ItemAbilities.PICKAXE_DIG);

            if (blockState.requiresCorrectToolForDrops()) {
                if (hasCorrectTool) {
                    return;
                }
                if (emptyHand) {
                    entity.hurt(level.damageSources().generic(), IncapableConfig.CONFIG.damagePlayer.get().floatValue() * 2);
                }
            } else {
                if (hasCorrectTool || hasDigAbility) {
                    return;
                }
                if (emptyHand) {
                    entity.hurt(level.damageSources().generic(), (float)IncapableConfig.CONFIG.damagePlayer.get().floatValue());
                }
            }

            event.setCanceled(true);
        }
    }
}
