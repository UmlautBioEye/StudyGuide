package com.example.pbuskell.studyguide;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PBuskell on 15/03/2016.
 */
public class Answers extends AppCompatActivity
{

    String strAnswer;
    TextView txtvwAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        txtvwAnswer = (TextView) findViewById(R.id.txtvwAnswer);

        Intent intent = getIntent();
        strAnswer = intent.getStringExtra(Questions.ANSWER);

        txtvwAnswer.setText(strAnswer);
    }



}
