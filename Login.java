package com.example.helpinghands;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private EditText email,password;
    private Button login;
    private TextView register;
    private FirebaseAuth mAuth;
    //private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressDialog loginDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=(EditText)findViewById(R.id.editText_username);
        password=(EditText)findViewById(R.id.editText_adminPassword);
        login=(Button)findViewById(R.id.btlogin);
        register=(TextView)findViewById(R.id.newUser);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openold1();
            }
        });
        register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openold2();
            }
        });
        mAuth=FirebaseAuth.getInstance();
    }

        public void openold1()
        {
            Intent i=new Intent(Login.this,MainActivity.class);
            startActivity(i);
        }
    public void openold2()
    {
        Intent i=new Intent(Login.this,Register.class);
        startActivity(i);
    }


    public void login(View view) {

        loginDialog.setMessage("you can login until ur verified");
        loginDialog.show();

        mAuth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful()) {

                        loginDialog.dismiss();

                        Toast.makeText(Login.this, "Login successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this,MainActivity.class));
                    }
                    else
                    {
                        Toast.makeText(Login.this, "Login failed", Toast.LENGTH_SHORT).show();

                    }
                }


        });


    }


   // public void register(View view) {
    //    startActivity(new Intent(Login.this,Register.class));
    //    finish();

    //}
}
