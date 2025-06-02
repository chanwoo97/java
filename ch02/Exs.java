package ch02;

public class Exs {
    // 정적 메서드 이용
    // 확인 상황, 파이널, 상수 확인 및 원 면적 구하는 기능.
    // 반지름을 매개변수로 받고, 원의 면적을 문자열 타입으로 받환하는 형태.
    public static String getCircleArea(double radius) {
        final double PI = 3.14159; // 원주율 상수
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        // PI = 3.14159123412; // 상수는 재할당 불가, 컴파일 에러 발생
        double area = PI * radius * radius; // 원의 면적 계산
        // String.format , 기본 옵션
        // 소수점 둘째 자리까지 출력
        // %.2f : 소수점 둘째 자리까지 출력 -> radius
        // %.2f : 소수점 둘째 자리까지 출력 -> area
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }

    // 타입 변환
    public static void getTypeExam() {
        long num1 = 100L; // long 타입 변수, 8바이트
        long num2 = 100; // 왼쪽 : 받는 타입 롱타입 8바이트, 오른쪽 : 정수형 int 타입 4바이트
        // int 타입 100을 long 타입으로 형변환 -> 자동 형변환
        // 작은 쪽 -> 큰 쪽으로 형변환 시에만 문제가 안됨.
    
        // 반대로, 큰 쪽에서 작은 쪽으로 형변환 시에는, 강제로 형변환 해야함
        byte num3 = 127; // 128은 byte 타입의 범위를 벗어남
        int num4 = 128;
        // 강제로 행변환, int num4 -> 강제로 byte 타입으로 변환
        // 값의 손실이 발생하거나, 정상적인 출력이 안나옴.
        // 예시로 확인만 하면됨.
        byte num5 = (byte)num4;
        System.out.println("num5:" + num5);

        
        // return "곧 결과 반환 하거나 출력만 할 예정."
    }

}
