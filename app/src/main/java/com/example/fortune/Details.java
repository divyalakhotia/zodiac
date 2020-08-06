package com.example.fortune;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

         editText1 = findViewById(R.id.editText3);
        editText2 = findViewById(R.id.editText4);
        button = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText2.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    Toast.makeText(Details.this, "please enter the field", Toast.LENGTH_SHORT).show();
                } else {

                    if (editText2.getText().toString().length() < 8 || editText2.getText().toString().indexOf('/') != 2 || editText2.getText().toString().lastIndexOf('/', 6) != 5) {

                        Toast.makeText(Details.this, "please enter the date in proper format", Toast.LENGTH_SHORT).show();

                    } else {


                        String date = editText2.getText().toString();
                        Intent intent = new Intent(Details.this, Otarrot.class).putExtra(date, editText2.getText().toString());

                        startActivity(intent);
                        finish();

                    }
                }
            }


        });


    }   }
