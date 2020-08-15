package com.example.helpinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orphanage extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orphanage);
        b1= (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openorf1();
            }
        });
        b2= (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openorf2();
            }
        });
        b3= (Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openorf3();
            }
        });

    }
    public void openorf1()
    {
        Intent i=new Intent(orphanage.this,orf1.class);
        startActivity(i);
    }
    public void openorf2()
    {
        Intent i=new Intent(orphanage.this,orf2.class);
        startActivity(i);
    }
    public void openorf3()
    {
        Intent i=new Intent(orphanage.this,orf3.class);
        startActivity(i);
    }



}
