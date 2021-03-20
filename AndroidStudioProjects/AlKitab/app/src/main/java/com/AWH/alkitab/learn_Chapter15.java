package com.AWH.alkitab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class learn_Chapter15 extends AppCompatActivity implements View.OnClickListener {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};

    String Qari = "" ;

    ImageView imgId;
    Integer [] imageIds = { R.id.imageView1,R.id.imageView2,R.id.imageView3,
            R.id.imageView4,R.id.imageView5,R.id.imageView6,
            R.id.imageView7,R.id.imageView8,R.id.imageView9,
            R.id.imageView10};
    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    String userID;
    public static final String TAG = "TAG ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn__chapter15);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            Qari = bundle.getString("Qari");

        }



        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);
        c3 = (CardView) findViewById(R.id.c3);
        c4 = (CardView) findViewById(R.id.c4);
        c5 = (CardView) findViewById(R.id.c5);
        c6 = (CardView) findViewById(R.id.c6);
        c7 = (CardView) findViewById(R.id.c7);
        c8 = (CardView) findViewById(R.id.c8);
        c9 = (CardView) findViewById(R.id.c9);
        c10 = (CardView) findViewById(R.id.c10);
        modifyScreen();



        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c1:
                updateCheck(1);
                break;
            case R.id.c2:
                updateCheck(2);
                break;
            case R.id.c3:
                updateCheck(3);
                break;

            case R.id.c4:
                updateCheck(4);
                break;
            case R.id.c5:
                updateCheck(5);
                break;
            case R.id.c6:
                updateCheck(6);
                break;
            case R.id.c7:
                updateCheck(7);
                break;
            case R.id.c8:
                updateCheck(8);
                break;
            case R.id.c9:
                updateCheck(9);
                break;
            default:
                updateCheck(10);
                break;


        }

    }
    public void modifyScreen(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterFifteenQari"+Qari, 1000);





        for(int i = 0;i<chaptervalue;i++){
            imgId = findViewById(imageIds[i]);
            System.out.println("-----------ID---------------------- "+imgId);
            imgId.setImageResource(R.drawable.rect2);
        }

        imgId = findViewById(imageIds[(int) (chaptervalue)]);
        imgId.setImageResource(R.drawable.rect3);



    }
    public void updateCheck(int cardTapped){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterFifteenQari"+Qari, 1000);

        if (cardTapped >= chaptervalue+2){
            // not allow to tapped

        }
        else if (cardTapped <= chaptervalue){
            //play audio only
            if(Qari.equals("One")){
               /* if(cardTapped<audioQ1.length){
                    stopPlaying();

                    int index = cardTapped-1;
                    mp = MediaPlayer.create(this, audioQ1[index]);
                    mp.start();

                }*/



            }
        }
        else{
            //play audio
//            if(Qari.equals("One")) {
//
//                stopPlaying();
//
//                int index = cardTapped - 1;
//                mp = MediaPlayer.create(this, audioQ1[index]);
//                mp.start();
//            }
            //update interface
            imgId = findViewById(imageIds[(int) (cardTapped-1)]);
            imgId.setImageResource(R.drawable.rect2);

            imgId = findViewById(imageIds[(int) (cardTapped)]);
            imgId.setImageResource(R.drawable.rect3);

            //update data
            updateSharedPref();
        }

    }
    public void updateSharedPref(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterFifteenQari"+Qari, 1000);

        SharedPreferences.Editor editor = getSharedPreferences("SharedData", MODE_PRIVATE).edit();
        editor.putLong("learnChapterFifteenQari"+Qari,chaptervalue+1);
        editor.apply();

        updateOnServer(prefs.getLong("learnChapterFifteenQari"+Qari, 1000));

    }
    public void updateOnServer(long chaptervalue){


        userID = mAuth.getCurrentUser().getUid();

        db.collection("users").document(userID)
                .update("learnChapterFifteenQari"+Qari, chaptervalue)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully updated!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error updating document", e);
                    }
                });
    }
}