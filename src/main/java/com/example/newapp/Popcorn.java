package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Popcorn extends AppCompatActivity
{

    Button proceedbtn;
    ImageButton addcheesepop,deletecheesepop;
    ImageButton addchocolatepop,deletechocolatepop;
    ImageButton addmasalapop,deletemasalapop;
    TextView billtext;
    int cheesecounter=0,chocolatecounter=0,masalacounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popcorn_activity);

        billtext = findViewById(R.id.billtext);
        proceedbtn = findViewById(R.id.proceedbtn);

        addcheesepop = findViewById(R.id.addcheesepop);
        addcheesepop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                cheesecounter+=150;
                billtext.setText("Your Bill: " + cheesecounter);
            }
        });
        deletecheesepop = findViewById(R.id.deletecheesepop);
        deletecheesepop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cheesecounter>=150 && cheesecounter!=0)
                {
                    cheesecounter-=150;
                    if(cheesecounter==0)
                    {
                        Toast.makeText(getApplicationContext(), "No item added", Toast.LENGTH_SHORT).show();
                    }
                    billtext.setText("Your Bill: " + cheesecounter);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "No item added", Toast.LENGTH_SHORT).show();
                }
            }
        });


        addchocolatepop = findViewById(R.id.addchocolatepop);
        addchocolatepop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chocolatecounter+=150;
                billtext.setText("Your Bill: " + chocolatecounter);
            }
        });
        deletechocolatepop = findViewById(R.id.deletechocolatepop);
        deletechocolatepop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chocolatecounter>=150 && chocolatecounter!=0)
                {
                    chocolatecounter -= 150;
                    if(chocolatecounter==0)
                    {
                        Toast.makeText(getApplicationContext(), "No item added", Toast.LENGTH_SHORT).show();
                    }
                    billtext.setText("Your Bill: " + chocolatecounter);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "No item added", Toast.LENGTH_SHORT).show();
                }
            }
        });

        addmasalapop = findViewById(R.id.addmasalapop);
        addmasalapop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masalacounter+=150;
                billtext.setText("Your Bill: " + masalacounter);
            }
        });
        deletemasalapop = findViewById(R.id.deletemasalapop);
        deletemasalapop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(masalacounter>=150 && masalacounter!=0)
                {
                    masalacounter -= 150;
                    if(masalacounter<150)
                    {
                        masalacounter=0;
                    }
                    billtext.setText("Your Bill: " + masalacounter);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "No item added", Toast.LENGTH_SHORT).show();
                }
            }
        });


        proceedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Popcorn.this,Bill.class);
                startActivity(i);
            }
        });
    }
}
