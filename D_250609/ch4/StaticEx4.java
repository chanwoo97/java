package D_250609.ch4;

public class StaticEx4 {
    // static : 클래스 단위로 공유되는 필드 / 메서드

    String name;

    // static 키워드를 사용해서, 모든 객체가 공유하는 변수
    static int studentCount = 0;

    // 생성자 호출시, 학생의 번호가 증가 하도록 만들기.
    public StaticEx4(String name) {
        this.name = name;
        // 공유 변수인, 학생 수를 카운트 하는 변수를 증가.
        studentCount++; // 학생 수 증가
    }

    // 인스턴스 메서드
    // 인스턴스, (객체) 생성 후, 해당 인스턴스명으로 호출.
    // A a = new A(); A = 생성자, 클래스명, a : 인스턴스명
    // a.showInfo()
    public void printInfo() {
        System.out.println("이름 : " + name);
    }

    // static 메서드
    // 클래스명으로 바로 사용이 가능함.
    // A : 클래스명
    // A.showInfoTotal()
    public static void showInfoTotal() {
        System.out.println("총 학생수 : " + studentCount);
    }

    // 주의사항
    // 1) 인스턴스 변수, 스태틱 변수 구분 -> static 있냐? 없냐?
    // 2) 스태틱 변수에 접근시, 클래스명으로 접근 해야하고,
    // 3) 인스턴스 변수 명으로 접근 안하기. 왜? 개념이 메모리적으로 저장 공간의 위치가 다름.
    // A a = new A();, a : 인스턴스명, A : 클래스명
    // a.studentCount -> 접근 안하기.
    // 클래스명.studentCount -> 접근하기.
}


/*
✅ [1] 아주 쉬운 설명: static이란?
static은 ‘클래스 공유’라는 뜻이에요.
클래스 안에 만들어진 변수나 메서드가 모든 객체(인스턴스) 사이에서 똑같이 공유된다는 뜻입니다.

🧩 비유로 이해하기
학생마다 이름(name)은 다르지만,
학교 전체 학생 수(studentCount)는 모두가 함께 공유하는 숫자예요.
학생 한 명 한 명은 각각 자기 이름이 다르지만,
학생 수 카운트는 학교 전체가 함께 보는 숫자이기 때문에
static으로 만들어서, 모든 학생 인스턴스가 이 값을 같이 씁니다.

🔥 핵심 요점
| 변수 종류     | 메모리 위치      | 예시                        | 특징                |
| --------- | ----------- | ------------------------- | ----------------- |
| 인스턴스 변수   | 객체마다 따로 생성  | `String name;`            | 학생마다 이름이 다름       |
| static 변수 | 클래스 영역에 하나만 | `static int studentCount` | 모든 학생이 함께 보는 학생 수 |

🖼️ [2] 그림으로 이해하기
[ StaticEx4 클래스 ]           (클래스 영역 - static 저장소)
┌─────────────────────────────┐
│ static int studentCount = 0;│  ← 공유 변수 (학교 전체 학생 수)
└─────────────────────────────┘
       ▲          ▲        ▲
       │          │        │
 ┌─────┴───┐ ┌────┴────┐ ┌─┴─────┐
 │학생1 인스턴스│ │학생2 인스턴스│ │학생3 인스턴스│  ← 각자 이름 다름
 │ name="철수" │ │ name="영희"│ │ name="민수" │
 └─────────┘ └─────────┘ └────────┘

📘 [3] 핵심 정리 표
| 구분         | 설명                      | 접근법                         |
| ---------- | ----------------------- | --------------------------- |
| 인스턴스 변수    | 객체(학생)마다 따로 갖는 변수       | `student1.name`             |
| static 변수  | 클래스가 하나만 갖는 공유 변수       | `StaticEx4.studentCount`    |
| 인스턴스 메서드   | 객체 생성 후에 `객체명.메서드()` 호출 | `student1.printInfo()`      |
| static 메서드 | 클래스명으로 바로 호출 가능         | `StaticEx4.showInfoTotal()` |

🧪 [4] 실행 흐름 보기
StaticEx4 student1 = new StaticEx4("철수");  // studentCount = 1
StaticEx4 student2 = new StaticEx4("영희");  // studentCount = 2
StaticEx4 student3 = new StaticEx4("민수");  // studentCount = 3

student1.printInfo();  // 출력: 이름 : 철수
student2.printInfo();  // 출력: 이름 : 영희
student3.printInfo();  // 출력: 이름 : 민수
StaticEx4.showInfoTotal();  // 출력: 총 학생수 : 3

🔍 주요 포인트
studentCount 변수는 static이라,
새로운 학생 객체가 만들어질 때마다 한 곳에서 증가함(공유됨)
학생 각각 이름(name)은 객체마다 따로 저장됨
showInfoTotal() 같은 static 메서드는 객체 없이 클래스명으로 바로 호출 가능

✨ 정리 그림
[ 학생 객체 student1 ]  name = "철수"
[ 학생 객체 student2 ]  name = "영희"
[ 학생 객체 student3 ]  name = "민수"

모두 공유하는 static 변수 studentCount = 3

객체명.printInfo() → 각자의 이름 출력
클래스명.showInfoTotal() → 전체 학생 수 출력

*/