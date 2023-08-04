package net.crackle.baguette;

import net.crackle.baguette.init.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baguette implements ModInitializer {

	public static final String MOD_ID = "baguette";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized La Baguette");

		ModItems.init();
	}
}
