package D_250611.member_project.model;

public class Member {

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

    public String getName() {
        return name;
    }

    // 이메일 조회 기능, 게터(getter)
    public String getEmail() {
        return email;
    }
}
