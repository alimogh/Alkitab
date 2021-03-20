package com.AWH.alkitab;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class Login extends AppCompatActivity {
    TextView txt1,txt2;
    Button btn1;
    EditText txtEmail,txtPassword;


    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};
    int [] chapterTotal = {30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30};


    String userID;
    public static final String TAG = "TAG ";

    ProgressBar progressBar;

    private ProgressDialog progressDialog;

    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();


        progressDialog = new ProgressDialog(this);


        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


        txt1 = findViewById(R.id.txt1);
        String forgetPass = "Forget Password";
        SpannableString ss1 = new SpannableString(forgetPass);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(Login.this,ForgetPassword.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.parseColor("#228b22"));
                ds.setUnderlineText(false);
            }
        };
        ss1.setSpan(clickableSpan1,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt1.setText(ss1);
        txt1.setMovementMethod(LinkMovementMethod.getInstance());

        txt2 = findViewById(R.id.txt2);
        String registerNow = "Don't have an account? Register Now";
        SpannableString ss2 = new SpannableString(registerNow);
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.parseColor("#228b22"));
                ds.setUnderlineText(false);
            }
        };
        ss2.setSpan(clickableSpan2,23,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt2.setText(ss2);
        txt2.setMovementMethod(LinkMovementMethod.getInstance());


        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();


            }
        });


    }

    public void login() {
        String email = txtEmail.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();

        if(email.isEmpty()){
            txtEmail.setError("Please enter an email! ");
            txtEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            txtPassword.setError("Please enter password ");
            txtPassword.requestFocus();
            return;
        }
        else
        {
           // progressBar.setVisibility(View.VISIBLE);
            progressDialog.setMessage("Logging in ...");
            progressDialog.show();
            mAuth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){

                                progressBar.setVisibility(View.VISIBLE);
                                Toast.makeText(Login.this,"Logged in",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Login.this,bottomNav.class);
                                startActivity(intent);
                                progressDialog.dismiss();
                                finish();
                            }
                            else{
                                progressBar.setVisibility(View.GONE);
                                Toast.makeText(Login.this,"Error! "+task.getException().getMessage(),Toast.LENGTH_LONG).show();

                            }
                        }
                    });
        }

    }


}