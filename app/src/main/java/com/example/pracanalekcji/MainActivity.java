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
    ArrayList<Integer> indeksy = new ArrayList<>();
    int wynik;
    int wynikGry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obraz1.setImageResource(R.drawable.kosc1);
        int[] kosci = new int[]{0,R.drawable.kosc1,R.drawable.kosc2, R.drawable.kosc3, R.drawable.kosc4, R.drawable.kosc5, R.drawable.kosc6};
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
                        wynik = 0;
                        int los1 = liczba.nextInt(6)+1;
                        int los2 = liczba.nextInt(6)+1;
                        int los3 = liczba.nextInt(6)+1;
                        int los4 = liczba.nextInt(6)+1;
                        int los5 = liczba.nextInt(6)+1;
                        imageView1.setImageResource(kosci[los1]);
                        indeksy.add(los1);
                        imageView2.setImageResource(kosci[los2]);
                        indeksy.add(los2);
                        imageView3.setImageResource(kosci[los3]);
                        indeksy.add(los3);
                        imageView4.setImageResource(kosci[los4]);
                        indeksy.add(los4);
                        imageView5.setImageResource(kosci[los5]);
                        indeksy.add(los5);
                       // for (int i = 0; i < indeksy.size(); i++) {
                        //    if(los1 || los2 || los3 || los4 || los5 == indeksy.get(i)){

                       //     }
                       // }
                       wynik = los1 + los2 + los3 + los4 + los5;

                        wynikGry = wynikGry + wynik;
                        textViewWynikLosowania.setText("Wynik tego losowania: " + wynik);
                        textViewWynikgry.setText("Wynik gry: "+wynikGry);

                    }
                }
        );
        buttonResetWyniku.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        wynik = 0;
                        wynikGry = 0;
                        textViewWynikLosowania.setText("Wynik tego losowania: " + wynik);
                        textViewWynikgry.setText("Wynik gry: "+wynikGry);
                        imageView1.setImageResource(R.drawable.kosc);
                        imageView2.setImageResource(R.drawable.kosc);
                        imageView3.setImageResource(R.drawable.kosc);
                        imageView4.setImageResource(R.drawable.kosc);
                        imageView5.setImageResource(R.drawable.kosc);
                    }
                }
        );
    }
}
//TODO: Do zrobienia podliczanie przy tych samych kościach