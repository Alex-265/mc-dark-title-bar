package at.alex.darkwindowtitle.client;

import com.sun.jna.Platform;
import com.sun.jna.platform.win32.WinDef;

public class DarkUtils {
    private static final int DWMWA_USE_IMMERSIVE_DARK_MODE = 20;
    public static void enableImmersiveDarkMode(long i_hwnd, boolean enabled) {
        if (!isCompatible()) {
            DarkWindowTitleClient.logger.info("Dark title bar is not compatible.");
            return;
        }
        int useImmersiveDarkMode = enabled ? 1 : 0;
        WinDef.HWND hWnd = new WinDef.HWND(com.sun.jna.Pointer.createConstant((int) i_hwnd));
        Dwmapi.INSTANCE.DwmSetWindowAttribute(hWnd, 20, new int[]{useImmersiveDarkMode}, Integer.BYTES);
    }

    public static boolean isCompatible() {
        if(!Platform.isWindows()) {
            DarkWindowTitleClient.logger.warn("Not windows");
            return false;
        }
        if(!WindowsVersionHelper.isWindows11Build22000OrHigher()) {
            DarkWindowTitleClient.logger.warn("At least win 11 build 22000 is required for dark window title bars.");
            return false;
        }
        return true;
    }
}
