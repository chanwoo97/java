package ch03;

import java.util.Scanner;

public class Mini_quiz2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 클래스명.메서드 부분에, 이해가 안가요,
        // 디버깅 하기,
        // 1) 중단점 찍기, 코드 라인 번호 앞에 클릭 시, 빨간점이 생성.
        // 2) 실행 , 디버깅 시작, f5
        // 3) 디버깅 중, f10 : 단위 실행, 다음 단계로 넘어가기
        // 언제 다음 단계로 넘어가냐?, 메서드 진입, 반복문에 진입 아닌 것들,
        // 출력, 변수 정의, 그냥 넘어가기,
        // f11 : 메서드 내부로 이동(단계정보), 메서드, 반복문에 보통 들어가고, 다른 기능은 가급적 안들어가기
        // 만약, 들어가면, 궁금하지 않은 메서드의 구체적인 실행 단계를 다봐야 함. 피로도 상승함.
        // shift + f11 : 메서드 나가기(단계 출력)
        // 만약, 잘못 들어가거나, 다시 나올 경우에는
        // Mini_quiz2_Func.quiz1(scanner);

        // 퀴즈2, 3x3 배열을 만들어 모든 요소에 1~9 채우고 출력
        // Mini_quiz2_Func.quiz2();
        scanner.close();

        // 퀴즈3, 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
        // 방법1
        String[] strings = { "apple", "banana", "cherry", "date" };
        String longestString = Mini_quiz2_Func.quiz3(strings);
        System.out.println("방법1, 가장 긴 문자열: " + longestString);
        // 방법2, strings, 랜덤하게 생성하는 메서드 이용해서,
        String[] randomStrings = Mini_quiz2_Func.generateRandomStrings(5);
        String longestRandomString = Mini_quiz2_Func.quiz3(randomStrings);
        System.out.println("방법2, 랜덤 문자열 중 가장 긴 문자열: " + longestRandomString);

    }
}

/*
1. 클래스명.메서드() 형태의 의미
자바에서 static 메서드는 객체 생성 없이 클래스 이름으로 직접 호출할 수 있습니다.

예) Mini_quiz2_Func.quiz3(strings)

여기서 Mini_quiz2_Func는 클래스명, quiz3는 그 클래스 안에 있는 static 메서드 이름이에요.

즉,

java
복사
편집
String longestString = Mini_quiz2_Func.quiz3(strings);
는

Mini_quiz2_Func 클래스 내부의 quiz3 메서드를 호출하는 코드이고,

strings 배열을 인자로 넘겨서 가장 긴 문자열을 받아서 longestString 변수에 저장하는 겁니다.

2. 디버깅 단축키 간단 요약
중단점 찍기: 코드 왼쪽 여백 클릭 → 빨간 점

디버깅 시작: F5

한 줄씩 실행 (Step Over): F10

메서드 내부로 진입 (Step Into): F11

메서드 내부 실행 빠져 나오기 (Step Out): Shift + F11

3. 왜 디버깅을 하냐?
프로그램 실행 흐름을 한 줄씩 보면서 변수 상태 확인

내가 호출한 메서드가 실제로 어떻게 작동하는지 이해

버그나 오류를 잡기 위해

4. Main 메서드에서 해야 할 일 정리
디버깅을 해보고 싶다면 Mini_quiz2_Func 클래스의 특정 메서드(예: quiz1, quiz2, quiz3) 호출 라인에 중단점 찍고 실행해보세요

scanner.close()는 입력 종료

quiz3 메서드 호출 후 결과 출력 코드 잘 작성됨
*/