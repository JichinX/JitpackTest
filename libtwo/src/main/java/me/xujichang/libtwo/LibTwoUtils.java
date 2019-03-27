package me.xujichang.libtwo;

import android.content.Context;
import android.widget.Toast;

/**
 * Des:JitpackTest - me.xujichang.libtwo
 *
 * @author xujichang
 * @date 2019-03-27 - 12:54
 * <p>
 * modify:
 */
public class LibTwoUtils {
    public void showMsg(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
