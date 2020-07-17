package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int num = 0;
    private TextView tvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNum = findViewById(R.id.txtNumDisplay);
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
}