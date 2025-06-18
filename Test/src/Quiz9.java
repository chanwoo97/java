import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");

        // 5개 나라와 인구 입력 받기
        for (int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String line = scanner.nextLine().trim();
            String[] parts = line.split("\\s+");

            if (parts.length != 2) {
                System.out.println("입력 형식이 올바르지 않습니다. 다시 입력하세요.");
                i--; // 다시 입력 받기 위해 인덱스 감소
                continue;
            }

            String country = parts[0];
            int population;

            try {
                population = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("인구는 숫자로 입력해야 합니다. 다시 입력하세요.");
                i--;
                continue;
            }

            nations.put(country, population);
        }

        // 가장 인구가 적은 나라 찾기
        String minCountry = null;
        int minPopulation = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : nations.entrySet()) {
            if (entry.getValue() < minPopulation) {
                minPopulation = entry.getValue();
                minCountry = entry.getKey();
            }
        }

        System.out.println("제일 인구가 적은 나라는 (" + minCountry + ", " + minPopulation + ")");
        scanner.close();
    }
}

/*
2. 흐름도
[프로그램 시작]
      |
      v
"나라 이름과 인구를 5개 입력하세요." 출력
      |
      v
반복문 5회 시작 (i=0부터 4까지)
      |
      v
나라 이름, 인구 입력 받음 (예: Korea 5000)
      |
      v
입력값이 "나라 이름"과 "인구" 두 개로 나눠졌는지 확인
  /           \
아니오          예
 |              |
"입력 형식 오류" 출력   인구가 숫자인지 검사
 |              |
i 감소, 다시 입력  숫자가 아니면 "인구 숫자 오류" 출력
                 i 감소, 다시 입력
                    |
                    v
                정상 입력이면 HashMap에 저장
      |
      v
반복 종료 후
      |
      v
HashMap에서 인구가 가장 적은 나라 찾기
      |
      v
"제일 인구가 적은 나라는 (나라, 인구)" 출력
      |
      v
[프로그램 종료]

3. 시각적 자료
입력 예시
| 나라 이름 | 인구    |
| ----- | ----- |
| Korea | 5000  |
| Japan | 4000  |
| China | 10000 |
| USA   | 3000  |
| India | 9000  |

HashMap 저장 상태
{Korea=5000, Japan=4000, China=10000, USA=3000, India=9000}

가장 인구가 적은 나라 찾기
| 나라 이름 | 인구    | 비교 결과                                                    |
| ----- | ----- | -------------------------------------------------------- |
| Korea | 5000  | minPopulation=5000, minCountry=Korea (초기값 업데이트)          |
| Japan | 4000  | 4000 < 5000, 업데이트 → minPopulation=4000, minCountry=Japan |
| China | 10000 | 10000 > 4000, 유지                                         |
| USA   | 3000  | 3000 < 4000, 업데이트 → minPopulation=3000, minCountry=USA   |
| India | 9000  | 9000 > 3000, 유지                                          |

4. 요점 정리
사용자가 5개의 나라와 인구를 입력한다.
입력값이 올바른지(나라명 1개 + 인구 1개 숫자) 확인하고, 틀리면 다시 입력 받는다.
모든 데이터를 HashMap에 저장한다.
입력이 끝나면 저장된 나라 중 인구가 가장 적은 나라를 찾아 출력한다.
Integer.MAX_VALUE는 비교할 때 아주 큰 값으로 초기 최소값으로 사용한다.

----------------------------------------------------------------------------------------------

코드 핵심 요약
HashMap<String, Integer>에 나라 이름과 인구 저장
입력 형식 체크 (공백 2개 분리, 인구는 숫자여야 함)
인구가 가장 적은 나라를 찾기 위해 Integer.MAX_VALUE로 초기화 후 반복 비교
최종적으로 최소 인구와 나라 출력

실행 흐름
사용자에게 나라 5개 입력 받기 (예: Korea 5000)
입력값을 공백 기준으로 분리, 예외 처리
nations에 저장
모든 나라 중 가장 적은 인구의 나라 탐색
결과 출력

예시 실행
나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)
나라 이름, 인구 >> Korea 5000
나라 이름, 인구 >> Japan 12000
나라 이름, 인구 >> China 13000
나라 이름, 인구 >> USA 10000
나라 이름, 인구 >> Canada 2000
제일 인구가 적은 나라는 (Canada, 2000)



*/