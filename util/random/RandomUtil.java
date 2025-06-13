package util.random;

public class RandomUtil {
    // 무작위 숫자 생성
    public static double generateRandom() {
        double randomValue = Math.random();
        return randomValue;
    }

    // 1~10사이의 랜덤 숫자 생성
    public static int generateRandomInRange(int min, int max) {
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        return randomValue;
    }

    // 1~45까지의 랜덤 로또 번호 생성
    public static void generateLottoNumbers() {
        int n1 = generateRandomInRange(1, 45);
        int n2;
        do {
            n2 = generateRandomInRange(1, 45);
        } while (n2 == n1); // 중복 체크
        int n3;
        do {
            n3 = generateRandomInRange(1, 45);
        } while (n3 == n1 || n3 == n2); // 중복 체크
        int n4;
        do {
            n4 = generateRandomInRange(1, 45);
        } while (n4 == n1 || n4 == n2 || n4 == n3); // 중복 체크
        int n5;
        do {
            n5 = generateRandomInRange(1, 45);
        } while (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4); // 중복 체크
        int n6;
        do {
            n6 = generateRandomInRange(1, 45);
        } while (n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5); // 중복 체크
        System.out.println("정찬우의 자동 로또 번호 생성기 사용한 번호 : "
                + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);

    }

}

/*
📦 RandomUtil 클래스 기능 요약
| 기능 메서드 이름                 | 설명                                |
| ------------------------- | --------------------------------- |
| `generateRandom()`        | 0.0 이상 1.0 미만의 무작위 실수(소수) 생성      |
| `generateRandomInRange()` | 원하는 범위 안에서 무작위 정수 생성              |
| `generateLottoNumbers()`  | 1\~45 사이에서 **중복 없이** 6개의 로또 숫자 생성 |

📌 메서드 상세 설명
1. generateRandom()
public static double generateRandom() {
    double randomValue = Math.random(); // 0.0 이상 1.0 미만
    return randomValue;
}
자바에서 Math.random()은 0.0 이상 1.0 미만의 실수 값을 무작위로 반환합니다.
예: 0.23135, 0.92314 등
🧠 실무에서는 많이 사용되지만 보통 정수로 변환해서 쓰는 경우가 많아요.

2. generateRandomInRange(int min, int max)
public static int generateRandomInRange(int min, int max) {
    int randomValue = (int) (Math.random() * (max - min + 1)) + min;
    return randomValue;
}
원하는 정수 범위에서 랜덤 값을 생성합니다.
예: generateRandomInRange(1, 10) → 1부터 10 사이 정수 중 하나

💡 수학적으로 이해하면:
(int)(Math.random() * (max - min + 1)) + min

3. generateLottoNumbers()
public static void generateLottoNumbers() {
    ...
}
이 메서드는 1부터 45까지의 숫자 중 중복되지 않는 6개의 숫자를 랜덤으로 뽑아 로또 번호처럼 출력해 줍니다.
✔ do ~ while 반복문을 이용해서 중복을 피하도록 설계되어 있어요.
🔁 중복 확인 방식
int n2;
do {
    n2 = generateRandomInRange(1, 45);
} while (n2 == n1);
이렇게 하면 n2가 n1과 같으면 다시 뽑습니다.
6개 숫자 모두 이런 식으로 중복 없이 뽑습니다.

🎯 예시 실행 결과
정찬우의 자동 로또 번호 생성기 사용한 번호 : 3, 22, 15, 9, 41, 27
🧠 전체 흐름도 (비전공자용 시각화)
*/