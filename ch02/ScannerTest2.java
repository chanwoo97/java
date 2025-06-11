package ch02;

import java.util.Scanner;

import util.user.UserService;

public class ScannerTest2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        UserService.registerUser(scanner);
        UserService.loginUser(scanner);
        scanner.close();
    }    
}


// ScannerTest2 클래스는 main 메서드를 포함하고 있으며, 이 클래스에서 사용자 입력을 받는 작업과 사용자 등록 및 로그인 처리를 합니다.
// Scanner scanner = new Scanner(System.in);: 사용자로부터 입력을 받기 위해 Scanner 객체를 생성합니다.
// UserService.registerUser(scanner);: **UserService**의 registerUser 메서드를 호출하여 사용자를 등록하는 작업을 수행합니다.
// UserService.loginUser(scanner);: 사용자가 입력한 정보를 바탕으로 **UserService**의 loginUser 메서드를 호출하여 사용자가 로그인하는 작업을 수행합니다.
// scanner.close();: 입력이 끝난 후, Scanner 객체를 닫아줍니다. 리소스 누수를 방지하기 위해 필수입니다.


