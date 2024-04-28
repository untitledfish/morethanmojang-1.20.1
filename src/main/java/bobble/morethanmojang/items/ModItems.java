package bobble.morethanmojang.items;

import bobble.morethanmojang.MoreThanMojang;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //declare items here
    public static final Item BISMUTH_FRACTURE = registerItems("bismuth_fracture", new Item(new FabricItemSettings()));
    public static final Item ROUGH_AMBER = registerItems("rough_amber", new Item(new FabricItemSettings()));
    public static final Item POLISHED_AMBER = registerItems("polished_amber", new Item(new FabricItemSettings()));
    public static final Item ROUGH_TOPAZ = registerItems("rough_topaz", new Item(new FabricItemSettings()));
    public static final Item POLISHED_TOPAZ = registerItems("polished_topaz", new Item(new FabricItemSettings()));
    public static final Item RAW_JADE = registerItems("raw_jade", new Item(new FabricItemSettings()));
    public static final Item JADE_CRYSTAL = registerItems("jade_crystal", new Item(new FabricItemSettings()));
    public static final Item REFINED_ENDERITE = registerItems("refined_enderite", new Item(new FabricItemSettings()));
    public static final Item SOFT_ENDERITE_INGOT = registerItems("enderite_ingot_soft", new Item(new FabricItemSettings()));
    public static final Item HARD_ENDERITE_INGOT = registerItems("enderite_ingot_hard", new Item(new FabricItemSettings()));

    public static final Item BISMUTH_PICKAXE = registerItems("bismuth_pickaxe", new PickaxeItem(ModToolMaterial.BISMUTH,
            4, 3f, new FabricItemSettings()));
    public static final Item BISMUTH_AXE = registerItems("bismuth_axe", new AxeItem(ModToolMaterial.BISMUTH,
            4, 3f, new FabricItemSettings()));
    public static final Item BISMUTH_SHOVEL = registerItems("bismuth_shovel", new ShovelItem(ModToolMaterial.BISMUTH,
            4, 3f, new FabricItemSettings()));
    public static final Item BISMUTH_HOE = registerItems("bismuth_hoe", new HoeItem(ModToolMaterial.BISMUTH,
            4, 3f, new FabricItemSettings()));
    public static final Item BISMUTH_SWORD = registerItems("bismuth_sword", new SwordItem(ModToolMaterial.BISMUTH,
            4, 3f, new FabricItemSettings()));
    public static final Item BISMUTH_LONGSWORD = registerItems("bismuth_longsword", new SwordItem(ModToolMaterial.BISMUTH,
            4, 3f, new FabricItemSettings()));

    private static void addOresToCMenu(FabricItemGroupEntries entries){
        entries.add(BISMUTH_FRACTURE);
        entries.add(ROUGH_AMBER);
        entries.add(POLISHED_AMBER);
        entries.add(ROUGH_TOPAZ);
        entries.add(POLISHED_TOPAZ);
        entries.add(RAW_JADE);
        entries.add(JADE_CRYSTAL);
        entries.add(REFINED_ENDERITE);
        entries.add(SOFT_ENDERITE_INGOT);
        entries.add(HARD_ENDERITE_INGOT);
    }

    private static void addToolsToCMenu(FabricItemGroupEntries entries) {
        entries.add(BISMUTH_SWORD);
        entries.add(BISMUTH_LONGSWORD);
        entries.add(BISMUTH_PICKAXE);
        entries.add(BISMUTH_AXE);
        entries.add(BISMUTH_SHOVEL);
        entries.add(BISMUTH_HOE);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreThanMojang.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreThanMojang.LOGGER.info("Registering Mod Items for " + MoreThanMojang.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addOresToCMenu);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addToolsToCMenu);
    }
}