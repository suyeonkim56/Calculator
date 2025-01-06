package com.example.Calculator3;
import java.util.ArrayList;

public class ArithmeticCalculator {
    private ArrayList<Integer> answers = new ArrayList<Integer>();
    int firstNumber;
    int secondNumber;
    char operator;

    ArithmeticCalculator(){}

    //값 setting
    void setCalculator(int firstNumber, int secondNumber, char operator){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    //enum 작성
    public enum OperatorType {
        PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

        OperatorType(String operator) {

        }
    }

    //수행한 사칙연산들의 값을 출력
    void answering(){
        System.out.print("결과들은 : ");
        for(int answer : answers){
            System.out.print(answer + ", ");
        }
    }

    //사칙연산 값들 중 맨 첫번째 값을 제거
    void answerRemove(){
        answers.remove(0);
    }
}

