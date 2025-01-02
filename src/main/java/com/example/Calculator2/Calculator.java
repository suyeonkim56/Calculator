package com.example.Calculator2;

import javax.smartcardio.Card;
import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> answer = new ArrayList<>();
    Calculator(){}

    void operating(int firstNumber, int secondNumber, char operator){
        switch (operator)
        {
            case '+':
                System.out.println("첫번째;= 숫자 더하기 두번째 숫자는 " + (firstNumber + secondNumber));
                answer.add((firstNumber + secondNumber));
            case '-':
                System.out.println("첫번째 숫자 빼기 두번째 숫자는 " + (firstNumber - secondNumber));
                answer.add((firstNumber - secondNumber));
            case '*':
                System.out.println("첫번째 숫자 곱하기 두번째 숫자는 " + (firstNumber * secondNumber));
                answer.add((firstNumber * secondNumber));
            case '/':
                if(secondNumber == 0)
                {
                    System.out.println("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다");
                }
                else
                {
                    System.out.println("첫번째 숫자 나누기 두번째 숫자는 " + (firstNumber / secondNumber));
                    answer.add((firstNumber / secondNumber));
                }
            default:
                System.out.println("올바른 연산자를 입력해주세요");
        }
    }
}
