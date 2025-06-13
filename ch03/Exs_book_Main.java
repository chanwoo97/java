package ch03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exs_book_Main {
    public static void main(String[] args) {
 // 공용으로 사용할 스캐너
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("도서 관리 프로그램 예시");
            System.out.println("==============================================================================================================");
            System.out.println("1. 도서 정보 추가 , 2. 도서 조회, 3. 도서 정보 수정, 4. 도서 정보 삭제, 5.더미 도서 5개 추가, 6. 도서 검색,  0. 종료");
            System.out.println("==============================================================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거
            switch (menu) {
                case 1:
                    Exs_book.addBook(scanner); // 도서 정보 추가
                    break;
                case 2:
                    Exs_book.viewBooks(); // 도서 정보 조회
                    break;
                case 3:
                    Exs_book.updateBook(scanner); // 도서 정보 수정
                    break;
                case 4:
                    Exs_book.deleteBook(scanner); // 도서 정보 삭제
                    break;
                case 5:
                    Exs_book.addDummyBooks(); // 더미 데이터 추가
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 6:
                    Exs_book.searchBook(scanner); // 도서 검색
                    System.out.println("도서 검색 기능이 실행되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0); // 메뉴가 0이 아닐 때까지 반복
        System.out.println("============================");

        System.out.println("============================");

        System.out.println("============================");

        System.out.println("============================");

        System.out.println("\n============================");

        System.out.println("============================");

        System.out.println("============================");

        scanner.close(); // 스캐너 자원 반납
        
    }
}


/*
1. 프로그램 실행과 메뉴 출력 흐름도
[프로그램 시작]
      │
      ▼
[메뉴 반복 출력]
  ┌─────────────────────────────────────────────────────────────┐
  │ 도서 관리 프로그램 예시                                       │
  │ 1. 도서 정보 추가                                            │
  │ 2. 도서 조회                                                 │
  │ 3. 도서 정보 수정                                            │
  │ 4. 도서 정보 삭제                                            │
  │ 5. 더미 도서 5개 추가                                        │
  │ 6. 도서 검색                                                 │
  │ 0. 종료                                                     │
  └─────────────────────────────────────────────────────────────┘
      │
      ▼
[사용자 입력(menu)]
      │
      ▼
[Switch 문으로 메뉴에 맞는 함수 호출]
      │
      ├─ case 1 → Exs_book.addBook(scanner)
      │
      ├─ case 2 → Exs_book.viewBooks()
      │
      ├─ case 3 → Exs_book.updateBook(scanner)
      │
      ├─ case 4 → Exs_book.deleteBook(scanner)
      │
      ├─ case 5 → Exs_book.addDummyBooks()
      │
      ├─ case 6 → Exs_book.searchBook(scanner)
      │
      └─ case 0 → 프로그램 종료
      │
      ▼
[반복해서 메뉴 보여줌 (0 입력 전까지)]

2. 주요 기능별 역할
메뉴 번호	기능	호출 메서드	설명
1	도서 정보 추가	Exs_book.addBook(scanner)	사용자가 입력한 도서 정보 저장
2	도서 조회	Exs_book.viewBooks()	등록된 모든 도서 목록 출력
3	도서 정보 수정	Exs_book.updateBook(scanner)	도서 정보 변경 기능
4	도서 정보 삭제	Exs_book.deleteBook(scanner)	도서 목록에서 특정 도서 삭제
5	더미 도서 5개 추가	Exs_book.addDummyBooks()	테스트용 더미 도서 5개 자동 추가
6	도서 검색	Exs_book.searchBook(scanner)	사용자가 입력한 조건으로 도서 검색
0	프로그램 종료	-	반복 종료 및 프로그램 종료 메시지 출력

3. Scanner와 반복문
Scanner는 키보드 입력을 받는 역할

do-while 반복문으로 메뉴를 계속 보여주면서 사용자가 0을 입력하면 종료

4. 개선 및 팁
scanner.nextLine() 호출하여 숫자 입력 후 남아있는 개행문자(엔터)를 제거하는 점 아주 좋아요!

메뉴가 잘못 입력되었을 때 안내 문구 출력해줘서 사용자가 다시 시도할 수 있도록 친절히 만들었네요.

*/