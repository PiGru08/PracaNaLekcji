package com.example.pracanalekcji;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> obrazy = new ArrayList<>();
    Button buttonRzucKoscmi;
    Button buttonResetWyniku;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    TextView textViewWynikLosowania;
    TextView textViewWynikgry;
    Random liczba = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obraz1 = findViewById(R.id.imageView5);
        //obraz1.setImageResource(R.drawable.kosc1);
        int[] kosci = new int[]{R.drawable.kosc1,R.drawable.kosc2, R.drawable.kosc3, R.drawable.kosc4, R.drawable.kosc5, R.drawable.kosc6};
        buttonResetWyniku = findViewById(R.id.buttonResetWyniku);
        buttonRzucKoscmi = findViewById(R.id.buttonRzuc);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        obrazy.add(imageView1);
        obrazy.add(imageView2);
        obrazy.add(imageView3);
        obrazy.add(imageView4);
        obrazy.add(imageView5);
        textViewWynikgry = findViewById(R.id.textViewWynikGry);
        textViewWynikLosowania = findViewById(R.id.textViewWynikLosowania);

        buttonRzucKoscmi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        imageView1.setImageResource(kosci[liczba.nextInt(kosci.length)]);
                        imageView2.setImageResource(kosci[liczba.nextInt(kosci.length)]);
                        imageView3.setImageResource(kosci[liczba.nextInt(kosci.length)]);
                        imageView4.setImageResource(kosci[liczba.nextInt(kosci.length)]);
                        imageView5.setImageResource(kosci[liczba.nextInt(kosci.length)]);
                        if(kosci == 1){

                        }
                    }
                }
        );
    }
}