package at.alex.darkwindowtitle.client;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkWindowTitleClient implements ClientModInitializer {
    public static final String MODID = "darkwindowtitle";
    public static Logger logger = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitializeClient() {
    }
}
