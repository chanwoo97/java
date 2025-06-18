class Point {
    private int x, y; // 점의 좌표 x, y 저장하는 변수 (외부에서 직접 접근 불가)

    public Point(int x, int y) { // 점을 만들 때 x, y 좌표를 받아 초기화하는 생성자
        this.x = x; // 입력받은 x 값을 멤버변수 x에 저장
        this.y = y; // 입력받은 y 값을 멤버변수 y에 저장
    }

    public int getX() { // 현재 x 좌표를 알려주는 함수
        return x;
    }

    public int getY() { // 현재 y 좌표를 알려주는 함수
        return y;
    }

    protected void move(int x, int y) { // 점의 위치를 새 좌표(x,y)로 옮기는 함수
        this.x = x; // 새 x 값으로 변경
        this.y = y; // 새 y 값으로 변경
    }
}

public class Quiz3_ColorPoint extends Point {
    private String color; // 점의 색깔 저장 (예: "RED", "BLUE")

    public Quiz3_ColorPoint(int x, int y, String color) { // 생성자: 좌표와 색을 받음
        super(x, y); // 부모(Point) 클래스의 생성자 호출해서 좌표 초기화
        this.color = color; // 색깔을 초기화
    }

    public void setPoint(int x, int y) { // 좌표를 변경하는 메서드
        move(x, y); // 부모 클래스의 move() 메서드 사용
    }

    public void setColor(String color) { // 색깔을 변경하는 메서드
        this.color = color;
    }

    public void show() { // 색깔과 좌표를 화면에 출력하는 메서드
        System.out.println(color + "색으로 (" + getX() + ", " + getY() + ")"); // 예: "GREEN색으로 (10, 20)"
    }

    public static void main(String[] args) {
        Quiz3_ColorPoint cp = new Quiz3_ColorPoint(5, 5, "YELLOW"); // 노란색 점 생성 (5,5)
        cp.setPoint(10, 20); // 점의 위치를 (10,20)으로 변경
        cp.setColor("GREEN"); // 색깔을 초록색으로 변경
        cp.show(); // 현재 상태 출력: "GREEN색으로 (10, 20)"
    }
}


/*
Point 클래스 객체 (좌표만 있음)
+----------------+
| Point 객체     |
| x: 5           |
| y: 5           |
+----------------+

Quiz3_ColorPoint 객체 (좌표 + 색깔 추가)
+-------------------------------+
| Quiz3_ColorPoint 객체          |
| x: 5                          |
| y: 5                          |
| color: "YELLOW"               |
+-------------------------------+

변경 후 모습
객체 상태 변경:

좌표: (5, 5)  → (10, 20)
색깔: "YELLOW" → "GREEN"

최종 출력:
"GREEN색으로 (10, 20)"

상속 관계 그림
   Point (부모 클래스)
   +------------------+
   | x, y 좌표 저장    |
   | move() 좌표 변경  |
   +------------------+
          ^
          |
Quiz3_ColorPoint (자식 클래스)
   +----------------------+
   | color 추가           |
   | setColor(), show()   |
   +----------------------+

------------------------------------------------------------------------------------------------

🎨 Quiz3_ColorPoint 클래스 설명 – 비전공자용 시각적 개념
🧱 클래스 구조 개념도
            (상속: 자식이 부모 기능을 물려받음)
        ┌──────────────────────┐
        │      Point (부모 클래스) │
        └──────────────────────┘
        │ - x (정수)           │
        │ - y (정수)           │
        │ + getX()             │
        │ + getY()             │
        │ # move(x, y)         │
        └────────┬─────────────┘
                 │ 상속받음 (extends)
        ┌────────▼─────────────┐
        │ Quiz3_ColorPoint     │
        └──────────────────────┘
        │ - color (문자열)     │
        │ + setPoint(x, y)     │
        │ + setColor(color)    │
        │ + show()             │
        └──────────────────────┘

💡 클래스 기능 쉽게 풀어보기
| 구성요소                   | 하는 일                        |
| ---------------------- | --------------------------- |
| `Point` 클래스            | x, y 좌표를 저장하고, 이동할 수 있음     |
| `Quiz3_ColorPoint` 클래스 | `Point`를 상속받아, 색깔까지 추가한 클래스 |
| `move()`               | x, y 좌표를 바꾸는 함수 (부모에서 정의)   |
| `show()`               | 색 + 좌표를 예쁘게 출력 (자식에서 정의)    |

🎯 실행 흐름 시나리오
Quiz3_ColorPoint cp = new Quiz3_ColorPoint(5, 5, "YELLOW");
👉 📍 (5, 5)에 있는 노란 점을 만든다

cp.setPoint(10, 20);
👉 그 점을 (10, 20)으로 이동시킨다

cp.setColor("GREEN");
👉 색깔을 초록색으로 바꾼다

👉 ✅ 최종 결과 출력:
GREEN색으로 (10, 20)

🧒 쉽게 기억하는 개념 요약
| 개념             | 쉽게 말하면...        |
| -------------- | ---------------- |
| 클래스            | 설계도              |
| 객체             | 설계도로 만든 실제 물건    |
| 상속 (`extends`) | 부모 기능을 자식이 물려받음  |
| `super()`      | 부모 생성자 호출 (초기화)  |
| `private`      | 클래스 안에서만 쓸 수 있음  |
| `protected`    | 자식 클래스도 사용할 수 있음 |
| `public`       | 어디서든 사용할 수 있음    |

*/