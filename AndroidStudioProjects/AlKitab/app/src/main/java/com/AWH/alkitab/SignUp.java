package com.AWH.alkitab;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {
    Button btn1;
    EditText txtName,txtEmail,txtPassword,txtCPassword;

    public static final String TAG = "TAG ";
    private FirebaseAuth mAuth;
    FirebaseFirestore fStore;

    String userID;
    //ProgressBar progressBar;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("");

        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        //progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressDialog = new ProgressDialog(this);

        txtName = (EditText) findViewById(R.id.txtName);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtCPassword = (EditText) findViewById(R.id.txtCPassword);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setBackgroundColor(Color.parseColor("#228b22"));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent intent = new Intent(SignUp.this, MainActivity.class);
              //  startActivity(intent);
                resgiterUser();
            }
        });
    }

    private void resgiterUser() {
        String name = txtName.getText().toString().trim();
        String email = txtEmail.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();
        String cPassword = txtCPassword.getText().toString().trim();

        if(name.isEmpty()){
            txtName.setError("Name is required");
            txtName.requestFocus();
            return;
        }
        if(email.isEmpty()){
            txtEmail.setError("Email is required");
            txtEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            txtPassword.setError("Password is required");
            txtPassword.requestFocus();
            return;
        }
        if(password.length()<6){
            txtPassword.setError("Your password should be of at least 6 characters! ");
            txtPassword.requestFocus();
            return;
        }
        if(cPassword.isEmpty()){
            txtCPassword.setError("Re-enter your password");
            txtCPassword.requestFocus();
            return;
        }



        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            txtEmail.setError("Please enter a valid Email Address ");
            txtEmail.requestFocus();
            return;
        }
        if(password.equals(cPassword)){

            //progressBar.setVisibility(View.VISIBLE);
            progressDialog.setMessage("Creating your account...");
            progressDialog.show();
            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                               // progressBar.setVisibility(View.GONE);
                                progressDialog.dismiss();

                                //Verrify the email
                               /* FirebaseUser Vuser = mAuth.getCurrentUser();
                                Vuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Toast.makeText(SignUp.this,"Verrification email has been sent",Toast.LENGTH_SHORT).show();
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Log.d(TAG,"Error "+e.getMessage());
                                    }
                                });  */



                                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                                SharedPreferences.Editor editor = pref.edit();


                                userID = mAuth.getCurrentUser().getUid();
                                DocumentReference documentReference = fStore.collection("users").document(userID);
                                Map<String, Object> user = new HashMap<>();
                                user.put("Name",name);
                                user.put("Email",email);
                                user.put("Password",password);
                                user.put("id",userID);


                                user.put("learnChapterOneQariOne",0);
                                user.put("learnChapterOneQariTwo",0);
                                user.put("learnChapterTwoQariOne",0);
                                user.put("learnChapterTwoQariTwo",0);
                                user.put("learnChapterThreeQariOne",0);
                                user.put("learnChapterThreeQariTwo",0);
                                user.put("learnChapterFourQariOne",0);
                                user.put("learnChapterFourQariTwo",0);
                                user.put("learnChapterFiveQariOne",0);
                                user.put("learnChapterFiveQariTwo",0);
                                user.put("learnChapterSixQariOne",0);
                                user.put("learnChapterSixQariTwo",0);
                                user.put("learnChapterSevenQariOne",0);
                                user.put("learnChapterSevenQariTwo",0);
                                user.put("learnChapterEightQariOne",0);
                                user.put("learnChapterEightQariTwo",0);
                                user.put("learnChapterNineQariOne",0);
                                user.put("learnChapterNineQariTwo",0);
                                user.put("learnChapterTenQariOne",0);
                                user.put("learnChapterTenQariTwo",0);
                                user.put("learnChapterElevenQariOne",0);
                                user.put("learnChapterElevenQariTwo",0);
                                user.put("learnChapterTwelveQariOne",0);
                                user.put("learnChapterTwelveQariTwo",0);
                                user.put("learnChapterThirteenQariOne",0);
                                user.put("learnChapterThirteenQariTwo",0);
                                user.put("learnChapterFourteenQariOne",0);
                                user.put("learnChapterFourteenQariTwo",0);
                                user.put("learnChapterFifteenQariOne",0);
                                user.put("learnChapterFifteenQariTwo",0);
                                user.put("learnChapterSixteenQariOne",0);
                                user.put("learnChapterSixteenQariTwo",0);
                                user.put("learnChapterSeventeenQariOne",0);
                                user.put("learnChapterSeventeenQariTwo",0);


                                user.put("evaluateChapterOneQariOne",0);
                                user.put("evaluateChapterTwoQariOne",0);
                                user.put("evaluateChapterThreeQariOne",0);
                                user.put("evaluateChapterFourQariOne",0);
                                user.put("evaluateChapterFiveQariOne",0);
                                user.put("evaluateChapterSixQariOne",0);
                                user.put("evaluateChapterSevenQariOne",0);
                                user.put("evaluateChapterEightQariOne",0);
                                user.put("evaluateChapterNineQariOne",0);
                                user.put("evaluateChapterTenQariOne",0);
                                user.put("evaluateChapterElevenQariOne",0);
                                user.put("evaluateChapterTwelveQariOne",0);
                                user.put("evaluateChapterThirteenQariOne",0);
                                user.put("evaluateChapterFourteenQariOne",0);
                                user.put("evaluateChapterFifteenQariOne",0);
                                user.put("evaluateChapterSixteenQariOne",0);
                                user.put("evaluateChapterSeventeenQariOne",0);
                                finish();


                                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Log.d(TAG,"User progile is created for "+userID );
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Log.d(TAG,"onFailure"+e.toString());
                                        Log.d(TAG,"Error! You already have an account! "+task.getException().getMessage());
                                    }
                                });
                                Toast.makeText(SignUp.this,"Account has been created",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUp.this,Login.class));
                            }
                            else {
                                //progressBar.setVisibility(View.GONE);
                                progressDialog.dismiss();
                                Toast.makeText(SignUp.this,"Error",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,"Error! You already have an account! "+task.getException().getMessage());

                            }
                        }
                    });

        }


    }
}