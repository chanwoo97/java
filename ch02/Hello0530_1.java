package ch02;

public class Hello0530_1 {
    public static void main(String[] args) {
        System.out.println("Test~~출력");
        // 만들었던 클래스를 불러와서, 재사용 해보기.
        // 본인  소개 및, 간단 계산 해보기.
        // 본인소개
    String myInfo = Introduce.introduce_info("정찬우", "010-3445-6223", "jcw6223@naver.com");
    System.out.println(myInfo);

    String myhobby = Introduce.introduce_hobby("제육볶음", "게임", "서든어택");
    System.out.println(myhobby);

    // 퀴즈 1
    // Introduce 클래스에, 정의한 사칙연산 메소드를 이용해서, 각각 계산 결과를
    // result1, result2, result3, result4 변수에 담아서, 출력해보기
    
    int result = Hello.sum(10, 5);
    System.out.println("Sum 이라는 함수 이용해서 결과 출력 : " + result);
    
    int result2 = Hello2.mul(10, 5);
    System.out.println("Sum 이라는 함수 이용해서 결과 출력 : " + result2);
    
    int result3 = Hello3.sub(10, 5);
    System.out.println("Sum 이라는 함수 이용해서 결과 출력 : " + result3);
    
    int result4 = Hello4.divide(10, 5);
    System.out.println("Sum 이라는 함수 이용해서 결과 출력 : " + result4);
    
    }
}


