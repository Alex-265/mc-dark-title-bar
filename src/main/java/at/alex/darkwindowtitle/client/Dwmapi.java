package at.alex.darkwindowtitle.client;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.W32APIOptions;

public interface Dwmapi extends com.sun.jna.Library {
    Dwmapi INSTANCE = Native.load("dwmapi", Dwmapi.class, W32APIOptions.DEFAULT_OPTIONS);

    int DwmSetWindowAttribute(WinDef.HWND hwnd, int attr, int[] attrValue, int attrSize);
}
