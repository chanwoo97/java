package ch04;

public class MainClassCh4_doc {
    // 실행 하는 클래스
    public static void main(String[] args) {

        // 퀴즈
        // 본인 만들 Phone 클래스를 , 담을 배열을 만들어서,
        // 1) 담기 2) 출력하기. 3) 각 멤버의 주소값 확인 해보기.

        // 앞에서 배운 배열을 이용해서, 클래스 객체를 배열의 요소로 사용하기
        // Phone 클래스 타입을 요소로 가지는 배열.
        Phone[] phones = new Phone[5]; // Phone 타입의 배열 생성, 5개 요소
        // 우리는 기본형으로 정수형, 실수형, 불린형, char, 문자형
        // 클래스 타입으로 인식을 함. -> 참조형 변수(타입)= 레퍼런스 타입
        // 중요한 정보 ,
        // phone1 에는 뭐가 들어가 있을까?
        // 정답은 해당 내용이 저장된 메모리 위치 주솟값이 들어감.
        // 비유, 여러분 돈 -> 은행 통장 -> 계좌번호 -> 돈이 들어있는 통장
        // 내용은 메모리에 넣어두고, 우리 그 메모리 위치 주소만 알면됨 -> 0x100,
        Phone phone1 = new Phone("Galaxy S23", "100만원", "삼성전자");
        Phone phone2 = new Phone("iPhone 14", "120만원", "Apple");
        Phone phone3 = new Phone("Pixel 7", "90만원", "Google");
        Phone phone4 = new Phone("OnePlus 11", "80만원", "OnePlus");
        Phone phone5 = new Phone("Xiaomi 13", "70만원", "Xiaomi");
        // 배열에 객체를 할당
        phones[0] = phone1; // 0번째 요소에 phone1 객체 할당
        phones[1] = phone2; // 1번째 요소에 phone2 객체 할당
        phones[2] = phone3; // 2번째 요소에 phone3 객체 할당
        phones[3] = phone4; // 3번째 요소에 phone4 객체 할당
        phones[4] = phone5; // 4번째 요소에 phone5 객체 할당

        // 직접 할당.
        Phone[] phones2 = {
                phone1,
                phone2,
                phone3,
                phone4,
                phone5
        };

        // 그래서, 각 인스턴스 주소는 , 독립적이다, 다 다른 메모리 위치 주소에 저장이된다.
        // 그러면, 그 위치 주소를 직접확인. 자바스크립트, 힘들고, '
        // 자바는 기능을 지원 해줌.
        // phone1, phone2 의 메모리 주소를 비교 및 확인.
        System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        System.out.println("phone2 주소: " + System.identityHashCode(phone2));

        // 반복문을 이용해서, 순회해서 출력.
        for (int i = 0; i < phones.length; i++) {
            // 각 요소에 있는 객체의 정보를 출력
            // phones[0] -> phone1 -> showInfo();
            phones[i].showInfo();
            System.out.println("-----------------");
        }

        // 문자열 타입을 요소로 가지는 배열.
        String[] carModels = { "suv", "k5세단", "아반떼", "소나타", "그랜저" };
        // 정수 타입을 요소로 가지는 배열.
        int[] carPrices = { 4000, 3000, 2500, 3500, 5000 }; // 단위 : 만원

        // 설계한 클래스를 이용해서
        // 객체 생성 ,
        // 순서1
        // [클래스명] 객체명(인스턴스 변수명) = new [클래스명]();
        // new Car() : 기본 생성자,
        Car car1 = new Car(); // 기본 생성자 호출
        // 순서2
        // 해당 자동차의 멤버 변수에 값 대입, 직접 값을 할당, 실무에서는 이렇게 사용안하고,
        // getter/setter 메소드를 사용 -> 불변성을 이용해서, 캡슐화, 밖에서 안보이게 , 접근 지정자로
        // 꽁꽁 숨길 예정. 지금은 기본이니, 참고만 함.
        car1.model = "suv";
        car1.price = "4000만원";
        car1.company = "기아자동차";
        // 순서3, 기능 확인. 객체명.메소드명(); 이런 형식으로 사용함,
        // 이전에 정적인 메소드는 , 사용 모양 : 클래스명.메소드명() , 비교.
        car1.showInfo();

        // 마치 공장에서 자동차를 찍어 내듯이, 또다른 인스턴스를 생성.
        Car car2 = new Car(); // 기본 생성자 호출
        car2.model = "k5세단";
        car2.price = "3000만원";
        car2.company = "기아자동차";
        car2.showInfo();
    }
}

