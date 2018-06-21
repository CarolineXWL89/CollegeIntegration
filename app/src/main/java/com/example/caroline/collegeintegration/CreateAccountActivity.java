package com.example.caroline.collegeintegration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    private Button createAccount;
    private EditText firstName, mi, lastName, username, email, password, confirmPass;
    private CheckBox termsConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        wireWidgets();
        setOnClickListeners();
    }

    public void wireWidgets(){
        //wires widgets
        createAccount = findViewById(R.id.createAccount_button);
        firstName = findViewById(R.id.firstName_editText);
        mi = findViewById(R.id.mi_editText);
        lastName = findViewById(R.id.lastName_editText);
        username = findViewById(R.id.username_editText);
        email = findViewById(R.id.email_editText);
        password = findViewById(R.id.password_editText);
        confirmPass = findViewById(R.id.confirm_editText);
        termsConditions = findViewById(R.id.terms_checkBox);
    }

    public void setOnClickListeners(){
        //sets onClickListeners

        termsConditions.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //sets what happens when terms + conditions is checked
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adds information provided earlier in login to Backendless + creates account
                //TEMP: does not check if account is already taken
                //FUTURE: will send email @email given to verify account

                //final step --> brings back to login screen
                Intent i = new Intent(CreateAccountActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}
