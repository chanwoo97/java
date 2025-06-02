package util.random;

public class RandomUtilMain {
    public static void main(String[] args) {
        System.out.println("Math.random()를 사용하여 생선된 난수: " + RandomUtil.generateRandom());
        System.out.println("1이상 45 이하 사이의 랜덤 정수: " + RandomUtil.generateRandomInRange(1, 45));
        System.out.println("정찬우의 자동 로또 번호 생성 프로그램" );
        RandomUtil.generateLottoNumbers();
    }
}
