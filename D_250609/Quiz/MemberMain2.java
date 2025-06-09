package D_250609.Quiz;

public class MemberMain2 {
    public static void main(String[] args) {
        // 인스턴스 생성 3개 하기. (각각 다른 이름, 이메일, 비밀번호)
        Member member1 = new Member("정찬우1", "jcw1@naver.com", "1234");
        Member member2 = new Member("정찬우2", "jcw2@naver.com", "1234");
        Member member3 = new Member("정찬우3", "jcw3@naver.com", "1234");

        // 방금 만든 설계 클래스를 담을 배열 생성하기.
        // Member[] memberArray = new Member[3];
        Member[] memberTempArray = { member1, member2, member3 }; // 배열을 사용하면 여러 객체를 한꺼번에 관리할 수 있음

        // 반복문으로 담기
        // for (int i = 0; i < memberArray.length; i++) {
        // memberArray[i] = memberTempArray[i];
        // }
        System.out.println("-----------------인스턴스  생성 후, 확인 해보기------------------------");;
        // 각 인스턴스를, 반복문 이용해서 출력 해보기.
        for (Member member : memberTempArray) { // 생성된 인스턴스들을 반복문으로 출력
            member.showInfo(); // 각 Member 객체의 정보 출력            
        }
        System.out.println("-------------------수정 후, 확인 해보기-------------------------------");
        
        // 각 인스턴스 멤버의 변수를 한번에 3개 다 변경하는 메서드 이용해서 수정하고, 다시 출력 해보기.
        member1.changeNameEmailPassword("정찬우 수정", "jcw@naver.com 수정", "123456 수정");
        member2.changeNameEmailPassword("정찬우 수정2", "jcw@naver.com 수정", "123456 수정");
        member3.changeNameEmailPassword("정찬우 수정3", "jcw@naver.com 수정", "123456 수정");  
        
        for (Member member : memberTempArray) { // 수정된 인스턴스들을 반복문으로 출력
            member.showInfo(); // 수정된 정보 출력
        }
    }
}
