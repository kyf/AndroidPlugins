package com.kyf.myutil;

import android.content.Context;

/**
 * Created by keyf on 2015/12/24.
 */
public class MyUtil {

    private static float density(Context context){
        return context.getResources().getDisplayMetrics().density;
    }

    public static int dp2px(Context context, int dpvalue){
        float density = MyUtil.density(context);
        return (int) (density * dpvalue + 0.5f);
    }

    public static int px2dp(Context context, int pxvalue){
        float density = MyUtil.density(context);
        return (int) (pxvalue / density + 0.5f);
    }

}
