package com.example.fortune;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class Yesno extends AppCompatActivity {
    ImageButton imageButton;
    TextView textview14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yesno);
        imageButton =(ImageButton)findViewById(R.id.imageButton);
        textview14 = findViewById(R.id.textView14);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                int n = rand.nextInt(2);
                if(n==0)
                {textview14.setText("YES");}
                else{
                    textview14.setText("NO");
                }

            }
        });

    }
}
