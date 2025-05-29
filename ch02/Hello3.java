package ch02;

public class Hello3 {
    public static int sub(int n, int m) {
        return n - m;
    }
    public static void main(String[] args) {
        int result3 = sub(20, 10);
        System.out.println("sub라는 함수 이용해서 결과 출력 : " + result3);
    }
}

// 퀴즈2 
// 정적 메소드 하나 만들어서, 빼기 기능으로 사용하기,
// result3 에 담아서, 출력해보기