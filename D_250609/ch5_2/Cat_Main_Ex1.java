package D_250609.ch5_2;

public class Cat_Main_Ex1 { // 실행 클래스이지, 자식 클래스가 아님.
    public static void main(String[] args) {
        // 인스턴스 생성, 기본 생성자 호출, 초기화 했음 => 다 같은말
        Cat_Ex1 cat_Ex1 = new Cat_Ex1(); 
        cat_Ex1.favoriteFood = "소세지";
        cat_Ex1.showInfo();
        
        // 2번째 인스턴스 생성.
        Cat_Ex1 cat_Ex2 = new Cat_Ex1("야옹님", "햄"); 
        cat_Ex2.showInfo();
        // 결론, 접근 지정자 protected는  상속 받은 자식 클래스에서, 접근이 가능하다, 또는 같은 패키지 이거나
        // cat_Ex2.name = "이름 수정, 다른 외부 클래스에 접근 시도";
    }
}



/*
🧠 1. 이 코드에서 하는 일
| 순서  | 동작 설명                                                     |
| --- | --------------------------------------------------------- |
| 1️⃣ | `Cat_Ex1 cat_Ex1 = new Cat_Ex1();` 기본 생성자 사용해서 고양이 만들기    |
| 2️⃣ | `cat_Ex1.favoriteFood = "소세지";` 고양이가 좋아하는 음식 직접 설정        |
| 3️⃣ | `cat_Ex1.showInfo();` 정보 출력: 좋아하는 음식                      |
| 4️⃣ | `Cat_Ex1 cat_Ex2 = new Cat_Ex1("야옹님", "햄");` 이름과 음식 모두 설정 |
| 5️⃣ | `cat_Ex2.showInfo();` 이름은 내부에 출력 코드가 없으므로, 음식만 출력됨        |

🖼️ 구조 그림
클래스 관계 및 실행 흐름
─────────────────────────────────────────────
Animal_Ex1 (부모 클래스)
  ▲
  │ 상속
Cat_Ex1 (자식 클래스)
  - protected String name     ← 부모로부터 상속
  - String favoriteFood       ← 자식 고유
  - showInfo(): 음식 출력

Cat_Main_Ex1 (실행 클래스)
  - cat_Ex1 = new Cat_Ex1()
      └ cat_Ex1.favoriteFood = "소세지"
      └ cat_Ex1.showInfo() → "소세지"
  - cat_Ex2 = new Cat_Ex1("야옹님", "햄")
      └ cat_Ex2.showInfo() → "햄"
─────────────────────────────────────────────

💡 2. 중요한 개념들
| 개념                      | 설명                                                                   |
| ----------------------- | -------------------------------------------------------------------- |
| `protected name`        | `Cat_Ex1`(자식 클래스)에서는 사용 가능하지만 `Cat_Main_Ex1`(외부 클래스)에서는 직접 접근 **불가** |
| `.favoriteFood = "소세지"` | `favoriteFood`는 **default 접근제한자** (접근 가능)                            |
| `.showInfo()`           | 고양이가 좋아하는 음식 출력                                                      |

✅ 출력 결과
좋아하는 음식 : 소세지
좋아하는 음식 : 햄

📌 여기서는 name을 출력하지 않았기 때문에 이름 정보는 안 나옵니다.
→ 만약 출력하고 싶다면, Cat_Ex1의 showInfo()를 다음처럼 바꾸면 돼요:
public void showInfo() {
    System.out.println("이름 : " + name); // protected이므로 자식 클래스에서는 접근 가능
    System.out.println("좋아하는 음식 : " + favoriteFood);}

🔒 접근 제어자 복습표
| 키워드         | 같은 클래스 | 같은 패키지 | 상속한 자식 클래스 | 외부 클래스 |
| ----------- | ------ | ------ | ---------- | ------ |
| `public`    | ✅ 가능   | ✅ 가능   | ✅ 가능       | ✅ 가능   |
| `protected` | ✅ 가능   | ✅ 가능   | ✅ 가능       | ❌ 불가능  |
| (default)   | ✅ 가능   | ✅ 가능   | ❌ 불가능      | ❌ 불가능  |
| `private`   | ✅ 가능   | ❌ 불가능  | ❌ 불가능      | ❌ 불가능  |

✅ 요약 한 줄
Cat_Main_Ex1은 Cat_Ex1 클래스를 이용해 고양이 인스턴스를 만들고,
고양이의 좋아하는 음식만 출력하는 실행 클래스입니다.
name은 protected라서 외부에서는 직접 접근할 수 없어요!

*/