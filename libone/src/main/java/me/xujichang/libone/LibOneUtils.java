package me.xujichang.libone;

import android.content.Context;
import android.widget.Toast;

/**
 * Des:JitpackTest - me.xujichang.libone
 *
 * @author xujichang
 * @date 2019-03-27 - 12:53
 * <p>
 * modify:
 */
public class LibOneUtils {
    public void showMsg(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
