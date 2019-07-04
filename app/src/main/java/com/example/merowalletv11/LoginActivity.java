package com.example.merowalletv11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    void validate(View view){
        String username = "admin";
        String password = "admin";
        EditText pass=findViewById(R.id.pass);
        EditText user=findViewById(R.id.username);
        String users= user.getText().toString();
        String passs= pass.getText().toString();
        if(users.equals(username)&&passs.equals(password)){
            Intent in = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(in);
            finish();
        }
        else{
            Toast.makeText(this,"Invalid Credentials!",Toast.LENGTH_SHORT).show();
        }}

    void validate1(View view){
        Intent in = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(in);
        finish();
    }

}
