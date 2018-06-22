package com.example.android.quizapp;

import android.arch.lifecycle.ViewModelProviders;
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

    ViewMainActivity myViewModel;
    RadioGroup one;
    RadioGroup two;
    RadioGroup three;
    RadioGroup four;
    RadioGroup five;
    RadioButton five_one;
    RadioButton five_two;
    RadioButton five_three;
    RadioButton five_four;
    RadioGroup six;
    CheckBox seven_one;
    CheckBox seven_two;
    CheckBox seven_three;
    CheckBox seven_four;
    EditText eight;
    TextView answer_one;
    TextView answer_two;
    TextView answer_three;
    TextView answer_four;
    TextView answer_five;
    TextView answer_six;
    TextView answer_seven;
    TextView answer_eight;

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
            grade(one, two, three, four, six, seven_one, seven_two, seven_three, seven_four, eight);

        }

    }

    //This method calculates and displays the score
    private void grade(RadioGroup one, RadioGroup two, RadioGroup three, RadioGroup four, RadioGroup six, CheckBox seven_one, CheckBox seven_two, CheckBox seven_three, CheckBox seven_four, EditText eight) {
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
            answer_eight.setText(myViewModel.getAnswer_one());
        } else {
            myViewModel.setAnswer_eight(getString(R.string.question_eight_answer));
            answer_eight.setText(myViewModel.getAnswer_eight());
        }
        Toast.makeText(getApplicationContext(), getString(R.string.answer, score), Toast.LENGTH_SHORT).show();

    }

    //This method is called when a RadioButton in the question five options is clicked
    public void check(View view) {
        RadioButton hercule = findViewById(R.id.hercule_poirot);
        RadioButton sherlock = findViewById(R.id.sherlock_holmes);
        RadioButton bruce = findViewById(R.id.bruce_wayne);
        RadioButton joe = findViewById(R.id.joe_hardy);
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
        hercule.setChecked(myViewModel.isFive_one());
        sherlock.setChecked(myViewModel.isFive_two());
        bruce.setChecked(myViewModel.isFive_three());
        joe.setChecked(myViewModel.isFive_four());
    }

    //This method is called when a RadioButton in a RadioGroup is clicked
    public void group_click(View view) {
        RadioGroup group = findViewById(view.getId());
        int checked = group.getCheckedRadioButtonId();
        if (group.getId() == R.id.question_one) {
            if (checked == R.id.one_one)
                myViewModel.setOne_one(true);
            else if (checked == R.id.one_two)
                myViewModel.setOne_two(true);
            else if (checked == R.id.one_three)
                myViewModel.setOne_three(true);
            else if (checked == R.id.one_four)
                myViewModel.setOne_four(true);
        }
        if (group.getId() == R.id.question_two) {
            if (checked == R.id.two_one)
                myViewModel.setTwo_one(true);
            else if (checked == R.id.two_two)
                myViewModel.setTwo_two(true);
            else if (checked == R.id.two_three)
                myViewModel.setTwo_three(true);
            else if (checked == R.id.two_four)
                myViewModel.setTwo_four(true);
        }
        if (group.getId() == R.id.question_three) {
            if (checked == R.id.three_one)
                myViewModel.setThree_one(true);
            else if (checked == R.id.three_two)
                myViewModel.setThree_two(true);
            else if (checked == R.id.three_three)
                myViewModel.setThree_three(true);
            else if (checked == R.id.three_four)
                myViewModel.setThree_four(true);
        }
        if (group.getId() == R.id.question_four) {
            if (checked == R.id.four_one)
                myViewModel.setFour_one(true);
            else if (checked == R.id.four_two)
                myViewModel.setFour_two(true);
            else if (checked == R.id.four_three)
                myViewModel.setFour_three(true);
            else if (checked == R.id.four_four)
                myViewModel.setFour_four(true);
        }
        if (group.getId() == R.id.question_six) {
            if (checked == R.id.six_one)
                myViewModel.setSix_one(true);
            else if (checked == R.id.six_two)
                myViewModel.setSix_two(true);
            else if (checked == R.id.six_three)
                myViewModel.setSix_three(true);
            else if (checked == R.id.six_four)
                myViewModel.setSix_four(true);
        }
    }

    //This method is called when a Checkbox is clicked
    public void checkbox(View view) {
        CheckBox checkbox = findViewById(view.getId());
        if (view.getId() == R.id.seven_one)
            myViewModel.setSeven_one(checkbox.isChecked());
        if (view.getId() == R.id.seven_two)
            myViewModel.setSeven_two(checkbox.isChecked());
        if (view.getId() == R.id.seven_three)
            myViewModel.setSeven_three(checkbox.isChecked());
        if (view.getId() == R.id.seven_four)
            myViewModel.setSeven_four(checkbox.isChecked());

    }
}
