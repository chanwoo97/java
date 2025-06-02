package util.user;

import java.util.Scanner;

public class UserService1 {
    public static void loginUser(Scanner scanner) {
    System.out.println("정찬우 홈피 로그인");

    String email = "";
    String password = "";
 while (true) {
    System.out.println("이메일 입력해주세요 > ");
    email = scanner.nextLine(); // 이메일 입력 받기

    if (email.isEmpty()) {
        System.out.println("이메일은 비워둘 수 없습니다. 다시 입력해주세요.");
    continue; // 다시 입력 받기 -> while 루프의 처음으로 돌아감 -> 계속 반복 진행한다.
        }
        
    System.out.println("패스워드 입력해주세요 > ");
    password = scanner.nextLine(); // 패스워드 입력 받기

    if (password.isEmpty()) {
    System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
    continue; // 다시 입력 받기
    }
    if (email.equals("admin@naver.com") && password.equals("1234")) {
        System.out.println("로그인 성공");
        }
    
    else {
        System.out.println("로그인 실패, 이메일 또는 패스워드를 확인해주세요.");
        continue; // 다시 입력 받기
    }
    break;
}

// 출력부분
System.out.println("로그인 이메일 정보:" + email);
System.out.println("로그인 비밀번호 정보:" + password);
System.out.println("로그인이 완료되었습니다. 현재 임시로 단순 출력용입니다.");
    
    }    
}