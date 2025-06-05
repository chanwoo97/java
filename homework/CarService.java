package homework;

// 외부 클래스 가져오기
import java.util.Scanner; // 사용자 입력을 받기위한 클래스
import java.time.LocalDateTime; // 현재 날짜와 시간을 가져오기 위한 클래스
import java.time.format.DateTimeFormatter; // 날짜와 시간 형식을 지정하기 위한 클래스

// CarService라는 이름의 공용클래스를 선언합니다. 차량 관련 서비스를 처리하는 클래스입니다.
public class CarService {
    // MAX_CARS는 최대 차량 저장 개수를 의미하는 상수입니다. final로 한 번 설정하면 값이 바뀌지 않습니다. static이라 클래스에 하나만 존재합니다.
    static final int MAX_CARS = 100;
    // CarModel 타입 객체를 최대 MAX_CARS개 만큼 저장할 수 있는 배열을 선언하고 초기화합니다. 모든 차량 정보를 저장하는 자료구조 역할을 합니다.
    static CarModel[] cars = new CarModel[MAX_CARS];

    // 현재 등록된 차량 수를 저장하는 정적 변수입니다. 차량이 추가되면 1씩 증가하고, 삭제되면 1씩 감소합니다.
    static int carCount = 0;

    public static String getCurrentDateTime() { // 현재 날짜와 시간을 문자열로 반환하는 정적 메서드의 시작입니다.
        LocalDateTime now = LocalDateTime.now(); //현재 시스템의 날짜와 시간을 now 변수에 저장합니다.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분"); // 날짜와 시간을 "년 월 일 시 분" 형식으로 포맷하기 위한 포맷터를 생성합니다.
        return now.format(formatter); // 현재 시간(now)을 위에서 지정한 포맷으로 문자열로 변환하여 반환합니다.
    }
    

    // 차량 추가
    public static void addCar(Scanner scanner) { // 사용자 입력을 받아 차량을 추가하는 정적 메서드입니다. Scanner 객체를 매개변수로 받아 입력을 처리합니다.
        if (carCount >= MAX_CARS) {
            System.out.println("차량 수가 최대치를 초과했습니다.");
            return; // 저장 공간이 가득 찼으면 경고 메시지를 출력하고 메서드를 종료합니다.
        }

        System.out.print("차량명을 입력하세요: "); 
        String name = scanner.nextLine(); // 사용자에게 차량명을 입력받아 name 변수에 저장합니다.

        System.out.print("제조사를 입력하세요: ");
        String company = scanner.nextLine(); // 사용자에게 제조사를 입력받아 company 변수에 저장합니다.

        System.out.print("연식을 입력하세요: ");
        String year = scanner.nextLine(); // 사용자에게 연식을 입력받아 year 변수에 저장합니다.

        String registrationDate = getCurrentDateTime(); // 차량 등록 시간을 현재 시각으로 설정합니다.
        
        CarModel car = new CarModel(name, company, year, registrationDate); // 입력받은 정보를 바탕으로 새로운 CarModel 객체를 생성합니다.

        cars[carCount] = car; // 생성한 차량 정보를 배열에 저장합니다.
        carCount++; // 차량 수를 1 증가시킵니다.
        
        System.out.println("차량이 추가되었습니다: " + name + " (" + company + ")"); // 추가된 차량 정보를 출력합니다.
        System.out.println("등록일 : " + registrationDate); // 등록일을 출력합니다.
    } 
    // 차량 추가

    
    // 차량 조회
    public static void viewCars() { // 등록된 차량 목록을 출력하는 정적 메서드입니다.
        if (carCount == 0) { // 등록된 차량이 없으면 메시지를 출력하고 메서드를 종료합니다.
            System.out.println("등록된 차량이 없습니다.");
            return;
        }

        System.out.println("=== 등록된 차량 목록 ==="); // 차량 목록의 시작을 알리는 메시지를 출력합니다.
        for (int i = 0; i < carCount; i++) { // 배열에 저장된 차량 정보를 처음부터 끝까지 순차적으로 출력합니다.
            System.out.println("차량변호: " + i); // 차량번호를 출력합니다.
            cars[i].showInfo(); // 차량 정보를 출력합니다.
        }
    }
    // 차량 조회


