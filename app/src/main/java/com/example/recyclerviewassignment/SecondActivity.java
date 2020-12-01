package com.example.recyclerviewassignment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private Button clickForWiki;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        clickForWiki = (Button) findViewById(R.id.wikiClick);

        getFact();
        getWiki();

        }
    private void getFact(){
        if(getIntent().hasExtra("factz")){
            String factText = getIntent().getStringExtra("factz");
            setFact(factText);
        }
    }

    private void setFact(String factText){
        TextView fact = findViewById(R.id.fact);
        fact.setText(factText);
    }

    private void getWiki(){
        if(getIntent().hasExtra("wikz")){
            String wikiText = getIntent().getStringExtra("wikz");
            setWiki(wikiText);
        }
    }

    private void setWiki(final String wikiText){
        Button wikiClickz = findViewById(R.id.wikiClick);
        wikiClickz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = wikiText;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
    }

}
