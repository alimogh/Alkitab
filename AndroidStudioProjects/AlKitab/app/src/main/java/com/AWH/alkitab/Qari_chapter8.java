package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Qari_chapter8 extends AppCompatActivity implements View.OnClickListener {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,
            c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,
            c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,c75,c76,c77,c78,c79,c80,c81,c82,c83,c84,c85,c86,c87,c88,c89,c90,
            c91,c92,c93,c94,c95,c96,c97,c98,c99,c100,c101,c102,c103,c104,c105,c106,c107,c108,c109,c110,c111,c112,c113,c114,c115,c116,c117,c118,c119,c120,
            c121,c122,c123,c124,c125,c126,c127,c128,c129,c130,c131,c132,c133,c134,c135,c136,c137,c138,c139,c140;

    int [] img = {  R.drawable.h1,R.drawable.h2,R.drawable.h3,
            R.drawable.h4,R.drawable.h5,R.drawable.h6,
            R.drawable.h7,R.drawable.h8,R.drawable.h9,
            R.drawable.h10,R.drawable.h11,R.drawable.h12,
            R.drawable.h13,R.drawable.h14,R.drawable.h15,
            R.drawable.h16,R.drawable.h17,R.drawable.h18,
            R.drawable.h19,R.drawable.h20,R.drawable.h21,
            R.drawable.h22,R.drawable.h23,R.drawable.h24,
            R.drawable.h25,R.drawable.h26,R.drawable.h27,
            R.drawable.h28,R.drawable.h29,R.drawable.h30,
            R.drawable.h31,R.drawable.h32,R.drawable.h33,
            R.drawable.h34,R.drawable.h35,R.drawable.h36,
            R.drawable.h37,R.drawable.h38,R.drawable.h39,
            R.drawable.h40,R.drawable.h41,R.drawable.h42,
            R.drawable.h43,R.drawable.h44,R.drawable.h45,
            R.drawable.h46,R.drawable.h47,R.drawable.h48,
            R.drawable.h49,R.drawable.h50,R.drawable.h51,
            R.drawable.h52,R.drawable.h53,R.drawable.h54,
            R.drawable.h55,R.drawable.h56,R.drawable.h57,
            R.drawable.h58,R.drawable.h59,R.drawable.h60,
            R.drawable.h61,R.drawable.h62,R.drawable.h63,
            R.drawable.h64,R.drawable.h65,R.drawable.h66,
            R.drawable.h67,R.drawable.h68,R.drawable.h69,
            R.drawable.h70,R.drawable.h71,R.drawable.h72,
            R.drawable.h73,R.drawable.h74,R.drawable.h75,
            R.drawable.h76,R.drawable.h77,R.drawable.h78,
            R.drawable.h79,R.drawable.h80,R.drawable.h81,
            R.drawable.h82,R.drawable.h83,R.drawable.h84,
            R.drawable.h85,R.drawable.h86,R.drawable.h87,
            R.drawable.h88,
            R.drawable.h89,R.drawable.h90,R.drawable.h91,
            R.drawable.h92,R.drawable.h93,R.drawable.h94,
            R.drawable.h95,R.drawable.h96,R.drawable.h97,
            R.drawable.h98,R.drawable.h99,R.drawable.h100,
            R.drawable.h101,R.drawable.h102,R.drawable.h103,
            R.drawable.h104,R.drawable.h105,R.drawable.h106,
            R.drawable.h107,R.drawable.h108,R.drawable.h109,
            R.drawable.h110,R.drawable.h111,R.drawable.h112,
            R.drawable.h113,R.drawable.h114,R.drawable.h115,
            R.drawable.h116,R.drawable.h117,R.drawable.h118,
            R.drawable.h119,R.drawable.h120,R.drawable.h121,
            R.drawable.h122,R.drawable.h123,R.drawable.h124,
            R.drawable.h125,R.drawable.h126,R.drawable.h127,
            R.drawable.h128,R.drawable.h129,R.drawable.h130,
            R.drawable.h131,R.drawable.h132,R.drawable.h133,
            R.drawable.h134,R.drawable.h135,R.drawable.h136,
            R.drawable.h137,R.drawable.h138,R.drawable.h139,
            R.drawable.h140};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qari_chapter8);

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
            case R.id.c101:
                next(100);
                break;
            case R.id.c102:
                next(101);
                break;
            case R.id.c103:
                next(102);
                break;
            case R.id.c104:
                next(103);
                break;
            case R.id.c105:
                next(104);
                break;
            case R.id.c106:
                next(105);
                break;
            case R.id.c107:
                next(106);
                break;
            case R.id.c108:
                next(107);
                break;
            case R.id.c109:
                next(108);
            case R.id.c110:
                next(109);
                break;
            case R.id.c111:
                next(110);
                break;
            case R.id.c112:
                next(111);
                break;
            case R.id.c113:
                next(112);
                break;
            case R.id.c114:
                next(113);
                break;
            case R.id.c115:
                next(114);
                break;
            case R.id.c116:
                next(115);
                break;
            case R.id.c117:
                next(116);
                break;
            case R.id.c118:
                next(117);
                break;
            case R.id.c119:
                next(118);
                break;
            case R.id.c120:
                next(119);
                break;
            case R.id.c121:
                next(120);
                break;
            case R.id.c122:
                next(121);
                break;
            case R.id.c123:
                next(122);
                break;
            case R.id.c124:
                next(123);
                break;
            case R.id.c125:
                next(124);
                break;
            case R.id.c126:
                next(825);
                break;
            case R.id.c127:
                next(126);
                break;
            case R.id.c128:
                next(127);
                break;
            case R.id.c129:
                next(128);
                break;
            case R.id.c130:
                next(129);
                break;
            case R.id.c131:
                next(130);
                break;
            case R.id.c132:
                next(131);
                break;
            case R.id.c133:
                next(132);
                break;
            case R.id.c134:
                next(133);
                break;
            case R.id.c135:
                next(134);
                break;
            case R.id.c136:
                next(135);
                break;
            case R.id.c137:
                next(136);
                break;
            case R.id.c138:
                next(137);
                break;
            case R.id.c139:
                next(138);
                break;


            default:
                next(140);
                break;


        }
    }
    public void next(int i){
        Intent intent = new Intent(Qari_chapter8.this,Record.class);
        intent.putExtra("img",img[i]);
        intent.putExtra("filenumber",i+1);
        intent.putExtra("chapter","Chapter 8");
        startActivity(intent);
    }
}