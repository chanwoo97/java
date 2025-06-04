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