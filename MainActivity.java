package com.example.helpinghands;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private ImageButton im1;
    private ImageButton im2;
    private ImageButton im3;
    private ImageButton im4;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im1 = findViewById(R.id.im1);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoldage();
            }
        });


        im2 = findViewById(R.id.im2);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openorphanage();
            }
        });
        im3 = findViewById(R.id.im3);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrehab();
            }
        });
        im4 = findViewById(R.id.im4);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrehab();
            }
        });

    }

    public void openoldage()
    {
        Intent intent=new Intent(this,oldage.class);
        startActivity(intent);
    }
    public void openorphanage()
    {
        Intent intent=new Intent(this,orphanage.class);
        startActivity(intent);
    }
    public void openrehab()
    {
        Intent intent=new Intent(this,rehab.class);
        startActivity(intent);
    }

    public void openngo()
    {
        Intent intent=new Intent(this,ngo.class);
        startActivity(intent);
    }
    //private void logout()
   // {
       // mAuth.signOut();
       // finish();
       // startActivity(new Intent(MainActivity.this,Login.class));
    //}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.logout:
                mAuth.signOut();
                finish();
                startActivity(new Intent(MainActivity.this,Login.class));

        }
        return super.onOptionsItemSelected(item);
    }

}
