package com.example.profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cntLikes;
    Button btn;
    int numOfLikes = 84;
    boolean myLike = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cntLikes =   findViewById(R.id.cntLikes);
        btn =  findViewById(R.id.btn);
        cntLikes.setText(numOfLikes + " Likes");

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                cntLikes.setText(++numOfLikes + " Likes");
                myLike = true;
                if ( myLike )
                {
                    btn.setTextColor(Color.BLUE);
                    btn.setEnabled(false);
                }
            }
        });


    }
}
