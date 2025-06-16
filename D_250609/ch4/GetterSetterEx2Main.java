package D_250609.ch4;

public class GetterSetterEx2Main {
    public static void main(String[] args) {
        GetterSetterEx2 getterSetterEx = 
        new GetterSetterEx2("홍길동", "hong@naver.com", "1234");
        // public, 외부에서 직접 데이터에 접근.
        // 설계 클래스에서 -> name에 대해서, public에 -> private 변경함.
        // 직접 접근, 수정이 불가.
        // getterSetterEx.name = "직접 접근해서 이름 수정 홍길동"; // 직접 접근해서, 임의로 수정함.
        // private, 데이터 직접 접근을 막는다.
        // getterSetterEx.email = "jcw@naver.com";
        // getterSetterEx.password = "password 수정";
        getterSetterEx.showInfo();
        System.out.println("Getter 라는 메서드를 이용해서, 각 멤버 변수 하나 조회 확인");
        System.out.println("이름 조회 : " + getterSetterEx.getName());
        System.out.println("이메일 조회 : " + getterSetterEx.getEmail());
        System.out.println("비밀번호 조회 : " + getterSetterEx.getPassword());
    
        System.out.println("Setter 라는 메서드를 이용해서, 각 멤버 변수 값 설정 확인");
        getterSetterEx.setName("정찬우 Setter로 수정");
        getterSetterEx.setEmail("jcw6223@naver.com" + " Setter로 수정");
        getterSetterEx.setPassword("123456 수정" + " Setter로 수정");
        
        System.out.println("Setter를 이용해서, 데이터 변경하고, 값 확인");
        getterSetterEx.showInfo();
    }
}


/*
✅ [1] 이 코드는 뭘 하나요?
👉 GetterSetterEx2 라는 클래스(회원 정보 클래스)를 이용해서
정보를 가져오고(getter),
정보를 바꾸고(setter),
보여주는(showInfo) 걸 테스트하는 예제예요.

🧠 흐름 설명: 한 줄씩 따라가 보기
GetterSetterEx2 getterSetterEx = new GetterSetterEx2("홍길동", "hong@naver.com", "1234");
➡️ 회원 한 명 만들어요.
name, email, password 3가지 정보로 초기화합니다.

getterSetterEx.showInfo();
➡️ 현재 저장된 정보를 출력합니다.

👀 Getter로 데이터 읽기
getterSetterEx.getName(); // 이름 가져오기
getterSetterEx.getEmail(); // 이메일 가져오기
getterSetterEx.getPassword(); // 비밀번호 가져오기
➡️ 외부에서는 직접 접근 못 하니까, getter() 메서드로 읽습니다.

✏️ Setter로 데이터 바꾸기
getterSetterEx.setName("정찬우 Setter로 수정");
getterSetterEx.setEmail("jcw6223@naver.com Setter로 수정");
getterSetterEx.setPassword("123456 수정 Setter로 수정");
➡️ 값을 바꾸려면 setter() 메서드를 써야 해요.

getterSetterEx.showInfo();
➡️ 바뀐 값이 잘 반영되었는지 다시 확인합니다!

🖼️ [2] 도식으로 보기
🔐 캡슐화된 객체와 데이터 흐름
[ GetterSetterEx2 객체 ]
    ┌────────────────────────────┐
    │ private name     : 홍길동      │
    │ private email    : hong@...   │
    │ private password : 1234       │
    └────────────────────────────┘
             ↑     ↑     ↑
       [getName] etc. ← 읽기(Getter)
             ↓     ↓     ↓
       [setName] etc. → 쓰기(Setter)

📘 [3] 핵심 정리표
| 용어           | 의미                        |
| ------------ | ------------------------- |
| `private`    | 외부에서 직접 접근 ❌              |
| `getter()`   | 값 읽기 메서드                  |
| `setter()`   | 값 바꾸기 메서드                 |
| `showInfo()` | 현재 값 모두 출력                |
| 캡슐화          | 데이터를 숨기고 메서드로만 접근하게 하는 원칙 |

📤 [4] 실행 결과 예시
이름: 홍길동
이메일: hong@naver.com
비밀번호: 1234
Getter 라는 메서드를 이용해서, 각 멤버 변수 하나 조회 확인
이름 조회 : 홍길동
이메일 조회 : hong@naver.com
비밀번호 조회 : 1234
Setter 라는 메서드를 이용해서, 각 멤버 변수 값 설정 확인
Setter를 이용해서, 데이터 변경하고, 값 확인
이름: 정찬우 Setter로 수정
이메일: jcw6223@naver.com Setter로 수정
비밀번호: 123456 수정 Setter로 수정

🧠 이 코드를 왜 배우나요?
✨ "코드로 데이터를 안전하게 다루는 법"을 배우는 중이에요.

직접 변수 바꾸는 건 위험해요. 실수로 이상한 값 들어갈 수도 있죠.

그래서 값을 안전하게 바꾸고 읽을 수 있게 → Getter & Setter를 사용합니다.

자바의 **객체지향 프로그래밍(OOP)**의 기본 철학인 캡슐화를 실천하는 예제예요.

🧊 요약 그림
[ private 변수들 ]
    ↕
[get/set 메서드로만 접근 가능]
    ↕
[ 데이터 보호 + 안정성 향상 ]

*/