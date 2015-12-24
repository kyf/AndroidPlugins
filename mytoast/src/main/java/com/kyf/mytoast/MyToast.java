package com.kyf.mytoast;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

//import com.kyf.myutil.MyUtil;

/**
 * Created by keyf on 2015/12/24.
 */
public class MyToast {

    private static Toast wrapToast(Context context, String msg, int duration){
        Toast myToast = new Toast(context);
        TextView textView = new TextView(context);
        textView.setText(msg);
        myToast.setDuration(duration);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(18);
        myToast.setView(textView);
        textView.setBackground(context.getDrawable(R.drawable.corner));
        //myToast.setGravity(Gravity.TOP, 0, MyUtil.dp2px(context, 120));
        myToast.setGravity(Gravity.TOP, 0,120);
        return myToast;
    }

    public static Toast makeText(Context context, int msg, int duration){
        return wrapToast(context, context.getString(msg), duration);
    }

    public static Toast makeText(Context context, String msg, int duration){
        return wrapToast(context, msg, duration);
    }

}
