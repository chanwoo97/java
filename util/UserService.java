package util;

import java.util.Scanner;

public class UserService {
    // 회원 가입 기능, 정적 메소드 생성.
    // 콘솔로 입력을 받고, 결과를 문자열로 반환하는 기능을 포함.
    // 추후 업그레이드는 반환 타입을 : 문자열에서, 사용자 클래스 객체로 변경 예정.
    // 메인 메소드가 없음, 왜냐하면, 실행을 여기서 안함.
    // 이런 클래스를 , 설계용 클래스.
    public static void registerUser(Scanner scanner) {
    System.out.println("정찬우 홈피 회원가입");
 
    // 입력부분
    System.out.println("이름을 입력하세요:"); 
    String name = scanner.nextLine();
    
    System.out.println("이메일을 입력하세요:"); 
    String email = scanner.nextLine();

    System.out.println("비밀번호를 입력하세요:");
    String password = scanner.nextLine();
    
    // 출력부분
    System.out.println("입력한 이름 정보:" + name);
    System.out.println("입력한 이메일 정보:" + email);
    System.out.println("입력한 비밀번호 정보:" + password);
    System.out.println("회원 가입 완료되었습니다.");
    String currentTime = DateUtil.getCurrentDateTime();
    System.out.println("현재 가입 시간: " + currentTime);
    
    }
}
