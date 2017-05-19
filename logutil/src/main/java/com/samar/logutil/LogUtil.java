package com.samar.logutil;

/**
 * Created by samar on 19/05/17.
 */

public class LogUtil {

    private static final boolean isDebug = BuildConfig.BUILD_TYPE.equalsIgnoreCase("debug");

    public static void i(String tag, String string) {
        if (isDebug) android.util.Log.i(tag, string);
    }
    public static void e(String tag, String string) {
        if (isDebug) android.util.Log.e(tag, string);
    }
    public static void d(String tag, String string) {
        if (isDebug) android.util.Log.d(tag, string);
    }
    public static void v(String tag, String string) {
        if (isDebug) android.util.Log.v(tag, string);
    }
    public static void w(String tag, String string) {
        if (isDebug) android.util.Log.w(tag, string);
    }
}
