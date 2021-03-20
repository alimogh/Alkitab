package com.AWH.alkitab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class learn_Chapter3 extends AppCompatActivity implements View.OnClickListener {

    ImageView imgId;

    MediaPlayer mp;


    Integer [] audioQ1 = {R.raw.c1_q1,R.raw.c2_q1,R.raw.c3_q1,R.raw.c4_q1,R.raw.c5_q1,R.raw.c6_q1,R.raw.c7_q1,R.raw.c8_q1,
            R.raw.c9_q1,R.raw.c10_q1,R.raw.c11_q1,R.raw.c12_q1,R.raw.c13_q1,R.raw.c14_q1};


    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};
    String Qari = "" ;
    Integer [] imageIds = {R.id.imageView1,R.id.imageView2,R.id.imageView3,R.id.imageView4,R.id.imageView5,
            R.id.imageView6,R.id.imageView7,R.id.imageView8,R.id.imageView9,R.id.imageView10,
            R.id.imageView11,R.id.imageView12,R.id.imageView13,R.id.imageView14};

    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    String userID;
    public static final String TAG = "TAG ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn__chapter3);

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
        c11 = (CardView) findViewById(R.id.c11);
        c12 = (CardView) findViewById(R.id.c12);
        c13 = (CardView) findViewById(R.id.c13);
        c14 = (CardView) findViewById(R.id.c14);


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
        c11.setOnClickListener(this);
        c12.setOnClickListener(this);
        c13.setOnClickListener(this);
        c14.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c1:
                next(0);
                updateCheck(1);
                break;
            case R.id.c2:
                next(1);
                updateCheck(2);
                break;
            case R.id.c3:
                next(2);
                updateCheck(3);
                break;

            case R.id.c4:
                next(3);
                updateCheck(4);
                break;
            case R.id.c5:
                next(4);
                updateCheck(5);
                break;
            case R.id.c6:
                next(5);
                updateCheck(6);
                break;
            case R.id.c7:
                next(6);
                updateCheck(7);
                break;
            case R.id.c8:
                next(7);
                updateCheck(8);
                break;
            case R.id.c9:
                next(8);
                updateCheck(9);
                break;
            case R.id.c10:
                next(9);
                updateCheck(10);
                break;
            case R.id.c11:
                next(10);
                updateCheck(11);
                break;
            case R.id.c12:
                next(11);
                updateCheck(12);
                break;
            case R.id.c13:
                next(12);
                updateCheck(13);
                break;
            default:
                next(13);
                updateCheck(14);
                break;


        }
    }
    public void next(int i){

    }
    public void modifyScreen(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterThreeQari"+Qari, 1000);





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
        long chaptervalue = prefs.getLong("learnChapterThreeQari"+Qari, 1000);

        if (cardTapped >= chaptervalue+2){
            // not allow to tapped
            System.out.println("Not allowed");

        }
        else if (cardTapped <= chaptervalue){
            //play audio only

            if (cardTapped == 14){
                stopPlaying();
                mp = MediaPlayer.create(this, audioQ1[13]);
                mp.start();
                return;
            }

            if(Qari.equals("One")){

                stopPlaying();
                mp = MediaPlayer.create(this, audioQ1[cardTapped-1]);
                mp.start();

            }
            else{
                //stopPlaying();
                //mp = MediaPlayer.create(this, audioQ2[cardTapped-1]);
                //mp.start();
            }
        }
        else{
            //play audio


            if(Qari.equals("One")){
                if(cardTapped<audioQ1.length){
                    stopPlaying();

                    int index = cardTapped-1;
                    mp = MediaPlayer.create(this, audioQ1[index]);
                    mp.start();

                }



            }
            else{
                //stopPlaying();
                //mp = MediaPlayer.create(this, audioQ2[cardTapped-1]);
                //mp.start();
            }

            //update interface

            if (cardTapped!=audioQ1.length){
                System.out.println("-----------------not come in else---------------  "+audioQ1.length);
                imgId = findViewById(imageIds[(int) (cardTapped-1)]);
                imgId.setImageResource(R.drawable.rect2);

                imgId = findViewById(imageIds[(int) (cardTapped)]);
                imgId.setImageResource(R.drawable.rect3);
            }
            else{
                System.out.println("-----------------come in else---------------  "+cardTapped);
                // specific for the last cell
                imgId = findViewById(imageIds[(int) (cardTapped-1)]);
                imgId.setImageResource(R.drawable.rect2);

            }

            //update data
            updateSharedPref();
        }

    }

    public void updateSharedPref(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterThreeQari"+Qari, 1000);

        SharedPreferences.Editor editor = getSharedPreferences("SharedData", MODE_PRIVATE).edit();
        editor.putLong("learnChapterThreeQari"+Qari,chaptervalue+1);
        editor.apply();

        updateOnServer(prefs.getLong("learnChapterThreeQari"+Qari, 1000));

    }

    public void updateOnServer(long chaptervalue){


        userID = mAuth.getCurrentUser().getUid();

        db.collection("users").document(userID)
                .update("learnChapterThreeQari"+Qari, chaptervalue)
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
    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        stopPlaying();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlaying();
    }
}