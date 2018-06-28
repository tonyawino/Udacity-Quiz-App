package com.example.android.quizapp;

import android.arch.lifecycle.ViewModel;

public class ViewMainActivity extends ViewModel {
    private boolean one_one, one_two, one_three, one_four, two_one, two_two, two_three, two_four, three_one, three_two, three_three, three_four, four_one, four_two, four_three, four_four, five_one, five_two, five_three, five_four, six_one, six_two, six_three, six_four, seven_one, seven_two, seven_three, seven_four;
    private String eight, answer_one, answer_two, answer_three, answer_four, answer_five, answer_six, answer_seven, answer_eight;

    public ViewMainActivity() {
        one_one = false;
        one_two = false;
        one_three = false;
        one_four = false;
        two_one = false;
        two_two = false;
        two_three = false;
        two_four = false;
        three_one = false;
        three_two = false;
        three_three = false;
        three_four = false;
        four_one = false;
        four_two = false;
        four_three = false;
        four_four = false;
        five_one = false;
        five_two = false;
        five_three = false;
        five_four = false;
        six_one = false;
        six_two = false;
        six_three = false;
        six_four = false;
        seven_one = false;
        seven_two = false;
        seven_three = false;
        seven_four = false;
        eight = "";
        answer_one = "";
        answer_two = "";
        answer_three = "";
        answer_four = "";
        answer_five = "";
        answer_six = "";
        answer_seven = "";
        answer_eight = "";
    }

    public boolean isOne_one() {
        return one_one;
    }

    //If the value is true, make all other choices false, otherwise leave them as they were, this applies to all mutator methods in questions
    //with RadioButtons

    public void setOne_one(boolean check) {
        if (check){
            one_one = check;
            one_two = !check;
            one_three = !check;
            one_four = !check;
        }
        else
            one_one=check;
    }

    public boolean isOne_two() {
        return one_two;
    }

    public void setOne_two(boolean check) {
        if (check){
            one_one = !check;
            one_two = check;
            one_three = !check;
            one_four = !check;
        }
        else
            one_two=check;
    }

    public boolean isOne_three() {
        return one_three;
    }

    public void setOne_three(boolean check) {
        if (check){
            one_one = !check;
            one_two = !check;
            one_three = check;
            one_four = !check;
        }
        else
            one_three=check;
    }

    public boolean isOne_four() {
        return one_four;
    }

    public void setOne_four(boolean check) {
        if (check){
            one_one = !check;
            one_two = !check;
            one_three = !check;
            one_four = check;
        }
        else
            one_four=check;
    }

    public boolean isTwo_one() {
        return two_one;
    }

    public void setTwo_one(boolean check) {
        if (check){
            two_one = check;
            two_two = !check;
            two_three = !check;
            two_four = !check;
        }
        else
            two_one=check;
    }

    public boolean isTwo_two() {
        return two_two;
    }

    public void setTwo_two(boolean check) {
        if (check){
            two_one = !check;
            two_two = check;
            two_three = !check;
            two_four = !check;
        }
        else
            two_two=check;
    }

    public boolean isTwo_three() {
        return two_three;
    }

    public void setTwo_three(boolean check) {
        if (check){
            two_one = !check;
            two_two = !check;
            two_three = check;
            two_four = !check;
        }
        else
            two_three=check;
    }

    public boolean isTwo_four() {
        return two_four;
    }

    public void setTwo_four(boolean check) {
        if (check){
            two_one = !check;
            two_two = !check;
            two_three = !check;
            two_four = check;
        }
        else
            two_four=check;
    }

    public boolean isThree_one() {
        return three_one;
    }

    public void setThree_one(boolean check) {
        if (check){
            three_one = check;
            three_two = !check;
            three_three = !check;
            three_four = !check;
        }
        else
            three_one=check;
    }

    public boolean isThree_two() {
        return three_two;
    }

    public void setThree_two(boolean check) {
        if (check){
            three_one = !check;
            three_two = check;
            three_three = !check;
            three_four = !check;
        }
        else
            three_two=check;
    }

    public boolean isThree_three() {
        return three_three;
    }

    public void setThree_three(boolean check) {
        if (check){
            three_one = !check;
            three_two = !check;
            three_three = check;
            three_four = !check;
        }
        else
            three_three=check;
    }

    public boolean isThree_four() {
        return three_four;
    }

    public void setThree_four(boolean check) {
        if (check){
            three_one = !check;
            three_two = !check;
            three_three = !check;
            three_four = check;
        }
        else
            three_four=check;
    }

    public boolean isFour_one() {
        return four_one;
    }

