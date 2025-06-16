package D_250609.ch4;

public class PublicEx1Main {
    public static void main(String[] args) {
        // 같은 패키지의 클래스
        // 클래스, 활용 1) 인스턴스 만들기 / 2) 생성자를 이용해서 초기화 하는 방법
        // [클래스명] [인스턴스 변수명] = new [클래스명]();
        // 생정자 : [클래스명]() "기본생성자"
        PublicEx1 publicEx1 = new PublicEx1();
        // 게터 세터를 사용하기 전에 직접 접근으로 알아보고,
        // 직접 접근은 인스턴스의 점(.)을 이용해서, 해당 멤버 변수에 접근.
        // 예) publicEx1.[멤버 변수명], 접근하기.
        publicEx1.email = "jcw@naver.com"; // 접근시, private 제외한 나머지 멤버는 보인다.
        publicEx1.hobby = "조깅";
        publicEx1.phone = "01034456223";
        publicEx1.showInfo();
    }    
}

/*
✅ [1] 쉬운 설명
이 코드는 뭘 하나요?
PublicEx1 클래스를 기반으로 객체(인스턴스)를 하나 생성
생성된 객체의 멤버 변수(email, hobby, phone)에 직접 값을 넣음
showInfo() 메서드를 호출해 모든 값을 출력

❗ 중요한 포인트
publicEx1.email = "jcw@naver.com"; // ✅ 가능: public
publicEx1.hobby = "조깅";           // ✅ 가능: protected (같은 패키지라서 OK)
publicEx1.phone = "01034456223";   // ✅ 가능: default (같은 패키지 OK)
// publicEx1.name = "홍길동";      // ❌ 오류: private이라서 외부 접근 불가

🖼️ [2] 클래스 구조 그림으로 보기
┌─────────────────────────────┐
│         PublicEx1           │
├─────────────┬───────────────┤
│ private     │ name          │ ❌ 외부에서 접근 불가 (숨김)
│ public      │ email         │ ✅ 외부에서 접근 가능
│ default     │ phone         │ ✅ 같은 패키지에서 접근 가능
│ protected   │ hobby         │ ✅ 같은 패키지 or 자식 클래스 접근 가능
├─────────────┴───────────────┤
│ public void showInfo()      │ 정보 전체 출력
└─────────────────────────────┘

📘 [3] 접근 가능 여부 요약표
| 접근자         | 같은 클래스 | 같은 패키지 | 다른 패키지 | 자식 클래스 |
| ----------- | ------ | ------ | ------ | ------ |
| `private`   | ✅      | ❌      | ❌      | ❌      |
| `default`   | ✅      | ✅      | ❌      | ❌      |
| `protected` | ✅      | ✅      | ❌      | ✅      |
| `public`    | ✅      | ✅      | ✅      | ✅      |
→ 지금 이 예제는 같은 패키지이기 때문에,
public, default, protected는 모두 접근 가능
하지만 private은 직접 접근 ❌

🧪 [4] 실행 흐름 보기
PublicEx1 publicEx1 = new PublicEx1();
publicEx1.email = "jcw@naver.com";
publicEx1.hobby = "조깅";
publicEx1.phone = "01034456223";
publicEx1.showInfo();

📤 출력 결과
이름: null
이메일: jcw@naver.com
전화번호: 01034456223
취미: 조깅

🔍 왜 이름은 null일까요?
name은 private이라 외부에서 값을 넣을 수 없고,
생성자도 없기 때문에 기본값인 null이 출력됩니다.

🎓 마무리 요약
클래스 외부에서 직접 멤버 변수에 접근할 수 있는지는 접근 지정자에 따라 다릅니다.
private은 외부 접근 ❌ → 대신 Getter/Setter 사용 필요.
public, default, protected는 같은 패키지 안에서는 대부분 접근 가능합니다.

✨ 정리 그림
[ PublicEx1Main 클래스 ] ────────► 접근
         ↓                            ↓
    public      ✅ 접근 가능
    default     ✅ 같은 패키지 OK
    protected   ✅ 같은 패키지 OK
    private     ❌ 직접 접근 불가 (Getter 필요)

*/