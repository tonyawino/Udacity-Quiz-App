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

    public boolean isOne_two() {
        return one_two;
    }

    public boolean isOne_three() {
        return one_three;
    }

    public boolean isOne_four() {
        return one_four;
    }

    public boolean isTwo_one() {
        return two_one;
    }

    public boolean isTwo_two() {
        return two_two;
    }

    public boolean isTwo_three() {
        return two_three;
    }

    public boolean isTwo_four() {
        return two_four;
    }

    public boolean isThree_one() {
        return three_one;
    }

    public boolean isThree_two() {
        return three_two;
    }

    public boolean isThree_three() {
        return three_three;
    }

    public boolean isThree_four() {
        return three_four;
    }

    public boolean isFour_one() {
        return four_one;
    }

    public boolean isFour_two() {
        return four_two;
    }

    public boolean isFour_three() {
        return four_three;
    }

    public boolean isFour_four() {
        return four_four;
    }

    public boolean isFive_one() {
        return five_one;
    }

    public boolean isFive_two() {
        return five_two;
    }

    public boolean isFive_three() {
        return five_three;
    }

    public boolean isFive_four() {
        return five_four;
    }

    public boolean isSix_one() {
        return six_one;
    }

    public boolean isSix_two() {
        return six_two;
    }

    public boolean isSix_three() {
        return six_three;
    }

    public boolean isSix_four() {
        return six_four;
    }

    public boolean isSeven_one() {
        return seven_one;
    }

    public boolean isSeven_two() {
        return seven_two;
    }

    public boolean isSeven_three() {
        return seven_three;
    }

    public boolean isSeven_four() {
        return seven_four;
    }

    public String getEight() {
        return eight;
    }

    public String getAnswer_one() {
        return answer_one;
    }

    public String getAnswer_two() {
        return answer_two;
    }

    public String getAnswer_three() {
        return answer_three;
    }

    public String getAnswer_four() {
        return answer_four;
    }

    public String getAnswer_five() {
        return answer_five;
    }

    public String getAnswer_six() {
        return answer_six;
    }

    public String getAnswer_seven() {
        return answer_seven;
    }

    public String getAnswer_eight() {
        return answer_eight;
    }

    public void setOne_one(boolean check) {
        one_one = check;
        one_two = !check;
        one_three = !check;
        one_four = !check;
    }

    public void setOne_two(boolean check) {
        one_one = !check;
        one_two = check;
        one_three = !check;
        one_four = !check;
    }

    public void setOne_three(boolean check) {
        one_one = !check;
        one_two = !check;
        one_three = check;
        one_four = !check;
    }

    public void setOne_four(boolean check) {
        one_one = !check;
        one_two = !check;
        one_three = !check;
        one_four = check;
    }

    public void setTwo_one(boolean check) {
        two_one = check;
        two_two = !check;
        two_three = !check;
        two_four = !check;
    }

    public void setTwo_two(boolean check) {
        two_one = !check;
        two_two = check;
        two_three = !check;
        two_four = !check;
    }

    public void setTwo_three(boolean check) {
        two_one = !check;
        two_two = !check;
        two_three = check;
        two_four = !check;
    }

    public void setTwo_four(boolean check) {
        two_one = !check;
        two_two = !check;
        two_three = !check;
        two_four = check;
    }

    public void setThree_one(boolean check) {
        three_one = check;
        three_two = !check;
        three_three = !check;
        three_four = !check;
    }

    public void setThree_two(boolean check) {
        three_one = !check;
        three_two = check;
        three_three = !check;
        three_four = !check;
    }

    public void setThree_three(boolean check) {
        three_one = !check;
        three_two = !check;
        three_three = check;
        three_four = !check;
    }

    public void setThree_four(boolean check) {
        three_one = !check;
        three_two = !check;
        three_three = !check;
        three_four = check;
    }

    public void setFour_one(boolean check) {
        four_one = check;
        four_two = !check;
        four_three = !check;
        four_four = !check;
    }

    public void setFour_two(boolean check) {
        four_one = !check;
        four_two = check;
        four_three = !check;
        four_four = !check;
    }

    public void setFour_three(boolean check) {
        four_one = !check;
        four_two = !check;
        four_three = check;
        four_four = !check;
    }

    public void setFour_four(boolean check) {
        four_one = !check;
        four_two = !check;
        four_three = !check;
        four_four = check;
    }

    public void setFive_one(boolean check) {
        five_one = check;
        five_two = !check;
        five_three = !check;
        five_four = !check;
    }

    public void setFive_two(boolean check) {
        five_one = !check;
        five_two = check;
        five_three = !check;
        five_four = !check;
    }

    public void setFive_three(boolean check) {
        five_one = !check;
        five_two = !check;
        five_three = check;
        five_four = !check;
    }

    public void setFive_four(boolean check) {
        five_one = !check;
        five_two = !check;
        five_three = !check;
        five_four = check;
    }

    public void setSix_one(boolean check) {
        six_one = check;
        six_two = !check;
        six_three = !check;
        six_four = !check;
    }

    public void setSix_two(boolean check) {
        six_one = !check;
        six_two = check;
        six_three = !check;
        six_four = !check;
    }

    public void setSix_three(boolean check) {
        six_one = !check;
        six_two = !check;
        six_three = check;
        six_four = !check;
    }

    public void setSix_four(boolean check) {
        six_one = !check;
        six_two = !check;
        six_three = !check;
        six_four = check;
    }

    public void setSeven_one(boolean check) {
        seven_one = check;
    }

    public void setSeven_two(boolean check) {
        seven_two = check;
    }

    public void setSeven_three(boolean check) {
        seven_three = check;
    }

    public void setSeven_four(boolean check) {
        seven_four = check;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }

    public void setAnswer_one(String answer) {
        answer_one = answer;
    }

    public void setAnswer_two(String answer) {
        answer_two = answer;
    }

    public void setAnswer_three(String answer) {
        answer_three = answer;
    }

    public void setAnswer_four(String answer) {
        answer_four = answer;
    }

    public void setAnswer_five(String answer) {
        answer_five = answer;
    }

    public void setAnswer_six(String answer) {
        answer_six = answer;
    }

    public void setAnswer_seven(String answer) {
        answer_seven = answer;
    }

    public void setAnswer_eight(String answer) {
        answer_eight = answer;
    }
}
