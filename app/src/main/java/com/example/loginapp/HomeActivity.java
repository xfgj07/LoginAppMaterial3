package com.example.loginapp;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView tvUser = findViewById(R.id.tvUser);
        MaterialButton btnLogout = findViewById(R.id.btnLogout);

        String email = getIntent().getStringExtra("email");
        tvUser.setText(email);

        btnLogout.setOnClickListener(v -> {
            startActivity(new android.content.Intent(this, LoginActivity.class));
            finish();
        });
    }
}