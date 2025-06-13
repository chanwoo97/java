package ch03;

import java.util.Scanner;

import ch02.Exs;

public class Exs_ch3_Main {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너
        Scanner scanner = new Scanner(System.in);

        // ex3-8-2, 배열을 리턴하는 메서드
        int[] returnArray = Exs_ch3.ex3_8_return(); // 배열 생성, 조회, 반복문 출력 예시
        System.out.println("ex3-8-2, 리턴된 배열의 값:");
        for (int number : returnArray) {
            System.out.print(number + " "); // 1 2 3 4 5 출력
        }

        // Ex3-8, 배열 생성, 조회, 반복문 출력 예시
        // Exs_ch3.ex3_8();
        System.out.println("============================");

        // ex3_7 , 확인 하는 예시 메소드
        // Exs_ch3.ex3_7(scanner);
        System.out.println("============================");

        // 회원 관리 프로그램 예시, ui 그리기,
        // Exs_ch3.ex_user_ui(scanner);
        System.out.println("============================");

        // Ex3-6-3, 이중 배열 예시
        // Exs_ch3.ex3_6_3();
        System.out.println("============================");

        // Ex3-6-2, 배열 직접 생성과 값 할당 예시
        // Exs_ch3.ex3_6_2();

        // Ex3-6, 배열1, 기본 생성과, 값 할당, 반복문 활용한 출력 예시
        // Exs_ch3.ex3_6();
        System.out.println("============================");

        // Ex3-5, continue 확인 , 다음 반복으로 넘어가는 예시,
        // Exs_ch3.ex3_5(scanner);
        System.out.println("============================");

        // Ex3-4 , 중첩 반복문 이용해서 구구단 출력해보기
        // Exs_ch3.ex3_4();

        // Ex3-3 퀴즈 ,do while 문 예시 확인.
        // Exs_ch3.ex3_3();
        System.out.println("\n============================");

        // Ex3-2 퀴즈 , 예시 확인.
        // int count = Exs_ch3.ex3_2_quiz(scanner);
        // System.out.println("입력한 문자 개수: " + count);
        System.out.println("============================");

        // Ex3-2 , 예시 확인.
        // Exs_ch3.ex3_2(scanner);
        System.out.println("============================");

        // Ex3-1 , 예시 확인.
        // int result_ex3_1 = Exs_ch3.getSum(10); // 55
        // System.out.println("Ex3-1: 1~10까지의 합 = " + result_ex3_1);

        scanner.close(); // 스캐너 자원 반납
    }
}


/*
📌 전체 역할 요약
이 코드는 자바 학습 중 만든 여러 예제 파일들 중에서 원하는 예제 메서드를 선택해서 실행해볼 수 있도록 준비된 메인(Main) 파일입니다.
즉, 테스트하고 싶은 코드들을 주석을 풀어가며 실행해보는 용도입니다.

📖 한 줄씩 설명
java
복사
편집
Scanner scanner = new Scanner(System.in);
▶ 사용자가 키보드로 값을 입력할 수 있게 도와주는 도구입니다. (한 번 만들고 여러 메서드에서 재사용 가능)

java
복사
편집
int[] returnArray = Exs_ch3.ex3_8_return();
▶ Exs_ch3 클래스 안에 있는 ex3_8_return() 메서드를 호출해서 배열을 받아옵니다.
예상 결과: 1 2 3 4 5 배열 반환

java
복사
편집
for (int number : returnArray) {
    System.out.print(number + " ");
}
▶ 배열에 담긴 값을 하나씩 꺼내서 출력합니다.

🧪 나머지 코드: 호출 주석 처리됨
java
복사
편집
// Exs_ch3.ex3_8();          → 배열 생성 및 출력 예제  
// Exs_ch3.ex3_7(scanner);   → 입력값 처리 예제  
// Exs_ch3.ex_user_ui(scanner); → 회원 관리 UI 관련 코드  
// Exs_ch3.ex3_6_3();        → 2차원 배열(이중 배열) 예제  
// Exs_ch3.ex3_6_2();        → 배열 직접 생성과 값 할당  
// Exs_ch3.ex3_6();          → 배열 기본 구조 및 반복 출력  
// Exs_ch3.ex3_5(scanner);   → continue 문 예제  
// Exs_ch3.ex3_4();          → 구구단 출력 예제  
// Exs_ch3.ex3_3();          → do-while 문 예제  
// Exs_ch3.ex3_2_quiz(scanner); → 입력 문자 수 세기 퀴즈  
// Exs_ch3.ex3_2(scanner);   → 일반 입력 예제  
// Exs_ch3.getSum(10);       → 1부터 10까지 합 구하기
💡 필요한 기능을 테스트하고 싶을 때, 앞에 // 주석을 지우면 실행됩니다.

java
복사
편집
scanner.close();
▶ 키보드 입력 도구를 사용한 뒤 꼭 닫아줘야 합니다. 메모리 누수 방지!

🧠 요약 정리
| 항목     | 설명                                    |
| ------ | ------------------------------------- |
| 클래스명   | `Exs_ch3_Main`                        |
| 역할     | 다양한 예제를 테스트하는 **Main 실행 파일**          |
| 동작 방식  | 호출하고 싶은 기능의 주석을 해제해서 실행               |
| 주요 개념  | `Scanner`, 배열, 메서드 호출, 반복문            |
| 의도된 용도 | 실습 중 작성한 예제를 **한곳에서 실행해보기** 위한 관리 포인트 |

🧭 전체 흐름도
[프로그램 시작]
        ↓
[Scanner 준비]
        ↓
[원하는 예제 메서드 호출]
   ┌────────────┬─────────────┬───────────────┐
   ↓            ↓             ↓
[배열 예제]  [회원 관리 예제]  [반복문/조건문 예제]
   ↓            ↓             ↓
[출력 결과 확인]
        ↓
[Scanner 종료]
        ↓
[프로그램 종료]

📌 추천 개선 사항
메뉴형 UI를 만들어서, 실행할 예제를 번호로 선택할 수 있도록 개선하면 더 편해요.

예를 들어:

java
복사
편집
System.out.println("1. 배열 예제 보기");
System.out.println("2. 회원 관리 프로그램 실행");
System.out.println("3. 구구단 출력 예제 실행");
// ...
사용자가 입력하면 해당 메서드를 호출하는 구조로 바꿔보면 간단한 콘솔 앱 형태가 됩니다 😊
*/