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
