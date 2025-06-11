package D_250611.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateutil {
    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");
        String result = now.format(formatter);
        return result;
    }
}
