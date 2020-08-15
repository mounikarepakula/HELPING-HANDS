package com.example.helpinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rehab extends AppCompatActivity {
    Button c1;
    Button c2;
    Button c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehab);
        c1= (Button)findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openre1();
            }
        });
        c2= (Button)findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openre2();
            }
        });
        c3= (Button)findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openre3();
            }
        });
    }
    public void openre1()
    {
        Intent i=new Intent(rehab.this,re1.class);
        startActivity(i);
    }
    public void openre2()
    {
        Intent i=new Intent(rehab.this,re2.class);
        startActivity(i);
    }
    public void openre3()
    {
        Intent i=new Intent(rehab.this,re3.class);
        startActivity(i);
    }

}
