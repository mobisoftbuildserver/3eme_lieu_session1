package com.orange.thirdplace.applicationtest;

import android.annotation.TargetApi;
import android.content.Intent;
import android.hardware.ConsumerIrManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_test){
           /*ConsumerIrManager manager = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);
           if(Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT){
               Toast.makeText(this,"api non dispo",Toast.LENGTH_SHORT).show();
           }
            else if (!manager.hasIrEmitter()) {
               Toast.makeText(this,"ir non dispo",Toast.LENGTH_SHORT).show();
           }*/
            startActivity(new Intent(getApplicationContext(),ActivityEnd.class));
        }
    }

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_test);
        btn.setOnClickListener(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
