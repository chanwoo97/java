package ch03;

import java.util.Scanner;
import util.date.DateUtil;

public class Exs_book {
    static final int MAX_USERS = 100; // 최대 도서 수
    static String[] bookname = new String[MAX_USERS];
    static String[] author = new String[MAX_USERS];
    static String[] publishers = new String[MAX_USERS];
    static String[] registrationDates = new String[MAX_USERS];
    // 상태 변수,
    static int bookCount = 0; // 현재 등록된 도서 수

    // 도서 추가
    public static void addBook(Scanner scanner) {
        if (bookCount < MAX_USERS) { // 기본 유효성 체크
            System.out.println("도서명을 입력하세요: ");
            String inputbookname = scanner.nextLine();
            bookname[bookCount] = inputbookname; // 도서명 저장

            System.out.println("저자를 입력하세요: ");
            String inputauthor = scanner.nextLine();
            author[bookCount] = inputauthor; // 저자 저장

            System.out.println("출판사를 입력하세요: ");
            String inputpublishers = scanner.nextLine();
            publishers[bookCount] = inputpublishers; // 출판사 저장

            // 현재 날짜와 시간 저장
            String registrationDate = DateUtil.getCurrentDateTime();
            registrationDates[bookCount] = registrationDate; // 등록일 저장

            // 도서 수 증가
            bookCount++;
            System.out.println("도서명이 추가되었습니다: 도서명 : " + inputbookname + ", 저자 : " + inputauthor + ", 출판사 : " + inputpublishers + ", 등록일 : "+ registrationDate);
        } else {
            System.out.println("도서 수가 최대치를 초과했습니다.");
        }
    } // 도서 추가 메서드


    // 도서 조회 메서드
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return; // 등록된 도서가 없을 때, 조회 기능 종료, 메서드(함수)를 나가기
        }
        System.out.println("등록된 도서 목록:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + bookname[i] + ", " + author[i] + ", " + publishers[i] + ", " + registrationDates[i]);
        }
    } // 도서 조회 메서드


    // 도서 수정 메서드
    public static void updateBook(Scanner scanner) {
        System.out.println("수정할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt(); // 수정할 도서의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거
        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 도서명을 입력하세요: ");
        String inputbookname = scanner.nextLine();
        bookname[index] = inputbookname; // 도서명 수정

        System.out.println("수정할 저자를 입력하세요: ");
        String inputauthor = scanner.nextLine();
        author[index] = inputauthor; // 저자 수정

        System.out.println("수정할 출판사를 입력하세요: ");
        String inputpublishers = scanner.nextLine();
        publishers[index] = inputpublishers; // 출판사 수정

        // 현재 날짜와 시간 저장
        String registrationDate = DateUtil.getCurrentDateTime();
        registrationDates[index] = registrationDate; // 등록일 수정

        System.out.println("도서 정보가 수정되었습니다: 도서명 : " + bookname[index] + ", 저자 : " + author[index] +",  " + publishers[index] + ", ");
    } // 도서 수정 메서드

    // 도서 정보 삭제 메서드
    public static void deleteBook(Scanner scanner) {
        System.out.println("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt(); // 삭제할 도서의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; // 잘못된 인덱스를 입력시, 삭제 기능을 종료 한다는 의미.
        }
        // 삭제할 도서 정보 출력
        System.out.println("삭제할 도서 정보: " + bookname[index] + ", " + author[index] + ", " + publishers[index] + ", " + registrationDates[index]);

        // 해당 인덱스의 도서 정보를 삭제하고, 뒤에 있는 도서 정보를 앞으로 이동
        for (int i = index; i < bookCount - 1; i++) {
            bookname[i] = bookname[i + 1];
            author[i] = author[i + 1];
            publishers[i] = publishers[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }
        // 마지막 도서 정보는 null로 설정
        bookname[bookCount - 1] = null;
        author[bookCount - 1] = null;
        publishers[bookCount - 1] = null;
        registrationDates[bookCount - 1] = null;

        // 도서 수 감소
        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }
    // 도서 삭제 메서드

    // 도서 더미 데이터 5개 추가하는 메서드
    public static void addDummyBooks() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_USERS) {
                bookname[bookCount] = "더미도서" + (i + 1);
                author[bookCount] = "저자명" + (i + 1);
                publishers[bookCount] = "출판사명" + (i + 1);
                registrationDates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            } else {
                System.out.println("더미 도서 추가 실패: 최대 도서 수 초과");
                break;
            }
        }
        System.out.println("더미 도서 5명이 추가되었습니다.");
    }
    // 도서 더미 데이터 5개 추가하는 메서드

    // 검색 기능
    // 도서 목록에서 이름 또는 저자로 검색하는 기능을 추가할 수 있습니다.
    public static void searchBook(Scanner scanner) {
        System.out.println("검색할 도서의 이름 또는 저자를 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (bookname[i].contains(searchQuery) || author[i].contains(searchQuery)) {
                System.out.println("검색 결과: " + (i + 1) + ". " + bookname[i] + ", " + author[i] + ", " + publishers[i] + ", " + registrationDates[i]);
                found = true;
            }
        }

        if (!found) { // 검색 결과가 있을 경우, 실행이 안됨, found = true; -> false;
            System.out.println("검색 결과가 없습니다.");
        }
    }
    // 검색 기능

}


