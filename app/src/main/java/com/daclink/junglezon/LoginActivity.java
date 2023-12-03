package com.daclink.junglezon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView mMainDisplay;
    EditText mUsername;
    EditText mPassword;

    Button mLoginButton;

    Button mCreateAccountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mMainDisplay = findViewById(R.id.mainJunglezonDisplay);
        mUsername = findViewById(R.id.mainUsernameEditText);
        mPassword = findViewById(R.id.mainPasswordEditText);
        mLoginButton = findViewById(R.id.mainLoginButton);
        mCreateAccountButton = findViewById(R.id.mainCreateAccountButton);





    }
}