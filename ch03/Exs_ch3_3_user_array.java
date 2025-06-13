package ch03;

import java.util.Scanner;

import util.date.DateUtil;

// 과제 할 페이지 -> 도서관리 프로그램



public class Exs_ch3_3_user_array {
    public class Exs_ch3_2_user_array {
    static final int MAX_USERS = 100;
    static String[] names = new String[MAX_USERS];
    static String[] emails = new String[MAX_USERS];
    static String[] passwords = new String[MAX_USERS];
    static String[] registrationDates = new String[MAX_USERS];
    static int userCount = 0;

    public static void addUser(Scanner scanner) {
        if (userCount < MAX_USERS) {
            System.out.println("이름을 입력하세요: ");
            String name = scanner.nextLine();
            names[userCount] = name;

            System.out.println("이메일을 입력하세요: ");
            String email = scanner.nextLine();
            emails[userCount] = email;

            System.out.println("패스워드를 입력하세요: ");
            String password = scanner.nextLine();
            passwords[userCount] = password;

            String registrationDate = DateUtil.getCurrentDateTime();
            registrationDates[userCount] = registrationDate;

            userCount++;
            System.out.println("회원이 추가되었습니다: " + name + ", " + email + ", " + registrationDate);
        } else {
            System.out.println("회원 수가 최대치를 초과했습니다.");
        }
    }

    public static void viewUsers() {
        if (userCount == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("등록된 회원 목록:");
        for (int i = 0; i < userCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + names[i] + ", " + emails[i] + ", "
                    + registrationDates[i]);
        }
    }

