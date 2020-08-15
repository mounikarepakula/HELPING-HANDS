package com.example.helpinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ngo extends AppCompatActivity {
    Button d1;
    Button d2;
    Button d3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo);
        d1= (Button)findViewById(R.id.d1);
        d1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openngo1();
            }
        });
        d2= (Button)findViewById(R.id.d2);
        d2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openngo2();
            }
        });
        d3= (Button)findViewById(R.id.d3);
        d3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openngo3();
            }
        });


    }
    public void openngo1()
    {
        Intent i=new Intent(ngo.this,ngo1.class);
        startActivity(i);
    }
    public void openngo2()
    {
        Intent i=new Intent(ngo.this,ngo2.class);
        startActivity(i);
    }
    public void openngo3()
    {
        Intent i=new Intent(ngo.this,ngo3.class);
        startActivity(i);
    }

}
