package ch02;

public class Exs_doc {

    public static String exMini_quiz1(String name, int month) {
        String season = "";
        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                return "잘못된 월입니다.";
        }
        String result = "" + name + "님, 좋아하는 월은 " + month + "월입니다. 계절은 " + season + "입니다.";
        // return String.format("%s님, 좋아하는 월은 %d월입니다. 계절은 %s입니다.", name, month, season);
        return result;
    }

    // if 문 이용 가능하지만, 조건 연산식으로, 표현.
    // 삼항 연산자 예시, 조건 ? 참일 때 : 거짓일 때
    public static String getTernaryExam(int score) {
        // score가 60 이상이면 "합격", 아니면 "불합격" 문자열 반환
        String result = (score >= 60) ? "합격" : "불합격";
        // if 문으로도 가능
        // if (score >= 60) {
        // result = "합격";
        // } else {
        // result = "불합격";
        // }
        return result;
    }


    // 증감 연산자 예시, 복합 대입 연산자 , a++, ++a , 차이점
    public static void getIncDecExam() {
        int a = 10;
        int b = 20;

        // a++ : 후위 연산자, a의 값을 먼저 사용하고, 나중에 1 증가
        // ++a : 전위 연산자, a의 값을 먼저 1 증가시키고, 그 다음에 사용
        System.out.println("a++: " + (a++)); // 10 출력 후, a는 11로 증가
        System.out.println("결과1 a: " + a); // 11 출력
        System.out.println("++a: " + (++a)); // 12 출력
        System.out.println("결과2 a: " + a); // 12 출력

        // 복합 대입 연산자
        b += 5; // b = b + 5; b는 이제 25
        System.out.println("b += 5: " + b);
    }

    // 타입 변환
    public static void getTypeExam() {
        long num1 = 100L; // long 타입 변수, 8바이트
        long num2 = 100; // 왼쪽 : 받는 타입 롱타입 8바이트, 오른쪽 : 정수형 int 타입 4바이트
        // int 타입 100을 , long 타입으로 형변환 -> 자동 형변환,
        // 작은 쪽 -> 큰 쪽으로 형변환 시에만 문제가 안됨.

        // 반대로, 큰 쪽에서 작은 쪽으로 형변환 시에는, 강제로 형변환
        byte num3 = 127; // 128은 byte 타입의 범위를 벗어남
        int num4 = 128;
        // 강제로 형변환 int num4 , -> 강제로 byte 타입으로 변환
        // 값의 손실이 발생하거나, 정상적인 출력이 안나옴.
        // 예시로 확인만.
        byte num5 = (byte) num4;
        System.out.println("num5: " + num5);
        // return "곧 결과 반환 하거나 출력만 할 예정.";
    }

    // 정적 메소드 이용,
    // 확인 상항, 파이널 , 상수 확인 및 원 면적 구하는 기능,
    // 반지름을 매개변수로 받고, 원의 면적을 문자열 타입으로 반환하는 형태.
    public static String getCircleArea(double radius) {
        final double PI = 3.14159; // 원주율 상수
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        // PI = 3.14159123412; // 상수는 재할당 불가, 컴파일 에러 발생
        double area = PI * radius * radius; // 원의 면적 계산
        // String.format , 기본 옵션
        // 소수점 둘째 자리까지 출력
        // %.2f : 소수점 둘째 자리까지 출력 -> radius
        // %.2f : 소수점 둘째 자리까지 출력 -> area
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }
}


/*

┌───────────────────────────────┐
│           Exs_doc 클래스        │
│  (자바 기본 문법, 조건문, 연산자 등) │
└───────────────┬───────────────┘
                │
    ┌───────────▼────────────┐
    │ 1. exMini_quiz1()      │
    │ - 이름과 월 받아서       │
    │ - 월에 따른 계절 판별     │
    │ - 결과 문장 생성 후 반환  │
    └───────────┬────────────┘
                │
    ┌───────────▼────────────┐
    │ 2. getTernaryExam()    │
    │ - 점수 받아서            │
    │ - 삼항연산자로 합격/불합격 판별 │
    │ - 결과 반환              │
    └───────────┬────────────┘
                │
    ┌───────────▼────────────┐
    │ 3. getIncDecExam()     │
    │ - 증감 연산자 (a++, ++a) │
    │ - 복합 대입 연산자 (b += 5) │
    │ - 연산 결과 출력         │
    └───────────┬────────────┘
                │
    ┌───────────▼────────────┐
    │ 4. getTypeExam()       │
    │ - 타입 변환 설명          │
    │ - 자동 형변환 (int→long)   │
    │ - 강제 형변환 (int→byte)   │
    │ - 데이터 손실 예시 출력    │
    └───────────┬────────────┘
                │
    ┌───────────▼────────────┐
    │ 5. getCircleArea()     │
    │ - 반지름 받기           │
    │ - 음수 입력 검사         │
    │ - 원의 면적 계산 (PI*r²)  │
    │ - 예쁜 문자열로 결과 반환  │
    └────────────────────────┘


 */