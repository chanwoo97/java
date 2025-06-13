package ch03;

import java.util.Scanner;

public class Mini_quiz1_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("도서 관리 프로그램 예시");
            System.out.println("=================================================================");
            System.out.println("1. 도서 추가 , 2. 도서 조회, 3. 도서 수정, 4. 도서 삭제, 5.더미 데이터 추가 5개, 6. 검색기능,  0. 종료");
            System.out.println("=================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거
            switch (menu) {
                case 1:
                    Mini_quiz1_Func.addBook(scanner); // 도서 추가
                    break;
                case 2:
                    Mini_quiz1_Func.viewBooks(); // 도서 조회
                    break;
                case 3:
                    Mini_quiz1_Func.updateBook(scanner); // 도서 수정
                    break;
                case 4:
                    Mini_quiz1_Func.deleteBook(scanner); // 도서 삭제
                    break;
                case 5:
                    Mini_quiz1_Func.addDummyBooks(); // 더미 데이터 추가
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 6:
                    Mini_quiz1_Func.searchBook(scanner); // 회원 검색
                    System.out.println("회원 검색 기능이 실행되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0); // 메뉴가 0이 아닐 때까지 반복
    }
}


/*
주요 동작 흐름
메뉴 출력
do-while 루프 내에서 도서 관리 메뉴가 출력됩니다.

메뉴 입력
scanner.nextInt()로 정수 입력 후 scanner.nextLine()으로 개행문자 제거 → 입력 버퍼 문제 방지.

switch-case 분기
각 메뉴 번호에 따라 Mini_quiz1_Func의 관련 메서드 호출

1: 도서 추가

2: 도서 조회

3: 도서 수정

4: 도서 삭제

5: 더미 데이터 추가

6: 도서 검색

0: 프로그램 종료

그 외: 오류 메시지 출력

반복 종료 조건
메뉴 0 선택 시 반복문 종료 → 프로그램 종료 메시지 출력 후 종료

참고 및 개선사항
scanner.nextLine() 개행 제거 처리 적절
nextInt() 사용 시 버퍼에 남은 개행 문자를 꼭 처리해주어야 입력 혼동이 없습니다.

메뉴 출력 메시지 명확성
메뉴 6 (검색) 실행 후 "회원 검색 기능이 실행되었습니다." 메시지가 있는데, 회원 → 도서로 수정하면 더 명확합니다.

예외 처리 미흡
숫자 이외 입력 시 프로그램이 예외를 던지므로, try-catch로 입력 유효성 검사 추가 가능

메서드 호출 정리
Mini_quiz1_Func 내 기능이 정상 작동하는 전제 하에 이 메인 코드는 잘 구성되어 있습니다.

예시) 메뉴 6 메시지 수정 추천
case 6:
    Mini_quiz1_Func.searchBook(scanner);
    System.out.println("도서 검색 기능이 실행되었습니다.");
    break;
    
*/