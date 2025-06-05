package homework;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        System.out.println("차량 관리 시스템에 오신 것을 환영합니다!");

        do {
            // 메뉴 출력
            System.out.println("=================================================================================================");
            System.out.println("차량 관리 프로그램");
            System.out.println("1. 차량 추가, 2. 차량 조회, 3. 차량 수정, 4. 차량 삭제, 5. 더미 데이터 추가 5개, 6. 검색기능,  0. 종료");
            System.out.println("=================================================================================================");
            System.out.print("메뉴를 선택하세요 (0~6): ");

            menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            // 선택한 메뉴에 따라 해당 기능 실행
            switch (menu) {
                case 1:
                    CarService.addCar(scanner);
                    break;
                case 2:
                    CarService.viewCars();
                    break;
                case 3:
                    CarService.updateCar(scanner);
                    break;
                case 4:
                    CarService.deleteCar(scanner);
                    break;
                case 5:
                    CarService.addDummyCars();
                    break;
                case 6:
                    CarService.searchCar(scanner);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다. 감사합니다!");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }
        } while (menu != 0);

        scanner.close();
    }
}
