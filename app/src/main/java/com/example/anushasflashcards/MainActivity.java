package com.example.anushasflashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Answer = findViewById(R.id.Flashcard_A);
        TextView Question = findViewById(R.id.Flashcard_Q);
        Question.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Question.setVisibility(View.INVISIBLE);
                Answer.setVisibility(View.VISIBLE);
            }
        });

        Answer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Question.setVisibility(View.VISIBLE);
                Answer.setVisibility(View.INVISIBLE);
            }
        });
    }
}