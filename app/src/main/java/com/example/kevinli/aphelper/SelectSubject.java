package com.example.kevinli.aphelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectSubject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button b1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_subject);


        b1 = findViewById(R.id.apchembutton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectSubject.this, MainActivity.class);
                startActivity(intent);
            }
        });
 }
}
