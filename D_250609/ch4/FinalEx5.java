package D_250609.ch4;

public class FinalEx5 {
    // final : 값 변경 금지 (변수에 사용시) -> 상수가 됨
    // 메서드, 클래스에서도 사용함.
    // 메서드 : final 사용시, 오버라이딩 금지
    // 클래스 : final 사용시, 상속 금지

    public static final double PI = 3.14159;

    public void circleMethod(int radius) {
        double result = radius * radius * PI;
        System.out.println("원 면적 : " + result);
    }
}

/*
✅ [1] 코드 쉬운 설명
🧠 핵심 개념: final이란?
| 사용 위치 | 의미                  |
| ----- | ------------------- |
| 변수 앞  | **값을 못 바꾸게 함** (상수) |
| 메서드 앞 | **오버라이딩 못하게 함**     |
| 클래스 앞 | **상속 금지**           |

📦 이 코드에서는…
public static final double PI = 3.14159;
이 줄은 **원주율(π)**을 담는 변수예요.
final이 붙어서 값을 바꿀 수 없음!
즉, "변하지 않는 숫자" = 상수라고 해요.

⚙️ 메서드 설명: 원 넓이 계산
public void circleMethod(int radius) {
    double result = radius * radius * PI;
    System.out.println("원 면적 : " + result);
}
radius: 반지름
PI: 원주율 (3.14159)
result: 원 넓이 계산 = 반지름² × π
System.out.println(...): 결과를 화면에 출력

🖼️ [2] 그림으로 정리
🎨 Final 키워드와 원 넓이 계산 흐름도
[반지름 입력 (예: 5)]
        ↓
[반지름 * 반지름 * PI]
        ↓
[3.14159 × 5 × 5]
        ↓
[결과 출력: "원 면적 : 78.53975"]

🔐 Final 키워드 개념 그림
[PI = 3.14159] ← final
     🔒 값 변경 금지!

📘 [3] 핵심 개념 요약 표
| 키워드            | 의미                    | 예시 사용             |
| -------------- | --------------------- | ----------------- |
| `final`        | 변수: 바뀌지 않는 값 (상수)     | `final double PI` |
| `static`       | 클래스 전체에서 공유되는 값       | 모든 인스턴스가 `PI` 사용  |
| `public`       | 어디서든 접근 가능            | 다른 클래스에서도 접근 가능   |
| `circleMethod` | 반지름 받아서 원의 면적 계산하는 함수 | `5` 넣으면 면적 계산됨    |

✏️ 예제 실행 결과
FinalEx5 f = new FinalEx5();
f.circleMethod(5);

📤 출력:
원 면적 : 78.53975

🔚 요약 정리
final을 붙이면 값이 바뀌지 않아요.
PI는 원주율이기 때문에, 절대 바뀌면 안 되죠!
circleMethod()는 반지름을 받아서 원의 넓이를 계산하고 출력해줘요.

*/