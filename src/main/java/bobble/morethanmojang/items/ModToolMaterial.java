package bobble.morethanmojang.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    BISMUTH(5, 1700, 17, 10.0f, 4.5f,
            () -> Ingredient.ofItems(ModItems.BISMUTH_FRACTURE));

    private final int miningLevel;
    private final int itemDurability;
    private final int enchantability;
    private final float miningSpeed;
    private final float attackDamage;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, int enchantability, float miningSpeed, float attackDamage, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.enchantability = enchantability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
