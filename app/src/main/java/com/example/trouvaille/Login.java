package com.example.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private String emailString;
    private String passwordString;

    public void switchToRegister(View view)
    {
           Intent intent = new Intent(Login.this,Register.class);
           intent.putExtra("code",2);
           startActivity(intent);
           finish();
    }

    public void onClickLogin(View view)
    {


              if(!emailString.equals(emailEditText.getText().toString()) || !passwordString.equals(passwordEditText.getText().toString()))
              {
                  emailEditText.setText("");
                  passwordEditText.setText("");
                  Toast.makeText(this, "Invalid Email-Password Pair", Toast.LENGTH_LONG).show();
              }
              else
              {
                  startActivity(new Intent(Login.this,EntertainmentList.class));
                  finish();
              }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = (EditText)findViewById(R.id.emailEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);

        Intent intent = getIntent();
         emailString = intent.getStringExtra(getString(R.string.sharedPreferencesEmail));
         passwordString = intent.getStringExtra(getString(R.string.sharedPreferencesPassword));

         if(!emailString.equals(R.string.notYetRegistered)) {

             emailEditText.setText(emailString);
         }

    }
}