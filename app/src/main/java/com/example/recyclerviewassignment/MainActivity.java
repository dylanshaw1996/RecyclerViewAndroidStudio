package com.example.recyclerviewassignment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String cars [] = {"Honda Civic Ep3", "Honda Civic Em1", "Honda Civic Eg6", "Integra Type R", "Mazda RX-7", "Nissan 240X", "R34 Skyline", "MK4 Supra", "Toyota MR2", "MK2 Ford Focus RS"};
    int images [] = {R.drawable.hondacivic, R.drawable.em, R.drawable.eg, R.drawable.integra, R.drawable.mazda, R.drawable.nissan, R.drawable.skyline, R.drawable.supra, R.drawable.toyota, R.drawable.focus};
    String funFact [] = {"This car was in production from 2001 - 2005", "This car was in production from 1995 - 2000", "This car was in production from 1991 - 1995", "The Integra Type R is equipped with a 1.8-liter DOHC VTEC in-line 4-cylinder (B18C) engine. In the JDM Type R this engine produces 200 PS (197 hp; 147 kW) at 8,000 rpm, whereas in the US models it produces 195 hp (198 PS; 145 kW) at 8,000 rpm and 130 lb⋅ft (176 N⋅m) of torque at 5,700 rpm.",
    "The Mazda RX-7 is a front/mid-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 to 2002 across three generations, all of which made use of a compact, lightweight Wankel rotary engine.",
    "The 240SX is a sports car that was introduced to the North American market by Nissan in 1989 for the following model year. It replaced the outgoing 200SX (S12) model. Most of the 240SX were equipped with the 2.4-liter inline 4 engine (KA24E from 1989–1990 and KA24DE from 1990–1998). The KA24E had a single overhead cam and KA24DE had dual overhead cams.",
    "The Nissan Skyline GT-R (Japanese: 日産・スカイラインGT-R, Nissan Sukairain GT-R) is a sports car based on the Nissan Skyline range. The first cars named Skyline GT-R were produced between 1969 and 1972 under the model code KPGC10, and were successful in Japanese touring car racing events.",
    "The Toyota Supra (Japanese: トヨタ・スープラ, Toyota Sūpura) is a sports car and grand tourer manufactured by Toyota Motor Corporation beginning in 1978. The initial four generations of the Supra were produced from 1978 to 2002. The fifth generation has been produced since March 2019 and went on sale in May 2019.",
    "The Toyota MR2 is a two-seat, mid-engined, rear-wheel-drive sports car manufactured in Japan and marketed globally by Toyota from 1984 to 2007 over three generations: W10 (1984–1989), W20 (1990–1999) and W30 (2000–2007). It is Japan's first mid-engined production car.",
    "The Ford Focus Mk 2 is an automobile which was produced by Ford from 2005 to 2010. It was launched at the Paris Motor Show on September 25, 2004 as a three and five-door hatchback and an estate, although the new car was previewed, in 4-door saloon form, as the 'Focus Concept' developed by Ford Europe at the Beijing Motor Show in mid-2005."};
    String wikiUrl [] = {"https://en.wikipedia.org/wiki/Honda_Civic_(seventh_generation)", "https://en.wikipedia.org/wiki/Honda_Civic_(sixth_generation)", "https://en.wikipedia.org/wiki/Honda_Civic_(fifth_generation)",
    "https://en.wikipedia.org/wiki/Honda_Integra", "https://en.wikipedia.org/wiki/Mazda_RX-7", "https://en.wikipedia.org/wiki/Nissan_240SX", "https://en.wikipedia.org/wiki/Nissan_Skyline_GT-R", "https://en.wikipedia.org/wiki/Toyota_Supra",
    "https://en.wikipedia.org/wiki/Toyota_MR2", "https://en.wikipedia.org/wiki/Ford_Focus_(second_generation,_Europe)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter recAdapt = new RecyclerViewAdapter(this, cars, images, funFact, wikiUrl);
        recyclerView.setAdapter(recAdapt);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}