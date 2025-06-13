package ch02;

public class Hello2 {
    public static int mul(int n, int m) {
        return n * m;
    }
    public static void main(String[] args) {
        int result2 = mul(10, 20);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

    }
}
// 퀴즈1 ,
// 정적 메소드 하나 만들어서, 곱하기 기능으로 사용하기,
// result2 에 담아서, 출력해보기




/*

1. 클래스와 함수 구조
┌───────────────────────────┐
│         Hello2 클래스      │
│                           │
│  ┌───────────────────────┐ │
│  │       mul 함수        │ │
│  │  int mul(int n, int m) │ │
│  │  {                     │ │
│  │    return n * m;       │ │
│  │  }                     │ │
│  └───────────────────────┘ │
│                           │
│  ┌───────────────────────┐ │
│  │      main 함수          │ │
│  │  public static void    │ │
│  │  main(String[] args) { │ │
│  │    int result2 = mul(10, 20); │
│  │    System.out.println(...);    │ │
│  │  }                     │ │
│  └───────────────────────┘ │
└───────────────────────────┘


2. mul 함수 동작 흐름
[입력값]
  n = 10, m = 20
      │
      ▼
[mul 함수] → 10 * 20 계산 → 200 반환
      │
      ▼
[main 함수] → 반환값 200을 변수 result2에 저장


3. 출력 내용
출력문: "mul 이라는 함수 이용해서 결과 출력 : " + result2
결과: "mul 이라는 함수 이용해서 결과 출력 : 200"


4. 전체 흐름 요약
main 함수 실행
      │
      ▼
mul(10, 20) 함수 호출
      │
      ▼
곱셈 수행 → 결과 200 반환
      │
      ▼
result2 변수에 200 저장
      │
      ▼
화면에 출력

*/