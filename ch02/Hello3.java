package ch02;

public class Hello3 {
    public static int sub(int n, int m) {
        return n - m;
    }

    public static void main(String[] args) {
        int result3 = sub(20, 10);
        System.out.println("sub라는 함수 이용해서 결과 출력 : " + result3);
    }
}

// 퀴즈2
// 정적 메소드 하나 만들어서, 빼기 기능으로 사용하기,
// result3 에 담아서, 출력해보기



/*

1. 클래스와 함수 구조
┌───────────────────────────┐
│         Hello3 클래스       │
│                           │
│  ┌───────────────────────┐ │
│  │        sub 함수          │ │
│  │  int sub(int n, int m) │ │
│  │  {                     │ │
│  │    return n - m;       │ │
│  │  }                     │ │
│  └───────────────────────┘ │
│                           │
│  ┌───────────────────────┐ │
│  │       main 함수         │ │
│  │  public static void    │ │
│  │  main(String[] args) { │ │
│  │    int result3 = sub(20, 10); │
│  │    System.out.println(...);    │ │
│  │  }                     │ │
│  └───────────────────────┘ │
└───────────────────────────┘


2. sub 함수 동작 흐름
[입력값]
  n = 20, m = 10
      │
      ▼
[sub 함수] → 20 - 10 계산 → 10 반환
      │
      ▼
[main 함수] → 반환값 10을 변수 result3에 저장



3. 출력 내용
출력문: "sub라는 함수 이용해서 결과 출력 : " + result3
결과: "sub라는 함수 이용해서 결과 출력 : 10"


4. 전체 흐름 요약
main 함수 실행
      │
      ▼
sub(20, 10) 함수 호출
      │
      ▼
뺄셈 수행 → 결과 10 반환
      │
      ▼
result3 변수에 10 저장
      │
      ▼
화면에 출력

*/