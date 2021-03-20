package com.AWH.alkitab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class learn_Chapter1 extends AppCompatActivity implements View.OnClickListener {

    ImageView imgId;

    MediaPlayer mp;


    Integer [] audioQ1 = {R.raw.a1_q1,R.raw.a2_q1,R.raw.a3_q1,R.raw.a4_q1,R.raw.a5_q1,R.raw.a6_q1,R.raw.a7_q1,R.raw.a8_q1,
            R.raw.a9_q1,R.raw.a10_q1,R.raw.a11_q1,R.raw.a12_q1,R.raw.a13_q1,R.raw.a14_q1,R.raw.a15_q1,R.raw.a16_q1,R.raw.a17_q1,
            R.raw.a18_q1,R.raw.a19_q1,R.raw.a20_q1,R.raw.a21_q1,R.raw.a22_q1,R.raw.a23_q1,R.raw.a24_q1,R.raw.a25_q1,R.raw.a26_q1,
            R.raw.a27_q1,R.raw.a28_q1,R.raw.a29_q1,R.raw.a30_q1};

    Integer [] audioQ2 = {R.raw.a1_q2,R.raw.a2_q2,R.raw.a3_q2,R.raw.a4_q2,R.raw.a5_q2,R.raw.a6_q2,R.raw.a7_q2,R.raw.a8_q2,
            R.raw.a9_q2,R.raw.a10_q2,R.raw.a11_q2,R.raw.a12_q2,R.raw.a13_q2,R.raw.a14_q2,R.raw.a15_q2,R.raw.a16_q2,R.raw.a17_q2,
            R.raw.a18_q2,R.raw.a19_q2,R.raw.a20_q2,R.raw.a21_q2,R.raw.a22_q2,R.raw.a23_q2,R.raw.a24_q2,R.raw.a25_q2,R.raw.a26_q2,
            R.raw.a27_q2,R.raw.a28_q2,R.raw.a29_q2,R.raw.a30_q1};



    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30;
    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};
    String Qari = "" ;
    Integer [] imageIds = {R.id.imageView1,R.id.imageView2,R.id.imageView3,R.id.imageView4,R.id.imageView5,R.id.imageView6,R.id.imageView7,R.id.imageView8,R.id.imageView9,R.id.imageView10,R.id.imageView11,R.id.imageView12,R.id.imageView13,R.id.imageView14,R.id.imageView15,R.id.imageView16,
            R.id.imageView17,R.id.imageView18,R.id.imageView19,R.id.imageView20,R.id.imageView21,R.id.imageView22,R.id.imageView23,R.id.imageView24,R.id.imageView25,R.id.imageView26,R.id.imageView27,R.id.imageView28,R.id.imageView29,R.id.imageView30};

    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    String userID;
    public static final String TAG = "TAG ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn__chapter1);


        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            Qari = bundle.getString("Qari");

        }

         initialize_cards();

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
            case R.id.c14:
                next(13);
                updateCheck(14);
                break;
            case R.id.c15:
                next(14);
                updateCheck(15);
                break;
            case R.id.c16:
                next(15);
                updateCheck(16);
                break;
            case R.id.c17:
                next(16);
                updateCheck(17);
                break;
            case R.id.c18:
                next(17);
                updateCheck(18);
                break;
            case R.id.c19:
                next(18);
                updateCheck(19);
                break;
            case R.id.c20:
                next(19);
                updateCheck(20);
                break;
            case R.id.c21:
                next(20);
                updateCheck(21);
                break;
            case R.id.c22:
                next(21);
                updateCheck(22);
                break;
            case R.id.c23:
                next(22);
                updateCheck(23);
                break;
            case R.id.c24:
                next(23);
                updateCheck(24);
                break;
            case R.id.c25:
                next(24);
                updateCheck(25);
                break;
            case R.id.c26:
                next(25);
                updateCheck(26);
                break;
            case R.id.c27:
                next(26);
                updateCheck(27);
                break;
            case R.id.c28:
                next(27);
                updateCheck(28);
                break;
            case R.id.c29:
                next(28);
                updateCheck(29);
                break;

            default:
                next(29);
                updateCheck(30);
                break;


        }

    }

    private void initialize_cards(){
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

    }

    public void next(int i){

    }

    public void modifyScreen(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterOneQari"+Qari, 1000);





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
        long chaptervalue = prefs.getLong("learnChapterOneQari"+Qari, 1000);

        if (cardTapped >= chaptervalue+2){
            // not allow to tapped
            System.out.println("Not allowed");

        }
        else if (cardTapped <= chaptervalue){
            //play audio only

            if (cardTapped == 30){
                stopPlaying();
                mp = MediaPlayer.create(this, audioQ1[29]);
                mp.start();
                return;
            }

            if(Qari.equals("One")){

                stopPlaying();
                mp = MediaPlayer.create(this, audioQ1[cardTapped-1]);
                mp.start();

            }
            else{
                stopPlaying();
                mp = MediaPlayer.create(this, audioQ2[cardTapped-1]);
                mp.start();
            }
        }
        else{
            //play audio


            if(Qari.equals("One")){

                stopPlaying();

                int index = cardTapped-1;
                mp = MediaPlayer.create(this, audioQ1[index]);
                mp.start();

            }
            else{
                stopPlaying();
                mp = MediaPlayer.create(this, audioQ2[cardTapped-1]);
                mp.start();
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
        long chaptervalue = prefs.getLong("learnChapterOneQari"+Qari, 1000);

        SharedPreferences.Editor editor = getSharedPreferences("SharedData", MODE_PRIVATE).edit();
        editor.putLong("learnChapterOneQari"+Qari,chaptervalue+1);
        editor.apply();

        updateOnServer(prefs.getLong("learnChapterOneQari"+Qari, 1000));

    }

    public void updateOnServer(long chaptervalue){


        userID = mAuth.getCurrentUser().getUid();

                db.collection("users").document(userID)
                .update("learnChapterOneQari"+Qari, chaptervalue)
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

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}