

package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Qari_chapter6 extends AppCompatActivity implements View.OnClickListener {

    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,
            c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54;

    int [] img = {  R.drawable.f1, R.drawable.f2, R.drawable.f3,
            R.drawable.f4, R.drawable.f5, R.drawable.f6,
            R.drawable.f7, R.drawable.f8, R.drawable.f9,
            R.drawable.f10, R.drawable.f11, R.drawable.f12,
            R.drawable.f13, R.drawable.f14, R.drawable.f15,
            R.drawable.f16, R.drawable.f17, R.drawable.f18,
            R.drawable.f19, R.drawable.f20, R.drawable.f21,
            R.drawable.f22, R.drawable.f23, R.drawable.f24,
            R.drawable.f25, R.drawable.f26, R.drawable.f27,
            R.drawable.f28, R.drawable.f29, R.drawable.f30,
            R.drawable.f31, R.drawable.f32, R.drawable.f33,
            R.drawable.f34, R.drawable.f35, R.drawable.f36,
            R.drawable.f37, R.drawable.f38, R.drawable.f39,
            R.drawable.f40, R.drawable.f41, R.drawable.f42,
            R.drawable.f43, R.drawable.f44, R.drawable.f45,
            R.drawable.f46, R.drawable.f47, R.drawable.f48,
            R.drawable.f49, R.drawable.f50, R.drawable.f51,
            R.drawable.f52,R.drawable.f53,R.drawable.f54};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qari_chapter6);

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
        
        
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.c1:
                next(0);
                break;
            case R.id.c2:
                next(1);
                break;
            case R.id.c3:
                next(2);
                break;

            case R.id.c4:
                next(3);
                break;
            case R.id.c5:
                next(4);
                break;
            case R.id.c6:
                next(5);
                break;
            case R.id.c7:
                next(6);
                break;
            case R.id.c8:
                next(7);
                break;
            case R.id.c9:
                next(8);
                break;
            case R.id.c10:
                next(9);
                break;
            case R.id.c11:
                next(10);
                break;
            case R.id.c12:
                next(11);
                break;
            case R.id.c13:
                next(12);
                break;
            case R.id.c14:
                next(13);
                break;
            case R.id.c15:
                next(14);
                break;
            case R.id.c16:
                next(15);
                break;
            case R.id.c17:
                next(16);
                break;
            case R.id.c18:
                next(17);
                break;
            case R.id.c19:
                next(18);
                break;
            case R.id.c20:
                next(19);
                break;
            case R.id.c21:
                next(20);
                break;
            case R.id.c22:
                next(21);
                break;
            case R.id.c23:
                next(22);
                break;
            case R.id.c24:
                next(23);
                break;
            case R.id.c25:
                next(24);
                break;
            case R.id.c26:
                next(25);
                break;
            case R.id.c27:
                next(26);
                break;
            case R.id.c28:
                next(27);
                break;
            case R.id.c29:
                next(28);
                break;
            case R.id.c30:
                next(29);
                break;

            case R.id.c31:
                next(30);
                break;
            case R.id.c32:
                next(31);
                break;
            case R.id.c33:
                next(32);
                break;

            case R.id.c34:
                next(33);
                break;
            case R.id.c35:
                next(34);
                break;
            case R.id.c36:
                next(35);
                break;
            case R.id.c37:
                next(36);
                break;
            case R.id.c38:
                next(37);
                break;
            case R.id.c39:
                next(38);
                break;
            case R.id.c40:
                next(39);
                break;
            case R.id.c41:
                next(40);
                break;
            case R.id.c42:
                next(41);
                break;
            case R.id.c43:
                next(42);
                break;

            case R.id.c44:
                next(43);
                break;
            case R.id.c45:
                next(44);
                break;
            case R.id.c46:
                next(45);
                break;
            case R.id.c47:
                next(46);
                break;
            case R.id.c48:
                next(47);
                break;
            case R.id.c49:
                next(48);
                break;
            case R.id.c50:
                next(49);
                break;
            case R.id.c51:
                next(50);
                break;
            case R.id.c52:
                next(51);
                break;
            case R.id.c53:
                next(52);
                break;
            default:
                next(53);
                break;
        }
        
    }
    public void next(int i){
        Intent intent = new Intent(Qari_chapter6.this,Record.class);
        intent.putExtra("img",img[i]);
        intent.putExtra("filenumber",i+1);
        intent.putExtra("chapter","Chapter 6");
        startActivity(intent);
    }
}