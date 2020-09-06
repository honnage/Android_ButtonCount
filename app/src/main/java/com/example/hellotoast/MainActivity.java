package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int num = 0;
    private TextView tvNum;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNum = findViewById(R.id.txtNumDisplay);
        if (savedInstanceState != null){
            if(savedInstanceState.getBoolean("RESUME") == true){
                num = savedInstanceState.getInt("COUNT");
                String strNum = Integer.toString(num);
                tvNum.setText(strNum);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        if (num != 0 ){
            outState.putInt("COUNT",num);
            outState.putBoolean("RESUME",true);
        }
    }

    public void showMessage(View v) {
        Toast t = Toast.makeText(this,"Hello Passakorn!!",Toast.LENGTH_LONG);
        t.show();
    }

    public void countUp(View v) {
        String strNum;
        num++;
        strNum = Integer.toString(num);
        tvNum.setText(strNum);
    }

    public void countDown(View v) {
        String strNum;
        num--;
        strNum = Integer.toString(num);
        tvNum.setText(strNum);
    }

    public void reset(View v){
        String strNum;
        num = 0;
        strNum = Integer.toString(num);
        tvNum.setText(strNum);
    }
}