package com.example.android.quizapp;

import android.content.Context;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when submit is pressed
    public void submit(View view) {
        verify();

    }

    //This method checks whether all the questions have been attempted
    private void verify() {
        RadioGroup one = findViewById(R.id.question_one);
        RadioGroup two = findViewById(R.id.question_two);
        RadioGroup three = findViewById(R.id.question_three);
        RadioGroup four = findViewById(R.id.question_four);
        RadioGroup five = findViewById(R.id.question_five);
        RadioGroup six = findViewById(R.id.question_six);
        CheckBox seven_one = findViewById(R.id.seven_one);
        CheckBox seven_two = findViewById(R.id.seven_two);
        CheckBox seven_three = findViewById(R.id.seven_three);
        CheckBox seven_four = findViewById(R.id.seven_four);
        EditText eight = findViewById(R.id.question_eight);
        TextView eight_question = findViewById(R.id.question_eight_text);
        Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        if (one.getCheckedRadioButtonId() == -1) {
            one.setFocusable(true);
            one.setFocusableInTouchMode(true);
            one.requestFocus();
            one.setFocusable(false);
            one.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "1"));
            toast.show();
        } else if (two.getCheckedRadioButtonId() == -1) {
            two.setFocusable(true);
            two.setFocusableInTouchMode(true);
            two.requestFocus();
            two.setFocusable(false);
            two.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "2"));
            toast.show();
        } else if (three.getCheckedRadioButtonId() == -1) {
            three.setFocusable(true);
            three.setFocusableInTouchMode(true);
            three.requestFocus();
            three.setFocusable(false);
            three.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "3"));
            toast.show();
        } else if (four.getCheckedRadioButtonId() == -1) {
            four.setFocusable(true);
            four.setFocusableInTouchMode(true);
            four.requestFocus();
            four.setFocusable(false);
            four.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "4"));
            toast.show();
        } else if (five.getCheckedRadioButtonId() == -1) {
            five.setFocusable(true);
            five.setFocusableInTouchMode(true);
            five.requestFocus();
            five.setFocusable(false);
            five.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "5"));
            toast.show();
        } else if (six.getCheckedRadioButtonId() == -1) {
            six.setFocusable(true);
            six.setFocusableInTouchMode(true);
            six.requestFocus();
            six.setFocusable(false);
            six.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "6"));
            toast.show();
        } else if (seven_one.isChecked() == false && seven_two.isChecked() == false && seven_three.isChecked() == false && seven_four.isChecked() == false) {
            seven_one.setFocusable(true);
            seven_one.setFocusableInTouchMode(true);
            seven_one.requestFocus();
            seven_one.setFocusable(false);
            seven_one.setFocusableInTouchMode(false);
            toast.setText(getString(R.string.unanswered, "7"));
            toast.show();
        } else if (eight.getText().toString().equals("")) {
            eight_question.setFocusable(true);
            eight_question.setFocusableInTouchMode(true);
            eight_question.requestFocus();
            eight_question.setFocusable(false);
            eight_question.setFocusableInTouchMode(false);
            eight_question.setEnabled(true);
            toast.setText(getString(R.string.unanswered, "8"));
            toast.show();
        } else if (eight.getText().toString().length() < 4) {
            eight_question.setFocusable(true);
            eight_question.setFocusableInTouchMode(true);
            eight_question.requestFocus();
            eight_question.setFocusable(false);
            eight_question.setFocusableInTouchMode(false);
            eight_question.setEnabled(true);
            toast.setText(R.string.invalid);
            toast.show();

        } else {
            grade(one, two, three, four, five, six, seven_one, seven_two, seven_three, seven_four, eight);

        }

    }

    //This method calculates and displays the score
    public void grade(RadioGroup one, RadioGroup two, RadioGroup three, RadioGroup four, RadioGroup five, RadioGroup six, CheckBox seven_one, CheckBox seven_two, CheckBox seven_three, CheckBox seven_four, EditText eight) {
        int score = 0;
        RadioButton oneselectRadio = findViewById(one.getCheckedRadioButtonId());
        String one_answer = oneselectRadio.getText().toString();
        RadioButton twoselectRadio = findViewById(two.getCheckedRadioButtonId());
        String two_answer = twoselectRadio.getText().toString();
        RadioButton threeselectRadio = findViewById(three.getCheckedRadioButtonId());
        String three_answer = threeselectRadio.getText().toString();
        RadioButton fourselectRadio = findViewById(four.getCheckedRadioButtonId());
        String four_answer = fourselectRadio.getText().toString();
        RadioButton fiveselectRadio = findViewById(five.getCheckedRadioButtonId());
        String five_answer = fiveselectRadio.getText().toString();
        RadioButton sixselectRadio = findViewById(six.getCheckedRadioButtonId());
        String six_answer = sixselectRadio.getText().toString();
        String eight_answer = eight.getText().toString();
        TextView answer;

        if (one_answer.equals(getString(R.string.question_one_option_one))) {
            score++;
            answer = findViewById(R.id.answer_one);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_one);
            answer.setText(R.string.question_one_option_one);
        }

        if (two_answer.equals(getString(R.string.question_two_option_two))) {
            score++;
            answer = findViewById(R.id.answer_two);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_two);
            answer.setText(R.string.question_two_option_two);
        }
        if (three_answer.equals(getString(R.string.question_three_option_three))) {
            score++;
            answer = findViewById(R.id.answer_three);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_three);
            answer.setText(R.string.question_three_option_three);
        }
        if (four_answer.equals(getString(R.string.question_four_option_four))) {
            score++;
            answer = findViewById(R.id.answer_four);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_four);
            answer.setText(R.string.question_four_option_four);
        }
        if (five_answer.equals(getString(R.string.question_five_option_one))) {
            score++;
            answer = findViewById(R.id.answer_five);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_five);
            answer.setText(R.string.question_five_option_one);
        }
        if (six_answer.equals(getString(R.string.question_six_option_three))) {
            score++;
            answer = findViewById(R.id.answer_six);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_six);
            answer.setText(R.string.question_six_option_three);
        }
        if (seven_one.isChecked() && seven_three.isChecked() && seven_four.isChecked()) {
            score++;
            answer = findViewById(R.id.answer_seven);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_seven);
            answer.setText(getString(R.string.question_seven_option_one) + ", " + getString(R.string.question_seven_option_three) + ", " + getString(R.string.question_seven_option_four));
        }
        if (eight_answer.equals(getString(R.string.question_eight_answer))) {
            score++;
            answer = findViewById(R.id.answer_eight);
            answer.setText("");
        } else {
            answer = findViewById(R.id.answer_eight);
            answer.setText(R.string.question_eight_answer);
        }
        Toast.makeText(getApplicationContext(), getString(R.string.answer, score), Toast.LENGTH_SHORT).show();

    }
}
