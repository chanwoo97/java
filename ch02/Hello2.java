package ch02;

public class Hello2 {
    public static int mul(int n, int m) {
        return n * m;
    }
    public static void main(String[] args) {
        int result2 = mul(10, 20);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

    }
}
// 퀴즈1 ,
// 정적 메소드 하나 만들어서, 곱하기 기능으로 사용하기,
// result2 에 담아서, 출력해보기