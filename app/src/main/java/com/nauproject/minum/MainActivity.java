package com.nauproject.minum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonKeSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonKeSetting = findViewById(R.id.buttonKeSetting);
        this.buttonKeSetting.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, PengingatMinum.class);
        startActivity(intent);
    }
}