package ch02;

public class Minitest {
    // 퀴즈4
    public static String introduce_info(String name, String phone, String email) {
        // String introduce_myself = 저는 {이름} 입니다. 제 전화번호 : {전화번호}이고, 이메일 : {이메일} 입니다.
        String introduce_myself = "저는 " + name + " 입니다. 제 전화번호 : " + phone + " 이고, 이메일 : " + email + "입니다.";
        return introduce_myself;
    }   
    public static void main(String[] args) {
        // 퀴즈4
        String introduce_myself = introduce_info("정찬우", "010-3445-6223", "jcw6223@naver.com");
        System.out.println(introduce_myself);
    
    }
}

    // 퀴즈4 - 과제
    // 본인의 이름과, 전화번호, 이메일을 입력 받는 매개변수가 3개이고,
    // 출력값은 문자열 타입인데 : 결과는
    // 저는 {이름} 입니다.
    // 제 전화번호 : {전화번호}이고,
    // 이메일 : {이메일} 입니다.
    // 출력하는 예제 해보기.


/*
쉽게 이해할 수 있도록 흐름을 그림으로 설명해볼게요!
main 함수 실행
     │
     ▼
introduce_info("정찬우", "010-3445-6223", "jcw6223@naver.com") 함수 호출
     │
     ▼
문자열 생성: "저는 정찬우 입니다. 제 전화번호 : 010-3445-6223 이고, 이메일 : jcw6223@naver.com입니다."
     │
     ▼
문자열 반환 → 변수 introduce_myself에 저장
     │
     ▼
System.out.println(introduce_myself); 출력


출력 결과
저는 정찬우 입니다. 제 전화번호 : 010-3445-6223 이고, 이메일 : jcw6223@naver.com입니다.
주요 포인트
함수 정의: introduce_info가 문자열을 만들어 반환함

함수 호출과 결과 저장: main에서 함수 호출 후 결과를 변수에 저장

출력: 변수에 저장된 문자열을 콘솔에 출력
*/
