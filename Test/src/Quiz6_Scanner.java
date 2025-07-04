import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 불러오기

public class Quiz6_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드 입력을 받을 Scanner 객체 생성

        while (true) { // 무한 반복 (사용자가 종료할 때까지 계속)
            String line = scanner.nextLine().trim(); // 한 줄 입력 받고, 앞뒤 공백 제거(trim)

            if (line.equals("exit")) { // 입력한 내용이 "exit"이면 종료
                System.out.println("종료합니다...");
                break; // 반복문 종료 (프로그램 종료)
            }

            // 입력 문자열을 ',' 콤마 기준으로 나누기 (split)
            String[] parts = line.split(",");

            // 나눈 문자열 중 공백만 있는 빈 문자열은 빼고 실제 어절(단어) 개수 세기
            int count = 0; // 어절 개수를 저장할 변수 초기화
            for (String part : parts) { // 분리된 문자열 각각에 대해 반복
                if (!part.trim().isEmpty()) { // 앞뒤 공백 제거 후 빈 문자열이 아니면
                    count++; // 어절 개수 1 증가
                }
            }

            System.out.println("어절 개수는 " + count); // 결과 출력
        }

        scanner.close(); // Scanner 객체 닫기 (자원 해제)
    }
}


/*
2. 이해를 돕는 그림과 흐름도
사용자가 입력한 문자열 예시
입력:  사과, 바나나,  , 딸기 , , 오렌지

line.split(",") 결과 → 배열 parts:
[ "사과", " 바나나", "  ", " 딸기 ", " ", " 오렌지" ]

각 요소를 trim() 해서 빈 문자열 아닌 것만 세면:
"사과"       → "사과"      → 카운트++
" 바나나"    → "바나나"    → 카운트++
"  "        → ""         → 무시
" 딸기 "     → "딸기"     → 카운트++
" "         → ""         → 무시
" 오렌지"    → "오렌지"    → 카운트++
총 어절 개수: 4

흐름도
[시작]
   |
   v
한 줄 입력 받음 (ex: "사과, 바나나,  , 딸기 , , 오렌지")
   |
   v
입력값이 "exit"인가? --- 예 ---> [종료 메시지 출력 후 종료]
       |
       아니오
       |
   문자열을 콤마(,)로 나누기
       |
       v
  각 부분마다
  앞뒤 공백 제거 후 빈 문자열 아니면
  개수 세기
       |
       v
개수 출력 ("어절 개수는 x")
       |
       v
[다시 입력 받으러 반복]


3. 주요 포인트 정리
Scanner는 키보드에서 한 줄씩 입력받는 역할을 해요.

split(",")은 입력된 문자열을 콤마로 나눠서 배열로 만듭니다.

빈 문자열이나 공백만 있는 부분은 세지 않아요.

exit를 입력하면 프로그램이 종료됩니다.

---------------------------------------------------------------------------

🧾 Quiz6_Scanner – 쉽게 이해하는 흐름
📌 프로그램의 목적
사용자로부터 문장을 입력받고, 콤마(,)로 나누어 나온 단어(어절)의 개수를 세어 출력
단, 공백( )만 있는 항목은 제외
"exit"을 입력하면 프로그램 종료

📊 실행 흐름 요약 다이어그램
┌──────────────────────────────┐
│ 사용자 입력을 받음           │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ "exit"이면 종료               │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ 콤마(,)로 나누어 배열로 저장   │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ 각 항목에서 공백 제거 후 검사 │
│ (빈 항목은 무시)              │
└────────────┬─────────────────┘
             ▼
┌──────────────────────────────┐
│ 실제 어절 개수(count) 출력   │
└──────────────────────────────┘

🧠 핵심 개념 정리
| 개념             | 쉬운 설명                     |
| -------------- | ------------------------- |
| `Scanner`      | 사용자 입력을 받는 도구             |
| `while (true)` | 사용자가 종료할 때까지 반복하는 무한 루프   |
| `split(",")`   | 문자열을 콤마(,) 기준으로 잘라 배열로 나눔 |
| `trim()`       | 문자열 앞뒤 공백 제거              |
| `isEmpty()`    | 문자열이 완전히 비었는지 확인          |
| `"exit"`       | 종료 명령어로 사용됨               |

📌 예제 사용 예
✅ 입력 1 : apple, banana,  melon
(※ 공백도 포함되지만 trim 처리됨)
👉 출력:어절 개수는 3

✅ 입력 2 : java, ,python ,  , c++
👉 출력:어절 개수는 3
빈 값(콤마 사이 아무 내용 없는 항목)은 무시됨

✅ 입력 3:exit
종료합니다...

📦 시각화 – 배열 분해 모습
java, ,python

split() 결과 배열:
┌───────┬────────┬──────────┐
│ "java"│ " "    │ "python" │
└───────┴────────┴──────────┘
trim 후:
┌───────┬────────┬──────────┐
│ "java"│ ""     │ "python" │
└───────┴────────┴──────────┘
count: 2










*/