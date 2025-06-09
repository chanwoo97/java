package D_250609.ch5;

public class InheritanceMain_Ex1 {
    public static void main(String[] args) {
        // A a = new A(); -> 인스턴스 생성
        Dog_Ex1 dog_Ex1 = new Dog_Ex1();
        dog_Ex1.speak();
        System.out.println("-----------------------------------------");
        // 2번째 멍멍이 인스턴스
        Dog_Ex1 dog_Ex2 = new Dog_Ex1("진돗개", "한국");
        dog_Ex2.showInfo();
    }
}
