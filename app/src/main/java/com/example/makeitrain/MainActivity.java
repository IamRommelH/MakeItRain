package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.graphics.Color;
import android.hardware.input.InputManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.makeitrain.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
//    private EditText enterAny;
//    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        enterAny = findViewById(R.id.txt_input);
//        display = findViewById(R.id.txt_display);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);
            }
        });
    }

    public void play(View view) {
//        display.setText(enterAny.getText().toString().trim());
//        display.setVisibility(View.VISIBLE);
        binding.txtDisplay.setText(binding.txtInput.getText().toString().trim());
        binding.txtDisplay.setVisibility(View.VISIBLE);

        //Hide Keyboard
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}