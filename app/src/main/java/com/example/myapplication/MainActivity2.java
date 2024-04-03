package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
   TextView forgotPasswordTextView;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    usernameEditText = findViewById(R.id.usernameEditText);
    passwordEditText = findViewById(R.id.passwordEditText);
    loginButton = findViewById(R.id.loginButton);
    forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);
}
if (username.isEmpty() || password.isEmpty()) {
        Toast.makeText(LoginActivity.this, "Username atau password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        return; // Mencegah eksekusi logika login lebih lanjut
    }
if (username.isEmpty() || password.isEmpty()) {
        Toast.makeText(LoginActivity.this, "Username atau password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        return; // Mencegah eksekusi logika login lebih lanjut
    }

}