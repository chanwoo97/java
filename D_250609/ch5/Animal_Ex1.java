package D_250609.ch5;

public class Animal_Ex1 { // 부모 클래스
    // 1) 가은 패키지  2) 상속 받은 클래스에서만 접근
    protected String name; // protected -> 같은 패키지 또는 상속 관계 클래스에서만 접근 가능.
    
    public void speak() {
        System.out.println("동물 소리를 냅니다.");
    }

    // 화면에 안보이지만, 기본 생성자 생력이 된 상태.
    // 매개변수가 있는 생성자를 만들 경우에는, 기본 생성자를 더이상 지원을 안해줌.
    public Animal_Ex1() {
        super(); // 모든 클래스는 Object 클래스를 상속받음.
    }

    // 매개변수가 1개인 생성자.
    public Animal_Ex1(String name) {
        this.name = name;
    } 

}


/*
✅ [1] 코드 주요 내용 쉽게 설명
1) 클래스명과 역할
Animal_Ex1 클래스는 부모 클래스 (동물의 기본 특징을 정의)입니다.

2) 멤버 변수 name
protected String name;

protected는 같은 패키지 혹은 상속받은 자식 클래스에서만 접근 가능하다는 뜻입니다.
외부나 다른 패키지의 일반 클래스에서는 직접 접근할 수 없어요.

3) 메서드 speak()
동물이 내는 소리를 출력하는 메서드입니다.

여기서는 "동물 소리를 냅니다." 문장을 출력하도록 되어있어요.

4) 생성자
기본 생성자 Animal_Ex1()는 특별한 작업 없이 부모 클래스(Object) 생성자를 호출합니다.

Animal_Ex1(String name) 생성자는 이름을 받아서, name 멤버 변수에 저장합니다.

🖼️ 그림으로 이해하기
부모 클래스: Animal_Ex1
----------------------
| protected String name; |  <-- 상속받은 클래스만 접근 가능
|                       |
| public void speak()    |  <-- 모두가 사용할 수 있는 기능
|                       |
| 생성자 2개 있음         |
----------------------
상속 클래스에서 name 사용 가능!
다른 클래스에서는 name 직접 접근 불가!

접근 권한 정리
| 멤버               | 설명                          | 어디서 접근 가능?                         |
| ---------------- | --------------------------- | ---------------------------------- |
| `protected name` | 같은 패키지 + 상속 관계인 클래스에서 접근 가능 | `Animal_Ex1`와 같은 패키지 or 상속받은 클래스   |
| `public speak()` | 모두 접근 가능                    | 어디서든 접근 가능                         |
| 생성자들             | 객체 생성시 호출 가능                | 어디서든 접근 가능 (접근 지정자가 `public`이기 때문) |

간단한 예시
Animal_Ex1 animal = new Animal_Ex1("강아지");
animal.speak(); // "동물 소리를 냅니다." 출력
// animal.name = "고양이"; // 오류! name은 protected라서 직접 접근 불가

*/