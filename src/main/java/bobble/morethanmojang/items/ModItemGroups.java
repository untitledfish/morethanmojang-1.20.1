package bobble.morethanmojang.items;

import bobble.morethanmojang.MoreThanMojang;
import bobble.morethanmojang.blocks.ModBlocks;
import bobble.morethanmojang.MoreThanMojang;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup EXAMPLE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreThanMojang.MOD_ID, "exampleGroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.example_items"))
                    .icon(() -> new ItemStack(ModItems.EXAMPLE)).entries((displayContext, entries)
                            -> {
                        entries.add(ModItems.EXAMPLE);
                        entries.add(ModBlocks.EXAMPLE_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        MoreThanMojang.LOGGER.info("Registering Item Groups for " + MoreThanMojang.MOD_ID);
    }
}