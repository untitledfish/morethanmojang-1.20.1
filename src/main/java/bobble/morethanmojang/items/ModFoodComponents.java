package bobble.morethanmojang.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent EXAMPLE = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300),.40f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 100), .90f)
            .build();
}
