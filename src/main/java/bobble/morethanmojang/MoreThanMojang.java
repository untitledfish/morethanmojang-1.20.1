package bobble.morethanmojang;

import bobble.morethanmojang.blocks.ModBlocks;
import bobble.morethanmojang.items.ModItemGroups;
import bobble.morethanmojang.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreThanMojang implements ModInitializer {
	public static final String MOD_ID = "morethanmojang";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting More Than Mojang");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}