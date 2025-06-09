package D_250609.Quiz;

public class MemberMain {
    public static void main(String[] args) {
        // [1] Member 객체 생성 (생성자 사용하여 초기값 지정)
        Member member1 = new Member("정찬우1", "jcw1@naver.com", "1234");
        Member member2 = new Member("정찬우2", "jcw2@naver.com", "1234");
        Member member3 = new Member("정찬우3", "jcw3@naver.com", "1234");
        // Member 객체를 만든면서 이름, 이메일, 비밀번호를 초기화
        member1.showInfo();
        // 생성된 객체의 회원 정보를 출력 (이름/이메일/비밀번호)
        System.out.println("---------------------------------------------------");

        System.out.println("Getter 메서드를 이용해서, 각 멤버 변수 하나 조회 확인");
        // 개별적으로 Getter 메서드를 사용하여 값 조회
        System.out.println("이름 조회 : " + member1.getName()); // 이름 출력
        System.out.println("이메일 조회 : " + member1.getEmail()); // 이메일 출력
        System.out.println("비밀번호 조회 : " + member1.getPassword()); // 비밀번호 출력
        System.out.println("---------------------------------------------------");
        
        System.out.println("Setter 메서드를 이용해서, 각 멤버 변수 값 설정 확인");
        // 변경 메서드를 통해 멤버 정보 수정
        member1.changeNameEmailPassword("정찬우 수정", "jcw6223@naver.com 수정", "123456 수정");
        // 이름, 이메일, 비밀번호를 한번에 모두 수정하는 메서드 호출
        System.out.println("Setter를 이용해서, 데이터 변경하고, 값 확인");
        // 수정된 내용이 반영됬는지 출력으로 확인
        member1.showInfo();
        // 다시한번 정보 출력해서 변경된 내용 확인
    }
}
