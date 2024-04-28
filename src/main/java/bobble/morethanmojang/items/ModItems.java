package bobble.morethanmojang.items;

import bobble.morethanmojang.MoreThanMojang;
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
    // need to be changed to block: public static final Item BISMUTH_ORE = registerItems(new Item(new FabricItemSettings()), "bismuth_ore");
    public static final Item BISMUTH_FRACTURE = registerItems("bismuth_fracture", new Item(new FabricItemSettings()));
    public static final Item ROUGH_AMBER = registerItems("rough_amber", new Item(new FabricItemSettings()));
    public static final Item POLISHED_AMBER = registerItems("polished_amber", new Item(new FabricItemSettings()));
    public static final Item ROUGH_TOPAZ = registerItems("rough_topaz", new Item(new FabricItemSettings()));
    public static final Item POLISHED_TOPAZ = registerItems("polished_topaz", new Item(new FabricItemSettings()));
    public static final Item RAW_JADE = registerItems("raw_jade", new Item(new FabricItemSettings()));
    public static final Item JADE_CRYSTAL = registerItems("jade_crystal", new Item(new FabricItemSettings()));
    // need to be changed to block: public static final Item ENDERITE_ORE = registerItems(new Item(new FabricItemSettings()), "enderite_ore");
    public static final Item REFINED_ENDERITE = registerItems("refined_enderite", new Item(new FabricItemSettings()));
    public static final Item SOFT_ENDERITE_INGOT = registerItems("enderite_ingot_soft", new Item(new FabricItemSettings()));
    public static final Item HARD_ENDERITE_INGOT = registerItems("enderite_ingot_hard", new Item(new FabricItemSettings()));

    private static void addOresToCMenu(FabricItemGroupEntries entries){
        // need to be changed to block: entries.add(BISMUTH_ORE);
        entries.add(BISMUTH_FRACTURE);
        entries.add(ROUGH_AMBER);
        entries.add(POLISHED_AMBER);
        entries.add(ROUGH_TOPAZ);
        entries.add(POLISHED_TOPAZ);
        entries.add(RAW_JADE);
        entries.add(JADE_CRYSTAL);
        // need to be changed to block: entries.add(ENDERITE_ORE);
        entries.add(REFINED_ENDERITE);
        entries.add(SOFT_ENDERITE_INGOT);
        entries.add(HARD_ENDERITE_INGOT);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreThanMojang.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreThanMojang.LOGGER.info("Registering Mod Items for " + MoreThanMojang.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addOresToCMenu);
    }
}