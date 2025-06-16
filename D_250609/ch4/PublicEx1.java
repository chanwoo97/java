package D_250609.ch4; // 같은 폴더입니다. 현재 속한 폴더의 위치를 알려줌.

public class PublicEx1 {
    // 접근 지정자
    // public, private, protected, default
    // public: 모든 클래스에서 접근 가능.
    // private: 같은 클래스 내부에서만 접근 가능.
    // protected: 같은 패키지 또는 상속 관계 클래스에서만 접근 가능.
    // (default): 같은 패키지에서만 접근 가능.
    // 결론, 접근 지정자는, 해당 클래스에 접근의 기능 여부.
    // 예시) 패키지(폴더) 개념,
    // exA 패키지 -> Ex1Test.java
    // exB 패키지 -> Ex2Test.java
    // 다른 폴더에 있는 내용(클래스)를 불러오기 위해서 필요한 키워드 : import

    // 각 접근 지정자 확인
    // 멤버 변수를 설정.
    private String name; // 외부 접근 불가
    public String email; // 모든 클래스에서 접근 가능
    String phone; // default 생략 / 같은 패키지 또는 상속 관계 클래스에서만 접근 가능.
    protected String hobby; // 같은 패키지 또는 상속 관계 클래스에서만 접근 가능.
    
    // 기능 만들기
    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("이메일: " + this.email);
        System.out.println("전화번호: " + this.phone);
        System.out.println("취미: " + this.hobby);
    }
}


/*
✅ [1] 아주 쉬운 설명: 접근 지정자란?
📦 우리가 클래스(설계도)를 만들 때, 어떤 정보나 기능을 다른 클래스들이 사용할 수 있는지 정하는 규칙이에요!
마치 집의 문에 “누가 들어올 수 있는지” 적혀 있는 안내판 같아요.
“공개” / “가족만” / “동네 친구만” 등등

🔐 사용 가능한 접근 지정자 4가지
| 접근 지정자      | 뜻    | 외부 접근 가능?                |
| ----------- | ---- | ------------------------ |
| `public`    | 공개   | ✅ 모두 가능                  |
| `private`   | 사적   | ❌ 자기 클래스 내부만 가능          |
| (default)   | 생략 시 | ✅ 같은 패키지 내 가능            |
| `protected` | 보호됨  | ✅ 같은 패키지 or 상속받은 클래스만 가능 |

🔍 예시 코드 살펴보기
private String name;
➡️ 오직 현재 클래스 안에서만 사용할 수 있어요. 다른 데서 name 직접 못 씁니다.

public String email;
➡️ 어디서든 자유롭게 사용 가능해요. (다른 클래스, 다른 파일도 O)

String phone;
➡️ default (생략): 같은 패키지 내에서는 사용 가능, 바깥에서는 ❌

protected String hobby;
➡️ 같은 폴더(패키지) or 상속 받은 클래스에서만 사용 가능

🖼️ [2] 그림으로 이해하기
🧊 접근 지정자 사용 범위 그림
┌──────────────────────────────┐
│       PublicEx1 클래스        │
├──────────────────────────────┤
│ private   name     ❌ 외부 접근 불가 │
│ public    email    ✅ 누구든 접근 가능 │
│ default   phone    ✅ 같은 폴더(Package)만 접근 가능 │
│ protected hobby    ✅ 같은 폴더 또는 자식 클래스 접근 가능 │
└──────────────────────────────┘

📘 [3] 핵심 정리 표
| 접근자            | 접근 범위 설명                  | 예시                        |
| -------------- | ------------------------- | ------------------------- |
| `public`       | 모든 클래스, 모든 위치에서 접근 가능     | `public String email;`    |
| `private`      | 자기 클래스 내부에서만 사용 가능        | `private String name;`    |
| `default` (생략) | 같은 패키지(폴더) 안에서만 사용 가능     | `String phone;`           |
| `protected`    | 같은 패키지 또는 자식 클래스에서만 접근 가능 | `protected String hobby;` |

🧪 [4] 실습 예제 흐름 보기
PublicEx1 obj = new PublicEx1();

// obj.name = "홍길동"; ❌ private: 직접 접근 불가
obj.email = "abc@naver.com"; ✅ public: 접근 가능
obj.phone = "010-1234-5678"; ✅ 같은 패키지면 접근 가능
obj.hobby = "농구"; ✅ 같은 패키지면 접근 가능
obj.showInfo(); // 모든 정보 출력

출력 예시:
이름: null
이메일: abc@naver.com
전화번호: 010-1234-5678
취미: 농구
💡 Tip: 왜 이렇게 나눌까요?
접근 지정자는 “정보 보호와 구조 설계”를 위한 기본 원칙이에요.
중요한 정보(name)는 private으로 숨깁니다.
외부에서 써야 하는 기능은 public으로 공개합니다.
내부 구조는 숨기고, 필요한 것만 보여주는 게 객체지향 프로그래밍(OOP)의 핵심 원칙이에요.

✨ 요약 그림
[ 클래스 내부 ]
 ┌────────────────────────┐
 │ private → 내부만 ✅     │
 │ public  → 모두 사용 ✅ │
 │ default → 같은 폴더 ✅ │
 │ protected → 상속 포함 ✅ │
 └────────────────────────┘









*/