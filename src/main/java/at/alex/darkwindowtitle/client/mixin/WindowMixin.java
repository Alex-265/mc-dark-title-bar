package at.alex.darkwindowtitle.client.mixin;


import at.alex.darkwindowtitle.client.DarkUtils;
import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class WindowMixin {
    @Inject(method = "setWindowActive", at = @At("HEAD"))
    public void win_act(boolean bl, CallbackInfo ci) {
        Long window = Minecraft.getInstance().getWindow().getWindow();
        int windowId = (int) GLFWNativeWin32.glfwGetWin32Window(window);

        DarkUtils.enableImmersiveDarkMode(windowId, true);
    }
}
