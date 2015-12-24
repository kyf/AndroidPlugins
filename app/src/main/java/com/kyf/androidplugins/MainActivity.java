package com.kyf.androidplugins;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


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

                break;
            }
        }
    }


}
