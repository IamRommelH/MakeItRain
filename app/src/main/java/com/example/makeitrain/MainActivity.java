package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;


import com.example.makeitrain.databinding.ActivityMainBinding;
import com.example.makeitrain.model.question;
import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private question[] questionBank = new question[] {
            //create/instantiate question objects
            new question(R.string.question_amendments, false), //correct: 27
            new question(R.string.question_constitution, true),
            new question(R.string.question_declaration, true),
            new question(R.string.question_independence_rights, true),
            new question(R.string.question_religion, true),
            new question(R.string.question_government, false),
            new question(R.string.question_government_feds, false),
            new question(R.string.question_government_senators, true),
            //and add more!
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.questionTextView.setText(questionBank[0].getAnswerResId());
    }
}