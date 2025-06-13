package util.date;

public class DateUtilMain {
    public static void main(String[] args) {
        System.out.println("현재 시간을 불러오는 기능 확인.");
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("현재 시간: " + currentTime);
    }
}


/* 
✅ 1. 클래스 이름: DateUtilMain
Main이라는 이름이 붙었으니까, 이 클래스는 **실행(entry point)**을 담당하는 클래스예요.
즉, 프로그램을 실행하면 main() 메서드부터 시작됨.

✅ 2. 메인 메서드 설명
public static void main(String[] args) {
자바 프로그램의 시작점
여기서 코드가 실행되기 시작함

✅ 3. 코드 설명 줄줄이 보기
System.out.println("현재 시간을 불러오는 기능 확인.");
🗨️ 설명 메시지 출력 → 실행 전에 안내용 메시지를 출력해줍니다.

String currentTime = DateUtil.getCurrentDateTime();
📌 핵심 기능

DateUtil.getCurrentDateTime() 메서드를 호출해서 현재 시간을 문자열로 받아옵니다.

static 메서드이기 때문에 DateUtil 클래스 이름만으로 호출 가능

System.out.println("현재 시간: " + currentTime);
📌 실제로 시간 출력

위에서 받아온 현재 시간을 사용자에게 보여줍니다.

🖨️ 실행 시 결과 예시
현재 시간을 불러오는 기능 확인.
현재 시간: 2025년 06월 13일 오후 5시 12분
이 결과는 컴퓨터의 현재 시각을 기준으로 하며, 실행할 때마다 바뀜.

🧭 전체 흐름 그림 (한눈에 보기)
[DateUtilMain 클래스 실행]
        ↓
출력: "현재 시간을 불러오는 기능 확인."
        ↓
[DateUtil.getCurrentDateTime() 호출]
        ↓
[현재 날짜와 시간 가져오기]
        ↓
[예쁜 형식으로 문자열 변환]
        ↓
반환된 문자열 저장 → currentTime
        ↓
출력: "현재 시간: " + currentTime

✅ 정리
DateUtil은 도구 클래스 (날짜와 시간 기능 제공)

DateUtilMain은 실행 클래스 (테스트 및 출력용)

static 메서드는 객체 생성 없이 바로 사용 가능

날짜 형식은 yyyy년 MM월 dd일 a h시 m분 형식으로 보기 편하게 구성됨


*/