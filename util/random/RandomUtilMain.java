package util.random;

public class RandomUtilMain {
    public static void main(String[] args) {
        System.out.println("Math.random()를 사용하여 생선된 난수: " + RandomUtil.generateRandom());
        System.out.println("1이상 45 이하 사이의 랜덤 정수: " + RandomUtil.generateRandomInRange(1, 45));
        System.out.println("정찬우의 자동 로또 번호 생성 프로그램" );
        RandomUtil.generateLottoNumbers();
    }
}


/*
🔍 RandomUtilMain 클래스 전체 설명
이 클래스는 RandomUtil 클래스에서 만든 기능들을 직접 실행하는 역할을 합니다.
public class RandomUtilMain {
    public static void main(String[] args) {
        ...
    }
}

✅ 실행 순서 설명
① Math.random()을 사용한 실수 출력
System.out.println("Math.random()를 사용하여 생선된 난수: " + RandomUtil.generateRandom());
RandomUtil.generateRandom() 호출 → 0.0 이상 1.0 미만의 실수 하나 생성
예: 0.58374235423

② 1부터 45 사이의 정수 하나 뽑기
System.out.println("1이상 45 이하 사이의 랜덤 정수: " + RandomUtil.generateRandomInRange(1, 45));
generateRandomInRange(1, 45) → 1~45 범위의 정수 중 무작위로 선택
예: 17

③ 로또 번호 6개 생성 (중복 없이)
System.out.println("정찬우의 자동 로또 번호 생성 프로그램");
RandomUtil.generateLottoNumbers();
generateLottoNumbers() 실행 → 1~45 범위의 숫자 중 중복 없이 6개 생성

예:
정찬우의 자동 로또 번호 생성기 사용한 번호 : 3, 18, 24, 5, 30, 41



📌 참고: 왜 중복 제거가 필요할까?
로또 번호는 1~45 사이의 서로 다른 숫자 6개여야 하므로, 중복 제거가 필수입니다.
do...while 문으로 이전에 나온 숫자들과 겹치면 다시 뽑도록 설계돼 있습니다.

🧠 전체 프로그램 시각화
[RandomUtilMain 실행]
        │
        ├─> RandomUtil.generateRandom()
        │     └─ 0.0 ~ 1.0 사이 실수 출력
        │
        ├─> RandomUtil.generateRandomInRange(1, 45)
        │     └─ 1 ~ 45 사이 정수 하나 출력
        │
        └─> RandomUtil.generateLottoNumbers()
              ├─ 1~45 사이 정수 6개 생성
              ├─ 각 숫자 생성 시 이전 숫자와 중복되지 않게 반복
              └─ 완성된 로또 번호 6개 출력

✅ 정리 요약
| 실행 내용                     | 설명                        |
| ------------------------- | ------------------------- |
| `generateRandom()`        | 0.0 이상 1.0 미만 실수 하나 생성    |
| `generateRandomInRange()` | 지정한 범위의 정수 중 무작위로 하나      |
| `generateLottoNumbers()`  | 1\~45 숫자 중 중복 없이 6개 뽑아 출력 |

🎁 추가 팁 (심화 학습)
중복 없이 숫자 6개를 뽑는 작업은 Set 자료구조를 쓰면 더 간단합니다.

Arrays.sort()를 이용하면 번호를 정렬된 상태로 출력할 수 있어요.

이 구조를 활용해 숫자 맞히기 게임도 만들 수 있습니다.
*/