package ch02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("ScannerTest 시작");

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine(); 
        System.out.println("입력한 이름:" + name); 

        System.out.println("본인이 좋아하는 숫자를 입력하세요:");
        int number = scanner.nextInt(); // nextLine() 메서드를 사용하여 한 줄 전체를 입력받음
        System.out.println("입력한 본인이 좋아하는 숫자 :" + number); // 입력받은 이름을 출력
        // 실제 작업 순서5, 위에서 입력 받는 내용이 전부 작업 후 , 맨 마지막에 한번만 실행.
        scanner.close();
         // Scanner 객체를 사용한 후에는 반드시 닫아줘야 함. 리소스 누수 방지
    
        

        }
}


