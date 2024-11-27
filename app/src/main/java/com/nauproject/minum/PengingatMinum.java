package com.nauproject.minum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class PengingatMinum extends AppCompatActivity {

    private Button btTampilkan;
    private ImageButton btTambah;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pengingat_minum);

        btTampilkan = findViewById(R.id.btTampilkan);
        btTambah = findViewById(R.id.btTambah);

        this.fm = getSupportFragmentManager();

        btTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction()
                        .replace(R.id.container_frag, new ReminderFragment())
                        .commit();
            }
        });
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction()
                        .replace(R.id.container_frag, new AddPengingatFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}

