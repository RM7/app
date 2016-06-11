package de.jugendhackt.schnellervoran_bb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_line extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_line);
        Button next3 = (Button) findViewById(R.id.button3);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), line3_menu.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), line1_menu.class);
                startActivityForResult(myIntent, 0);
            }
    }); Button next2 = (Button) findViewById(R.id.button2);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), line2_menu.class);
                startActivityForResult(myIntent, 0);
            }
        });
}}