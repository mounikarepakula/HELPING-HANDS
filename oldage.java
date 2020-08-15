package com.example.helpinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class oldage extends AppCompatActivity {
    Button a1;
    Button a2;
    Button a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldage);
        a1= (Button)findViewById(R.id.a1);
        a1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openold1();
            }
        });
        a2= (Button)findViewById(R.id.a2);
        a2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openold2();
            }
        });
        a3= (Button)findViewById(R.id.a3);
        a3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openold3();
            }
        });

    }
    public void openold1()
    {
        Intent i=new Intent(oldage.this,old1.class);
        startActivity(i);
    }
    public void openold2()
    {
        Intent i=new Intent(oldage.this,old2.class);
        startActivity(i);
    }
    public void openold3()
    {
        Intent i=new Intent(oldage.this,old3.class);
        startActivity(i);
    }


}
