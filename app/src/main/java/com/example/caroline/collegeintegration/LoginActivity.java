package com.example.caroline.collegeintegration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button login, newAccount;
    private EditText username, password;
    private TextView welcome, forgotInfo;
    private CheckBox rememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        wireWidgets();
        userLogin();
    }

    public void wireWidgets(){
        //wires widgets
        login = findViewById(R.id.login_button);
        newAccount = findViewById(R.id.newAccount_button);
        username = findViewById(R.id.username_editText);
        password = findViewById(R.id.password_editText);
        welcome = findViewById(R.id.welcome_textView);
        forgotInfo = findViewById(R.id.forgot_textView);
        rememberMe = findViewById(R.id.rememberMe_checkBox);
    }

    public void userLogin(){
        //happens after user fills out username + password + clicks login button
        //separate b/c not always called --> will want to be checked depending on if checkbox is T/F
        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();
        if(!usernameText.equals("") && !passwordText.equals("")){
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //what should the login button do?
                    //TEMP: brings up HomeActivity (in future have set-up screens)

                }
            });
        }
    }

    public void setOnClicks(){
        //what happens when checkbox is clicked
        rememberMe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //don't open the login page unless signed out

            }
        });

        //what happens when forgot text is clicked
        forgotInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //prompts you to input email
                //TEMP: will display username + password in AlertDialogBox
            }
        });

        //what happens when create new account is clicked
        newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //brings you to Create Account Activity (intent)
                Intent i = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(i);
            }
        });
    }
}