    public static void updateUser(Scanner scanner) {
        System.out.println("수정할 회원의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine(); 
        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 회원의 이름을 입력하세요: ");
        String name = scanner.nextLine();
        names[index] = name; 

        System.out.println("수정할 회원의 이메일을 입력하세요: ");
        String email = scanner.nextLine();
        emails[index] = email; 

        System.out.println("수정할 회원의 패스워드를 입력하세요: ");
        String password = scanner.nextLine();
        passwords[index] = password; 

        String registrationDate = DateUtil.getCurrentDateTime();
        registrationDates[index] = registrationDate; 

        System.out.println("회원 정보가 수정되었습니다: " + names[index] + ", " + emails[index]);
    } 


    public static void deleteUser(Scanner scanner) {
        System.out.println("삭제할 회원의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine();

        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; 
        }
        
        System.out.println("삭제할 회원 정보: " + names[index] + ", " + emails[index] + ", " + registrationDates[index]);

        for (int i = index; i < userCount - 1; i++) {
            names[i] = names[i + 1];
            emails[i] = emails[i + 1];
            passwords[i] = passwords[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }

        names[userCount - 1] = null;
        emails[userCount - 1] = null;
        passwords[userCount - 1] = null;
        registrationDates[userCount - 1] = null;

        userCount--;
        System.out.println("회원이 삭제되었습니다.");
    }


    public static void addDummyUsers() {
        for (int i = 0; i < 5; i++) {
            if (userCount < MAX_USERS) {
                names[userCount] = "더미회원" + (i + 1);
                emails[userCount] = "dummy" + (i + 1) + "@example.com";
                passwords[userCount] = "password" + (i + 1);
                registrationDates[userCount] = DateUtil.getCurrentDateTime();
                userCount++;
            } else {
                System.out.println("더미 회원 추가 실패: 최대 회원 수 초과");
                break;
            }
        }
        System.out.println("더미 회원 5명이 추가되었습니다.");
    }
}

}




/*
✅ 1. 이 프로그램의 목적은?
📘 "도서관리 프로그램"이라는 제목이 있지만, 실제 구현된 코드는 아직 "회원 관리 프로그램" 기능만 구현되어 있습니다.

즉, 이 코드는 다음을 처리합니다:

회원 등록 (추가)

회원 목록 조회

회원 정보 수정

회원 삭제

더미 데이터 추가

📌 도서관리 기능은 아직 미구현 상태입니다.

🧱 2. 사용된 주요 개념 (쉽게 설명)
| 개념                              | 설명                                |
| ------------------------------- | --------------------------------- |
| `배열`                            | 같은 종류의 여러 값을 저장하는 박스 (`String[]`) |
| `Scanner`                       | 키보드 입력을 받는 도구                     |
| `DateUtil.getCurrentDateTime()` | 현재 날짜와 시간을 문자열로 가져오는 함수           |
| `static`                        | 프로그램 전체에서 공유되는 변수나 메서드에 사용        |
| `MAX_USERS`                     | 최대 저장 가능한 회원 수(100명)              |

🧠 3. 기능별 설명
✅ 회원 추가 (addUser)
names[userCount] = name;
emails[userCount] = email;
passwords[userCount] = password;
registrationDates[userCount] = registrationDate;

✅ 회원 목록 보기 (viewUsers)
for (int i = 0; i < userCount; i++) {
    System.out.println(names[i], emails[i]...);
}

✅ 회원 수정 (updateUser)
int index = scanner.nextInt();
...
names[index] = 새 이름;
emails[index] = 새 이메일;
...
수정할 회원 번호(인덱스)를 입력받아 새 정보를 입력받고 덮어씁니다.

✅ 회원 삭제 (deleteUser)
for (int i = index; i < userCount - 1; i++) {
    names[i] = names[i + 1];
}
삭제할 위치를 기준으로 뒤의 회원 정보를 앞으로 땡깁니다.
마지막 정보는 null로 비우고, userCount--로 수를 줄입니다.

✅ 더미 데이터 추가 (addDummyUsers)
개발자가 테스트할 수 있도록 5명의 가짜 회원 정보를 자동으로 넣습니다.

🔎 차이점 및 주의사항
| 항목                  | 설명                                                                                                            |
| ------------------- | ------------------------------------------------------------------------------------------------------------- |
| 클래스 이름 중복           | 코드에 `public class Exs_ch3_3_user_array` 안에 `public class Exs_ch3_2_user_array`가 정의돼 있어 에러 발생합니다. 하나만 사용해야 해요. |
| 도서 기능 없음            | 제목은 "도서관리 프로그램"이지만 실제 구현은 회원 기능뿐입니다.                                                                          |
| `Member` 클래스 사용 안 함 | 클래스 형태로 사용자 정의 자료형을 만들지 않았습니다.                                                                                |


✍️ 전체 흐름 정리
[시작]
   ↓
[더미 회원 5명 자동 추가 or 사용자 수동 추가]
   ↓
[기능 선택: 조회 / 수정 / 삭제 / 추가]
   ↓
[결과 출력]
   ↓
[다시 기능 선택 or 종료]


🖼️ 흐름도 그림
┌────────────────────────────────────┐
│            프로그램 시작           │
└────────────────────────────────────┘
               ↓
┌────────────────────────────────────┐
│     더미 회원 추가 or 직접 입력    │
└────────────────────────────────────┘
               ↓
┌────────────┬────────────┬────────────┬────────────┐
│  회원 추가 │  회원 조회 │ 회원 수정  │ 회원 삭제  │
└────────────┴────────────┴────────────┴────────────┘
               ↓
      ┌──────────────────────┐
      │    결과 화면 출력     │
      └──────────────────────┘
               ↓
      ┌──────────────────────┐
      │ 다시 기능 or 종료 선택│
      └──────────────────────┘


✅ 마무리 요약
현재 코드는 회원 관리만 구현되어 있고, 도서 기능은 아직 없습니다.

클래스를 정리하고 중복 제거해야 오류 없이 실행됩니다.

배열을 이용해 최대 100명까지 저장 가능하지만, 확장성은 떨어집니다.
→ 추후 ArrayList, 파일 저장, Member 클래스 활용 등으로 개선할 수 있어요.







*/