package com.nikica.incapable.config;

import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public class IncapableConfig {
    public static final ModConfigSpec serverConfig;
    public static final ConfigValue<Boolean> damagePlayer;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();
        damagePlayer = builder.comment("Enable Damage?").define("damage_player", true);
        serverConfig = builder.build();
    }
}
