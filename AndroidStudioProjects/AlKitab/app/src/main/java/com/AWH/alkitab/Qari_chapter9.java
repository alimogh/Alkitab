package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Qari_chapter9 extends AppCompatActivity implements View.OnClickListener {

    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,
            c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,
            c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,c75,c76,c77,c78,c79,c80,c81,c82,c83,c84,c85,c86,c87,c88,c89,c90,
            c91,c92,c93,c94,c95,c96,c97,c98,c99,c100,c101;

    int [] img = {  R.drawable.i1,R.drawable.i2,R.drawable.i3,
            R.drawable.i4,R.drawable.i5,R.drawable.i6,
            R.drawable.i7,R.drawable.i8,R.drawable.i9,
            R.drawable.i10,R.drawable.i11,R.drawable.i12,
            R.drawable.i13,R.drawable.i14,R.drawable.i15,
            R.drawable.i16,R.drawable.i17,R.drawable.i18,
            R.drawable.i19,R.drawable.i20,R.drawable.i21,
            R.drawable.i22,R.drawable.i23,R.drawable.i24,
            R.drawable.i25,R.drawable.i26,R.drawable.i27,
            R.drawable.i28,R.drawable.i29,R.drawable.i30,
            R.drawable.i31,R.drawable.i32,R.drawable.i33,
            R.drawable.i34,R.drawable.i35,R.drawable.i36,
            R.drawable.i37,R.drawable.i38,R.drawable.i39,
            R.drawable.i40,R.drawable.i41,R.drawable.i42,
            R.drawable.i43,R.drawable.i44,R.drawable.i45,
            R.drawable.i46,R.drawable.i47,R.drawable.i48,
            R.drawable.i49,R.drawable.i50,R.drawable.i51,
            R.drawable.i52,R.drawable.i53,R.drawable.i54,
            R.drawable.i55,R.drawable.i56,R.drawable.i57,
            R.drawable.i58,R.drawable.i59,R.drawable.i60,
            R.drawable.i61,R.drawable.i62,R.drawable.i63,
            R.drawable.i64,R.drawable.i65,R.drawable.i66,
            R.drawable.i67,R.drawable.i68,R.drawable.i69,
            R.drawable.i70,R.drawable.i71,R.drawable.i72,
            R.drawable.i73,R.drawable.i74,R.drawable.i75,
            R.drawable.i76,R.drawable.i77,R.drawable.i78,
            R.drawable.i79,R.drawable.i80,R.drawable.i81,
            R.drawable.i82,R.drawable.i83,R.drawable.i84,
            R.drawable.i85,R.drawable.i86,R.drawable.i87,
            R.drawable.i88,
            R.drawable.i89,R.drawable.i90,R.drawable.i91,
            R.drawable.i92,R.drawable.i93,R.drawable.i94,
            R.drawable.i95,R.drawable.i96,R.drawable.i97,
            R.drawable.i98,R.drawable.i99,R.drawable.i100,
            R.drawable.i101};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qari_chapter9);

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

            case R.id.c54:
                next(53);
                break;
            case R.id.c55:
                next(54);
                break;
            case R.id.c56:
                next(55);
                break;
            case R.id.c57:
                next(56);
                break;
            case R.id.c58:
                next(57);
                break;
            case R.id.c59:
                next(58);
                break;
            case R.id.c60:
                next(59);
                break;
            case R.id.c61:
                next(60);
                break;
            case R.id.c62:
                next(61);
                break;
            case R.id.c63:
                next(62);
                break;

            case R.id.c64:
                next(63);
                break;
            case R.id.c65:
                next(64);
                break;
            case R.id.c66:
                next(65);
                break;
            case R.id.c67:
                next(66);
                break;
            case R.id.c68:
                next(67);
                break;
            case R.id.c69:
                next(68);
                break;
            case R.id.c70:
                next(69);
                break;
            case R.id.c71:
                next(70);
                break;
            case R.id.c72:
                next(71);
                break;
            case R.id.c73:
                next(72);
                break;

            case R.id.c74:
                next(73);
                break;
            case R.id.c75:
                next(74);
                break;
            case R.id.c76:
                next(75);
                break;
            case R.id.c77:
                next(76);
                break;
            case R.id.c78:
                next(77);
                break;
            case R.id.c79:
                next(78);
                break;
            case R.id.c80:
                next(79);
                break;
            case R.id.c81:
                next(80);
                break;
            case R.id.c82:
                next(81);
                break;
            case R.id.c83:
                next(82);
                break;
            case R.id.c84:
                next(83);
                break;
            case R.id.c85:
                next(84);
                break;
            case R.id.c86:
                next(85);
                break;
            case R.id.c87:
                next(86);
                break;
            case R.id.c88:
                next(87);
                break;
            case R.id.c89:
                next(88);
                break;
            case R.id.c90:
                next(89);
                break;
            case R.id.c91:
                next(90);
                break;
            case R.id.c92:
                next(91);
                break;
            case R.id.c93:
                next(92);
                break;
            case R.id.c94:
                next(93);
                break;
            case R.id.c95:
                next(94);
                break;
            case R.id.c96:
                next(95);
                break;
            case R.id.c97:
                next(96);
                break;
            case R.id.c98:
                next(97);
                break;
            case R.id.c99:
                next(98);
                break;
            case R.id.c100:
                next(99);
                break;
            default:
                next(100);
                break;
        }
    }
    public void next(int i){
        Intent intent = new Intent(Qari_chapter9.this,Record.class);
        intent.putExtra("img",img[i]);
        intent.putExtra("filenumber",i+1);
        intent.putExtra("chapter","Chapter 9");
        startActivity(intent);
    }
}