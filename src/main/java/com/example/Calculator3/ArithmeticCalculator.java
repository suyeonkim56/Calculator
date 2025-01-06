package com.example.Calculator3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArithmeticCalculator {
    //계산 결과들
    private ArrayList<Integer> answers = new ArrayList<Integer>();
    //받은 값들
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

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
                numbers.add(firstNumber);
                numbers.add(secondNumber);
                answers.add(answer);
                return answer;
            }
            case MINUS:
            {
                int answer = firstNumber - secondNumber;
                numbers.add(firstNumber);
                numbers.add(secondNumber);
                answers.add(answer);
                return answer;
            }
            case MULTIPLY:
            {
                int answer = firstNumber * secondNumber;
                numbers.add(firstNumber);
                numbers.add(secondNumber);
                answers.add(answer);
                return answer;
            }
            case DIVIDE:
            {
                int answer = firstNumber / secondNumber;
                numbers.add(firstNumber);
                numbers.add(secondNumber);
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
        System.out.print("\n입력한 값들보다 큰 결과들은 : ");
        int max = Collections.max(numbers);
        List<Integer> bigger = answers.stream().filter(x-> x>max).toList();

        for(int big : bigger)
        {
            System.out.print(big+", ");
        }
        System.out.println("");
    }

    //사칙연산 값들 중 맨 첫번째 값을 제거
    void answerRemove(){
        answers.remove(0);
    }
}

