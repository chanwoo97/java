package util.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");
        String result = now.format(formatter);
        return result;
    }

}


/*
✅ 1. 클래스 이름: DateUtil
"Date(날짜) + Util(유틸리티 도구)" → 날짜 관련 기능을 도와주는 도구 클래스
이 클래스 안에는 현재 시간을 예쁘게 포맷팅해서 문자열로 반환하는 메서드가 하나 있어요.

✅ 2. 메서드 이름: getCurrentDateTime()
public static String getCurrentDateTime() {
public: 어디서든 사용 가능

static: 객체를 만들지 않고도 바로 사용 가능 (DateUtil.getCurrentDateTime()처럼)
String: 문자열을 반환함
getCurrentDateTime(): 현재 날짜와 시간을 가져오는 기능

✅ 3. 내부 동작 흐름
LocalDateTime now = LocalDateTime.now();
📍 현재 날짜와 시간 정보를 가져옴
예: 2025-06-13T16:43:00.123456

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");
📍 출력 형식 지정
yyyy: 연도
MM: 월
dd: 일
a: 오전/오후
h: 시 (12시간제)
m: 분
예: 2025년 06월 13일 오후 4시 43분

String result = now.format(formatter);
📍 현재 시간(now)을 위에서 지정한 형식대로 문자열로 변환함
return result;
📍 최종 결과 문자열을 반환함
💡 사용 예시 (메인 메서드 예)
public class TestDate {
    public static void main(String[] args) {
        String now = DateUtil.getCurrentDateTime();
        System.out.println("현재 시간은: " + now);
    }
}
🖨️ 출력 예:
현재 시간은: 2025년 06월 13일 오후 4시 43분
📌 전체 흐름 그림 (비전공자용)
[DateUtil 클래스]
     ↓
(getCurrentDateTime 메서드 호출)
     ↓
[현재 날짜와 시간 얻기]
     ↓
[출력 형식 설정 → "yyyy년 MM월 dd일 a h시 m분"]
     ↓
[지정한 형식대로 날짜를 문자열로 변환]
     ↓
[결과 문자열 반환]
     ↓
예: "2025년 06월 13일 오후 4시 43분"

*/