package D_250609.ch4;

public class GetterSetterEx2 {
    // public String name; // 이름이 외부에서 직접 접근이 가능한 문제점 발견
    private String name; // 외부에서 직접 접근을 막기 위해 private로 선언
    private String email;
    private String password;

    // 매개변수가 3개인 생성자
    public GetterSetterEx2(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("비밀번호: " + password);
    }

    // Getter : 데이터를 가져오는 역할
    // Setter : 데이터를 쓰는 역할
    // 접근 지정자를 private이용시,
    // 왜? private 접근 지정자를 사용하나요? -> 외부에서 해당 데이터에 직접 접근을 막기 위해서,
    // 캡슐화, 데이터 은닉, 숨기기. -> 왜? 숨기지? -> 외냐하면, 해당 인스턴스 직접 값을 변경하게되면,
    // 불변성 또는 데이터 일관성 등이 깨지는 확률이 생김. 실수할 확률이 발생함.

    // 외부에서, 조회 하는 경우, Getter 사용하고,
    public String getName() {
        return this.name; // 현재 인스턴스에 설정이 된 이름.
    }
    public String getEmail() {
        return this.email; // 현재 인스턴스에 설정이 된 이메일.
    }
    public String getPassword() {
        return this.password; // 현재 인스턴스에 설정이 된 비밀번호.
    }
    
    
    // 외부에서, 변경을 하는 경우, Setter 사용함.
    // 자동으로 코드를 생성해줌. 일단, 수동으로 확인.
    public void setName(String name) {
        this.name = name; // 현재 인스턴스에 설정이 된 이름을 변경함.
    }
    public void setEmail(String email) {
        this.email = email; // 현재 인스턴스에 설정이 된 이메일을 변경함.
    }
    public void setPassword(String password) {
        this.password = password; // 현재 인스턴스에 설정이 된 비밀번호를 변경함.
    }

    // 불변성 이유로, Setter 보다는, 데이터를 변경하는 메서드를 따로 설정해서 작업을 함.
}


/*
✅ [1] 아주 쉬운 설명
🧱 클래스란?
설계도입니다. "회원"이라는 객체를 만들기 위한 틀이에요.

🔐 private 왜 쓰나요?
private String name;
private는 "이 안에서만 사용할게요!"라는 뜻
외부에서 직접 값을 바꾸는 실수를 막기 위해 사용해요.

📤 Getter: 값을 가져오기
public String getName() {
    return this.name;}
📝 Setter: 값을 변경하기
public void setName(String name) {
    this.name = name;}
왜 이렇게 어렵게 가져오고 바꾸게 만들까요?
→ 실수로 데이터를 망가뜨리지 않도록! (= 캡슐화, 보호)

🖼️ [2] 그림으로 이해하기
🧊 캡슐화 개념 그림
┌──────────────────────┐
│  GetterSetterEx2 객체 │
├──────────────────────┤
│ private name         │ ← 외부에서 직접 못 건드림
│ private email        │
│ private password     │
├──────────────────────┤
│ getName()            │ → 이름 읽기 (조회)
│ setName(String name) │ → 이름 바꾸기 (수정)
└──────────────────────┘

🔁 데이터 흐름 예시
GetterSetterEx2 user = new GetterSetterEx2("홍길동", "hong@email.com", "1234");

[ 외부에서 직접 name 접근 ❌ ]
    user.name = "임꺽정"; → 에러 (private)

[ Getter 사용 ✅ ]
    user.getName(); → "홍길동"

[ Setter 사용 ✅ ]
    user.setName("임꺽정"); → 이름 바뀜

📘 [3] 핵심 개념 요약표
| 용어          | 쉬운 설명                      |
| ----------- | -------------------------- |
| `private`   | 클래스 안에서만 사용할 수 있도록 보호      |
| `getter`    | 값을 읽는 메서드 (`getName()`)    |
| `setter`    | 값을 바꾸는 메서드 (`setName()`)   |
| `this.name` | 현재 객체의 name이라는 변수          |
| 캡슐화         | 데이터를 보호하고, 외부 접근을 제한하는 것   |
| 생성자         | 객체를 만들 때 데이터를 넣어주는 특별한 메서드 |

🧪 [4] 실습 예제 – 직접 써보기
public class GetterSetterTest {
    public static void main(String[] args) {
        GetterSetterEx2 user = new GetterSetterEx2("홍길동", "hong@email.com", "1234");

        // 값 출력
        user.showInfo();

        // 값 수정 (setter 사용)
        user.setName("임꺽정");
        user.setPassword("5678");

        // 다시 출력
        System.out.println("--- 수정 후 ---");
        user.showInfo();
    }
}

💻 실행 결과
이름: 홍길동
이메일: hong@email.com
비밀번호: 1234
--- 수정 후 ---
이름: 임꺽정
이메일: hong@email.com
비밀번호: 5678

🧠 왜 중요할까요?
직접 변수 바꾸게 하면 데이터가 망가질 수 있어요.
그래서 막아두고, **통로(getter/setter)**만 열어두는 거예요.
이것이 바로 자바의 객체지향 핵심 원칙 중 하나: 캡슐화입니다.

✨ 마무리 정리 그림
[데이터 보호 🛡️]
    ↓
private 변수 (직접 못 건드림)
    ↓
getter = 읽기만 허용
setter = 정해진 방법으로만 변경

*/