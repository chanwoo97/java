package ch04;

// 퀴즈1
// 설계 클래스, Phone ,
// 멤버 변수 : model, price, company
// 메서드 : showInfo(), 해당 정보 출력하는 메서드 만들기.
// 객체 3개 이상 생성후, 정보 출력하는 메소드 사용해보기
public class Phone_doc {
    // 멤버 변수
    String model; // 모델명
    String price; // 가격
    String company; // 제조사

    // 생성자
    // 1) 기본 생성자 -> 다른 매개변수 생성자가 없으면 기본 지원.
    // 생성자의 모양 -> 클래스명() 으로 표현.
    // 역할 -> 객체를 생성시, 속한 멤버의 값을 , 지정한 값으로 초기화(변수 할당
    //
    // 기본 생성자가 있는 것과 마찬가지.
    public Phone_doc() {
        // 기본 생성자 내용은 비워둠, 필요시 초기화 작업 가능
    }

    // 생성자의 오버로딩 ,같은 생성자이름, 다른 매개변수의 모양(형태)로 정의한 것.

    // 1개의 매개변수를 가지는 생성자
    public Phone_doc(String model) { // 매개변수 매번 다름, 동적인값
        this.model = model; // this.model, 위에 정의한 멤버 변수, model: 동적인 값.
        // price, company는 초기화 안함, 필요시 따로 설정.
    }

    // 2개의 매개변수를 가지는 생성자
    public Phone_doc(String model, String price) { // 매개변수 매번 다름, 동적인값
        this.model = model; // this.model, 위에 정의한 멤버 변수, model: 동적인 값.
        this.price = price;
    }

    // 주의사항, 매개변수가 있는 생성자를 생성시, 기본 생성자는 더이상 지원을 안해줌.
    // 그래서, 만약 기본 생성자를 따로 필요하다면, 따로 만들어야 함.
    // 3개 형태의 생성자
    public Phone_doc(String model, String price, String company) { // 매개변수 매번 다름, 동적인값
        this.model = model; // this.model, 위에 정의한 멤버 변수, model: 동적인 값.
        this.price = price;
        this.company = company;
        // 기본 생성자 내용은 비워둠, 필요시 초기화 작업 가능
    }

    // 메소드
    public void showInfo() {
        // this : 현재 객체를 가리키는 키워드
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }
}



/*
Phone_doc 클래스 쉽게 이해하기
1. 클래스란?
클래스는 사람, 사물, 개념을 컴퓨터로 표현하기 위한 설계도 같은 것.

Phone_doc 클래스는 휴대폰 정보를 담는 설계도예요.

2. 멤버 변수란?
클래스 안에 들어있는 변수들을 멤버 변수라고 해요.

이 클래스에는 3가지 멤버 변수가 있어요:

model : 모델명 (예: 갤럭시, 아이폰)

price : 가격 (예: 100만원)

company : 제조사 (예: 삼성, 애플)

3. 생성자란?
생성자는 객체를 만들 때 호출되어, 멤버 변수에 값을 넣어주는 특별한 메서드예요.

Phone_doc phone = new Phone_doc("아이폰", "100만원", "애플");

이렇게 하면 생성자가 실행되어, "아이폰"을 모델명으로, "100만원"을 가격으로, "애플"을 제조사로 저장해줍니다.

4. 생성자의 종류 (오버로딩)
같은 이름(클래스명)을 가진 생성자가 여러 개 있지만, 매개변수의 수나 타입이 다릅니다.

이런 방식을 오버로딩이라고 부릅니다.

| 생성자 종류                                                  | 설명                             |
| ------------------------------------------------------- | ------------------------------ |
| `Phone_doc()`                                           | 기본 생성자. 아무 정보도 안 받고, 그냥 객체 생성  |
| `Phone_doc(String model)`                               | 모델명만 받아서 저장. 가격과 제조사는 초기화하지 않음 |
| `Phone_doc(String model, String price)`                 | 모델명과 가격을 받아 저장. 제조사는 초기화하지 않음  |
| `Phone_doc(String model, String price, String company)` | 모델명, 가격, 제조사 모두 받아 저장          |

5. 메서드 showInfo()
객체의 정보를 화면에 출력하는 역할.
this는 현재 객체 자신을 가리키는 키워드예요.
예를 들어, this.model은 "이 객체의 모델명"이라는 뜻입니다.
public void showInfo() {
    System.out.println("모델명 : " + this.model);
    System.out.println("가격 : " + this.price);
    System.out.println("제조사 : " + this.company);
}

6. 주요 개념 요약
| 용어    | 설명                        | 예시                                |
| ----- | ------------------------- | --------------------------------- |
| 클래스   | 객체를 만들기 위한 설계도            | `Phone_doc`                       |
| 객체    | 클래스로부터 만들어진 실체 (하나의 휴대폰)  | `phone1`, `phone2` 등              |
| 멤버 변수 | 객체가 가지는 데이터               | `model`, `price`, `company`       |
| 생성자   | 객체 생성 시 변수 초기화 역할을 하는 메서드 | `Phone_doc("아이폰", "100만원", "애플")` |
| 메서드   | 객체가 할 수 있는 행동, 기능         | `showInfo()`                      |
| 오버로딩  | 같은 이름의 생성자를 여러 개 만드는 것    | 여러 개 `Phone_doc()` 생성자들           |

간단한 흐름 그림
[클래스 설계도] Phone_doc
  ├─ 멤버 변수: model, price, company
  ├─ 생성자 (오버로딩)
  │     ├─ Phone_doc()
  │     ├─ Phone_doc(String model)
  │     ├─ Phone_doc(String model, String price)
  │     └─ Phone_doc(String model, String price, String company)
  └─ 메서드: showInfo()

          ↓ 객체 생성

[객체 1] phone1 --------------------
| model = "아이폰"                 |
| price = "100만원"               |   → showInfo() 호출하면
| company = "애플"                |     저장된 정보 출력됨
-----------------------------------

[객체 2] phone2 --------------------
| model = "갤럭시"                |
| price = "200만원"               |   → showInfo() 호출
| company = "삼성"                |
-----------------------------------


*/