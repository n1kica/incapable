package com.nikica.incapable;

import com.nikica.incapable.event.ModEvents;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.LoggerFactory;

@Mod(Incapable.MOD_ID)
public class Incapable
{
    public static final String MOD_ID = "incapable";

    public Incapable(@NotNull IEventBus bus) {
        NeoForge.EVENT_BUS.addListener(ModEvents::onIncapable);
    }
}
