package D_250609.Quiz;

public class Member {
    // 퀴즈1-1
    // 설계 클래스 만들기, 클래스명 : Member
    // 멤버 변수 : 1) name 2) email 3) password , private 지정,
    // 생성자 만들기
    // getter, setter 만들기. 하나씩 조회 및, 수정,
    // 조회는 : showInfo , 각 멤버 정보 호출하는 기능,
    // 수정 : changeNameEmailPassword : 메서드 이름으로 만들기.
    // 실행 후,
    // 1) 각 인스턴스 생성 3개 해보기 2) 각 인스턴스로 정보 출력, 3) 정보 변경 해보기.

    // [1] 멤버 변수(필드) 선언 - 외부에서 직접 접근하지 못하도록 private 지정
    private String name; // 이름을 저장할 변수
    private String email; // 이메일을 저장할 변수
    private String password; // 비밀번호를 저장할 변수
 
    // [2] 생성자 - 객체 생성 시 초기값을 설정하는 메서드
    public Member(String name, String email, String password) {
        this.name = name; // 매개변수로 받은 name을 멤버 변수에 저장
        this.email = email; // 매개변수로 받은 email을 멤버 변수에 저장
        this.password = password; // 매개변수로 받은 password를 멤버 변수에 저장
    }

    // [3] 회원 정보 출력 메서드 - 이름, 이메일, 비밀번호 출력
    public void showInfo() {
        System.out.println("이름: " + name); // 현재 객체의 이름 출력
        System.out.println("이메일: " + email); // 현재 객체의 이메일 출력
        System.out.println("비밀번호: " + password); // 현재 객체의 비밀번호 출력
    }

    // [4] 회원 정보 수정 메서드 / 한번에 이름, 이메일, 비밀번호를 변경
        public void changeNameEmailPassword(String name, String email, String password) {
        this.name = name; // 새로운 이름으로 수정
        this.email = email; // 새로운 이메일로 수정
        this.password = password; // 새로운 비밀번호로 수정
    }

    // [5] Getter 메서드 / 외부에서 값을 읽어갈 수 있게 해주는 메서드
    public String getName() { // 이름 반환
        return this.name;
    }
    public String getEmail() { // 이메일 반환
        return this.email;
    }
    public String getPassword() { // 비밀번호 반환
        return this.password;
    }

    // [6] Setter 메서드 / 외부에서 값을 수정할수 있게 해주는 메서드
    public void setName(String name) { // 이름 수정
        this.name = name;
    }
    public void setEmail(String email) { // 이메일 수정
        this.email = email;
    }
    public void setPassword(String password) { // 비밀번호 수정
        this.password = password;
    }

    // vscode에서 지원 해주는 자동완성 코드, 이용해보기
    // 우클릭 -> 소스작업 -> Generate Getters, Setters 선택하기


}
