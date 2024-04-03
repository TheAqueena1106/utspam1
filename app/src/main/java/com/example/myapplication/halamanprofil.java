package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class halamanprofil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanprofil);
    }
    public class HomeActivity extends AppCompatActivity {

        private TextView nameTextView;
        private TextView emailTextView;
        private ImageView profileImageView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            nameTextView = findViewById(R.id.nameTextView);
            emailTextView = findViewById(R.id.emailTextView);
            profileImageView = findViewById(R.id.profileImageView);

            // Dapatkan data user dari Shared Preferences
            SharedPreferences sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);
            String name = sharedPreferences.getString("name", "");
            String email = sharedPreferences.getString("email", "");
            String profilePicPath = sharedPreferences.getString("profile_pic_path", "");

            // Tampilkan data user
            nameTextView.setText(name);
            emailTextView.setText(email);
            if (!profilePicPath.isEmpty()) {
                profileImageView.setImageBitmap(BitmapFactory.decodeFile(profilePicPath));
            }
        }
    }

}