/* 
1. 객체 배열 선언과 생성
Phone[] phones = new Phone[5];
Phone 타입 객체 5개를 담을 수 있는 배열을 만들었어요.

배열은 여러 개의 데이터를 한 번에 담을 수 있는 상자와 같아요.

Phone 클래스 객체를 담는 배열이니, 각 칸에는 휴대폰 하나씩 들어가요.

2. 객체 생성 및 배열에 저장
Phone phone1 = new Phone("Galaxy S23", "100만원", "삼성전자");
...
phones[0] = phone1;
...
new Phone(...) 으로 휴대폰 객체를 하나씩 만듭니다.

각 휴대폰 객체는 모델명, 가격, 제조사를 갖고 있어요.

만든 객체를 배열 phones의 각 칸에 넣습니다.

3. 객체 주소 확인
System.out.println("phone1 주소: " + System.identityHashCode(phone1));
객체는 실제 데이터가 저장된 **메모리 위치(주소)**를 가지고 있어요.

System.identityHashCode() 메서드를 써서 그 객체가 메모리 어디에 있는지 주소를 알 수 있습니다.

주소가 다르면 객체가 서로 다른 메모리 공간에 독립적으로 저장된다는 뜻이에요.

4. 반복문을 사용한 출력
for (int i = 0; i < phones.length; i++) {
    phones[i].showInfo();
}
for 반복문으로 배열 안의 모든 휴대폰 객체를 하나씩 꺼내서 정보를 출력합니다.

phones[i].showInfo() 는 각 휴대폰 객체의 정보를 화면에 보여줍니다.

5. 다른 배열 예시 (문자열, 정수 배열)
String[] carModels = { "suv", "k5세단", "아반떼", "소나타", "그랜저" };
int[] carPrices = { 4000, 3000, 2500, 3500, 5000 };
String 타입(문자열) 배열과 int 타입(정수) 배열도 만들어서 여러 데이터를 관리하는 방법을 보여줍니다.

6. Car 객체 생성과 출력
Car car1 = new Car();
car1.model = "suv";
car1.price = "4000만원";
car1.company = "기아자동차";
car1.showInfo();
자동차 객체도 만들어서 멤버 변수에 값을 직접 넣고, 출력하는 예제입니다.

같은 방법으로 여러 자동차를 만들 수도 있어요.

전체 흐름 정리 그림
[Main 시작]
     |
     v
[Phone 객체 5개 생성]
     |
     v
[Phone 배열(phones)에 각 객체 저장]
     |
     v
[각 객체의 메모리 주소 출력]   <-- 객체는 메모리 안 특정 위치에 저장됨
     |
     v
[for 반복문으로 phones 배열 순회]
     |
     v
[phones[i].showInfo() 호출 -> 휴대폰 정보 출력]
     |
     v
[다른 배열(carModels, carPrices) 생성]
     |
     v
[Car 객체 2개 생성 후 멤버 변수 값 할당]
     |
     v
[car1.showInfo(), car2.showInfo() 호출 -> 자동차 정보 출력]
     |
     v
[프로그램 종료]

핵심 요약
클래스는 설계도, 객체는 그 설계도로 만든 실체

배열은 같은 종류의 데이터를 여러 개 저장하는 상자

객체 배열에는 객체의 **참조(주소)**가 저장됨

반복문으로 배열을 순회하며 각 객체의 기능(메서드)을 호출 가능

객체는 독립된 메모리 공간을 가진다

*/