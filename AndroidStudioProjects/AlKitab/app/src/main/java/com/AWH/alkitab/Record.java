package com.AWH.alkitab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import io.grpc.Context;

public class Record extends AppCompatActivity {

    private StorageReference mStorage;
    private FirebaseAuth mAuth;

    Button button,button2;

    private ProgressDialog progressDialog;

    int number;
    int check = 0;
    String chapter = "";

    CardView c1,c2,c3;

    TextView txt1,txt2;

    ImageView img1,img2,img3;

    boolean mStartRecording = true;
    boolean mStartPlaying = true;

    private static final String LOG_TAG = "AudioRecordTest";
    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 200;
    private static String fileName = null;

    private MediaRecorder recorder = null;
    private MediaPlayer player = null;

    private boolean permissionToRecordAccepted = false;
    private String [] permissions = {Manifest.permission.RECORD_AUDIO};

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_RECORD_AUDIO_PERMISSION:
                permissionToRecordAccepted  = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                break;
        }
        if (!permissionToRecordAccepted ) finish();

    }

    private void onRecord(boolean start) {
        if (start) {
            startRecording();
        } else {
            stopRecording();
        }
    }

    private void onPlay(boolean start) {
        if (start) {
            startPlaying();
        } else {
            txt2.setText("Play");
            stopPlaying();
        }
    }

    private void startPlaying() {
       // stopPlay();
        player = new MediaPlayer();
        try {
            player.setDataSource(fileName);
            player.prepare();
            player.start();
        } catch (IOException e) {
            Log.e(LOG_TAG, "prepare() failed");
        }
    }

    private void stopPlaying() {
        player.release();
        player = null;

    }

    private void startRecording() {
        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        recorder.setOutputFile(fileName);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            recorder.prepare();
        } catch (IOException e) {
            Log.e(LOG_TAG, "prepare() failed");
        }

        recorder.start();
    }

    private void stopRecording() {
        recorder.stop();
        recorder.release();
        recorder = null;

       // c2.setEnabled(true);
        check = 1;
        //uploadAudio();
    }

    /*private void uploadAudio() {
        progressDialog.setMessage("Uploading Audio... ");
        progressDialog.show();

        StorageReference filepath = mStorage.child("Audio").child("new_audio.3gp");
        Uri uri = Uri.fromFile(new File(fileName));
        filepath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                progressDialog.setMessage("Uploaded ");
                progressDialog.dismiss();
            }
        });
    } */

    public void onPRecord(View view){
       // boolean mStartRecording = true;
        onRecord(mStartRecording);
        if (mStartRecording) {
            txt1.setText("Stop");

        } else {
            txt1.setText("Record");
        }
        mStartRecording = !mStartRecording;


    }
    public void onPPlay(View view){
        // boolean mStartRecording = true;
        if(check==1){
            onPlay(mStartPlaying);
            if (mStartPlaying) {
                txt2.setText("Play");
            } else {
                txt2.setText("Play");
            }
            mStartPlaying = !mStartPlaying;
        }
        else{
            Toast.makeText(Record.this,"Please record the audio 1st! ",Toast.LENGTH_SHORT).show();
        }



    }


    public void onSend(View view){
        if(check==1){
            progressDialog.setMessage("Uploading Audio... ");
            progressDialog.show();
            int random = new Random().nextInt(100);

            StorageReference filepath = mStorage.child("User: "+mAuth.getUid()).child(chapter).child(""+number).child("new_audio.3gp"+random);
            Uri uri = Uri.fromFile(new File(fileName));
            filepath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                    progressDialog.dismiss();
                    Toast.makeText(Record.this,"Uploaded successfully",Toast.LENGTH_SHORT).show();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Record.this,"Failed"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });
        }
        else{
            Toast.makeText(Record.this,"Please record the audio 1st! ",Toast.LENGTH_SHORT).show();
        }

    }
   /* private void stopPlay() {
        if (player != null) {
            player.stop();
            player.release();
            player = null;
        }
    }
    private void releaseFile(){
        if(fileName!=null){
            System.out.println("inside file--------------------------");
            fileName = "";
        }
        else{
            System.out.println("-------------------------");
        }
    } */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);




        mStorage = FirebaseStorage.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        //button = (Button) findViewById(R.id.button);
        //button2 = (Button) findViewById(R.id.button2);



        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);
        c3 = (CardView) findViewById(R.id.c3);
       // c2.setEnabled(false);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);

        progressDialog = new ProgressDialog(this);

       // fileName = getExternalCacheDir().getAbsolutePath();
        //releaseFile();

        fileName = getExternalCacheDir().getAbsolutePath();
        fileName += "/audiorecordtest.3gp";

        ActivityCompat.requestPermissions(this, permissions, REQUEST_RECORD_AUDIO_PERMISSION);

        img3 = (ImageView) findViewById(R.id.img3);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            int resId = bundle.getInt("img");
            img3.setImageResource(resId);
            number = bundle.getInt("filenumber");
            chapter = bundle.getString("chapter");
        }
        System.out.println("------------------------------"+number);
    }


}