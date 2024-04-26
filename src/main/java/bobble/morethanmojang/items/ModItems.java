package bobble.morethanmojang.items;

import bobble.morethanmojang.MoreThanMojang;
import bobble.morethanmojang.MoreThanMojang;
import bobble.morethanmojang.items.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //declare items here
    public static final Item EXAMPLE = registerItems(new Item(new FabricItemSettings()), "Example");
    public static final Item EXAMPLE_FOOD = registerItems(new Item(new FabricItemSettings()
            .food(ModFoodComponents.EXAMPLE)), "bottled_cum");

    public static void addItemsToCMenu(FabricItemGroupEntries entries){
        entries.add(EXAMPLE);
    }

    public static <T extends Item> T registerItems (T item, String ID) {
        Identifier itemID = new Identifier(MoreThanMojang.MOD_ID, ID);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void registerModItems() {
        MoreThanMojang.LOGGER.info("Registering Mod Items for " + MoreThanMojang.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCMenu);
    }
}