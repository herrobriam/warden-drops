package net.herrobriam.wardendrops;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WardenDrops implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("warden-drops");

	@Override
	public void onInitialize() {
		LOGGER.info("Modifying the Warden's loot table...");
	}
}