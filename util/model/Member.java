package util.model;

public class Member {
    // 사용할 멤버 변수
    // 이름, 패스워드, 이메일, 등록일, 모두 문자열 형태
    // 생성자는 매개변수 4개를 구성하기
    // 각각의 정보를 호출하는 인스턴스 메서드를 생성
    // 주의사항) 현재, 접근 지정자, 상속, 객체지향 기법을 모두 배운게 아니라서
    // 현재 캡슐화 등 안하고, 일단 public 하는점 이해하기.

    String name;
    String password;
    String email;
    String registrationDate;

    public Member(String name, String password, String email, String registrationDate) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("패스워드 : " + this.password);
        System.out.println("이메일 : " + this.email);
        System.out.println("등록일 : " + this.registrationDate);
    }

    // 검색을 위해서 해당 이름과 이메일 정보를 조회 하는 기능
    // 이름 조회 기능, 게터(getter), 자동 생성 또는 라이브러리 사용해서 자동 생성된 기능을 이용할 예정
    // 또는 수동으로 만들어서 사용도 함.
    // 결론, 나중에 라이브러리 많이 사용함.
    public String getName() {
        return name;
    }

    // 이메일 조회 기능, 게터(getter)
    public String getEmail() {
        return email;
    }

}


/*
📦 클래스 이름: Member
Member는 "회원"이라는 뜻이에요.
웹사이트나 앱에 회원 가입할 때 저장되는 정보를 담는 클래스라고 보면 됩니다.

✅ 주요 구성요소 쉽게 설명하기
1. 📄 멤버 변수 (정보 저장 공간)
String name;
String password;
String email;
String registrationDate;
| 변수 이름              | 설명                     |
| ------------------ | ---------------------- |
| `name`             | 회원 이름                  |
| `password`         | 로그인 시 사용하는 비밀번호        |
| `email`            | 회원의 이메일 주소             |
| `registrationDate` | 가입한 날짜 (예: 2025-06-13) |
모두 String (문자열) 형태입니다. 날짜도 우선 문자열로 저장합니다.

2. 🏗 생성자 (객체 만들 때 자동으로 호출되는 메서드)
public Member(String name, String password, String email, String registrationDate)
회원 정보를 입력 받아서 한 번에 저장해줍니다.
예를 들어 아래처럼 사용함:

Member m = new Member("홍길동", "1234", "hong@example.com", "2025-06-13");
3. 📢 회원 정보 출력 메서드
public void showInfo() {
    ...
}
회원의 정보를 화면에 출력하는 메서드입니다.
회원 가입 후 확인용으로 자주 사용됩니다.

출력 예시:
이름 : 홍길동
패스워드 : 1234
이메일 : hong@example.com
등록일 : 2025-06-13

4. 🔍 정보 검색용 getter 메서드
public String getName()
public String getEmail()
외부에서 이 회원의 이름과 이메일을 조회할 수 있도록 열어준 메서드입니다.
나중에 검색 기능에 필요해요.

예시:
System.out.println(member.getName());
System.out.println(member.getEmail());
현재는 간단히 public으로 열어뒀지만, 나중엔 보안을 위해 private + getter/setter 구조로 감쌀 거예요.

🧠 전체 흐름 그림 (시각화)
[ Member 클래스 설계도 ]
        ↓
+-------------------------------+
|  name               (문자열) |
|  password           (문자열) |
|  email              (문자열) |
|  registrationDate   (문자열) |
+-------------------------------+
|  생성자: name, pw, email, date |
|  showInfo()                  |
|  getName()                   |
|  getEmail()                  |
+-------------------------------+
        ↓
[ new Member("홍길동", "1234", "hong@...", "2025-06-13") ]
        ↓
[ Member 객체 하나 생성됨 ]
        ↓
member.showInfo() → 정보 출력
member.getEmail() → 이메일 가져옴

✅ 정리 한 줄 요약
Member 클래스는 이름, 비밀번호, 이메일, 가입일 정보를 저장하고 출력하거나 검색할 수 있는 객체를 만들기 위한 설계도입니다.
*/