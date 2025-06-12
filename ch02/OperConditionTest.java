package ch02;

public class OperConditionTest {
    public static void oper1() {
        int a = 10;
        int b = 20;
        System.out.println("산술 연산자 테스트");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("몫: b / a = " + (b / a)); 
        System.out.println("나머지: b % a = " + (b % a));
    }
    
    public static void oper2() {
        int a = 100;
        int b = 200;
        System.out.println("임의의 산술 연산자 테스트");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("몫: b / a = " + (b / a));
        System.out.println("나머지: b % a = " + (b % a));
    }



}


/* 

oper1() 메서드 실행 과정 그림
┌─────────────┐
│  int a = 10 │
│  int b = 20 │
└─────┬───────┘
      │
      ▼
┌────────────────────────────┐
│   연산자별 계산 및 출력      │
│   a + b = 10 + 20 = 30     │
│   a - b = 10 - 20 = -10    │
│   a * b = 10 * 20 = 200    │
│   b / a = 20 / 10 = 2      │
│   b % a = 20 % 10 = 0      │
└────────────────────────────┘


oper2() 메서드 실행 과정 그림
┌───────────────┐
│ int a = 100   │
│ int b = 200   │
└──────┬────────┘
       │
       ▼
┌───────────────────────────────┐
│   연산자별 계산 및 출력         │
│   a + b = 100 + 200 = 300     │
│   a - b = 100 - 200 = -100    │
│   a * b = 100 * 200 = 20000   │
│   b / a = 200 / 100 = 2       │
│   b % a = 200 % 100 = 0       │
└───────────────────────────────┘













*/