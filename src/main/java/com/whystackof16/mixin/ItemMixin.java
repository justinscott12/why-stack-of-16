package com.whystackof16.mixin;

import net.minecraft.world.item.ItemInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// In 26.2 the max stack size lives on the ItemInstance interface (a default
// method backed by the MAX_STACK_SIZE data component), not on ItemStack.
@Mixin(ItemInstance.class)
public interface ItemMixin {

    @Inject(method = "getMaxStackSize", at = @At("RETURN"), cancellable = true)
    private void increaseStackSize(CallbackInfoReturnable<Integer> cir) {
        // If the item normally stacks to 16, make it stack to 64
        if (cir.getReturnValue() == 16) {
            cir.setReturnValue(64);
        }
    }
}
