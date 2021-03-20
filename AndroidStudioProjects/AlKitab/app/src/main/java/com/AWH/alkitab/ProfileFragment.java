package com.AWH.alkitab;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileFragment extends Fragment {

    CardView c1,c2,c3,c4,c5;

    private FirebaseAuth mFirebaseAuth;




    String [] chapterName = {"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen"};
    int [] chapterTotal = {30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        c1 = v.findViewById(R.id.c1);
        c2 = v.findViewById(R.id.c2);
        c3 = v.findViewById(R.id.c3);
        c4 = v.findViewById(R.id.c4);
        c5 = v.findViewById(R.id.c5);

        mFirebaseAuth = FirebaseAuth.getInstance();

        SharedPreferences pref = this.getActivity().getSharedPreferences("SharedData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();



        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),aboutUs.class);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),qari_select.class);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.signOut();
                Intent intent = new Intent(getActivity(),Login.class);
                startActivity(intent);
                editor.clear();
                editor.apply();



                getActivity().onBackPressed();

            }
        });

        return v;
    }
}
