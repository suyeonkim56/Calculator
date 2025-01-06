package com.example.Calculator2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int firstNumber;
        int secondNumber;
        String operator;
        String answer;
        // exit을 받을 때 까지 무한 반복
        while(true)
        {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            firstNumber =sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            secondNumber =sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : " );
            operator = sc.next();

            //cal class에 변수 set
            cal.setCalculator(firstNumber, secondNumber, operator.charAt(0));
            
            //사칙연산 수행
            cal.operating();

            System.out.print("더 계산하시겠습니까? (exit 입력시 종료) : ");
            answer = sc.next();
            if(answer.equals("exit"))
            {
                //모든 사칙연산 수행 값 출력
                cal.answering();

                //사칙연산 값들 중 맨 첫번째 값을 제거한 값들을 출력
                System.out.print("첫번째 결과를 제외한 ");
                cal.answerRemove();
                cal.answering();

                //무한 루프 빠져나가기
                break;
            }
        }
    }
}
