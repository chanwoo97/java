package ch03;

import java.util.Scanner;

import util.date.*;
import util.model.Member;

public class Exs_ch3_2_user_array_doc_ver2 {
    static final int MAX_USERS = 100;
    static String[] names = new String[MAX_USERS];
    static String[] compnays = new String[MAX_USERS];
    static String[] years = new String[MAX_USERS];
    static String[] registrationDates = new String[MAX_USERS];

    static Member[] members = new Member[MAX_USERS];

    static int userCount = 0;

    // 차량 추가 메서드
    public static void addUser(Scanner scanner) {
        if (userCount < MAX_USERS) { // 기본 유효성 체크
            System.out.println("차량명을 입력하세요: ");
            String name = scanner.nextLine();

            System.out.println("제조사를 입력하세요: ");
            String compnay = scanner.nextLine();

            System.out.println("연식을 입력하세요: ");
            String year = scanner.nextLine();

            String registrationDate = DateUtil.getCurrentDateTime();

            Member member = new Member(name, year, compnay, registrationDate);

            // 배열의 단점, 인덱스의 위치 조정 자동으로 안해줌.
            // 앞에 삭제시, 삭제후 인덱스 이동을 수동을 했음. 그래서,
            // 지금 배열의 불편한 부분을 감수하고, -> 배열의 업그레이드 버전 -> arrayList 등으로 해결.

            members[userCount] = member;
            // 차량 수 증가
            userCount++;
            System.out.println("차량이 추가되었습니다: " + name + ", " + compnay + ", " + registrationDate);
        } else {
            System.out.println("차량 수가 최대치를 초과했습니다.");
        }
    } // 차량 추가 메서드

    // 차량 조회 메서드
    public static void viewUsers() {
        if (userCount == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return; // 등록된 차량이 없을 때, 조회 기능 종료, 메서드(함수)를 나가기
        }
        System.out.println("등록된 차량 목록:");
        for (int i = 0; i < userCount; i++) {
            // System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + names[i] + ", "
            // + compnays[i] + ", "
            // + registrationDates[i]);
            members[i].showInfo();
        }
    } // 차량 조회 메서드

    // 차량 수정 메서드
    // 차량 전체 목록에서, 해당 차량의 인덱스를 번호를 이용해서, 차량 정보를 수정해보기.
    public static void updateUser(Scanner scanner) {
        System.out.println("수정할 차량의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); // 수정할 차량의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거
        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 차량의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("수정할 차량의 이메일을 입력하세요: ");
        String compnay = scanner.nextLine();

        System.out.println("수정할 차량의 패스워드를 입력하세요: ");
        String year = scanner.nextLine();

        // 현재 날짜와 시간 저장
        String registrationDate = DateUtil.getCurrentDateTime();

        // 변경할 정보를 담아둘 Member 객체 생성
        Member mumber = new Member(name, year, compnay, registrationDate);
        // 해당 인덱스에 수정된 차량 정보 저장
        members[index] = mumber;

        System.out.println("차량 정보가 수정되었습니다: " + name + ", " + compnays + ", " + registrationDate);
    } // 차량 수정 메서드

    // 차량 삭제 메서드
    // 수정 처럼, 차량의 인덱스 번호를 입력시, 삭제하는 로직.
    public static void deleteUser(Scanner scanner) {
        System.out.println("삭제할 차량의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); // 삭제할 차량의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거

        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; // 잘못된 인덱스를 입력시, 삭제 기능을 종료 한다는 의미.
        }
        // 삭제할 차량 정보 출력

        Member member = members[index];
        System.out.println("삭제할 차량 정보 : ");
        member.showInfo(); // 차량 정보 출력

        members[index] = null; // 해당 인덱스의 차량 정보 삭제
        for (int i = index; i < userCount - 1; i++) {
            members[i] = members[i + 1]; // 다음 인덱스의 차량 정보를 현재 인덱스로 이동
        }
        members[userCount - 1] = null;

        // 차량 수 감소
        userCount--;
        System.out.println("차량이 삭제되었습니다.");
    }
    // 차량 삭제 메서드

    // 차량 더미 데이터 5개 추가하는 메서드
    public static void addDummyUsers() {
        for (int i = 0; i < 5; i++) {
            if (userCount < MAX_USERS) {
                Member dummyMember = new Member(
                        "더미차량" + (i + 1),
                        "year" + (i + 1),
                        "dummy" + (i + 1) + "@example.com",
                        DateUtil.getCurrentDateTime());
                userCount++;
            } else {
                System.out.println("더미 차량 추가 실패: 최대 차량 수 초과");
                break;
            }
        }
        System.out.println("더미 차량 5명이 추가되었습니다.");
    }
    // 차량 더미 데이터 5개 추가하는 메서드

    // 검색 기능
    // 차량 목록에서 이름 또는 이메일로 검색하는 기능을 추가할 수 있습니다.
    public static void searchUser(Scanner scanner) {
        System.out.println("검색할 차량의 이름 또는 이메일을 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            if (members[i].getName().contains(searchQuery) || members[i].getcompnay().contains(searchQuery)) {
                members[i].showInfo(); // 차량 정보 출력
                found = true;
            }
        }

        if (!found) { // 검색 결과가 있을 경우, 실행이 안됨, found = true; -> false;
            System.out.println("검색 결과가 없습니다.");
        }
    }
    // 검색 기능

}
