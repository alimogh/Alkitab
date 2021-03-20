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

public class learn_Chapter11 extends AppCompatActivity implements View.OnClickListener  {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,
            c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,
            c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,c75,c76,c77,c78,c79,c80,c81,c82,c83,c84,c85,c86,c87,c88,c89,c90,
            c91,c92,c93,c94,c95,c96,c97,c98,c99,c100,c101,c102,c103,c104,c105,c106,c107,c108,c109,c110,c111,c112,c113,c114,c115,c116,c117,c118,c119,c120,
            c121,c122,c123,c124,c125,c126,c127,c128,c129,c130,c131,c132,c133,c134,c135,c136,c137,c138,c139,c140;

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
            R.id.imageView31,R.id.imageView32,R.id.imageView33,
            R.id.imageView34,R.id.imageView35,R.id.imageView36,
            R.id.imageView37,R.id.imageView38,R.id.imageView39,
            R.id.imageView40,R.id.imageView41,R.id.imageView42,
            R.id.imageView43,R.id.imageView44,R.id.imageView45,
            R.id.imageView46,R.id.imageView47,R.id.imageView48,
            R.id.imageView49,R.id.imageView50,R.id.imageView51,
            R.id.imageView52,R.id.imageView53,R.id.imageView54,
            R.id.imageView55,R.id.imageView56,R.id.imageView57,
            R.id.imageView58,R.id.imageView59,R.id.imageView60,
            R.id.imageView61,R.id.imageView62,R.id.imageView63,
            R.id.imageView64,R.id.imageView65,R.id.imageView66,
            R.id.imageView67,R.id.imageView68,R.id.imageView69,
            R.id.imageView70,R.id.imageView71,R.id.imageView72,
            R.id.imageView73,R.id.imageView74,R.id.imageView75,
            R.id.imageView76,R.id.imageView77,R.id.imageView78,
            R.id.imageView79,R.id.imageView80,R.id.imageView81,
            R.id.imageView82,R.id.imageView83,R.id.imageView84,
            R.id.imageView85,R.id.imageView86,R.id.imageView87,
            R.id.imageView88,
            R.id.imageView89,R.id.imageView90,R.id.imageView91,
            R.id.imageView92,R.id.imageView93,R.id.imageView94,
            R.id.imageView95,R.id.imageView96,R.id.imageView97,
            R.id.imageView98,R.id.imageView99,R.id.imageView100,
            R.id.imageView101,R.id.imageView102,R.id.imageView103,
            R.id.imageView104,R.id.imageView105,R.id.imageView106,
            R.id.imageView107,R.id.imageView108,R.id.imageView109,
            R.id.imageView110,R.id.imageView111,R.id.imageView112,
            R.id.imageView113,R.id.imageView114,R.id.imageView115,
            R.id.imageView116,R.id.imageView117,R.id.imageView118,
            R.id.imageView119,R.id.imageView120,R.id.imageView121,
            R.id.imageView122,R.id.imageView123,R.id.imageView124,
            R.id.imageView125,R.id.imageView126,R.id.imageView127,
            R.id.imageView128,R.id.imageView129,R.id.imageView130,
            R.id.imageView131,R.id.imageView132,R.id.imageView133,
            R.id.imageView134,R.id.imageView135,R.id.imageView136,
            R.id.imageView137,R.id.imageView138,R.id.imageView139,
            R.id.imageView140};


    private FirebaseAuth mAuth;
    FirebaseFirestore db;

    String userID;
    public static final String TAG = "TAG ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn__chapter11);


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
        c34 = (CardView) findViewById(R.id.c34);
        c35 = (CardView) findViewById(R.id.c35);
        c36 = (CardView) findViewById(R.id.c36);
        c37 = (CardView) findViewById(R.id.c37);
        c38 = (CardView) findViewById(R.id.c38);
        c39 = (CardView) findViewById(R.id.c39);
        c40 = (CardView) findViewById(R.id.c40);
        c41 = (CardView) findViewById(R.id.c41);
        c42 = (CardView) findViewById(R.id.c42);
        c43 = (CardView) findViewById(R.id.c43);
        c44 = (CardView) findViewById(R.id.c44);
        c45 = (CardView) findViewById(R.id.c45);
        c46 = (CardView) findViewById(R.id.c46);
        c47 = (CardView) findViewById(R.id.c47);
        c48 = (CardView) findViewById(R.id.c48);
        c49 = (CardView) findViewById(R.id.c49);
        c50 = (CardView) findViewById(R.id.c50);
        c51 = (CardView) findViewById(R.id.c51);
        c52 = (CardView) findViewById(R.id.c52);
        c53 = (CardView) findViewById(R.id.c53);
        c54 = (CardView) findViewById(R.id.c54);
        c55 = (CardView) findViewById(R.id.c55);
        c56 = (CardView) findViewById(R.id.c56);
        c57 = (CardView) findViewById(R.id.c57);
        c58 = (CardView) findViewById(R.id.c58);
        c59 = (CardView) findViewById(R.id.c59);
        c60 = (CardView) findViewById(R.id.c60);
        c61 = (CardView) findViewById(R.id.c61);
        c62 = (CardView) findViewById(R.id.c62);
        c63 = (CardView) findViewById(R.id.c63);
        c64 = (CardView) findViewById(R.id.c64);
        c65 = (CardView) findViewById(R.id.c65);
        c66 = (CardView) findViewById(R.id.c66);
        c67 = (CardView) findViewById(R.id.c67);
        c68 = (CardView) findViewById(R.id.c68);
        c69 = (CardView) findViewById(R.id.c69);
        c70 = (CardView) findViewById(R.id.c70);
        c71 = (CardView) findViewById(R.id.c71);
        c72 = (CardView) findViewById(R.id.c72);
        c73 = (CardView) findViewById(R.id.c73);
        c74 = (CardView) findViewById(R.id.c74);
        c75 = (CardView) findViewById(R.id.c75);
        c76 = (CardView) findViewById(R.id.c76);
        c77 = (CardView) findViewById(R.id.c77);
        c78 = (CardView) findViewById(R.id.c78);
        c79 = (CardView) findViewById(R.id.c79);
        c80 = (CardView) findViewById(R.id.c80);
        c81 = (CardView) findViewById(R.id.c81);
        c82 = (CardView) findViewById(R.id.c82);
        c83 = (CardView) findViewById(R.id.c83);
        c84 = (CardView) findViewById(R.id.c84);
        c85 = (CardView) findViewById(R.id.c85);
        c86 = (CardView) findViewById(R.id.c86);
        c87 = (CardView) findViewById(R.id.c87);
        c88 = (CardView) findViewById(R.id.c88);
        c89 = (CardView) findViewById(R.id.c89);
        c90 = (CardView) findViewById(R.id.c90);
        c91 = (CardView) findViewById(R.id.c91);
        c92 = (CardView) findViewById(R.id.c92);
        c93 = (CardView) findViewById(R.id.c93);
        c94 = (CardView) findViewById(R.id.c94);
        c95 = (CardView) findViewById(R.id.c95);
        c96 = (CardView) findViewById(R.id.c96);
        c97 = (CardView) findViewById(R.id.c97);
        c98 = (CardView) findViewById(R.id.c98);
        c99 = (CardView) findViewById(R.id.c99);
        c100 = (CardView) findViewById(R.id.c100);
        c101 = (CardView) findViewById(R.id.c101);
        c102 = (CardView) findViewById(R.id.c102);
        c103 = (CardView) findViewById(R.id.c103);
        c104 = (CardView) findViewById(R.id.c104);
        c105 = (CardView) findViewById(R.id.c105);
        c106 = (CardView) findViewById(R.id.c106);
        c107 = (CardView) findViewById(R.id.c107);
        c108 = (CardView) findViewById(R.id.c108);
        c109 = (CardView) findViewById(R.id.c109);
        c110 = (CardView) findViewById(R.id.c110);
        c111 = (CardView) findViewById(R.id.c111);
        c112 = (CardView) findViewById(R.id.c112);
        c113 = (CardView) findViewById(R.id.c113);
        c114 = (CardView) findViewById(R.id.c114);
        c115 = (CardView) findViewById(R.id.c115);
        c116 = (CardView) findViewById(R.id.c116);
        c117 = (CardView) findViewById(R.id.c117);
        c118 = (CardView) findViewById(R.id.c118);
        c119 = (CardView) findViewById(R.id.c119);
        c120 = (CardView) findViewById(R.id.c120);
        c121 = (CardView) findViewById(R.id.c121);
        c122 = (CardView) findViewById(R.id.c122);
        c123 = (CardView) findViewById(R.id.c123);
        c124 = (CardView) findViewById(R.id.c124);
        c125 = (CardView) findViewById(R.id.c125);
        c126 = (CardView) findViewById(R.id.c126);
        c127 = (CardView) findViewById(R.id.c127);
        c128 = (CardView) findViewById(R.id.c128);
        c129 = (CardView) findViewById(R.id.c129);
        c130 = (CardView) findViewById(R.id.c130);
        c131 = (CardView) findViewById(R.id.c131);
        c132 = (CardView) findViewById(R.id.c132);
        c133 = (CardView) findViewById(R.id.c133);
        c134 = (CardView) findViewById(R.id.c134);
        c135 = (CardView) findViewById(R.id.c135);
        c136 = (CardView) findViewById(R.id.c136);
        c137 = (CardView) findViewById(R.id.c137);
        c138 = (CardView) findViewById(R.id.c138);
        c139 = (CardView) findViewById(R.id.c139);
        c140 = (CardView) findViewById(R.id.c140);

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
        c34.setOnClickListener(this);
        c35.setOnClickListener(this);
        c36.setOnClickListener(this);
        c37.setOnClickListener(this);
        c38.setOnClickListener(this);
        c39.setOnClickListener(this);
        c40.setOnClickListener(this);
        c41.setOnClickListener(this);
        c42.setOnClickListener(this);
        c43.setOnClickListener(this);
        c44.setOnClickListener(this);
        c45.setOnClickListener(this);
        c46.setOnClickListener(this);
        c47.setOnClickListener(this);
        c48.setOnClickListener(this);
        c49.setOnClickListener(this);
        c50.setOnClickListener(this);
        c51.setOnClickListener(this);
        c52.setOnClickListener(this);
        c53.setOnClickListener(this);
        c54.setOnClickListener(this);
        c55.setOnClickListener(this);
        c56.setOnClickListener(this);
        c57.setOnClickListener(this);
        c58.setOnClickListener(this);
        c59.setOnClickListener(this);
        c60.setOnClickListener(this);
        c61.setOnClickListener(this);
        c62.setOnClickListener(this);
        c63.setOnClickListener(this);
        c64.setOnClickListener(this);
        c65.setOnClickListener(this);
        c66.setOnClickListener(this);
        c67.setOnClickListener(this);
        c68.setOnClickListener(this);
        c69.setOnClickListener(this);
        c70.setOnClickListener(this);
        c71.setOnClickListener(this);
        c72.setOnClickListener(this);
        c73.setOnClickListener(this);
        c74.setOnClickListener(this);
        c75.setOnClickListener(this);
        c76.setOnClickListener(this);
        c77.setOnClickListener(this);
        c78.setOnClickListener(this);
        c79.setOnClickListener(this);
        c80.setOnClickListener(this);
        c81.setOnClickListener(this);
        c82.setOnClickListener(this);
        c83.setOnClickListener(this);
        c84.setOnClickListener(this);
        c85.setOnClickListener(this);
        c86.setOnClickListener(this);
        c87.setOnClickListener(this);
        c88.setOnClickListener(this);
        c89.setOnClickListener(this);
        c90.setOnClickListener(this);
        c91.setOnClickListener(this);
        c92.setOnClickListener(this);
        c93.setOnClickListener(this);
        c94.setOnClickListener(this);
        c95.setOnClickListener(this);
        c96.setOnClickListener(this);
        c97.setOnClickListener(this);
        c98.setOnClickListener(this);
        c99.setOnClickListener(this);
        c100.setOnClickListener(this);
        c101.setOnClickListener(this);
        c102.setOnClickListener(this);
        c103.setOnClickListener(this);
        c104.setOnClickListener(this);
        c105.setOnClickListener(this);
        c106.setOnClickListener(this);
        c107.setOnClickListener(this);
        c108.setOnClickListener(this);
        c109.setOnClickListener(this);
        c110.setOnClickListener(this);
        c111.setOnClickListener(this);
        c112.setOnClickListener(this);
        c113.setOnClickListener(this);
        c114.setOnClickListener(this);
        c115.setOnClickListener(this);
        c116.setOnClickListener(this);
        c117.setOnClickListener(this);
        c118.setOnClickListener(this);
        c119.setOnClickListener(this);
        c120.setOnClickListener(this);
        c121.setOnClickListener(this);
        c122.setOnClickListener(this);
        c123.setOnClickListener(this);
        c124.setOnClickListener(this);
        c125.setOnClickListener(this);
        c126.setOnClickListener(this);
        c127.setOnClickListener(this);
        c128.setOnClickListener(this);
        c129.setOnClickListener(this);
        c130.setOnClickListener(this);
        c131.setOnClickListener(this);
        c132.setOnClickListener(this);
        c133.setOnClickListener(this);
        c134.setOnClickListener(this);
        c135.setOnClickListener(this);
        c136.setOnClickListener(this);
        c137.setOnClickListener(this);
        c138.setOnClickListener(this);
        c139.setOnClickListener(this);
        c140.setOnClickListener(this);
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
            case R.id.c33:
                updateCheck(33);
                break;

            case R.id.c34:
                updateCheck(34);
                break;
            case R.id.c35:
                updateCheck(35);
                break;
            case R.id.c36:
                updateCheck(36);
                break;
            case R.id.c37:
                updateCheck(37);
                break;
            case R.id.c38:
                updateCheck(38);
                break;
            case R.id.c39:
                updateCheck(39);
                break;
            case R.id.c40:
                updateCheck(40);
                break;
            case R.id.c41:
                updateCheck(41);
                break;
            case R.id.c42:
                updateCheck(42);
                break;
            case R.id.c43:
                updateCheck(43);
                break;

            case R.id.c44:
                updateCheck(44);
                break;
            case R.id.c45:
                updateCheck(45);
                break;
            case R.id.c46:
                updateCheck(46);
                break;
            case R.id.c47:
                updateCheck(47);
                break;
            case R.id.c48:
                updateCheck(48);
                break;
            case R.id.c49:
                updateCheck(49);
                break;
            case R.id.c50:
                updateCheck(50);
                break;
            case R.id.c51:
                updateCheck(51);
                break;
            case R.id.c52:
                updateCheck(52);
                break;
            case R.id.c53:
                updateCheck(53);
                break;

            case R.id.c54:
                updateCheck(54);
                break;
            case R.id.c55:
                updateCheck(55);
                break;
            case R.id.c56:
                updateCheck(56);
                break;
            case R.id.c57:
                updateCheck(57);
                break;
            case R.id.c58:
                updateCheck(58);
                break;
            case R.id.c59:
                updateCheck(59);
                break;
            case R.id.c60:
                updateCheck(60);
                break;
            case R.id.c61:
                updateCheck(61);
                break;
            case R.id.c62:
                updateCheck(62);
                break;
            case R.id.c63:
                updateCheck(63);
                break;

            case R.id.c64:
                updateCheck(64);
                break;
            case R.id.c65:
                updateCheck(65);
                break;
            case R.id.c66:
                updateCheck(66);
                break;
            case R.id.c67:
                updateCheck(67);
                break;
            case R.id.c68:
                updateCheck(68);
                break;
            case R.id.c69:
                updateCheck(69);
                break;
            case R.id.c70:
                updateCheck(70);
                break;
            case R.id.c71:
                updateCheck(71);
                break;
            case R.id.c72:
                updateCheck(72);
                break;
            case R.id.c73:
                updateCheck(73);
                break;

            case R.id.c74:
                updateCheck(74);
                break;
            case R.id.c75:
                updateCheck(75);
                break;
            case R.id.c76:
                updateCheck(76);
                break;
            case R.id.c77:
                updateCheck(77);
                break;
            case R.id.c78:
                updateCheck(78);
                break;
            case R.id.c79:
                updateCheck(79);
                break;
            case R.id.c80:
                updateCheck(80);
                break;
            case R.id.c81:
                updateCheck(81);
                break;
            case R.id.c82:
                updateCheck(82);
                break;
            case R.id.c83:
                updateCheck(83);
                break;
            case R.id.c84:
                updateCheck(84);
                break;
            case R.id.c85:
                updateCheck(85);
                break;
            case R.id.c86:
                updateCheck(86);
                break;
            case R.id.c87:
                updateCheck(87);
                break;
            case R.id.c88:
                updateCheck(88);
                break;
            case R.id.c89:
                updateCheck(89);
                break;
            case R.id.c90:
                updateCheck(90);
                break;
            case R.id.c91:
                updateCheck(91);
                break;
            case R.id.c92:
                updateCheck(92);
                break;
            case R.id.c93:
                updateCheck(93);
                break;
            case R.id.c94:
                updateCheck(94);
                break;
            case R.id.c95:
                updateCheck(95);
                break;
            case R.id.c96:
                updateCheck(96);
                break;
            case R.id.c97:
                updateCheck(97);
                break;
            case R.id.c98:
                updateCheck(98);
                break;
            case R.id.c99:
                updateCheck(99);
                break;
            case R.id.c100:
                updateCheck(100);
                break;
            case R.id.c101:
                updateCheck(101);
                break;
            case R.id.c102:
                updateCheck(102);
                break;
            case R.id.c103:
                updateCheck(103);
                break;
            case R.id.c104:
                updateCheck(104);
                break;
            case R.id.c105:
                updateCheck(105);
                break;
            case R.id.c106:
                updateCheck(106);
                break;
            case R.id.c107:
                updateCheck(107);
                break;
            case R.id.c108:
                updateCheck(108);
                break;
            case R.id.c109:
                updateCheck(109);
            case R.id.c110:
                updateCheck(110);
                break;
            case R.id.c111:
                updateCheck(111);
                break;
            case R.id.c112:
                updateCheck(112);
                break;
            case R.id.c113:
                updateCheck(113);
                break;
            case R.id.c114:
                updateCheck(114);
                break;
            case R.id.c115:
                updateCheck(115);
                break;
            case R.id.c116:
                updateCheck(116);
                break;
            case R.id.c117:
                updateCheck(117);
                break;
            case R.id.c118:
                updateCheck(118);
                break;
            case R.id.c119:
                updateCheck(119);
                break;
            case R.id.c120:
                updateCheck(120);
                break;
            case R.id.c121:
                updateCheck(121);
                break;
            case R.id.c122:
                updateCheck(122);
                break;
            case R.id.c123:
                updateCheck(123);
                break;
            case R.id.c124:
                updateCheck(124);
                break;
            case R.id.c125:
                updateCheck(125);
                break;
            case R.id.c126:
                updateCheck(126);
                break;
            case R.id.c127:
                updateCheck(127);
                break;
            case R.id.c128:
                updateCheck(128);
                break;
            case R.id.c129:
                updateCheck(129);
                break;
            case R.id.c130:
                updateCheck(130);
                break;
            case R.id.c131:
                updateCheck(131);
                break;
            case R.id.c132:
                updateCheck(132);
                break;
            case R.id.c133:
                updateCheck(133);
                break;
            case R.id.c134:
                updateCheck(134);
                break;
            case R.id.c135:
                updateCheck(135);
                break;
            case R.id.c136:
                updateCheck(136);
                break;
            case R.id.c137:
                updateCheck(137);
                break;
            case R.id.c138:
                updateCheck(138);
                break;
            case R.id.c139:
                updateCheck(139);
                break;

            default:
                updateCheck(140);
                break;


        }

    }

    public void next(int i){

    }
    public void modifyScreen(){
        SharedPreferences prefs = getSharedPreferences("SharedData", MODE_PRIVATE);
        long chaptervalue = prefs.getLong("learnChapterElevenQari"+Qari, 1000);





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
        long chaptervalue = prefs.getLong("learnChapterElevenQari"+Qari, 1000);

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
        long chaptervalue = prefs.getLong("learnChapterElevenQari"+Qari, 1000);

        SharedPreferences.Editor editor = getSharedPreferences("SharedData", MODE_PRIVATE).edit();
        editor.putLong("learnChapterElevenQari"+Qari,chaptervalue+1);
        editor.apply();

        updateOnServer(prefs.getLong("learnChapterElevenQari"+Qari, 1000));

    }
    public void updateOnServer(long chaptervalue){


        userID = mAuth.getCurrentUser().getUid();

        db.collection("users").document(userID)
                .update("learnChapterElevenQari"+Qari, chaptervalue)
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
