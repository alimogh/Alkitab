package com.AWH.alkitab;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class HomeFragment extends Fragment {

    CardView c10,c11,c12;

    ProgressBar p;

    private FirebaseAuth mAuth;
    FirebaseFirestore db;
    public static final String TAG = "TAG ";
    String userID;

    private ProgressDialog progressDialog;

    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};
    int [] chapterTotal = {30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30};

    SharedPreferences.Editor editor;

    //Integer [] barIds = {R.id.L1pb1,R.id.L1pb2,R.id.L2pb1,R.id.L2pb2,R.id.L3pb1,
           // R.id.L3pb2,R.id.L4pb1,R.id.L4pb2,R.id.L5pb1,R.id.L5pb2,
           // R.id.L6pb1,R.id.L6pb2,R.id.L7pb1,R.id.L7pb2,
           // R.id.L8pb1,R.id.L8pb2,R.id.L9pb1,R.id.L9pb2};

    ProgressBar pb1,pb2,pb3,pb4,pb5,pb6,pb7,pb8,pb9;
    ProgressBar pb_1,pb_2,pb_3,pb_4,pb_5,pb_6,pb_7,pb_8,pb_9;

    ProgressBar bar1Id;
    ProgressBar bar2Id;

    ProgressBar L4pb1;


    //Integer [] txtIds = {R.id.L1T1,R.id.L1T2,R.id.L2T1,R.id.L2T2,R.id.L3T1,
      //      R.id.L3T2,R.id.L4T1,R.id.L4T2,R.id.L5T1,R.id.L5T2,
        //    R.id.L6T1,R.id.L6T2,R.id.L7T1,R.id.L7T2,
          //  R.id.L8T1,R.id.L8T2,R.id.L9T1,R.id.L9T2};

    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
    TextView tx_1,tx_2,tx_3,tx_4,tx_5,tx_6,tx_7,tx_8,tx_9;

    TextView txt1Id;
    TextView txt2Id;










    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_home,container,false);


        progressDialog = new ProgressDialog(this.getActivity());


        pb1 = (ProgressBar) v.findViewById(R.id.L1pb1);
        pb2 = (ProgressBar) v.findViewById(R.id.L2pb1);
        pb3 = (ProgressBar) v.findViewById(R.id.L3pb1);
        pb4 = (ProgressBar) v.findViewById(R.id.L4pb1);
        pb5 = (ProgressBar) v.findViewById(R.id.L5pb1);
        pb6 = (ProgressBar) v.findViewById(R.id.L6pb1);
        pb7 = (ProgressBar) v.findViewById(R.id.L7pb1);
        pb8 = (ProgressBar) v.findViewById(R.id.L8pb1);
        pb9 = (ProgressBar) v.findViewById(R.id.L9pb1);

        pb_1 = (ProgressBar) v.findViewById(R.id.L1pb2);
        pb_2 = (ProgressBar) v.findViewById(R.id.L2pb2);
        pb_3 = (ProgressBar) v.findViewById(R.id.L3pb2);
        pb_4 = (ProgressBar) v.findViewById(R.id.L4pb2);
        pb_5 = (ProgressBar) v.findViewById(R.id.L5pb2);
        pb_6 = (ProgressBar) v.findViewById(R.id.L6pb2);
        pb_7 = (ProgressBar) v.findViewById(R.id.L7pb2);
        pb_8 = (ProgressBar) v.findViewById(R.id.L8pb2);
        pb_9 = (ProgressBar) v.findViewById(R.id.L9pb2);


        tx1 = (TextView) v.findViewById(R.id.L1T1);
        tx2 = (TextView) v.findViewById(R.id.L2T1);
        tx3  = (TextView) v.findViewById(R.id.L3T1);
        tx4 = (TextView) v.findViewById(R.id.L4T1);

        tx5 = (TextView) v.findViewById(R.id.L5T1);
        tx6 = (TextView) v.findViewById(R.id.L6T1);
        tx7 = (TextView) v.findViewById(R.id.L7T1);
        tx8 = (TextView) v.findViewById(R.id.L8T1);
        tx9 = (TextView) v.findViewById(R.id.L9T1);

        tx_1 = (TextView) v.findViewById(R.id.L1T2);
        tx_2 = (TextView) v.findViewById(R.id.L2T2);
        tx_3  = (TextView) v.findViewById(R.id.L3T2);
        tx_4 = (TextView) v.findViewById(R.id.L4T2);

        tx_5 = (TextView) v.findViewById(R.id.L5T2);
        tx_6 = (TextView) v.findViewById(R.id.L6T2);
        tx_7 = (TextView) v.findViewById(R.id.L7T2);
        tx_8 = (TextView) v.findViewById(R.id.L8T2);
        tx_9 = (TextView) v.findViewById(R.id.L9T2);





