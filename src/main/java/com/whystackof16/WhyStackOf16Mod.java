package com.whystackof16;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhyStackOf16Mod implements ModInitializer {
    public static final String MOD_ID = "why-stack-of-16";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Why Stack of 16? mod initialized! Items that stack to 16 will now stack to 64.");
    }
}
