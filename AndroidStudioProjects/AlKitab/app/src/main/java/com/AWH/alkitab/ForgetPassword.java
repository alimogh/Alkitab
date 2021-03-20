package com.AWH.alkitab;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPassword extends AppCompatActivity {
    FirebaseAuth mAuth;
    EditText txtEmail;
    Button btn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        getSupportActionBar().setTitle("");

        mAuth = FirebaseAuth.getInstance();

        txtEmail = (EditText) findViewById(R.id.txtPassword);
        btn = (Button) findViewById(R.id.btn);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgetPassword();
            }
        });
    }
    public void forgetPassword(){
        String email = txtEmail.getText().toString().trim();

        if(email.isEmpty()){
            txtEmail.setError("Enter an email ");
            txtEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            txtEmail.setError("Please enter a valid email address!");
            txtEmail.requestFocus();
            return;
        }
        else{
            progressBar.setVisibility(View.VISIBLE);
            mAuth.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(ForgetPassword.this,"Check your email to reset the password",Toast.LENGTH_LONG).show();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(ForgetPassword.this,"Error "+e.getMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}