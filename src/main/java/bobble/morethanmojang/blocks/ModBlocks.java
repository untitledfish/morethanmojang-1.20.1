package bobble.morethanmojang.blocks;

import bobble.morethanmojang.MoreThanMojang;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block BISMUTH_ORE = registerBlock("bismuth_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block BLOCK_ENDERITE_H = registerBlock("hard_enderite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BLOCK_ENDERITE_S = registerBlock("soft_enderite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block BLOCK_BISMUTH = registerBlock("bismuth_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block BLOCK_AMBER = registerBlock("amber_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block BLOCK_TOPAZ = registerBlock("topaz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BLOCK_JADE = registerBlock("jade_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MoreThanMojang.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, new Identifier(MoreThanMojang.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {}
}