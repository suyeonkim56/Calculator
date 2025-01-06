package com.example.Calculator3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();
        number<T> firstNumber = new number<>();
        number<T> secondNumber = new number<>();
        int number;
        String operator;
        String answer;

        while(true)
        {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            firstNumber.setValue(sc.nextDouble());
            System.out.print("두 번째 숫자를 입력하세요 : ");
            secondNumber.setValue(sc.next());
            System.out.print("사칙연산 기호를 입력하세요 : " );
            operator = sc.next();

            // 받은 문자로 enum 상수 설정
            OperatorType operation = OperatorType.findbyString(operator.charAt(0));

            //class 값 설정
            cal.setCalculator(firstNumber.getValue(), secondNumber.getValue(), operation);

            //계산
            System.out.println(cal.calculating());

            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : ");
            answer = sc.next();
            if(answer.equals("exit"))
            {
                cal.answering();
                System.out.print("첫번째 결과를 제외한 ");
                cal.answerRemove();
                cal.answering();
                break;
            }
        }
    }
}
