import java.util.Scanner;  // 키보드 입력을 받을 Scanner 클래스를 가져옴

class Circle {
    private int radius;  // 반지름 값을 저장하는 변수 (외부에서 직접 접근 불가)

    public Circle(int radius) {  // Circle 객체를 만들 때 반지름 값을 받아 저장하는 생성자
        this.radius = radius;    // 입력받은 반지름 값을 멤버 변수 radius에 저장
    }

    public double getArea() {   // 원의 면적을 계산해서 반환하는 메서드
        return radius * radius * 3.14;  // 반지름 * 반지름 * 3.14 (원주율 근사값)
    }
}

public class Quiz5_CircleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 키보드 입력을 받기 위한 Scanner 객체 생성
        Circle[] circles = new Circle[4];           // Circle 객체를 4개 저장할 배열 생성 (초기값은 null)

        // 4개의 원 반지름을 차례대로 입력 받기 위한 반복문
        for (int i = 0; i < circles.length; i++) {
            System.out.print((i + 1) + " 반지름 >> ");  // 몇 번째 반지름을 입력받는지 출력
            int radius = Integer.parseInt(scanner.nextLine());  // 입력받은 문자열을 정수로 변환
            circles[i] = new Circle(radius);  // 입력받은 반지름 값으로 Circle 객체 생성 후 배열에 저장
        }

        System.out.println("저장하였습니다...");  // 입력 완료 안내 메시지 출력

        double totalArea = 0.0;  // 원들의 면적 합을 저장할 변수, 처음엔 0.0으로 초기화
        for (Circle c : circles) {  // circles 배열에 저장된 Circle 객체 하나씩 꺼내서
            totalArea += c.getArea();  // 각 원의 면적을 계산해서 totalArea에 더함
        }

        // 계산된 전체 원 면적 합을 소수점 둘째 자리까지 포맷하여 출력
        System.out.printf("원의 면적 전체 합은 %.2f\n", totalArea);

        scanner.close();  // Scanner 객체 닫아서 자원 해제
    }
}

/*
그림으로 이해하기
Circle 클래스와 객체 생성

사용자 입력 반지름  →  Circle 객체 생성
예) radius = 5  →  Circle(5) 객체가 만들어짐

Circle 객체 배열 circles
circles 배열 (크기 4)
+-----+-----+-----+-----+
| c[0]| c[1]| c[2]| c[3]|
+-----+-----+-----+-----+
각 칸에 Circle 객체가 저장됨

반지름 입력 → 객체 생성 → 배열 저장
반복문 4번 실행:
1) 반지름 입력 → Circle 객체 생성 → circles[0]에 저장
2) 반지름 입력 → Circle 객체 생성 → circles[1]에 저장
3) 반지름 입력 → Circle 객체 생성 → circles[2]에 저장
4) 반지름 입력 → Circle 객체 생성 → circles[3]에 저장

면적 계산 및 합산
for each Circle c in circles:
    totalArea += c.getArea()

계산식 예시: 반지름 5 → 5*5*3.14 = 78.5
모든 원 면적 더함 → totalArea에 저장

-----------------------------------------------------------------------------------------------
🔵 Quiz5_CircleArray – 비전공자를 위한 그림 설명
📦 전체 구조 요약
Circle 클래스 : 원 하나의 반지름과 면적을 담당
Circle[] 배열 : 원 여러 개를 저장하는 상자
Scanner : 사용자 입력 도구

📊 프로그램 흐름 순서도
┌──────────────────────────────┐
│ 사용자에게 반지름 4번 입력 받기 │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ 입력값으로 Circle 객체 4개 생성 │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ 각 원의 면적 계산하여 더함     │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ 전체 면적 합 출력 (소수 둘째 자리) │
└──────────────────────────────┘

🧠 핵심 개념 쉽게 풀기
| 개념                   | 쉽게 말하면...                      |
| -------------------- | ------------------------------ |
| `Circle` 클래스         | 원 하나의 반지름과 면적 계산 공식이 들어 있는 설계도 |
| `new Circle(radius)` | 반지름 값을 넣어서 원을 하나 만드는 작업        |
| `Circle[] circles`   | 원 여러 개를 담는 상자 (4칸짜리 배열)        |
| `for-each` 문         | 배열에서 하나씩 꺼내서 처리하는 반복문          |
| `getArea()`          | 면적 = 반지름² × 3.14 공식 수행         |

🎯 예시 흐름 (입력과 출력)
1 반지름 >> 3
2 반지름 >> 5
3 반지름 >> 2
4 반지름 >> 4
저장하였습니다...
원의 면적 전체 합은 122.54

(계산 과정)
원1: 3×3×3.14 = 28.26
원2: 5×5×3.14 = 78.5
원3: 2×2×3.14 = 12.56
원4: 4×4×3.14 = 50.24
→ 총합: 169.56

💡 코드 구조를 그림으로 설명
┌────────────────────────────┐
│ Circle[] 배열 (4칸)         │
├────────┬────────┬────────┬────────┤
│ Circle │ Circle │ Circle │ Circle │
│(반3)   │(반5)   │(반2)   │(반4)   │
└────────┴────────┴────────┴────────┘

각 칸마다 .getArea() 호출해서 더함

*/