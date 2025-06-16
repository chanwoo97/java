package D_250609.ch5;

public class InheritanceMain_Ex1 {
    public static void main(String[] args) {
        // A a = new A(); -> 인스턴스 생성
        Dog_Ex1 dog_Ex1 = new Dog_Ex1();
        dog_Ex1.speak();
        System.out.println("-----------------------------------------");
        // 2번째 멍멍이 인스턴스
        Dog_Ex1 dog_Ex2 = new Dog_Ex1("진돗개", "한국");
        dog_Ex2.showInfo();
    }
}

/*
✅ 1. 코드 흐름 설명
// 1단계: 기본 생성자로 Dog_Ex1 객체 만들기
Dog_Ex1 dog_Ex1 = new Dog_Ex1(); 
dog_Ex1.speak(); // 오버라이딩된 메서드 실행: "난 멍멍이야, 그래서 멍멍할게"

// 구분선 출력
System.out.println("-----------------------------------------");

// 2단계: 이름과 나라를 넣은 생성자로 객체 만들기
Dog_Ex1 dog_Ex2 = new Dog_Ex1("진돗개", "한국");
dog_Ex2.showInfo(); // 이름: 진돗개 / 나라: 한국

🖼️ 2. 그림으로 구조 정리
클래스 구조
─────────────────────────────
Animal_Ex1 (부모 클래스)
- protected String name;
- public void speak() → "동물 소리를 냅니다."

Dog_Ex1 (자식 클래스) extends Animal_Ex1
- private String nation;
- @Override speak() → "난 멍멍이야, 그래서 멍멍할게"
- showInfo() → name + nation 출력

─────────────────────────────

main 실행
─────────────────────────────
1) new Dog_Ex1()
   - speak() 실행 → "난 멍멍이야, 그래서 멍멍할게"

2) new Dog_Ex1("진돗개", "한국")
   - name = "진돗개" (부모한테 전달)
   - nation = "한국"
   - showInfo() 실행 →
     이름 : 진돗개
     나라 : 한국

📌 3. 실행 결과
난 멍멍이야, 그래서 멍멍할게
-----------------------------------------
이름 : 진돗개
나라 : 한국

🧠 4. 핵심 복습
| 항목             | 설명                              |
| -------------- | ------------------------------- |
| `extends`      | `Dog_Ex1`이 `Animal_Ex1`을 상속받음   |
| `@Override`    | 부모의 `speak()` 메서드를 자식이 다시 정의함   |
| `super(name)`  | 부모 생성자 호출 → `name` 값 전달         |
| `protected` 접근 | 부모의 `name`은 자식 클래스에서 직접 사용 가능   |
| `showInfo()`   | `name`(상속) + `nation`(자식 고유) 출력 |

✅ 요약 한 줄!
Dog_Ex1은 Animal_Ex1의 기능을 상속받고, speak() 기능을 자식답게 바꾸고,
추가 정보(nation) 도 관리하는 "강아지 클래스" 입니다.
메인에서는 이걸 두 가지 방식(기본생성자, 매개변수 생성자) 으로 만들어서 출력한 거예요!

*/