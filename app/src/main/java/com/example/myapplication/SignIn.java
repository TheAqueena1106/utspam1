package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    Button signUpButton = findViewById(R.id.signUpButton);
signUpButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Navigate to sign-up activity (implementation details explained later)
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    });

}