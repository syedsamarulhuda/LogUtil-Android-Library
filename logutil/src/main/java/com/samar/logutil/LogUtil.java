package com.samar.logutil;

/**
 * Created by samar on 19/05/17.
 */

public class LogUtil {


    public static void i(boolean isDebug,String tag, String string) {
        if (isDebug) android.util.Log.i(tag, string);
    }
    public static void e(boolean isDebug,String tag, String string) {
        if (isDebug) android.util.Log.e(tag, string);
    }
    public static void d(boolean isDebug,String tag, String string) {
        if (isDebug) android.util.Log.d(tag, string);
    }
    public static void v(boolean isDebug,String tag, String string) {
        if (isDebug) android.util.Log.v(tag, string);
    }
    public static void w(boolean isDebug,String tag, String string) {
        if (isDebug) android.util.Log.w(tag, string);
    }
}
