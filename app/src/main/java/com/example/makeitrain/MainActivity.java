package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Button makeItRain;
    private Button showInfo;
    private TextView moneyValue;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

//        makeItRain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
//                moneyCounter += 1000;
//                moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
//                Log.d("MIR", "onClick: " + moneyCounter);
//            }
//        });

    }

    public void makeItRain(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 2000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
    }

    public void showInfo(View view) {

    }
}