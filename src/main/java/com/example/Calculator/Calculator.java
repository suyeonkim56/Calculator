package com.example.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String operator;
        String answer;
        while(true)
        {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            firstNumber =sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            secondNumber =sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : " );
            operator = sc.next();

            switch (operator.charAt(0))
            {
                case '+':
                    System.out.println("첫번째 숫자 더하기 두번째 숫자는 " + (firstNumber + secondNumber));
                    break;
                case '-':
                    System.out.println("첫번째 숫자 빼기 두번째 숫자는 " + (firstNumber - secondNumber));
                    break;
                case '*':
                    System.out.println("첫번째 숫자 곱하기 두번째 숫자는 " + (firstNumber * secondNumber));
                    break;
                case '/':
                    if(secondNumber == 0)
                        System.out.println("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다");
                    else
                        System.out.println("첫번째 숫자 나누기 두번째 숫자는 " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("올바른 연산자를 입력해주세요");
            }
            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : ");
            answer = sc.next();
            if(answer.equals("exit"))
                break;
        }

    }
}
