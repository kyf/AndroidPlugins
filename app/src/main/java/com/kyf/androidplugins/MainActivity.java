package com.kyf.androidplugins;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kyf.mytoast.MyToast;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        Button mytoast = (Button) findViewById(R.id.mytoastbt);

        mytoast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.mytoastbt:{
                MyToast.makeText(this, R.string.toast_show_text, Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }


}
