package com.jasjotsingh.a2colors1textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSignUp = findViewById(R.id.tvSignUp);
        String text = "<font color=#ffffff>Don`t have an account?</font> <font color=#53FFC4>Sign Up</font>";
        tvSignUp.setText(Html.fromHtml(text));
    }
}
