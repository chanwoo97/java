package util.date;

import java.time.LocalDateTime; // LocalDateTime : 날짜와 시간을 다루는 클래스
import java.time.format.DateTimeFormatter; // DateTimeFormatter : 지정한 날짜 형식으로 변환하는 클래스

public class DateUtil_doc {
    // 정적 메서드 추가, 현재 날짜와 시간을
    // 형식 : 2025년 05월 30일 오후 4시 35분 , 이런 형식의 데이터로 변환
    // 문자열 형태로 반환하는 메소드 만들기.
    public static String getCurrentDateTime() {
        // 현재 날짜를 알려주는 클래스 : LocalDateTime 이용하기.
        // 방법1) 정적인 형태.
        // [클래스명] [변수명] = [클래스명].[정적 메서드]();
        LocalDateTime now = LocalDateTime.now(); // 현재 날짜와 시간 가져오기

        // 사용자 정의한 포맷 모양으로 변환하기.
        // 형식 : 2025년 05월 30일 오후 4시 35분 , 이런 형식의 데이터로 변환
        // DateTimeFormatter : 특정의 날짜와 형식으로 변환 해주는 기능.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");
        // 반환하기.
        return now.format(formatter); // 포맷을 적용하여 문자열로 변환하여 반환
        // 방법2) 인스턴스 형태로, 객체를 생성해서, 메서드 호출하기.
        // [클래스명] [변수명] = new [클래스명]();

    }

}


/*
1. 클래스 역할
날짜와 시간을 특정 형식의 문자열로 변환해서 알려주는 기능을 모아둔 도구 상자입니다.

여기서는 현재 날짜와 시간을 "2025년 05월 30일 오후 4시 35분" 같은 한글 형식으로 보여주는 기능을 만듭니다.

2. 주요 사용 클래스
| 클래스명                | 역할                               |
| ------------------- | -------------------------------- |
| `LocalDateTime`     | 현재 날짜와 시간을 가져오는 자바 표준 클래스        |
| `DateTimeFormatter` | 날짜와 시간을 우리가 원하는 모양(포맷)으로 바꾸는 클래스 |

3. 메서드 설명: getCurrentDateTime()
public static String getCurrentDateTime() {
    LocalDateTime now = LocalDateTime.now();  // 1) 현재 날짜와 시간 가져오기

    // 2) 날짜 시간 포맷 지정: "yyyy년 MM월 dd일 a h시 m분"
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");

    // 3) 현재 날짜/시간을 지정한 포맷으로 변환 후 문자열로 반환
    return now.format(formatter);
}
세부 설명:
LocalDateTime.now() :
지금 이 순간의 날짜와 시간을 가져옵니다.

DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분") :
날짜와 시간을 어떻게 보여줄지 정합니다.

yyyy : 4자리 연도 (예: 2025)

MM : 2자리 월 (01~12)

dd : 2자리 일 (01~31)

a : 오전/오후 표시 (AM/PM 대신 한글로 오전/오후 출력)

h : 12시간 형식의 시간 (1~12)

m : 분 (0~59)

now.format(formatter) :
현재 시간 정보를 위에 정한 형식대로 변환해 문자열로 만듭니다.

4. 사용법 예시
String currentDateTime = DateUtil_doc.getCurrentDateTime();
System.out.println(currentDateTime);
출력 결과 예시:
2025년 06월 13일 오후 4시 35분

비유로 이해하기
LocalDateTime은 시계와 같습니다. 지금 시간을 알려줍니다.

DateTimeFormatter는 디자이너입니다. 시계에서 가져온 시간을 예쁘고 보기 좋은 형식으로 꾸며 줍니다.

getCurrentDateTime()는 이 둘을 사용해서 현재 시간을 꾸며준 결과물을 돌려주는 작업자입니다.

전체 흐름 그림
rust
복사
편집
[현재 시간 요청] ---> LocalDateTime.now() --> 현재 날짜와 시간 정보 획득
                         |
                         V
         DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분")  (형식 지정)
                         |
                         V
         현재 시간 정보에 형식 적용 (format)
                         |
                         V
        결과 문자열 생성 -> "2025년 06월 13일 오후 4시 35분"
                         |
                         V
                 호출자에게 반환

*/