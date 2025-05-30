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
