package bobble.morethanmojang.datagen;

import bobble.morethanmojang.blocks.ModBlocks;
import bobble.morethanmojang.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BISMUTH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_ENDERITE_S);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_ENDERITE_H);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_BISMUTH);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_AMBER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_TOPAZ);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_JADE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BISMUTH_FRACTURE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BISMUTH_DYE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROUGH_AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_AMBER, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROUGH_TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_TOPAZ, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_CRYSTAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERITE_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_ENDERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOFT_ENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARD_ENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_DYE, Models.GENERATED);
    }
}
