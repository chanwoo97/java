package ch04;

public class Car {
    // 멤버 변수
    String model; // 차종, 세단, SUV 등
    String price; // 가격
    String company; // 제조사

    // 메소드
    public void showInfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }
}

/*
1. 클래스란?
클래스는 **"붕어빵 틀"**과 같아요.
Car 클래스는 자동차 객체를 만들기 위한 설계도입니다.
설계도에는 자동차가 가져야 할 속성과 행동이 정의되어 있어요.

2. 멤버 변수(속성)
String model;   // 자동차 종류 (예: 세단, SUV)
String price;   // 자동차 가격 (예: 4000만원)
String company; // 제조사 (예: 현대자동차)
model, price, company 는 자동차가 가진 정보(속성) 입니다.

이 변수들은 각각 문자열(String) 타입이에요.

객체를 만들면 각 자동차마다 이 정보가 달라질 수 있어요.

3. 메서드(행동)
public void showInfo() {
    System.out.println("모델명 : " + this.model);
    System.out.println("가격 : " + this.price);
    System.out.println("제조사 : " + this.company);
}
showInfo()는 자동차의 정보를 화면에 출력하는 기능이에요.

this는 지금 출력하고 있는 자동차 객체 자신을 가리켜요.

예를 들어, car1.showInfo()를 호출하면 car1 객체의 모델명, 가격, 제조사를 출력합니다.

4. 객체 생성과 사용
이 클래스로 자동차 객체를 만들 수 있어요:

Car car1 = new Car(); // 자동차 객체 생성
car1.model = "SUV";  // 속성에 값 할당
car1.price = "4000만원";
car1.company = "기아자동차";

car1.showInfo(); // 정보 출력
쉽게 비유하면
| 용어    | 비유                         |
| ----- | -------------------------- |
| 클래스   | 자동차 설계도 (도면)               |
| 객체    | 실제 만들어진 자동차                |
| 멤버 변수 | 자동차의 색깔, 모델명, 가격 등         |
| 메서드   | 자동차가 할 수 있는 기능(예: 정보 보여주기) |

전체 흐름 그림
[Car 클래스 설계도]
    |
    |-- 멤버 변수: model, price, company
    |-- 메서드: showInfo()

        ↓ 객체 생성

[Car 객체 car1]
    model = "SUV"
    price = "4000만원"
    company = "기아자동차"

        ↓ showInfo() 호출

[화면 출력]
모델명 : SUV
가격 : 4000만원
제조사 : 기아자동차

*/