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