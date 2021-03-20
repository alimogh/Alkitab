package com.AWH.alkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prayer_select extends AppCompatActivity {

    CardView c1,c2;
    String male;
    String female;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_select);

        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);

        male = "The right way to perform namaz(salah) for men. \n" +
                "\n" +
                "\n" +
                "Niyah\n" +
                "Before salah one should perform wadhu or ghusl (whichever is required). Your place of praying should be clean. Make sure your body is covered from your neck till knees. Your hairs should be covered with a cap or a cloth. Your face should be towards QIBLAH. Make intention quietly for whatever prayer you wish for. Eyes should be fixed on the spot where your head will be in SAJJDAH. There should be 4 fingers gap between your feet. \n" +
                "\n" +
                "\n" +
                "Takbeer e tehreema \n" +
                "\n" +
                "After niyah, raise your hands to the level of your ears, keep your fingers slightly open and your palms towards the QIBLAH. Your eyes should be fixed on the spot where your head will be in SAJJDAH. \n" +
                "\n" +
                "And than say “ALLAH HU AKHBAR”\n" +
                "\n" +
                "\n" +
                "Then men should keep their hands below their navel making a ring around their wrist. Right hand above the left hand. Three fingers on the left hand, thumb and the small finger around the left hand wrist. \n" +
                "\n" +
                "\n" +
                "Start with the recitation of Dua\n" +
                "\n" +
                "“Subhana kallah humma wa bi-hamdika watabara kasmuka wata 'ala jad-duka, wa la ilaha ghayruk.”\n" +
                "\n" +
                "Than recite TAAWUDH ''Audhu billahi mina shaitaan nir rajeem\" \n" +
                "\n" +
                "and TASMIYAH ''Bismillah ir-Rahman ir-Rahim''\n" +
                "\n" +
                "silently. Then recite Surah Fatiha. After that recite any surah from the HOLY QURAN. \n" +
                "\n" +
                "\n" +
                "RUKU:\n" +
                "\n" +
                "In ruku men should bend enough to make their backs straight while keeping their hands on their knees with fingers open. Eyes should be fixed where your head rests in SAJJDAH \n" +
                "\n" +
                "\n" +
                "While bending one should say “ALLAH HU AKBAR” keeping their hands up to ears level and once they are in the ruku position they should recite. \n" +
                "\n" +
                "Subhana Rabiyy al-'Adheem\n" +
                "3 times atleast \n" +
                "\n" +
                "\n" +
                "\n" +
                "QAWMAH is to stand up from the ruku and return to Takbeer e Tehreema. Position your arms straight to your sides. While standing up from the ruku you should recite TASMEE raising your hands up to your ear level. \n" +
                "\n" +
                "\"Sami'a-l-lahu Liman hamida.\" \n" +
                "\n" +
                "And when you are standing upright then lower your hands to your waist and say TAMHEED\n" +
                "\n" +
                "“Rabbana walakal-hamd.”\n" +
                "\n" +
                "\n" +
                "SAJJDAH\n" +
                "\n" +
                "After tamheed recite “ALLAH HU AKHBAR” before going into sajdah. \n" +
                "\n" +
                "And also make sure your forehead, nose, palms of both hands, knees, and both toes are touching the ground.\n" +
                "\n" +
                "Recite ''Subhana rabbil Allah\" \n" +
                "3,5,7 or 11 times in Sajdah \n" +
                "\n" +
                "TASHAHHUD\n" +
                "\n" +
                "Get up from the floor reciting “ALLAH HU AKHBAR” in order of forehead first, nose, hands and than sit straight (JALSA) on your left leg. Your left foot will rest on the floor while your right foot is upright. Place your hands on your knees.\n" +
                "\n" +
                "\n" +
                "When you are in this position it is recommended to ask Allah for forgiveness. A simple and easy dua you can say is:\n" +
                "\n" +
                "Rabbigh-fir lee\n" +
                "\n" +
                "Rest for a moment and then say “ALLAH HU AKHBAR” and prostrate again second time reciting the TASBEEH\n" +
                "\n" +
                "Quood \n" +
                "\n" +
                "Get up from the second sajdah, stand up back to the qiyaam position. This completes one rak’aah of prayer. \n" +
                "The second rak’aah is performed in the same manner but it starts from tasmiyah then followed by surah Fatiha and then further. \n" +
                "\n" +
                "AT TASHAHHUD: \n" +
                "\n" +
                "After the second sajdah of the second rak’aah remain seated on your legs and knees. \n" +
                "\n" +
                "And recite quietly\n" +
                " “At-Tahiyatu-lillahi Was-Salawatu, Wat-Taiyibatu, As-Salamu 'Alaika aiyuhan-Nabiyyu wa Rah-matul-lahi wa Barakatuhu, As-Salamu 'Alaina wa 'ala 'Ibadillahi assalihin,”\n" +
                " \n" +
                "While reciting, when the words “Ash-hadu an la ilaaha” are recited, use right hand thumb and middle finger to make a circle and raise the index finger high enough to face it towards the QIBLAH. Drop the finger back again after reciting “al-laa ilaaha”\n" +
                "\n" +
                "Followed by DUROOD E IBRAHIM and any of thé Surah. \n" +
                "\n" +
                "\n" +
                "If you’re performing 3 rak’aah for\n" +
                "Maghrib or Isha or 4 rak’aah for (zuhr, asr, isha) than stand up from tashahhud. \n" +
                "\n" +
                "Salaam. \n" +
                "\n" +
                "Now turn your face to look at your right shoulder reciting “ASSALAAM O ALAIKIUM WAA REHMATUL LAAHI WAA BARAKATU HU” \n" +
                "And again to your left shoulder reciting the same.";
        female = "The right method to perform salah for women. \n" +
                "\n" +
                "Niyah:\n" +
                "Before salah, one should perform wadhu or ghusl (which ever is required). Your clothes and place of praying should be clean. Your Satr should be covered. Women Satr in salah is to cover everything except hands,face and feet. Your face should be towards QIBLAH. Make intention quietly for whatever prayer you wish for. Eyes should be fixed on the spot where your head will be in SAJJDAH. Keep your feet joined together. \n" +
                "\n" +
                "Takbeer e tehreema \n" +
                "\n" +
                "After niyah, raise your hands to the height of your shoulders make sure your fingers are together and your palm towards QIBLAH. Your eyes should be focused on the place of sajdah. \n" +
                "\n" +
                "And than say “ALLAH HU AKHBAR” \n" +
                "\n" +
                "After this women should place their hands over the chest. Right hand above the left hand, keeping the fingers and thumb together. But make sure you don’t make ring around your wrist like men do. \n" +
                "\n" +
                "Start with the recitation of Dua\n" +
                "\n" +
                "“Subhana kallah humma wa bi-hamdika watabara kasmuka wata 'ala jad-duka, wa la ilaha ghayruk.”\n" +
                "\n" +
                "Than recite TAAWUDH ''Audhu billahi mina shaitaan nir rajeem\" \n" +
                "\n" +
                "and TASMIYAH ''Bismillah ir-Rahman ir-Rahim''\n" +
                "\n" +
                "silently. Then recite Surah Fatiha. After that recite any surah from the HOLY QURAN. \n" +
                "\n" +
                "RUKU:\n" +
                "\n" +
                "Women should only bend down sufficiently so that their fingers can touch their knees with the fingers kept together. Also knees should be bent and back should not be straight like men. Elbows should touch the body and eyes should be on toes. \n" +
                "\n" +
                "While bending one should say “ALLAH HU AKBAR” keeping their hands up to their shoulder level and once they are in the ruku position they should recite. \n" +
                "\n" +
                "Subhana Rabiyy al-'Adheem\n" +
                "3 times atleast \n" +
                "\n" +
                "\n" +
                "\n" +
                "QAWMAH is to stand up from the ruku and return to Takbeer e Tehreema. Position your arms straight to your sides. While standing up from the ruku you should recite TASMEE \n" +
                "\n" +
                "\"Sami'a-l-lahu Liman hamida.\" \n" +
                "\n" +
                "and when stood up recite TAMHEED\n" +
                "\n" +
                "“Rabbana walakal-hamd.”\n" +
                "\n" +
                "\n" +
                "\n" +
                "SAJJDAH\n" +
                "\n" +
                "After tamheed recite “ALLAH HU AKHBAR” before going into sajdah. \n" +
                "Starting by lowering your knees to the ground and keeping your back straight but unlike men women may bend their back going into sajdah, then palms of the both hands, then nose and finally head. Keep your eyes focused towards the nose. Women should keep their limbs close together and close to the ground, including the arms, elbows, bottom and feet. Both feet should point out to the right and toes towards the QIBLAH. \n" +
                "\n" +
                "Recite ''Subhana rabbil Allah\" \n" +
                "3,5,7 or 11 times in Sajdah \n" +
                "\n" +
                "\n" +
                "TASHAHHUD\n" +
                "\n" +
                "Get up from the floor reciting “ALLAH HU AKHBAR” in order of forehead first, nose, hands and than sit straight (JALSA) place your hands on lower thigh not on knees and your eyes between the front of your hands in your lap. While resting on the floor, women feet should be pointing out to the right. \n" +
                "Rest for a moment and then say “ALLAH HU AKHBAR” and prostrate again second time reciting the TASBEEH\n" +
                "\n" +
                "Quood \n" +
                "\n" +
                "Get up from the second sajdah, stand up back to the qiyaam position. This completes one rak’aah of prayer. \n" +
                "The second rak’aah is performed in the same manner but it starts from tasmiyah then followed by surah Fatiha and then further. \n" +
                "\n" +
                "AT TASHAHHUD: \n" +
                "\n" +
                "After the second sajdah of the second rak’aah remain seated. \n" +
                "\n" +
                "And recite quietly\n" +
                " “At-Tahiyatu-lillahi Was-Salawatu, Wat-Taiyibatu, As-Salamu 'Alaika aiyuhan-Nabiyyu wa Rah-matul-lahi wa Barakatuhu, As-Salamu 'Alaina wa 'ala 'Ibadillahi assalihin,”\n" +
                " \n" +
                "While reciting, when the words “Ash-hadu an la ilaaha” are recited, use right hand thumb and middle finger to make a circle and raise the index finger high enough to face it towards the QIBLAH. Drop the finger back again after reciting “al-laa ilaaha”\n" +
                "\n" +
                "Followed by DUROOD E IBRAHIM and any of thé Surah. \n" +
                "\n" +
                "\n" +
                "If you’re performing 3 rak’aah for\n" +
                "Maghrib or Isha or 4 rak’aah for (zuhr, asr, isha) than stand up from tashahhud. \n" +
                "\n" +
                "Salaam. \n" +
                "\n" +
                "Now turn your face to look at your right shoulder reciting “ASSALAAM O ALAIKIUM WAA REHMATUL LAAHI WAA BARAKATU HU” \n" +
                "And again to your left shoulder reciting the same.";

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(prayer_select.this,prayer.class);
                intent.putExtra("method",male);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(prayer_select.this,prayer.class);
                intent.putExtra("method",female);
                startActivity(intent);
            }
        });
    }
}