/*
        c10 = (CardView) v.findViewById(R.id.c10);
        c10.setVisibility(View.GONE);
        c11 = (CardView) v.findViewById(R.id.c11);
        c11.setVisibility(View.GONE);*/









        p = v.findViewById(R.id.L1pb1);

       // L4pb1 = (ProgressBar) v.findViewById(R.id.L4pb1);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        userID = mAuth.getCurrentUser().getUid();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String name = "" ;
        String email = "";
        if (user != null) {
            // Name, email address etc
            name = user.getDisplayName();
            email = user.getEmail();
        }
        System.out.println("----------------username-------------"+name);
        System.out.println("----------------email-------------"+email);




        SharedPreferences prefs = this.getActivity().getSharedPreferences("SharedData", Context.MODE_PRIVATE);
        editor = this.getActivity().getSharedPreferences("SharedData", Context.MODE_PRIVATE).edit();

        long check = prefs.getLong("learnChapter"+chapterName[1]+"QariOne", 1000);





        if( check != 1000){
            //already installed app
            System.out.println("----------------already installed--------------------");

            SharedPreferences pref = this.getActivity().getSharedPreferences("SharedData", Context.MODE_PRIVATE);
            for (int i=0;i<18;i=i+2){


                long qari1Value = pref.getLong("learnChapter"+chapterName[i]+"QariOne", 1000);
               // System.out.println("-------------Qari value---"+i+"-----------"+qari1Value);
                long qari2Value = pref.getLong("learnChapter"+chapterName[i]+"QariTwo", 1000);
                long totalProgress = pref.getLong("learnChapter"+chapterTotal[i]+"Total", 1000);

               // System.out.println("---------------------------check for chapter4 -------------"+pref.getLong("learnChapter"+chapterName[3]+"QariOne", 1000));

               // L4pb1.setProgress((int) pref.getLong("learnChapter"+chapterName[3]+"QariOne", 1000));

                //bar1Id.setProgress((int) (qari1Value));


                pb1.setProgress((int) pref.getLong("learnChapter"+chapterName[0]+"QariOne", 1000));
                pb2.setProgress((int) pref.getLong("learnChapter"+chapterName[1]+"QariOne", 1000));
                pb3.setProgress((int) pref.getLong("learnChapter"+chapterName[2]+"QariOne", 1000));
                pb4.setProgress((int) pref.getLong("learnChapter"+chapterName[3]+"QariOne", 1000));
                pb5.setProgress((int) pref.getLong("learnChapter"+chapterName[4]+"QariOne", 1000));
                pb6.setProgress((int) pref.getLong("learnChapter"+chapterName[5]+"QariOne", 1000));
                pb7.setProgress((int) pref.getLong("learnChapter"+chapterName[6]+"QariOne", 1000));
                pb8.setProgress((int) pref.getLong("learnChapter"+chapterName[7]+"QariOne", 1000));
                pb9.setProgress((int) pref.getLong("learnChapter"+chapterName[8]+"QariOne", 1000));

                pb_1.setProgress((int) pref.getLong("learnChapter"+chapterName[0]+"QariTwo", 1000));
                pb_2.setProgress((int) pref.getLong("learnChapter"+chapterName[1]+"QariTwo", 1000));
                pb_3.setProgress((int) pref.getLong("learnChapter"+chapterName[2]+"QariTwo", 1000));
                pb_4.setProgress((int) pref.getLong("learnChapter"+chapterName[3]+"QariTwo", 1000));
                pb_5.setProgress((int) pref.getLong("learnChapter"+chapterName[4]+"QariTwo", 1000));
                pb_6.setProgress((int) pref.getLong("learnChapter"+chapterName[5]+"QariTwo", 1000));
                pb_7.setProgress((int) pref.getLong("learnChapter"+chapterName[6]+"QariTwo", 1000));
                pb_8.setProgress((int) pref.getLong("learnChapter"+chapterName[7]+"QariTwo", 1000));
                pb_9.setProgress((int) pref.getLong("learnChapter"+chapterName[8]+"QariTwo", 1000));


                tx1.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[0]+"QariOne", 1000))+"/30");
                tx2.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[1]+"QariOne", 1000))+"/127");
                tx3.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[2]+"QariOne", 1000))+"/14");
                tx4.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[3]+"QariOne", 1000))+"/84");
                tx5.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[4]+"QariOne", 1000))+"/84");
                tx6.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[5]+"QariOne", 1000))+"/54");
                tx7.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[6]+"QariOne", 1000))+"/33");
                tx8.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[7]+"QariOne", 1000))+"/140");
                tx9.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[8]+"QariOne", 1000))+"/101");

                tx_1.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[0]+"QariTwo", 1000))+"/30");
                tx_2.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[1]+"QariTwo", 1000))+"/127");
                tx_3.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[2]+"QariTwo", 1000))+"/14");
                tx_4.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[3]+"QariTwo", 1000))+"/84");
                tx_5.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[4]+"QariTwo", 1000))+"/84");
                tx_6.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[5]+"QariTwo", 1000))+"/54");
                tx_7.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[6]+"QariTwo", 1000))+"/33");
                tx_8.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[7]+"QariTwo", 1000))+"/140");
                tx_9.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[8]+"QariTwo", 1000))+"/101");



                //bar1Id = v.findViewById(barIds[i]);
                //bar2Id = v.findViewById(barIds[i+1]);
               // System.out.println("-------------bar id value--------------"+i);

               // bar1Id.setProgress((int) (qari1Value));
                //System.out.println("After bar id----------------------------");
               // bar2Id.setProgress((int) (qari2Value));

                //txt1Id = v.findViewById(txtIds[i]);
                //txt2Id = v.findViewById(txtIds[i+1]);



                //txt1Id.setText(String.valueOf(qari1Value)+"/30");
                //txt2Id.setText(String.valueOf(qari2Value)+"/30");




            }


        }
        else{
            //1st time install

            progressDialog.setMessage("Getting Data ...");
            progressDialog.show();

            SharedPreferences pref = this.getActivity().getSharedPreferences("SharedData", Context.MODE_PRIVATE);

            System.out.println("----------------1st time install------------------");

            db.collection("users") .whereEqualTo("id", userID)
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {

                                    //------------------------------SharedPref--------------------------------------

                                    for (int i = 0;i<=16;i++){

                                        //learning data

                                        editor.putLong("learnChapter"+chapterName[i]+"QariOne",(long) document.get("learnChapter"+chapterName[i]+"QariOne"));
                                        editor.putLong("learnChapter"+chapterName[i]+"QariTwo", (long) document.get("learnChapter"+chapterName[i]+"QariTwo"));
                                        editor.putLong("learnChapter"+chapterTotal[i]+"Total", (long) (chapterTotal[i]));

                                        //eval data
                                        editor.putLong("evaluateChapter"+chapterName[i]+"QariOne",(long) document.get("learnChapter"+chapterName[i]+"QariOne"));
                                        editor.putLong("evaluateChapter"+chapterTotal[i]+"Total", (long) (chapterTotal[i]));


                                        editor.apply();


                                    }
                                    progressDialog.dismiss();

                                    for (int i=0;i<18;i=i+2){


                                        long qari1Value = pref.getLong("learnChapter"+chapterName[i]+"QariOne", 1000);
                                        long qari2Value = pref.getLong("learnChapter"+chapterName[i]+"QariTwo", 1000);
                                        long totalProgress = pref.getLong("learnChapter"+chapterTotal[i]+"Total", 1000);



                                        pb1.setProgress((int) pref.getLong("learnChapter"+chapterName[0]+"QariOne", 1000));
                                        pb2.setProgress((int) pref.getLong("learnChapter"+chapterName[1]+"QariOne", 1000));
                                        pb3.setProgress((int) pref.getLong("learnChapter"+chapterName[2]+"QariOne", 1000));
                                        pb4.setProgress((int) pref.getLong("learnChapter"+chapterName[3]+"QariOne", 1000));
                                        pb5.setProgress((int) pref.getLong("learnChapter"+chapterName[4]+"QariOne", 1000));
                                        pb6.setProgress((int) pref.getLong("learnChapter"+chapterName[5]+"QariOne", 1000));
                                        pb7.setProgress((int) pref.getLong("learnChapter"+chapterName[6]+"QariOne", 1000));
                                        pb8.setProgress((int) pref.getLong("learnChapter"+chapterName[7]+"QariOne", 1000));
                                        pb9.setProgress((int) pref.getLong("learnChapter"+chapterName[8]+"QariOne", 1000));

                                        pb_1.setProgress((int) pref.getLong("learnChapter"+chapterName[0]+"QariTwo", 1000));
                                        pb_2.setProgress((int) pref.getLong("learnChapter"+chapterName[1]+"QariTwo", 1000));
                                        pb_3.setProgress((int) pref.getLong("learnChapter"+chapterName[2]+"QariTwo", 1000));
                                        pb_4.setProgress((int) pref.getLong("learnChapter"+chapterName[3]+"QariTwo", 1000));
                                        pb_5.setProgress((int) pref.getLong("learnChapter"+chapterName[4]+"QariTwo", 1000));
                                        pb_6.setProgress((int) pref.getLong("learnChapter"+chapterName[5]+"QariTwo", 1000));
                                        pb_7.setProgress((int) pref.getLong("learnChapter"+chapterName[6]+"QariTwo", 1000));
                                        pb_8.setProgress((int) pref.getLong("learnChapter"+chapterName[7]+"QariTwo", 1000));
                                        pb_9.setProgress((int) pref.getLong("learnChapter"+chapterName[8]+"QariTwo", 1000));


                                        tx1.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[0]+"QariOne", 1000))+"/30");
                                        tx2.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[1]+"QariOne", 1000))+"/127");
                                        tx3.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[2]+"QariOne", 1000))+"/14");
                                        tx4.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[3]+"QariOne", 1000))+"/84");
                                        tx5.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[4]+"QariOne", 1000))+"/84");
                                        tx6.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[5]+"QariOne", 1000))+"/54");
                                        tx7.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[6]+"QariOne", 1000))+"/33");
                                        tx8.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[7]+"QariOne", 1000))+"/140");
                                        tx9.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[8]+"QariOne", 1000))+"/101");

                                        tx_1.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[0]+"QariTwo", 1000))+"/30");
                                        tx_2.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[1]+"QariTwo", 1000))+"/127");
                                        tx_3.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[2]+"QariTwo", 1000))+"/14");
                                        tx_4.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[3]+"QariTwo", 1000))+"/84");
                                        tx_5.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[4]+"QariTwo", 1000))+"/84");
                                        tx_6.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[5]+"QariTwo", 1000))+"/54");
                                        tx_7.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[6]+"QariTwo", 1000))+"/33");
                                        tx_8.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[7]+"QariTwo", 1000))+"/140");
                                        tx_9.setText(String.valueOf(pref.getLong("learnChapter"+chapterName[8]+"QariTwo", 1000))+"/101");



                                        //bar1Id = v.findViewById(barIds[i]);
                                        //bar2Id = v.findViewById(barIds[i+1]);

                                       // bar1Id.setProgress((int) (qari1Value));
                                        //bar2Id.setProgress((int) (qari2Value));

                                        //txt1Id = v.findViewById(txtIds[i]);
                                        //txt2Id = v.findViewById(txtIds[i+1]);



                                        //txt1Id.setText(String.valueOf(qari1Value)+"/30");
                                        //txt2Id.setText(String.valueOf(qari2Value)+"/30");

                                    }


                                    Log.d(TAG, document.getId() + " => " + document.getData());
                                }



                            }
                            else {
                                Log.d(TAG, "Error getting documents: ", task.getException());
                            }
                        }
                    });

        }

        return v;


    }






}
