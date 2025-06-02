package user_mini_project;

import java.util.Scanner;
import ch02.OperConditionTest;
import util.random.RandomUtil;
import util.user.UserService;
import util.user.UserService1;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.println("========================================================");
            System.out.println("회원 관리 시스템에 오신 것을 환영합니다. 배운거 복습 적용해보기");
            System.out.println("1. 회원 가입  2.로그인 3.산술 연산자 테스트 4.임의의 산술 연산자 테스트  0.종료");
            System.out.println("5. 로또 번호 생성기 : 배열 없는 버전");
            System.out.println("========================================================");
            System.out.println("메뉴 번호를 선택해주세요 (0~5): ");
            
            String choice = scanner.nextLine();
            if (choice.equals("1")) { // 회원 가입 기능 호출
                UserService.registerUser(scanner);
            }
            
            else if (choice.equals("2")) { // 로그인 기능 호출
                UserService1.loginUser(scanner);    
            } 
            
            else if (choice.equals("3")) { // 산술연산자 테스트 기능 호출
                OperConditionTest.oper1();
            }

            else if (choice.equals("4")) { // 임의의 산술 연산자 테스트 기능 호출
                OperConditionTest.oper2();
            } 
            
            else if (choice.equals("5")) { // 로또번호 생성기 기능 호출
                RandomUtil.generateLottoNumbers();
                break;
            }
            
            else if (choice.equals("0")) { // 프로그램 종료
                System.out.println("프로그램을 종료합니다. 감사합니다!");
                scanner.close(); // 스캐너 자원 반납
                return; // while 루프 종료
            } 
            
            else {
                System.out.println("잘못된 입력입니다. 0, 1, 2, 3, 4 중에서 선택해주세요."); // 입력된 번호 외 다른 번호입력시 처리방법
            }
        }
    }
}
