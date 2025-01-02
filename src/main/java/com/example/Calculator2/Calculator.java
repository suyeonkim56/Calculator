package com.example.Calculator2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> answers = new ArrayList<Integer>();
    int firstNumber;
    int secondNumber;
    char operator;

    Calculator(){}

    void setCalculator(int firstNumber, int secondNumber, char operator){
        this.firstNumber = firstNumber;
        this. secondNumber = secondNumber;
        this.operator = operator;
    }
    void operating(){
        switch (operator)
        {
            case '+':
                System.out.println("첫번째 숫자 더하기 두번째 숫자는 " + (firstNumber + secondNumber));
                answers.add((firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("첫번째 숫자 빼기 두번째 숫자는 " + (firstNumber - secondNumber));
                answers.add((firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("첫번째 숫자 곱하기 두번째 숫자는 " + (firstNumber * secondNumber));
                answers.add((firstNumber * secondNumber));
                break;

            case '/':
                if(secondNumber == 0)
                {
                    System.out.println("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다");
                    break;
                }
                else
                {
                    System.out.println("첫번째 숫자 나누기 두번째 숫자는 " + (firstNumber / secondNumber));
                    answers.add((firstNumber / secondNumber));
                    break;
                }
            default:
                System.out.println("올바른 연산자를 입력해주세요");
        }
    }

    void answering(){
        System.out.print("결과들은 : ");
        for(int answer : answers){
            System.out.print(answer + ", ");
        }
    }

    void answerRemove(){
        answers.remove(0);
    }
}
