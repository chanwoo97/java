package D_250609.ch5_2;

import D_250609.ch5.Animal_Ex1; // 다른 패키지의 클래스를 사용시 임포트해야함.

// extends Animal_Ex1 상속받음
// 자식 클래스이므로, 부모의 protected 멤버에 접근 가능함
public class Cat_Ex1 extends Animal_Ex1 {
    String favoriteFood;
    public void showInfo() {
        System.out.println("좋아하는 음식 : " + favoriteFood);
        // 상속을 안받고, 다른 패키지 다른 폴더의 클래스의 멤버에 접근
    }

    // 기본 생성자 생략
    public Cat_Ex1() {
        super(); // 부모꺼 생략, 왜? 기본 생성자라서
    }
    
    // 초기화를 쉽게 하기 위해서, 매개변수 생성자를 만들기
    public Cat_Ex1(String name, String favoriteFood) {
        super(name);
    }
}


/*
✅ 초간단 설명
| 클래스 역할       | 설명                                           |
| ------------ | -------------------------------------------- |
| `Animal_Ex1` | 부모 클래스: `name`이라는 멤버 변수를 갖고 있음 (`protected`) |
| `Cat_Ex1`    | 자식 클래스: 부모의 `name`과 자신의 `favoriteFood`를 가짐   |

🖼️ 구조 그림
📁 D_250609.ch5         📁 D_250609.ch5_2
│ Animal_Ex1.java       │ Cat_Ex1.java
└─────> protected name  └─────> extends Animal_Ex1
                         └────> 접근 가능!
       Animal_Ex1 (부모 클래스)
      ┌───────────────────────────────┐
      │ protected String name;        │
      │ public Animal_Ex1(String name)│
      └───────────────────────────────┘
                 ▲
                 │
         상속 받음 (extends)
                 │
      Cat_Ex1 (자식 클래스)
      ┌─────────────────────────────┐
      │ String favoriteFood;        │
      │ super(name); ← 부모 name 초기화 │
      │ showInfo() { 음식 출력 }       │
      └─────────────────────────────┘

🧠 핵심 개념 정리
| 개념            | 설명                               |
| ------------- | -------------------------------- |
| `extends`     | 부모 클래스 `Animal_Ex1`의 기능을 물려받음    |
| `protected`   | 다른 패키지라도 자식 클래스에서 접근 가능 (`name`) |
| `super(name)` | 부모 생성자를 호출하면서 `name`을 초기화        |
| `showInfo()`  | 고양이의 좋아하는 음식 출력 기능               |

✅ 현재 코드 주의사항 (중요!)
public Cat_Ex1(String name, String favoriteFood) {
    super(name); // ✅ 부모의 name 초기화
    // ❌ 이 부분 빠짐!
    // this.favoriteFood = favoriteFood;}
📌 이 코드엔 favoriteFood를 저장하는 코드가 빠져 있습니다.
➡️ 반드시 아래 코드 한 줄을 생성자에 추가해야 합니다.

this.favoriteFood = favoriteFood;
✅ 수정된 생성자 전체 코드

public Cat_Ex1(String name, String favoriteFood) {
    super(name);
    this.favoriteFood = favoriteFood;}

✅ 사용 예시
Cat_Ex1 cat = new Cat_Ex1("나비", "참치");
cat.showInfo(); 

결과:
좋아하는 음식 : 참치

📌 요약 정리표
| 항목     | 설명                                           |
| ------ | -------------------------------------------- |
| 상속     | `Cat_Ex1` → `Animal_Ex1` 상속                  |
| 접근 제한자 | `protected`라서 `name`은 자식에서 사용 가능             |
| 생성자    | `super(name)` 사용으로 부모 생성자 호출                 |
| 실수 방지  | `this.favoriteFood = favoriteFood;` 꼭 추가해야 함 |

*/