/*
Exs_book 클래스 주요 구성 요소와 흐름
1. 저장 구조 (도서 데이터 배열)
| 배열명                   | 의미           | 용도                 |
| --------------------- | ------------ | ------------------ |
| `bookname[]`          | 도서명 배열       | 각 도서 이름 저장         |
| `author[]`            | 저자 배열        | 각 도서 저자 저장         |
| `publishers[]`        | 출판사 배열       | 각 도서 출판사 저장        |
| `registrationDates[]` | 등록일 배열       | 도서 등록(또는 수정) 날짜 저장 |
| `bookCount`           | 등록된 도서 개수 저장 | 현재 저장된 도서의 총 개수    |

2. 주요 기능별 흐름도
2-1. 도서 추가 (addBook)
[사용자에게 도서명, 저자, 출판사 입력 요청] → [각 배열에 해당 정보 저장 (bookCount 인덱스 위치)] → 
[현재 날짜 저장] → [bookCount 증가] → [추가 완료 메시지 출력]

2-2. 도서 조회 (viewBook)
[bookCount가 0인지 확인] → [0이면 '등록된 도서가 없습니다.' 출력 후 종료] → 
[아니면 배열들 순회하며 도서 정보 출력]

2-3. 도서 수정 (updateBook)
[수정할 도서 인덱스 입력] → [유효성 검사 실패 시 종료] → 
[새 도서명, 저자, 출판사 입력] → [해당 인덱스 배열 값들 수정] → [등록일 현재 시간으로 변경] → [수정 완료 메시지 출력]

2-4. 도서 삭제 (deleteBook)
[삭제할 도서 인덱스 입력] → [유효성 검사 실패 시 종료] → 
[해당 인덱스 도서 정보 출력] → [배열 뒤쪽 도서 정보를 앞으로 당겨서 빈 칸 채움] → 
[마지막 배열 값 null 처리] → [bookCount 감소] → [삭제 완료 메시지 출력]

2-5. 도서 더미 데이터 추가 (addDummyBooks)
[bookCount가 MAX_USERS 미만이면] → [5개 반복하며 '더미도서N'과 관련 정보 저장] → [bookCount 증가] → [완료 메시지]

2-6. 도서 검색 (searchBook)
[검색어 입력] → [배열 전체 순회] → [도서명 or 저자에 검색어 포함되면 해당 도서 정보 출력] → 
[검색 결과 없으면 '검색 결과가 없습니다.' 출력]


그림으로 정리 (개념도)
┌─────────────┐
│   사용자 입력   │
└─────┬───────┘
      │
      ▼
┌─────────────┐
│  Exs_book 클래스  │
│  ┌───────────┐ │
│  │ 도서 정보 배열  │
│  │ bookname[]    │
│  │ author[]      │
│  │ publishers[]  │
│  │ registrationDates[] │
│  └───────────┘ │
│               │
│  ┌───────────┐ │
│  │ 주요 기능    │
│  │ addBook()  │
│  │ viewBooks()│
│  │ updateBook()│
│  │ deleteBook()│
│  │ addDummyBooks()│
│  │ searchBook() │
│  └───────────┘ │
└─────────────┘
      │
      ▼
┌─────────────┐
│   결과 출력   │
└─────────────┘

추가 팁
DateUtil.getCurrentDateTime()는 현재 날짜와 시간을 문자열로 받아오는 유틸리티 함수입니다.

삭제 시 배열 데이터를 한 칸씩 앞으로 당기는 방식은 기본적인 배열 관리 방법입니다.

배열 대신에 ArrayList 같은 동적 자료구조를 사용하면 더 유연한 관리가 가능해집니다.

*/
