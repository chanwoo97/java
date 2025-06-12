package ch02;

public class Introduce {
    public static String introduce_info(String name, String phone, String email) {
        // String introduce_myself = 저는 {이름} 입니다. 제 전화번호 : {전화번호}이고, 이메일 : {이메일} 입니다.
        String introduce_myself = "저는 " + name + " 입니다. 제 전화번호 : " + phone + " 이고, 이메일 : " + email + "입니다.";
        return introduce_myself;
    }   
    
    public static String introduce_hobby(String food, String hobby, String game) {
        // String introduce2_myself = 제가 좋아하는 음식은 {음식이름} 입니다. 제 취미 : {취미}이고, 좋아하는 게임 : {게임명} 입니다.    
        String introduce_hobby = "제가 좋아하는 음식은 " + food + " 입니다. 제 취미 : " + hobby + " 이고, 좋아하는 게임 : " + game + "입니다.";
        return introduce_hobby;
    }

    public static void main(String[] args) {        
        String introduce_myself = introduce_info("정찬우", "010-3445-6223", "jcw6223@naver.com");
        System.out.println(introduce_myself);
        
        String introduce_hobby = introduce_hobby("제육볶음", "게임", "서든어택");
        System.out.println(introduce_hobby);

    }
}

// 퀴즈 5
// 내가 좋아하는 음식, 취미, 게임 등 알려주는 기능
// 좋아하는 음식, 취미, 게임 매개변수 3개 정의
// 출력
// 제가 좋아하는 음식은 : {음식이름} 입니다.
// 제 취미 : {취미}이고,
// 좋아하는 게임 : {게임명} 입니다.
// 출력하는 예제 해보기.

// 해야할 일,
// 1)함수 정의
// 2)함수 사용