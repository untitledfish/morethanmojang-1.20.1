package bobble.morethanmojang;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreThanMojang implements ModInitializer {
	public static final String MOD_ID = "morethanmojang";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting More Than Mojang");
	}
}