package bobble.morethanmojang.datagen;

import bobble.morethanmojang.blocks.ModBlocks;
import bobble.morethanmojang.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> BISMUTH_ORES = List.of(ModBlocks.BISMUTH_ORE);
    private static final List<ItemConvertible> ENDERITE_ORES = List.of(ModBlocks.ENDERITE_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_AMBER,
                RecipeCategory.DECORATIONS, ModBlocks.BLOCK_AMBER);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_TOPAZ,
                RecipeCategory.DECORATIONS, ModBlocks.BLOCK_TOPAZ);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE_CRYSTAL,
                RecipeCategory.DECORATIONS, ModBlocks.BLOCK_JADE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BISMUTH_FRACTURE,
                RecipeCategory.DECORATIONS, ModBlocks.BLOCK_BISMUTH);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_ENDERITE_S, 1)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .input('S', ModItems.SOFT_ENDERITE_INGOT)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(ModItems.SOFT_ENDERITE_INGOT), conditionsFromItem(ModItems.SOFT_ENDERITE_INGOT))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLOCK_ENDERITE_S)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_ENDERITE_H, 1)
                .pattern("HHH")
                .pattern("HNH")
                .pattern("HHH")
                .input('H', ModItems.HARD_ENDERITE_INGOT)
                .input('N', Items.NETHERITE_SCRAP)
                .criterion(hasItem(ModItems.HARD_ENDERITE_INGOT), conditionsFromItem(ModItems.HARD_ENDERITE_INGOT))
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLOCK_ENDERITE_H)));
    }
}
