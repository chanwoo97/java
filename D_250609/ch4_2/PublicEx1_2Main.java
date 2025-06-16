package D_250609.ch4_2;

import D_250609.ch4.PublicEx1;

public class PublicEx1_2Main {
    // 다른 패키지의 클래스
    public static void main(String[] args) {
        PublicEx1 publicEx1 = new PublicEx1();
        // 인스턴스명. 멤버를 조회시, 보이는 것은 public으로 선언된 멤버만 보임.
        publicEx1.email = "jcw@naver.com";
    }
}

/*
✅ [1] 핵심 개념: 패키지와 접근 지정자
패키지는 자바에서 폴더 같은 개념입니다.
예) D_250609.ch4 폴더
예) D_250609.ch4_2 폴더
다른 패키지에 있는 클래스를 사용하려면 import가 필요해요.
접근 지정자는 멤버(변수, 메서드)가 다른 클래스에서 보이고 접근할 수 있는지를 결정해요.
public : 어디서든 접근 가능
private : 같은 클래스 내에서만 접근 가능
protected : 같은 패키지 + 상속받은 클래스에서 접근 가능
default (아무것도 안 쓴 경우) : 같은 패키지 내에서만 접근 가능

🖼️ 그림으로 이해하기
[D_250609.ch4 폴더]                [D_250609.ch4_2 폴더]
┌───────────────┐             ┌───────────────────┐
│ PublicEx1     │             │ PublicEx1_2Main   │
│  - private name               │
│  - public email <---------- public 멤버만 보임
│  - default phone
│  - protected hobby
└───────────────┘             └───────────────────┘
PublicEx1_2Main은 D_250609.ch4_2 패키지에 있지만,
import D_250609.ch4.PublicEx1; 문장 덕분에
PublicEx1 클래스를 쓸 수 있어요.
그런데, PublicEx1 내부 멤버 중에서 public 으로 선언된 email만 접근 가능해요.
private, default, protected는 다른 패키지에서 보이지 않아요.

🔍 코드 동작 설명
PublicEx1 publicEx1 = new PublicEx1();
publicEx1.email = "jcw@naver.com"; // 가능! public이라서
// publicEx1.name = "홍길동";    // 오류! private 멤버라 접근 불가
// publicEx1.phone = "010-1234"; // 오류! default, 다른 패키지라 안 보임
// publicEx1.hobby = "독서";    // 오류! protected, 상속 관계도 아니고, 다른 패키지라 안 보임

요약 표
| 멤버 접근 지정자 | 같은 패키지    | 다른 패키지 (상속X) | 다른 패키지 (상속O) |
| --------- | --------- | ------------ | ------------ |
| public    | O         | O            | O            |
| private   | O(본인클래스만) | X            | X            |
| protected | O         | X            | O            |
| default   | O         | X            | X            |

*/
