package com.example.tarea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class NosotrosFragment extends Fragment {


    public NosotrosFragment() {
        // Required empty public constructor
    }

    ImageButton google, facebook, link, youtube;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nosotros, container, false);

        google = view.findViewById(R.id.btngoogle);
        facebook=view.findViewById(R.id.btnfacebook);
        youtube=view.findViewById(R.id.btnvideo);
        link=view.findViewById(R.id.btnlink);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri google = Uri.parse("https://www.tudiscovery.com/animal-planet");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri youtube = Uri.parse("https://www.youtube.com/c/Programaci%C3%B3nATS");
                Intent intent = new Intent(Intent.ACTION_VIEW,youtube);
                startActivity(intent);

            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://discord.com/channels/@me");
                Intent intent = new Intent(Intent.ACTION_VIEW,link);
                startActivity(intent);

            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri facebook = Uri.parse("https://web.facebook.com/aldana.rojas.585112");
                Intent intent = new Intent(Intent.ACTION_VIEW,facebook);
                startActivity(intent);
            }
        });

        return view;
    }
}