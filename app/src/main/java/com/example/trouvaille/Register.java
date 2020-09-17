package com.example.trouvaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button registerButton;
    private Button switchButton;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;

    public void switchToLogin(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.sharedPreferences),MODE_PRIVATE);
        String emailString = sharedPreferences.getString(getString(R.string.sharedPreferencesEmail),"");
        String passwordString = sharedPreferences.getString(getString(R.string.sharedPreferencesPassword),"");

        if(emailString.equals(""))
        {
            Intent loginIntent = new Intent(Register.this,Login.class);
            loginIntent.putExtra(getString(R.string.notYetRegistered),emailString);
            loginIntent.putExtra(getString(R.string.notYetRegistered),passwordString);
            startActivity(loginIntent);
            finish();
        }
        else
        {
            Intent loginIntent = new Intent(Register.this,Login.class);
            loginIntent.putExtra(getString(R.string.sharedPreferencesEmail),emailString);
            loginIntent.putExtra(getString(R.string.sharedPreferencesPassword),passwordString);
            startActivity(loginIntent);
            finish();

        }


    }

    public void onClickRegister(View view)
    {
          boolean isOk = validate();
          if(isOk)
          {
              SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.sharedPreferences),MODE_PRIVATE);
              SharedPreferences.Editor editor = sharedPreferences.edit();

              editor.putString(getString(R.string.sharedPreferencesEmail),emailEditText.getText().toString());
              editor.putString(getString(R.string.sharedPreferencesPassword),passwordEditText.getText().toString());
              editor.commit();
              Log.i("Email Stored : ",emailEditText.getText().toString());
              Log.i("Password Stored : ",passwordEditText.getText().toString());
              startActivity(new Intent(this,EntertainmentList.class));
              finish();
          }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();

        if(intent.getIntExtra("code",-1)==1)
        {
            checkForPreferences();
        }




        registerButton = (Button)findViewById(R.id.register_button);
        switchButton = (Button)findViewById(R.id.switch_button);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        confirmPasswordEditText = (EditText)findViewById(R.id.confirmPasswordEditText);
        emailEditText = (EditText)findViewById(R.id.emailEditText);



    }

    private void checkForPreferences()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.sharedPreferences),MODE_PRIVATE);
        String emailString = sharedPreferences.getString(getString(R.string.sharedPreferencesEmail),"");
        String passwordString = sharedPreferences.getString(getString(R.string.sharedPreferencesPassword),"");

//        Log.i(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Email : ",emailString);
//        Log.i(">>>>>>>>>>>>>>>>>>>>>>>>>>>>Password : ",passwordString);

        if(!emailString.equals(""))
        {
               Intent loginIntent = new Intent(Register.this,Login.class);
               loginIntent.putExtra(getString(R.string.sharedPreferencesEmail),emailString);
               loginIntent.putExtra(getString(R.string.sharedPreferencesPassword),passwordString);
               startActivity(loginIntent);
               finish();
        }

    }

    private boolean validate()
    {
          String email = emailEditText.getText().toString();
          String password = passwordEditText.getText().toString();
          String confirm = confirmPasswordEditText.getText().toString();

          if(email.equals(""))
          {
              Toast.makeText(this, "Email is mandatory", Toast.LENGTH_LONG).show();
              return false;
          }
          if(password.equals("")||confirm.equals(""))
          {
              Toast.makeText(this, "Password is mandatory", Toast.LENGTH_LONG).show();
              return false;
          }
          else
          {
               if(!password.equals(confirm))
               {
                   Toast.makeText(this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                   passwordEditText.setText("");
                   confirmPasswordEditText.setText("");
                   return false;
               }
          }
          return true;
    }
}