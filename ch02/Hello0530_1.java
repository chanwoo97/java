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


/*
1. 전체 구조 흐름
┌──────────────────────────────┐
│          main 함수            │
│                              │
│ 1) Introduce 클래스 호출       │
│   - 소개 정보 출력             │
│   - 취미 정보 출력             │
│                              │
│ 2) 사칙연산 클래스 메서드 호출 │
│   - Hello.sum(덧셈)            │
│   - Hello2.mul(곱셈)           │
│   - Hello3.sub(뺄셈)           │
│   - Hello4.divide(나눗셈)      │
│                              │
│ 3) 각 결과를 변수에 저장 후 출력 │
└──────────────────────────────┘


2. 함수 호출 순서도 (예시: sum 호출)
main 함수 실행
      │
      ▼
Introduce.introduce_info("정찬우", "010-3445-6223", "jcw6223@naver.com")
      │
      ▼
소개 문자열 반환 → myInfo 변수에 저장 → 출력

main 함수 계속 실행
      │
      ▼
Hello.sum(10, 5)
      │
      ▼
덧셈 결과 15 반환 → result 변수에 저장 → 출력
※ Hello2.mul, Hello3.sub, Hello4.divide도 같은 방식으로 호출되어 결과 출력됨


3. 출력 예시
Test~~출력
저는 정찬우 입니다.
제 전화번호 : 010-3445-6223이고,
이메일 : jcw6223@naver.com 입니다.

제 취미는 제육볶음, 게임, 서든어택 입니다.

Sum 이라는 함수 이용해서 결과 출력 : 15
Sum 이라는 함수 이용해서 결과 출력 : 50
Sum 이라는 함수 이용해서 결과 출력 : 5
Sum 이라는 함수 이용해서 결과 출력 : 2
추가 설명
Introduce 클래스의 메서드들은 문자열을 만들어 반환하는 역할만 합니다.

Hello, Hello2, Hello3, Hello4 클래스의 메서드들은 각각 덧셈, 곱셈, 뺄셈, 나눗셈을 수행합니다.

main 함수에서 이 메서드들을 호출하고 결과를 받아서 출력하는 구조입니다.

재사용(모듈화) 개념의 좋은 예제입니다!
*/
