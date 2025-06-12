package ch02;

public class OperConditionTestMain {
    public static void main(String[] args) {
        System.out.println("연산자 확인 및 조건문 테스트 시작");
        OperConditionTest.oper1();
        

        System.out.println("임의의 산술 연산하는 기능");
        OperConditionTest.oper2(); 
    }

}


/*

전체 흐름 (Main에서 메서드 호출)
┌───────────────────────────┐
│  OperConditionTestMain    │
│  main 메서드 시작          │
└───────────┬───────────────┘
            │
            ▼
┌───────────────────────────┐
│ OperConditionTest.oper1() │
│   → oper1() 실행          │
│   → 연산 결과 출력         │
└───────────┬───────────────┘
            │
            ▼
┌───────────────────────────┐
│ OperConditionTest.oper2() │
│   → oper2() 실행          │
│   → 연산 결과 출력         │
└───────────────────────────┘



*/ 
