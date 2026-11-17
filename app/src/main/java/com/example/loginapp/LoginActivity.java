package com.example.loginapp;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilEmail, tilPassword;
    private TextInputEditText etEmail, etPassword;

    // Credenciales de prueba
    private static final String USER_OK = "admin@test.com";
    private static final String PASS_OK = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tilEmail = findViewById(R.id.tilEmail);
        tilPassword = findViewById(R.id.tilPassword);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        MaterialButton btnLogin = findViewById(R.id.btnLogin);
        TextView tvForgot = findViewById(R.id.tvForgot);
        TextView tvRegister = findViewById(R.id.tvRegister);

        btnLogin.setOnClickListener(v -> attemptLogin());

        tvForgot.setOnClickListener(v ->
                Toast.makeText(this, "Recuperar contraseña", Toast.LENGTH_SHORT).show());

        tvRegister.setOnClickListener(v ->
                Toast.makeText(this, "Ir a registro", Toast.LENGTH_SHORT).show());
    }

    private void attemptLogin() {
        tilEmail.setError(null);
        tilPassword.setError(null);

        String email = etEmail.getText() == null ? "" : etEmail.getText().toString().trim();
        String pass = etPassword.getText() == null ? "" : etPassword.getText().toString();

        boolean valid = true;

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            tilEmail.setError("Correo inválido");
            valid = false;
        }
        if (pass.length() < 6) {
            tilPassword.setError("Mínimo 6 caracteres");
            valid = false;
        }
        if (!valid) return;

        if (email.equals(USER_OK) && pass.equals(PASS_OK)) {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra("email", email);
            startActivity(intent);
            finish();
        } else {
            tilPassword.setError("Correo o contraseña incorrectos");
        }
    }
}