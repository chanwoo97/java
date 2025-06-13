package ch04;

public class Phone {
    // 멤버 변수
    String model; // 모델
    String price; // 가격
    String company; // 제조사

    // 기본 생성자
    public Phone() {
        this.model = "모델명";
        this.price = "0만원";
        this.company = "제조사";
    }

    // 매개변수 생성자
    public Phone(String model, String price, String company) {
        this.model = model;
        this.price = price;
        this.company = company;
    }

    // 메소드
    public void showInfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
        System.out.println("-------------------------");
    }

    // 생성자 오버로딩
    public Phone(String model) {
        this.model = model;
        this.price = "0만원";
        this.company = "제조사";
    }

    public Phone(String model, String price) {
        this.model = model;
        this.price = price;
        this.company = "제조사";
    }
}


/*
자바 코드 쉽게 설명 — Phone 클래스
1. 클래스란?
Phone은 휴대폰이라는 '설계도' 역할을 하는 코드입니다.
이 설계도를 기반으로 실제 휴대폰(객체)을 만들 수 있어요.
객체마다 모델명, 가격, 제조사가 다를 수 있어요.

2. 멤버 변수 (정보를 저장하는 곳)
String model; — 휴대폰 모델명 (예: 갤럭시 S23)
String price; — 가격 (예: 120만원)
String company; — 제조사 (예: 삼성전자)
이 변수들은 각각의 휴대폰이 가진 고유 정보입니다.

3. 생성자 (객체를 만들 때 사용하는 특별한 메서드)
기본 생성자
아무 정보도 입력하지 않아도, 휴대폰을 만들 수 있도록 미리 기본값을 넣어줍니다.
public Phone() {
    this.model = "모델명";
    this.price = "0만원";
    this.company = "제조사";
}

매개변수 생성자
휴대폰을 만들 때 모델명, 가격, 제조사를 직접 정해서 만들 수 있어요.
public Phone(String model, String price, String company) {
    this.model = model;
    this.price = price;
    this.company = company;
}

생성자 오버로딩
생성자가 여러 개 있어서, 입력하는 정보의 개수에 따라 골라 쓸 수 있어요.
public Phone(String model) { ... } // 모델만 지정  
public Phone(String model, String price) { ... } // 모델과 가격만 지정  

4. 메서드 (객체의 행동)
showInfo() 메서드는 휴대폰의 정보를 화면에 출력해 줍니다.
public void showInfo() {
    System.out.println("모델명 : " + this.model);
    System.out.println("가격 : " + this.price);
    System.out.println("제조사 : " + this.company);
    System.out.println("-------------------------");
}

5. 전체 흐름
먼저 Phone 클래스로부터 휴대폰 객체를 만듭니다.
생성자를 사용해 객체를 만들고, 필요한 정보를 입력합니다.
만든 객체의 showInfo() 메서드를 호출해서 정보를 화면에 보여줍니다.


그림으로 보는 흐름
+-----------------------+
|       Phone 클래스     |  <--- 설계도 역할
|-----------------------|
| 멤버 변수:             |
|  model, price, company |
|-----------------------|
| 생성자:               |
|  - 기본 생성자         |
|  - 매개변수 생성자     |
|  - 생성자 오버로딩     |
|-----------------------|
| 메서드:               |
|  showInfo()           |
+-----------------------+

          |
          | (객체 생성)
          V

+-----------------------+    showInfo() 호출   ------------------------------>
|      Phone 객체 1      |    ----------------->
| model="갤럭시 S23"    |     출력: 모델명 : 갤럭시 S23
| price="120만원"        |           가격 : 120만원
| company="삼성전자"     |           제조사 : 삼성전자
+-----------------------+           ------------------------

          |
          | (다른 객체도 비슷하게 생성 후 정보 출력)
          V

+-----------------------+
|      Phone 객체 2      |  ...
| model="아이폰 14"     |
| price="130만원"        |
| company="애플"         |
+-----------------------+

핵심 정리
Phone 클래스는 휴대폰 정보를 저장하는 틀이다.

생성자는 객체를 만들 때 정보를 초기화하는 역할을 한다.

여러 생성자가 있어서, 다양한 방법으로 객체를 만들 수 있다.

showInfo() 메서드는 그 객체 정보를 출력한다.


*/