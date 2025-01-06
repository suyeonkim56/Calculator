package com.example.Calculator3;
import java.util.ArrayList;

public class ArithmeticCalculator {
    private ArrayList<Integer> answers = new ArrayList<Integer>();
    private int firstNumber;
    private int secondNumber;
    public OperatorType operation;

    ArithmeticCalculator(){}

    //값 setting
    void setCalculator(int firstNumber, int secondNumber, OperatorType operation){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    //enum 값에 따른 사칙연산 수행
    public int calculating()
    {
        switch(operation)
        {
            case PLUS:
            {
                int answer = firstNumber + secondNumber;
                answers.add(answer);
                return answer;
            }
            case MINUS:
            {
                int answer = firstNumber - secondNumber;
                answers.add(answer);
                return answer;
            }
            case MULTIPLY:
            {
                int answer = firstNumber * secondNumber;
                answers.add(answer);
                return answer;
            }
            case DIVIDE:
            {
                int answer = firstNumber / secondNumber;
                answers.add(answer);
                return answer;
            }
            default: return 0;
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

