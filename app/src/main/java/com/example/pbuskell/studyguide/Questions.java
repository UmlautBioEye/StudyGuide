package com.example.pbuskell.studyguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Questions extends AppCompatActivity {

    public final static String ANSWER = "com.example.pbuskell.studyguide";

    TextView txtvwQuestion;
    QandA qaOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        txtvwQuestion = (TextView) findViewById(R.id.txtvwQuestion);
        
        qaOne = new QandA("What year was Canada founded?", "1867");

        txtvwQuestion.setText(qaOne.getQuestion());

    }

    public void showAnswer(View vw)
    {
        Intent intent = new Intent(this, Answers.class);
        intent.putExtra(ANSWER, qaOne.getAnswer());
        startActivity(intent);
    }




}
