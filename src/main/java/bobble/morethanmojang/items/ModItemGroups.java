package bobble.morethanmojang.items;

import bobble.morethanmojang.MoreThanMojang;
import bobble.morethanmojang.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup EXAMPLE_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreThanMojang.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.example_items"))
                    .icon(() -> new ItemStack(ModItems.BISMUTH_FRACTURE)).entries((displayContext, entries)
                            -> {
                        entries.add(ModBlocks.BISMUTH_ORE);
                        entries.add(ModItems.BISMUTH_FRACTURE);
                        entries.add(ModItems.BISMUTH_DYE);
                        entries.add(ModItems.ROUGH_AMBER);
                        entries.add(ModItems.POLISHED_AMBER);
                        entries.add(ModItems.ROUGH_TOPAZ);
                        entries.add(ModItems.POLISHED_TOPAZ);
                        entries.add(ModItems.RAW_JADE);
                        entries.add(ModItems.JADE_CRYSTAL);
                        entries.add(ModBlocks.ENDERITE_ORE);
                        entries.add(ModItems.ENDERITE_FRAGMENT);
                        entries.add(ModItems.REFINED_ENDERITE);
                        entries.add(ModItems.SOFT_ENDERITE_INGOT);
                        entries.add(ModItems.HARD_ENDERITE_INGOT);
                        entries.add(ModItems.ENDERITE_DYE);

                        entries.add(ModItems.BISMUTH_SWORD);
                        entries.add(ModItems.BISMUTH_LONGSWORD);
                        entries.add(ModItems.BISMUTH_PICKAXE);
                        entries.add(ModItems.BISMUTH_AXE);
                        entries.add(ModItems.BISMUTH_SHOVEL);
                        entries.add(ModItems.BISMUTH_HOE);

                        entries.add(ModItems.BISMUTH_HELMET);
                        entries.add(ModItems.BISMUTH_CHESTPLATE);
                        entries.add(ModItems.BISMUTH_LEGGINGS);
                        entries.add(ModItems.BISMUTH_BOOTS);
                    }).build());

    public static void registerItemGroups(){
        MoreThanMojang.LOGGER.info("Registering Item Groups for " + MoreThanMojang.MOD_ID);
    }
}