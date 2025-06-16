package D_250609.ch5_3;

public class GalaxyEx1_3 extends PhoneEx1_2 {
    // 자식 클래스

    private String logo;

    public void logoInfo() {
        System.out.println("로고 모양 : " + logo);
    }

    // getter 만들고,
    public String getLogo() {
        return logo;
    }
    
    // 생성자 만들기. 우클릭으로 반자동으로 만들기 중.
    public GalaxyEx1_3(String company, String name, String price, String logo) {
        super(company, name, price);
        this.logo = logo;
    }
}


/*
🧠 1. 역할 요약
| 클래스 이름        | 역할 설명                             |
| ------------- | --------------------------------- |
| `PhoneEx1_2`  | 부모 클래스 (공통적인 휴대폰 정보: 회사, 모델명, 가격) |
| `GalaxyEx1_3` | 자식 클래스 (갤럭시 전용 기능인 `logo` 필드 추가)  |

🖼️ 2. 클래스 구조 그림
클래스 상속 구조
──────────────────────────────────────────────
PhoneEx1_2 (부모 클래스)
│  - company: String
│  - name: String
│  - price: String
│  + 생성자: PhoneEx1_2(company, name, price)
│
▼ 상속 (extends)
GalaxyEx1_3 (자식 클래스)
│  - logo: String
│  + logoInfo(): 로고 출력
│  + getLogo(): 로고 반환
│  + 생성자: GalaxyEx1_3(company, name, price, logo)
──────────────────────────────────────────────

✅ 3. 코드 설명 (주석처럼)
public class GalaxyEx1_3 extends PhoneEx1_2 { // 부모인 PhoneEx1_2로부터 상속받음

    private String logo; // Galaxy만의 고유 속성

    public void logoInfo() {
        // 로고 정보를 출력하는 메서드
        System.out.println("로고 모양 : " + logo);
    }

    public String getLogo() {
        // 로고를 반환하는 getter
        return logo;
    }

    // 생성자: 4개의 값을 받아 초기화
    public GalaxyEx1_3(String company, String name, String price, String logo) {
        super(company, name, price); // 부모 클래스의 필드 초기화
        this.logo = logo;            // 자식 클래스의 필드 초기화
    }
}

✅ 4. 사용 예 (메인에서 실행해 보기)
public class GalaxyMain {
    public static void main(String[] args) {
        GalaxyEx1_3 phone = new GalaxyEx1_3("삼성", "갤럭시S25", "120만원", "은하수 로고");

        phone.logoInfo(); // 출력: 로고 모양 : 은하수 로고

        System.out.println("로고 조회: " + phone.getLogo());
    }
}

실행 결과:
로고 모양 : 은하수 로고
로고 조회: 은하수 로고

🧩 5. 추가 팁: super()가 뭐죠?
super(...)는 부모 클래스의 생성자를 호출할 때 사용합니다.

여기선 PhoneEx1_2(company, name, price)를 호출해서 부모의 필드도 함께 초기화하는 것이죠.

✅ 핵심 요약 한 줄
GalaxyEx1_3은 PhoneEx1_2를 상속받아,
휴대폰 정보 + 갤럭시만의 고유 정보(logo)까지 추가한 자식 클래스입니다!
*/