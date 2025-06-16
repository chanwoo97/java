package D_250609.ch4;

public class FinalEx5Main {
    public static void main(String[] args) {
        FinalEx5 finalEx5 = new FinalEx5();
        finalEx5.circleMethod(10);
        // final로 정의한 공유 상수 변경 시도 -> 변경 불가.
        // FinalEx5.PI = 3.14; // 오류 발생: final 변수는 변경할 수 없음
    }
}


/*
✅ [1] 쉬운 설명: 무슨 일이 일어나는 코드인가요?
🔧 목적: 원의 넓이를 계산해서 출력하기!
코드 설명 (한 줄씩)
public class FinalEx5Main {
    public static void main(String[] args) {
        FinalEx5 finalEx5 = new FinalEx5();
FinalEx5 클래스(원 넓이 계산기)를 만들어서 사용하려고 객체를 만듭니다.
즉, finalEx5라는 이름의 계산기를 준비한 거예요.

finalEx5.circleMethod(10);
반지름이 10인 원의 넓이를 계산합니다.
내부에서는 10 × 10 × 3.14159로 계산돼요!

        // FinalEx5.PI = 3.14; // 오류 발생: final 변수는 변경할 수 없음
여긴 중요한 포인트!
→ PI는 final이라서 바꿀 수 없어요!
→ 그래서 주석을 풀면 에러가 납니다.

🖼️ [2] 그림으로 이해하기
📌 전체 흐름도
[FinalEx5Main 클래스]
      ↓
[FinalEx5 객체 생성]
      ↓
[반지름 10 전달 → circleMethod()]
      ↓
[10 × 10 × PI(3.14159)]
      ↓
[결과 출력: "원 면적 : 314.159"]

📤 출력 결과
원 면적 : 314.159

🔒 final 값 변경 시도 (실패)
FinalEx5.PI = 3.14; ← ❌ 오류!
    ↑
final 이라서 바꿀 수 없음

📘 [3] 핵심 개념 정리 표
| 코드 요소               | 쉬운 설명                     |
| ------------------- | ------------------------- |
| `FinalEx5` 클래스      | 원 넓이 계산하는 클래스             |
| `PI` (상수)           | 고정된 원주율 3.14159 (`final`) |
| `circleMethod(int)` | 반지름 받아서 원의 넓이 출력          |
| `final` 키워드         | 값 변경 ❌                    |
| `static` 키워드        | 클래스 전체가 공유하는 값            |
| `main` 메서드          | 프로그램 시작 지점                |

💡 정리 한 줄 요약
FinalEx5Main은 FinalEx5를 사용해서 원의 넓이를 구하고 출력하며,
final이 붙은 값은 절대 바꿀 수 없다는 걸 보여주는 예제예요!
*/