package util.random;

public class RandomUtil_doc {
    // 설계 클래스
    // Math 클래스에 있는 random() 메소드를 사용하여
    // 0.0 이상 1.0 미만의 난수를 생성하는 메소드를 작성
    // 기본 기능 확인용, 정적 메서드 추가해보기.
    public static double generateRandom() {
        // 데이터 타입 : double, 변수명 : randomValue
        // Math 클래스의 정적 메소드 random()를 호출하여
        double randomValue = Math.random();
        return randomValue;
    }

    // 특정 범위의 난수를 생성하기. 실수 -> 정수 형태로 변경.
    // 1 이상 10 이하의 난수를 생성하는 메소드 작성
    public static int generateRandomInRange(int min, int max) {
        // Math.random()을 사용하여 0.0 이상 1.0 미만의 난수를 생성
        // 이를 이용하여 원하는 범위의 정수 난수를 생성

        // 설명 1. Math.random() : 0.0 이상 1.0 미만의 난수를 생성
        // 결과 모양 0.0 <= x < 1.0 ,

        // 예시) min = 1, max = 10
        // 설명 2. Math.random() * (max - min + 1)
        // 결과 모양 0.0 <= x < 10.0
        //
        // 형변환 연산자, 캐스팅 연산자라고 하고, 기호는 소괄호를 사용.
        // 예시 )
        // (변환하고 싶은 타입) 원래 데이터
        // 예시) (int) Math.random() * (max - min + 1)

        // 설명 3. (int) Math.random() * (max - min + 1) : double 타입을 int 타입으로 변환
        // 결과 모양 0 <= x < 10

        // 설명 4. (int) Math.random() * (max - min + 1) + min
        // 결과 모양 1 <= x < 11
        // -> 1 <= x <= 10
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        return randomValue;
    }

    // 퀴즈1
    // 로또 번호를 생성하는 기능을 만들기.
    // 아직 배열 안배워서, 각각의 6자리 숫자를 따로 받아서,
    // 출력만 한번에 생성하는 기능으로,
    // 정적 메소드를 만들어서, 출력 문장에서, 랜덤 숫자 6개 보여주기 형식으로 하기.
    // 출력문 모양: 이상용의 자동 로또 번호 생성기 사용한 번호 : 1, 20 ,30, 11, 17 ,45
    // 조건문을 활용해서, 중복된 숫자가 발생 안하게끔 , 해보기
    public static void generateLottoNumbers() {
        // 로또 번호를 생성하는 기능을 구현
        // 1부터 45까지의 숫자 중에서 중복되지 않는 6개의 숫자를 생성
        // 예시 출력: 이상용의 자동 로또 번호 생성기 사용한 번호 : 1, 20, 30, 11, 17, 45

        // 첫번째 숫자 생성
        int n1 = generateRandomInRange(1, 45);

        // 두번째 숫자 생성
        int n2; // 일단 정의만 먼저하고, 초기화 값 할당은 뒤에 하기.
        do {
            // 실제 값 할당은 뒤에서 하고,
            n2 = generateRandomInRange(1, 45);
        } while (n2 == n1); // 중복 체크

        // 세번째 숫자 생성
        int n3;
        do {
            n3 = generateRandomInRange(1, 45);
        } while (n3 == n1 || n3 == n2); // 중복 체크

        // 네번째 숫자 생성
        int n4;
        do {
            n4 = generateRandomInRange(1, 45);
        } while (n4 == n1 || n4 == n2 || n4 == n3); // 중복 체크

        // 다섯번째 숫자 생성
        int n5;
        do {
            n5 = generateRandomInRange(1, 45);
        } while (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4); // 중복 체크

        // 여섯번째 숫자 생성
        int n6;
        do {
            n6 = generateRandomInRange(1, 45);
        } while (n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5); // 중복 체크

        // 로직 구현은 생략하고, 출력문만 작성
        System.out.println("이상용의 자동 로또 번호 생성기 사용한 번호 : "
                + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);

    }
}


/*
📦 클래스 이름: RandomUtil_doc
이 클래스는 랜덤 숫자 관련 기능들을 모아둔 유틸리티 클래스입니다.
모든 메서드는 정적(static) 이라서, 객체를 만들지 않고도 바로 사용할 수 있어요.

✅ 주요 메서드별 설명
1. generateRandom()
public static double generateRandom() {
    double randomValue = Math.random(); // 0.0 이상 1.0 미만
    return randomValue;
}
📌 Math.random()은 자바에서 **랜덤 실수(소수)**를 생성하는 함수예요.
예시 결과:
0.371554, 0.992145, 0.003223 등

2. generateRandomInRange(int min, int max)
public static int generateRandomInRange(int min, int max) {
    int randomValue = (int) (Math.random() * (max - min + 1)) + min;
    return randomValue;
}
📌 이 메서드는 특정 정수 범위의 랜덤 값을 생성합니다.

int num = generateRandomInRange(1, 10); // 1 이상 10 이하의 정수
🧠 내부 작동 방식:
Math.random() → 0.0 <= x < 1.0
곱하기 (max - min + 1) → 범위를 늘림
(int)로 소수점 버림 → 정수로 변환
+ min → 원하는 범위 시작점으로 맞춤

3. generateLottoNumbers()
public static void generateLottoNumbers() {
    // 중복 없이 6개 숫자 생성
    ...
    System.out.println("이상용의 자동 로또 번호 생성기 사용한 번호 : ...");
}
📌 1부터 45 사이의 숫자 중 중복 없이 6개 숫자를 랜덤으로 뽑는 기능입니다.
작동 방식:
generateRandomInRange(1, 45)를 이용해서 숫자 하나 생성
그 숫자가 이전에 나온 숫자와 같은지 확인
같으면 다시 뽑고, 다르면 저장
6번 반복해서 총 6개 숫자 확보
🔄 do { ... } while(조건) 문으로 중복을 방지하는 방식이에요.

🧠 전체 흐름 그림 (시각화)
[ RandomUtil_doc 클래스 ]
        ↓
+--------------------------------------+
|  generateRandom()                    | → 0.0 이상 1.0 미만 실수 반환
+--------------------------------------+
|  generateRandomInRange(min, max)     | → 특정 범위의 정수 랜덤 값 반환
+--------------------------------------+
|  generateLottoNumbers()              | → 중복 없이 6개의 로또 숫자 생성
+--------------------------------------+
        ↓
예: generateLottoNumbers()
→ n1 = 7
→ n2 = 13 (≠ n1)
→ n3 = 7 → 재시도 → 22
→ n4 = 30 (중복 없음)
→ ...
→ 출력: 이상용의 자동 로또 번호 생성기 사용한 번호 : 7, 13, 22, 30, 45, 5

🧾 정리 요약
메서드 이름	기능 설명
generateRandom()	0.0 이상 1.0 미만의 실수 생성
generateRandomInRange()	원하는 범위의 정수 랜덤 값 생성
generateLottoNumbers()	1~45 중 중복 없이 6개 번호 생성

💡 다음에 해볼 수 있는 것들
로또 번호를 배열이나 Set으로 저장해서 더 깔끔하게 만들기

여러 번 로또 번호를 생성하는 반복 기능

날짜/시간과 결합하여 기록 남기기 (예: 생성한 시간까지 출력)

*/