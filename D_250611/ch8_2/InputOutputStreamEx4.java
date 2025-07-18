package D_250611.ch8_2;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputOutputStreamEx4 {
    public static void main(String[] args) {
        // 변경 전
        // try (FileInputStream fis = new FileInputStream("test.txt")) {}
        // 변경 후
        // InputStreamReader reader = new InputStreamReader (매개변수1, 매개변수2)
        // 매개변수1 -> 읽은 데이터(바이트단위)
        // 매개변수2 -> 변환 할 데이터 인코딩 타입
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("test.txt"),
                StandardCharsets.UTF_8)) {
            int data;
            // 변경 전
            // while ((data = fis.read()) != -1) {}
            // 변경 후
            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 한글 안깨지게, UTF-8 중간 데이터 타입을 이용해서, 출력해보기.
// UTF-8 란?
// Unicode Transformation Format 8 bit ( 1바이트 = 8비트 )
// 1 ~ 4 바이트로 하나의 문자를 표현,
// ASCII(아스키 코드)와 호환
// U+0000 ~ U+007F (ASCII)
// 가변 길이이고, 전세계 언어를 지원, 웹 표준
// EUC-KR, 한글 전용, 국내 한정, 국제화 미흡
// ISO-8859-1 : 서유럽 문자 전용, 한글 불가.
