package D_250610.ch6_2;

import java.util.StringTokenizer;

public class StringTokenizer_Ex {
    // 문자열을 구분자 기준으로 나누는 방법.
    // 기본 문법
    // 자주 사용하는 옵션
    // 1) hasMoreTokens() : 다음 토큰(문자)이 있는지 여부
    // 2) nextToken() : 다음 토큰(문자) 반환(꺼내기)
    
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("사과, 배, 바나나, 포도", ", ");
        // String [] st = {"사과", "배", "바나나", "포도"}
        while (st.hasMoreTokens()) {
            System.out.println("구분자로 나누어진 배열에서 하나씩 꺼내서 확인하기 : " + st.nextToken());

        }
    }
}