    public void setFour_one(boolean check) {
        if (check){
            four_one = check;
            four_two = !check;
            four_three = !check;
            four_four = !check;
        }
        else
            four_one=check;
    }

    public boolean isFour_two() {
        return four_two;
    }

    public void setFour_two(boolean check) {
        if (check){
            four_one = !check;
            four_two = check;
            four_three = !check;
            four_four = !check;
        }
        else
            four_two=check;
    }

    public boolean isFour_three() {
        return four_three;
    }

    public void setFour_three(boolean check) {
        if (check){
            four_one = !check;
            four_two = !check;
            four_three = check;
            four_four = !check;
        }
        else
            four_three=check;
    }

    public boolean isFour_four() {
        return four_four;
    }

    public void setFour_four(boolean check) {
        if (check){
            four_one = !check;
            four_two = !check;
            four_three = !check;
            four_four = check;
        }
        else
            four_four=check;
    }

    public boolean isFive_one() {
        return five_one;
    }

    public void setFive_one(boolean check) {
        if (check){
            five_one = check;
            five_two = !check;
            five_three = !check;
            five_four = !check;
        }
        else
            five_one=check;
    }

    public boolean isFive_two() {
        return five_two;
    }

    public void setFive_two(boolean check) {
        if (check){
            five_one = !check;
            five_two = check;
            five_three = !check;
            five_four = !check;
        }
        else
            five_two=check;
    }

    public boolean isFive_three() {
        return five_three;
    }

    public void setFive_three(boolean check) {
        if (check){
            five_one = !check;
            five_two = !check;
            five_three = check;
            five_four = !check;
        }
        else
            five_three=check;
    }

    public boolean isFive_four() {
        return five_four;
    }

    public void setFive_four(boolean check) {
        if (check){
            five_one = !check;
            five_two = !check;
            five_three = !check;
            five_four = check;
        }
        else
            five_four=check;
    }

    public boolean isSix_one() {
        return six_one;
    }

    public void setSix_one(boolean check) {
        if (check){
            six_one = check;
            six_two = !check;
            six_three = !check;
            six_four = !check;
        }
        else
            six_one=check;
    }

    public boolean isSix_two() {
        return six_two;
    }

    public void setSix_two(boolean check) {
        if (check){
            six_one = !check;
            six_two = check;
            six_three = !check;
            six_four = !check;
        }
        else
            six_two=check;
    }

    public boolean isSix_three() {
        return six_three;
    }

    public void setSix_three(boolean check) {
        if (check){
            six_one = !check;
            six_two = !check;
            six_three = check;
            six_four = !check;
        }
        else
            six_three=check;
    }

    public boolean isSix_four() {
        return six_four;
    }

    public void setSix_four(boolean check) {
        if (check){
            six_one = !check;
            six_two = !check;
            six_three = !check;
            six_four = check;
        }
        else
            six_four=check;
    }

    public boolean isSeven_one() {
        return seven_one;
    }

    public void setSeven_one(boolean check) {
        seven_one = check;
    }

    public boolean isSeven_two() {
        return seven_two;
    }

    public void setSeven_two(boolean check) {
        seven_two = check;
    }

    public boolean isSeven_three() {
        return seven_three;
    }

    public void setSeven_three(boolean check) {
        seven_three = check;
    }

    public boolean isSeven_four() {
        return seven_four;
    }

    public void setSeven_four(boolean check) {
        seven_four = check;
    }

    public String getEight() {
        return eight;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }

    public String getAnswer_one() {
        return answer_one;
    }

    public void setAnswer_one(String answer) {
        answer_one = answer;
    }

    public String getAnswer_two() {
        return answer_two;
    }

    public void setAnswer_two(String answer) {
        answer_two = answer;
    }

    public String getAnswer_three() {
        return answer_three;
    }

    public void setAnswer_three(String answer) {
        answer_three = answer;
    }

    public String getAnswer_four() {
        return answer_four;
    }

    public void setAnswer_four(String answer) {
        answer_four = answer;
    }

    public String getAnswer_five() {
        return answer_five;
    }

    public void setAnswer_five(String answer) {
        answer_five = answer;
    }

    public String getAnswer_six() {
        return answer_six;
    }

    public void setAnswer_six(String answer) {
        answer_six = answer;
    }

    public String getAnswer_seven() {
        return answer_seven;
    }

    public void setAnswer_seven(String answer) {
        answer_seven = answer;
    }

    public String getAnswer_eight() {
        return answer_eight;
    }

    public void setAnswer_eight(String answer) {
        answer_eight = answer;
    }
}
