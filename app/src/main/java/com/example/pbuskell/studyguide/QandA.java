package com.example.pbuskell.studyguide;

/**
 * Created by PBuskell on 15/03/2016.
 */
public class QandA
{
    private String strQuestion;
    private String strAnswer;

    public QandA(String strQuestion_PARAM,
                 String strAnswer_PARAM)
    {
        this.strQuestion = strQuestion_PARAM;
        this.strAnswer = strAnswer_PARAM;
    }

    public String getQuestion()
    {
        return strQuestion;
    }

    public String getAnswer()
    {
        return strAnswer;
    }
}
