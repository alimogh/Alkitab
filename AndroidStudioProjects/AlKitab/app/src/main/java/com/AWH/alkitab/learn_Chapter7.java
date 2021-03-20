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

public class learn_Chapter7 extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mp;


    Integer [] audioQ1 = {R.raw.g1_q1,R.raw.g2_q1,R.raw.g3_q1,R.raw.g4_q1,R.raw.g5_q1,R.raw.g6_q1,R.raw.g7_q1,R.raw.g8_q1,
            R.raw.g9_q1,R.raw.g10_q1,R.raw.g11_q1,R.raw.g12_q1};
    
    
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,
            c31,c32,c33;

    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};

    String Qari = "" ;

    ImageView imgId;

    Integer [] imageIds = { R.id.imageView1,R.id.imageView2,R.id.imageView3,
            R.id.imageView4,R.id.imageView5,R.id.imageView6,
            R.id.imageView7,R.id.imageView8,R.id.imageView9,
            R.id.imageView10,R.id.imageView11,R.id.imageView12,
            R.id.imageView13,R.id.imageView14,R.id.imageView15,
            R.id.imageView16,R.id.imageView17,R.id.imageView18,
            R.id.imageView19,R.id.imageView20,R.id.imageView21,
            R.id.imageView22,R.id.imageView23,R.id.imageView24,
            R.id.imageView25,R.id.imageView26,R.id.imageView27,
            R.id.imageView28,R.id.imageView29,R.id.imageView30,
            R.id.imageView31,R.id.imageView32,R.id.imageView33};


    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    String userID;
    public static final String TAG = "TAG ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn__chapter7);

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
        c15 = (CardView) findViewById(R.id.c15);
        c16 = (CardView) findViewById(R.id.c16);
        c17 = (CardView) findViewById(R.id.c17);
        c18 = (CardView) findViewById(R.id.c18);
        c19 = (CardView) findViewById(R.id.c19);
        c20 = (CardView) findViewById(R.id.c20);
        c21 = (CardView) findViewById(R.id.c21);
        c22 = (CardView) findViewById(R.id.c22);
        c23 = (CardView) findViewById(R.id.c23);
        c24 = (CardView) findViewById(R.id.c24);
        c25 = (CardView) findViewById(R.id.c25);
        c26 = (CardView) findViewById(R.id.c26);
        c27 = (CardView) findViewById(R.id.c27);
        c28 = (CardView) findViewById(R.id.c28);
        c29 = (CardView) findViewById(R.id.c29);
        c30 = (CardView) findViewById(R.id.c30);
        c31 = (CardView) findViewById(R.id.c31);
        c32 = (CardView) findViewById(R.id.c32);
        c33 = (CardView) findViewById(R.id.c33);



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
        c15.setOnClickListener(this);
        c16.setOnClickListener(this);
        c17.setOnClickListener(this);
        c18.setOnClickListener(this);
        c19.setOnClickListener(this);
        c20.setOnClickListener(this);
        c21.setOnClickListener(this);
        c22.setOnClickListener(this);
        c23.setOnClickListener(this);
        c24.setOnClickListener(this);
        c25.setOnClickListener(this);
        c26.setOnClickListener(this);
        c27.setOnClickListener(this);
        c28.setOnClickListener(this);
        c29.setOnClickListener(this);
        c30.setOnClickListener(this);
        c31.setOnClickListener(this);
        c32.setOnClickListener(this);
        c33.setOnClickListener(this);
    }

    @Override
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
            case R.id.c10:
                updateCheck(10);
                break;
            case R.id.c11:
                updateCheck(11);
                break;
            case R.id.c12:
                updateCheck(12);
                break;
            case R.id.c13:
                updateCheck(13);
                break;
            case R.id.c14:
                updateCheck(14);
                break;
            case R.id.c15:
                updateCheck(15);
                break;
            case R.id.c16:
                updateCheck(16);
                break;
            case R.id.c17:
                updateCheck(17);
                break;
            case R.id.c18:
                updateCheck(18);
                break;
            case R.id.c19:
                updateCheck(19);
                break;
            case R.id.c20:
                updateCheck(20);
                break;
            case R.id.c21:
                updateCheck(21);
                break;
            case R.id.c22:
                updateCheck(22);
                break;
            case R.id.c23:
                updateCheck(23);
                break;
            case R.id.c24:
                updateCheck(24);
                break;
            case R.id.c25:
                updateCheck(25);
                break;
            case R.id.c26:
                updateCheck(26);
                break;
            case R.id.c27:
                updateCheck(27);
                break;
            case R.id.c28:
                updateCheck(28);
                break;
            case R.id.c29:
                updateCheck(29);
                break;
            case R.id.c30:
                updateCheck(30);
                break;

            case R.id.c31:
                updateCheck(31);
                break;
            case R.id.c32:
                updateCheck(32);
                break;
            default:
                updateCheck(33);
                break;


        }
    }
    public void modifyScreen(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterSevenQari"+Qari, 1000);





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
        long chaptervalue = prefs.getLong("learnChapterSevenQari"+Qari, 1000);

        if (cardTapped >= chaptervalue+2){
            // not allow to tapped

        }
        else if (cardTapped <= chaptervalue){
            //play audio only
            if(Qari.equals("One")){

                stopPlaying();

                int index = cardTapped-1;
                mp = MediaPlayer.create(this, audioQ1[index]);
                mp.start();

            }
        }
        else{
            //play audio
            if(Qari.equals("One")) {

                if(cardTapped<audioQ1.length){
                    stopPlaying();

                    int index = cardTapped - 1;
                    mp = MediaPlayer.create(this, audioQ1[index]);
                    mp.start();
                }


            }
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
        long chaptervalue = prefs.getLong("learnChapterSevenQari"+Qari, 1000);

        SharedPreferences.Editor editor = getSharedPreferences("SharedData", MODE_PRIVATE).edit();
        editor.putLong("learnChapterSevenQari"+Qari,chaptervalue+1);
        editor.apply();

        updateOnServer(prefs.getLong("learnChapterSevenQari"+Qari, 1000));

    }
    public void updateOnServer(long chaptervalue){


        userID = mAuth.getCurrentUser().getUid();

        db.collection("users").document(userID)
                .update("learnChapterSevenQari"+Qari, chaptervalue)
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