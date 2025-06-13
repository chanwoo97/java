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




/*
Introduce 클래스 구조
┌──────────────────────────────────────────────┐
│                 Introduce 클래스               │
│                                              │
│ ┌──────────────────────────────┐             │
│ │   introduce_info 함수           │             │
│ │  (name, phone, email)         │             │
│ │  → "저는 {name} 입니다. 제 전화번호 : {phone}이고, 이메일 : {email} 입니다." │
│ │  → 문자열 반환                │             │
│ └──────────────────────────────┘             │
│                                              │
│ ┌──────────────────────────────┐             │
│ │   introduce_hobby 함수          │             │
│ │  (food, hobby, game)          │             │
│ │  → "제가 좋아하는 음식은 {food} 입니다. 제 취미 : {hobby}이고, 좋아하는 게임 : {game} 입니다." │
│ │  → 문자열 반환                │             │
│ └──────────────────────────────┘             │
└──────────────────────────────────────────────┘


함수 동작 흐름
introduce_info 함수 호출
  ↓
매개변수 name, phone, email 입력
  ↓
문자열 조합 → 반환
  ↓
main 함수에서 받아 출력

introduce_hobby 함수 호출
  ↓
매개변수 food, hobby, game 입력
  ↓
문자열 조합 → 반환
  ↓
main 함수에서 받아 출력

출력 예시
저는 정찬우 입니다. 제 전화번호 : 010-3445-6223 이고, 이메일 : jcw6223@naver.com입니다.
제가 좋아하는 음식은 제육볶음 입니다. 제 취미 : 게임 이고, 좋아하는 게임 : 서든어택입니다.
핵심 포인트
문자열 연결(Concatenation): "문자열" + 변수 + "문자열" 형태로 새로운 문장을 만듭니다.

함수의 반환값: 문자열을 만들어서 호출한 곳(main 함수)으로 반환합니다.

재사용성: 소개할 내용을 바꾸고 싶으면 함수 호출 시 매개변수 값만 바꾸면 됩니다.
















*/