    // 차량 수정
    public static void updateCar(Scanner scanner) { // 차량 정보를 수정하는 정적 메서드입니다. Scanner 객체를 매개변수로 받아 입력을 처리합니다.
        if (carCount == 0) { // 등록된 차량이 없으면 메시지를 출력하고 메서드를 종료합니다.
            System.out.println("등록된 차량이 없습니다.");
            return;
        }

        System.out.print("수정할 차량의 차량번호를 입력하세요 (0 ~ " + (carCount - 1) + "): "); // 사용자에게 수정할 차량의 차량번호를 입력받습니다.
        int index = scanner.nextInt(); // 입력받은 차량번호를 index 변수에 저장합니다.
        scanner.nextLine(); // 개행 문자 제거

        // 차량번호 유효성 검사
        if (index < 0 || index >= carCount) { // 차량번호가 유효한 범위를 벗어나면 경고 메시지를 출력하고 메서드를 종료합니다.
            System.out.println("잘못된 차량번호입니다.");
            return;
        }

        System.out.print("새로운 차량명을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("새로운 제조사를 입력하세요: ");
        String company = scanner.nextLine();

        System.out.print("새로운 연식을 입력하세요: ");
        String year = scanner.nextLine();

        String registrationDate = getCurrentDateTime();

        // 새로운 차량 객체로 교체
        cars[index] = new CarModel(name, company, year, registrationDate); // 입력받은 정보를 바탕으로 새로운 차량 객체를 생성하고 배열에 저장합니다.

        System.out.println("차량 정보가 수정되었습니다.");
    } 
    // 차량 수정

    // 차량 삭제 메서드
    public static void deleteCar(Scanner scanner) {
        if (carCount == 0) { // 등록된 차량이 없으면 메시지를 출력하고 메서드를 종료합니다.
            System.out.println("등록된 차량이 없습니다.");
            return;
        }

        System.out.print("삭제할 차량의 차량번호를 입력하세요 (0 ~ " + (carCount - 1) + "): "); // (carCount - 1) 하는 이뉴는 인덱스 번호가 0번부터 시작하기때문에 마지막 인덱스는 carCount - 1 이다.
        int index = scanner.nextInt(); // 입력받은 차량번호를 index 변수에 저장합니다.
        scanner.nextLine(); // 개행 문자 제거 -> 입력 후 엔터가 남아 있어서 다음 입력이 꼬이는 문제를 해결하기 위해, nextLine()을 한번 더 호출해서 엔터(개행 문자)를 읽고 버리는 작업입니다.

        // 차량번호 유효성 검사
        if (index < 0 || index >= carCount) {
            System.out.println("잘못된 차량번호입니다.");
            return;
        } // index > 삭제할 차량의 번호

        System.out.println("=== 삭제할 차량 정보 ===");
        cars[index].showInfo(); // 삭제할 차량 정보를 출력합니다.

        for (int i = index; i < carCount - 1; i++) { // 삭제할 차량 이후의 모든 요소를 앞으로 이동시킵니다.
            cars[i] = cars[i + 1]; // 현재 요소를 다음 요소로 덮어씁니다.
        }
        
        cars[carCount - 1] = null; // 마지막 요소를 null로 설정하여 데이터 삭제를 시뮬레이션합니다.
        carCount--; // 차량 수를 1 감소시킵니다.

        System.out.println("차량이 삭제되었습니다.");
    }

    // 더미 데이터 추가 메서드
    public static void addDummyCars() { // 더미 데이터를 추가하는 정적 메서드입니다.
        String[] dummyNames = {"아반떼", "소나타", "그랜저", "투싼", "싼타페"};
        String[] dummyCompanies = {"현대", "현대", "현대", "현대", "현대"};
        String[] dummyYears = {"2020", "2021", "2022", "2023", "2024"};

        int addedCount = 0; // 추가된 더미 차량 수를 추적하기 위한 변수입니다.
        for (int i = 0; i < 5; i++) { // 5개의 더미 차량을 추가합니다.
            if (carCount < MAX_CARS) { // 차량 수가 최대 차량 수를 초과하지 않는 경우에만 추가합니다.
                CarModel dummyCar = new CarModel( // 더미 차량 정보를 생성하고 배열에 추가합니다.
                    dummyNames[i], 
                    dummyCompanies[i], 
                    dummyYears[i], 
                    getCurrentDateTime()
                );
                cars[carCount] = dummyCar; // 더미 차량을 배열에 추가합니다.
                carCount++; // 차량 수를 1 증가시킵니다.
                addedCount++; // 추가된 더미 차량 수를 1 증가시킵니다.
            } else {
                System.out.println("더미 차량 추가 실패: 최대 차량 수 초과");
                break;
            }
        }
        System.out.println("더미 차량 " + addedCount + "개가 추가되었습니다.");
    }

    // 차량 검색 메서드
    public static void searchCar(Scanner scanner) { // searchCar는 Scanner 객체를 매개변수로 받아 차량 정보를 검색하는 정적 메서드입니다.
        if (carCount == 0) { // 등록된 차량 수가 0개면 등록된 차량이 없습니다 메세지 출력 후 메서드 종료 (return 까지)
            System.out.println("등록된 차량이 없습니다.");
            return;
        }

        System.out.print("검색할 차량명 또는 제조사를 입력하세요: "); // 사용자에게 검색할 차량명을 입력해달라는 요청을 함
        String searchQuery = scanner.nextLine(); // 사용자로부터 입력받은 문자열을 searchQuery 변수에 저장 / nextLine()은 문자열을 입력받는 메서드
        boolean found = false; // 검색 결과가 하나라도 있는지를 확인하기 위한 변수. 선언 및 변수, 초기값임.

        System.out.println("=== 검색 결과 ===");
        for (int i = 0; i < carCount; i++) { // 배열에 저장된 차량정보들을 처음부터 끝까지 순차적으로 검사 / int i = 0; -> i는 차량번호를 가르킴. cars[i]에서 몇 번째 차량을 가르키는지 나타냄. 자바에서 차량번호는 0부터 시작
            // i < carCount -> i가 carCount보다 작을 때까지 반복. 배열의 모든 차량을 검사하기 위해 사용함. ex. carCount가 5라면 0부터 4까지 반복
            // i++ -> i의 값을 1씩 증가시킴. / i = i + 1 과 같은 의미
            if (cars[i].getName().contains(searchQuery) ||  // -> cars[i] 객체의 차량 이름 또는 제조사에 searchQuery(검색한 이름)가 포함되어 있다면,
                cars[i].getCompany().contains(searchQuery)) {
                System.out.println("차량번호: " + i); // 해당 차량의 차량변호를 출력 / println() -> 입력 후 엔터가 남아 있어서 다음 입력이 꼬이는 문제를 해결하기 위해, nextLine()을 한번 더 호출해서 엔터(개행 문자)를 읽고 버리는 작업.
                cars[i].showInfo(); // 해당 차량 객체의 showInfo() 메서드를 호출하여 차량의 상세 정보를 출력합니다.
                found = true; // 검색 결과가 하나 이상 있으면 found를 true로 설정.
            }
        }

        if (!found) { //검색된 차량이 하나도 없다면(found가 false인 경우),
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
