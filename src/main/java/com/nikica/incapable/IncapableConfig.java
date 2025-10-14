package com.nikica.incapable;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class IncapableConfig {
    public static final IncapableConfig CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<IncapableConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(IncapableConfig::new);
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ModConfigSpec.DoubleValue damagePlayer;

    private IncapableConfig(ModConfigSpec.Builder builder) {
        builder.comment("Incapable Settings").push("damage");

        damagePlayer = builder
                .comment("Amount of damage taken when unequipped",
                        "Default: 1.0")
                .defineInRange("damage_player", 1.0, 0.0, 20.0);

        builder.pop();
    }
}
