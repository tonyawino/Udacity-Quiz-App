package com.example.android.quizapp;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewMainActivity myViewModel;
    private RadioGroup one;
    private RadioGroup two;
    private RadioGroup three;
    private RadioGroup four;
    private RadioGroup five;
    private RadioButton five_one;
    private RadioButton five_two;
    private RadioButton five_three;
    private RadioButton five_four;
    private RadioGroup six;
    private CheckBox seven_one;
    private CheckBox seven_two;
    private CheckBox seven_three;
    private CheckBox seven_four;
    private EditText eight;
    private TextView answer_one;
    private TextView answer_two;
    private TextView answer_three;
    private TextView answer_four;
    private TextView answer_five;
    private TextView answer_six;
    private TextView answer_seven;
    private TextView answer_eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Maintain data on configuration changes
        myViewModel = ViewModelProviders.of(this).get(ViewMainActivity.class);
        one = findViewById(R.id.question_one);
        two = findViewById(R.id.question_two);
        three = findViewById(R.id.question_three);
        four = findViewById(R.id.question_four);
        five = findViewById(R.id.question_five);
        five_one = findViewById(R.id.hercule_poirot);
        five_two = findViewById(R.id.sherlock_holmes);
        five_three = findViewById(R.id.bruce_wayne);
        five_four = findViewById(R.id.joe_hardy);
        six = findViewById(R.id.question_six);
        seven_one = findViewById(R.id.seven_one);
        seven_two = findViewById(R.id.seven_two);
        seven_three = findViewById(R.id.seven_three);
        seven_four = findViewById(R.id.seven_four);
        eight = findViewById(R.id.question_eight);
        answer_one = findViewById(R.id.answer_one);
        answer_two = findViewById(R.id.answer_two);
        answer_three = findViewById(R.id.answer_three);
        answer_four = findViewById(R.id.answer_four);
        answer_five = findViewById(R.id.answer_five);
        answer_six = findViewById(R.id.answer_six);
        answer_seven = findViewById(R.id.answer_seven);
        answer_eight = findViewById(R.id.answer_eight);
        design();
        if (!myViewModel.isOne_one() && !myViewModel.isOne_two() && !myViewModel.isOne_three() && !myViewModel.isOne_four())
            reset(findViewById(R.id.reset));


    }

    //This method recreates the UI on configuration changes
    private void design() {
        if (myViewModel.isOne_one())
            this.one.check(R.id.one_one);
        else if (myViewModel.isOne_two())
            this.one.check(R.id.one_two);
        else if (myViewModel.isOne_three())
            this.one.check(R.id.one_three);
        else if (myViewModel.isOne_four())
            this.one.check(R.id.one_four);
        else
            this.one.check(-1);

        if (myViewModel.isTwo_one())
            this.two.check(R.id.two_one);
        else if (myViewModel.isTwo_two())
            this.two.check(R.id.two_two);
        else if (myViewModel.isTwo_three())
            this.two.check(R.id.two_three);
        else if (myViewModel.isTwo_four())
            this.two.check(R.id.two_four);
        else
            this.two.check(-1);

        if (myViewModel.isThree_one())
            this.three.check(R.id.three_one);
        else if (myViewModel.isThree_two())
            this.three.check(R.id.three_two);
        else if (myViewModel.isThree_three())
            this.three.check(R.id.three_three);
        else if (myViewModel.isThree_four())
            this.three.check(R.id.three_four);
        else
            this.three.check(-1);

        if (myViewModel.isFour_one())
            this.four.check(R.id.four_one);
        else if (myViewModel.isFour_two())
            this.four.check(R.id.four_two);
        else if (myViewModel.isFour_three())
            this.four.check(R.id.four_three);
        else if (myViewModel.isFour_four())
            this.four.check(R.id.four_four);
        else
            this.four.check(-1);

        if (myViewModel.isSix_one())
            this.six.check(R.id.six_one);
        else if (myViewModel.isSix_two())
            this.six.check(R.id.six_two);
        else if (myViewModel.isSix_three())
            this.six.check(R.id.six_three);
        else if (myViewModel.isSix_four())
            this.six.check(R.id.six_four);
        else
            this.six.check(-1);

        seven_one.setChecked(myViewModel.isSeven_one());
        seven_two.setChecked(myViewModel.isSeven_two());
        seven_three.setChecked(myViewModel.isSeven_three());
        seven_four.setChecked(myViewModel.isSeven_four());
        answer_one.setText(myViewModel.getAnswer_one());
        answer_two.setText(myViewModel.getAnswer_two());
        answer_three.setText(myViewModel.getAnswer_three());
        answer_four.setText(myViewModel.getAnswer_four());
        answer_five.setText(myViewModel.getAnswer_five());
        answer_six.setText(myViewModel.getAnswer_six());
        answer_seven.setText(myViewModel.getAnswer_seven());
        answer_eight.setText(myViewModel.getAnswer_eight());
    }

    //This method is called when submit is pressed
    public void submit(View view) {
        verify();

    }

    //This method checks whether all the questions have been attempted
    private void verify() {
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
        } else if (!five_one.isChecked() && !five_two.isChecked() && !five_three.isChecked() && !five_four.isChecked()) {
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
        } else if (!seven_one.isChecked() && !seven_two.isChecked() && !seven_three.isChecked() && !seven_four.isChecked()) {
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
            grade(one, two, three, four, six, seven_one, seven_three, seven_four, eight);

        }

    }

    //This method checks the user's answer, compares it to the correct answer, and then calculates and displays the score
    private void grade(RadioGroup one, RadioGroup two, RadioGroup three, RadioGroup four, RadioGroup six, CheckBox seven_one, CheckBox seven_three, CheckBox seven_four, EditText eight) {
        int score = 0;
        RadioButton oneselectRadio = findViewById(one.getCheckedRadioButtonId());
        String one_answer = oneselectRadio.getText().toString();
        RadioButton twoselectRadio = findViewById(two.getCheckedRadioButtonId());
        String two_answer = twoselectRadio.getText().toString();
        RadioButton threeselectRadio = findViewById(three.getCheckedRadioButtonId());
        String three_answer = threeselectRadio.getText().toString();
        RadioButton fourselectRadio = findViewById(four.getCheckedRadioButtonId());
        String four_answer = fourselectRadio.getText().toString();
        RadioButton fiveselectRadio = findViewById(R.id.hercule_poirot);
        RadioButton sixselectRadio = findViewById(six.getCheckedRadioButtonId());
        String six_answer = sixselectRadio.getText().toString();
        String eight_answer = eight.getText().toString();

        if (one_answer.equals(getString(R.string.question_one_option_one))) {
            score++;
            myViewModel.setAnswer_one("");
            answer_one.setText(myViewModel.getAnswer_one());
        } else {
            myViewModel.setAnswer_one(getString(R.string.question_one_option_one));
            answer_one.setText(myViewModel.getAnswer_one());
        }

        if (two_answer.equals(getString(R.string.question_two_option_two))) {
            score++;
            myViewModel.setAnswer_two("");
            answer_two.setText(myViewModel.getAnswer_two());
        } else {
            myViewModel.setAnswer_two(getString(R.string.question_two_option_two));
            answer_two.setText(myViewModel.getAnswer_two());
        }
        if (three_answer.equals(getString(R.string.question_three_option_three))) {
            score++;
            myViewModel.setAnswer_three("");
            answer_three.setText(myViewModel.getAnswer_three());
        } else {
            myViewModel.setAnswer_three(getString(R.string.question_three_option_three));
            answer_three.setText(myViewModel.getAnswer_three());
        }
        if (four_answer.equals(getString(R.string.question_four_option_four))) {
            score++;
            myViewModel.setAnswer_four("");
            answer_four.setText(myViewModel.getAnswer_four());
        } else {
            myViewModel.setAnswer_four(getString(R.string.question_four_option_four));
            answer_four.setText(myViewModel.getAnswer_four());
        }
        if (fiveselectRadio.isChecked()) {
            score++;
            myViewModel.setAnswer_five("");
            answer_five.setText(myViewModel.getAnswer_five());
        } else {
            myViewModel.setAnswer_five(getString(R.string.question_five_option_one));
            answer_five.setText(myViewModel.getAnswer_five());
        }
        if (six_answer.equals(getString(R.string.question_six_option_three))) {
            score++;
            myViewModel.setAnswer_six("");
            answer_six.setText(myViewModel.getAnswer_six());
        } else {
            myViewModel.setAnswer_six(getString(R.string.question_six_option_three));
            answer_six.setText(myViewModel.getAnswer_six());
        }
        if (seven_one.isChecked() && seven_three.isChecked() && seven_four.isChecked()) {
            score++;
            myViewModel.setAnswer_seven("");
            answer_seven.setText(myViewModel.getAnswer_seven());
        } else {
            myViewModel.setAnswer_seven(getString(R.string.question_seven_option_one) + ", " + getString(R.string.question_seven_option_three) + ", " + getString(R.string.question_seven_option_four));
            answer_seven.setText(myViewModel.getAnswer_seven());
        }
        if (eight_answer.equals(getString(R.string.question_eight_answer))) {
            score++;
            myViewModel.setAnswer_eight("");
            answer_eight.setText(myViewModel.getAnswer_eight());
        } else {
            myViewModel.setAnswer_eight(getString(R.string.question_eight_answer));
            answer_eight.setText(myViewModel.getAnswer_eight());
        }
        Toast.makeText(getApplicationContext(), getString(R.string.answer, score), Toast.LENGTH_SHORT).show();

    }

    //This method is called when a RadioButton in the question five options is clicked, it checks only the clicked button
    public void check(View view) {
        if (view.getId() == R.id.hercule_poirot) {
            myViewModel.setFive_one(true);
        }
        if (view.getId() == R.id.sherlock_holmes) {
            myViewModel.setFive_two(true);
        }
        if (view.getId() == R.id.bruce_wayne) {
            myViewModel.setFive_three(true);
        }
        if (view.getId() == R.id.joe_hardy) {
            myViewModel.setFive_four(true);
        }
        five_one.setChecked(myViewModel.isFive_one());
        five_two.setChecked(myViewModel.isFive_two());
        five_three.setChecked(myViewModel.isFive_three());
        five_four.setChecked(myViewModel.isFive_four());
    }

    //This method resets the user interface
    public void reset(View view) {
        myViewModel.setOne_one(false);
        myViewModel.setOne_two(false);
        myViewModel.setOne_three(false);
        myViewModel.setOne_four(false);
        one.clearCheck();
        myViewModel.setTwo_one(false);
        myViewModel.setTwo_two(false);
        myViewModel.setTwo_three(false);
        myViewModel.setTwo_four(false);
        two.clearCheck();
        myViewModel.setThree_one(false);
        myViewModel.setThree_two(false);
        myViewModel.setThree_three(false);
        myViewModel.setThree_four(false);
        three.clearCheck();
        myViewModel.setFour_one(false);
        myViewModel.setFour_two(false);
        myViewModel.setFour_three(false);
        myViewModel.setFour_four(false);
        four.clearCheck();
        myViewModel.setFive_one(false);
        five_one.setChecked(myViewModel.isFive_one());
        myViewModel.setFive_two(false);
        five_two.setChecked(myViewModel.isFive_two());
        myViewModel.setFive_three(false);
        five_three.setChecked(myViewModel.isFive_three());
        myViewModel.setFive_four(false);
        five_four.setChecked(myViewModel.isFive_four());
        myViewModel.setSix_one(false);
        myViewModel.setSix_two(false);
        myViewModel.setSix_three(false);
        myViewModel.setSix_four(false);
        six.clearCheck();
        myViewModel.setSeven_one(false);
        seven_one.setChecked(myViewModel.isSeven_one());
        myViewModel.setSeven_two(false);
        seven_two.setChecked(myViewModel.isSeven_two());
        myViewModel.setSeven_three(false);
        seven_three.setChecked(myViewModel.isSeven_three());
        myViewModel.setSeven_four(false);
        seven_four.setChecked(myViewModel.isSeven_four());
        myViewModel.setEight("");
        eight.setText(myViewModel.getEight());
        myViewModel.setAnswer_one("");
        answer_one.setText(myViewModel.getAnswer_one());
        myViewModel.setAnswer_two("");
        answer_two.setText(myViewModel.getAnswer_two());
        myViewModel.setAnswer_three("");
        answer_three.setText(myViewModel.getAnswer_three());
        myViewModel.setAnswer_four("");
        answer_four.setText(myViewModel.getAnswer_four());
        myViewModel.setAnswer_five("");
        answer_five.setText(myViewModel.getAnswer_five());
        myViewModel.setAnswer_six("");
        answer_six.setText(myViewModel.getAnswer_six());
        myViewModel.setAnswer_seven("");
        answer_seven.setText(myViewModel.getAnswer_seven());
        myViewModel.setAnswer_eight("");
        answer_eight.setText(myViewModel.getAnswer_eight());
        eight.setFocusableInTouchMode(false);
        one.setFocusable(true);
        one.setFocusableInTouchMode(true);
        one.requestFocus();
        one.setFocusable(false);
        one.setFocusableInTouchMode(false);
        eight.setFocusableInTouchMode(true);
    }
}
