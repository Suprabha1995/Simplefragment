package com.example.suprabha.simplefragment;

import android.app.FragmentTransaction;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Blue blue=new Blue();
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.lin_lay,blue);
                ft.commit();


            }
        });
            Button btn_red=(Button)findViewById(R.id.btn_red);
            btn_red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Red red=new Red();
                    FragmentManager fm=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.lin_lay,red);
                    ft.commit();



            }
        });
        Button btn_green=(Button)findViewById(R.id.btn_green);
        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Green green=new Green();
                FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.lin_lay,green);
                ft.commit();

            }
        });

    }
}
