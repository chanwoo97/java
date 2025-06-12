package ch02;

import java.util.Scanner;

public class Exs_main {
    public static void main(String[] args) {
        System.out.println("파이널 상수 이용한, 원면적 구하기 예제");
        // 반지름 5.0인 원의 면적 구하기
        String result = Exs.getCircleArea(5.0);
        System.out.println(result);
    
        // 강제 행변환 예시
        Exs_doc.getTypeExam();    
    
        // EX2-7, a++, ++a 예시,
        Exs_doc.getIncDecExam();

        // EX2-9, 삼항 연산자 예시
        String result_ex2_9 = Exs_doc.getTernaryExam(75);
        System.out.println("EX2-9, 삼항 연산자 예시: " + result_ex2_9);
        System.out.println("----------------------------");
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자 이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.println("좋아하는 월을 입력하세요 (1~12):");
        String month = scanner.nextLine();
        int monthInt = Integer.parseInt(month);
        // 스캐너 이용해서 받아서 입력.d
        String result_exMini_quiz1 = Exs_doc.exMini_quiz1(name, monthInt);
        System.out.println(result_exMini_quiz1);
        scanner.close();
        // 하드 코딩, 직접 이름과, 월을 입력 하건.
        // Exs_doc.exMini_quiz1("홍길동", 5);
        // 퀴즈
    
    }
}

/*
┌───────────────────────────────┐
│          Exs_main 클래스       │
│          main() 메서드         │
└───────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ "파이널 상수 이용한, 원면적 구하기 예제" 출력 │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Exs.getCircleArea(5.0) 호출  │
  │ → 반지름 5.0인 원의 면적 계산 │
  │ → 결과 문자열 반환             │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ 결과 문자열 출력               │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Exs_doc.getTypeExam() 호출  │
  │ → 타입 변환 예제 출력         │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Exs_doc.getIncDecExam() 호출 │
  │ → 증감 연산자 예제 출력       │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Exs_doc.getTernaryExam(75) 호출│
  │ → 삼항 연산자로 합격 여부 판단 │
  │ → 결과 문자열 반환             │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ 결과 문자열 출력               │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Scanner 객체 생성             │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ 사용자에게 이름 입력 요청     │
  │ → 입력값 저장(name)           │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ 사용자에게 좋아하는 월 입력 요청│
  │ → 입력값 저장(month 문자열)     │
  │ → 문자열을 정수로 변환(monthInt)│
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Exs_doc.exMini_quiz1(name, monthInt) 호출 │
  │ → 월에 따른 계절 문자열 반환                 │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ 결과 문자열 출력               │
  └─────────────┬───────────────┘
                │
  ┌─────────────▼───────────────┐
  │ Scanner 객체 종료            │
  └─────────────────────────────┘

*/