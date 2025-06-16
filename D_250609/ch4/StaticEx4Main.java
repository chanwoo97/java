package D_250609.ch4;

public class StaticEx4Main {
    public static void main(String[] args) {
        // 예시) 인스턴스 3개 생성 후, 생성된 전체 숫자 확인
        StaticEx4 staticEx4_1 = new StaticEx4("정찬우1"); 
        // 전체 숫자 확인
        System.out.println("총 수 확인: ");
        StaticEx4.showInfoTotal();
        
        StaticEx4 staticEx4_2 = new StaticEx4("정찬우2");
        System.out.println("총 수 확인: ");
        StaticEx4.showInfoTotal();
        
        StaticEx4 staticEx4_3 = new StaticEx4("정찬우3");
        System.out.println("총 수 확인: ");
        StaticEx4.showInfoTotal();
    }
}


/*
✅ [1] 쉽게 설명
1.StaticEx4 클래스의 생성자에 이름을 넣어서 staticEx4_1, staticEx4_2, staticEx4_3 이렇게 3개의 학생 객체를 만듭니다.
2.객체가 만들어질 때마다 studentCount라는 공유 변수가 1씩 증가합니다.
3.StaticEx4.showInfoTotal()을 호출해서, 지금까지 만들어진 학생 객체 총 수를 출력합니다.

📊 실행 흐름과 출력 결과
| 실행 순서                                            | studentCount 값 | 출력 내용       |
| ------------------------------------------------ | -------------- | ----------- |
| `StaticEx4 staticEx4_1 = new StaticEx4("정찬우1");` | 1              | "총 수 확인:"   |
| `StaticEx4.showInfoTotal();`                     | 1              | "총 학생수 : 1" |
| `StaticEx4 staticEx4_2 = new StaticEx4("정찬우2");` | 2              | "총 수 확인:"   |
| `StaticEx4.showInfoTotal();`                     | 2              | "총 학생수 : 2" |
| `StaticEx4 staticEx4_3 = new StaticEx4("정찬우3");` | 3              | "총 수 확인:"   |
| `StaticEx4.showInfoTotal();`                     | 3              | "총 학생수 : 3" |

🖼️ 그림으로 보기
시작: studentCount = 0

1) 객체 생성 - 정찬우1
   studentCount → 1

2) 객체 생성 - 정찬우2
   studentCount → 2

3) 객체 생성 - 정찬우3
   studentCount → 3

출력 시점마다 클래스 공유 변수 studentCount 값이 변함.

정리
studentCount는 클래스 단위로 하나만 존재해서
StaticEx4 클래스로 만들어진 모든 객체가 이 값을 공유합니다.

새 객체가 만들어질 때마다 studentCount++가 실행돼서 학생 수가 1씩 늘어납니다.

showInfoTotal()은 클래스명으로 바로 호출하는 static 메서드로, 현재 학생 수를 알려줍니다.

*/