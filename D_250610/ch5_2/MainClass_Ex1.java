package D_250610.ch5_2;

public class MainClass_Ex1 {
    public static void main(String[] args) {
        // 원래 형으로 기본으로 인스턴스 생성.
        // A a = new A(); / A = 기본생성자, 클래스명 / 인스턴스 생성 / a = 참조형 변수
        Dog_Ex1 dog_Ex1 = new Dog_Ex1();
        // dog_Ex1.sound();
        // dog_Ex1.eat();

        Cat_Ex1 cat_Ex1 = new Cat_Ex1();
        // cat_Ex1.sound();
        // cat_Ex1.eat();

        // 다형성, 부모 타입으로 받아보기.
        Animal_Ex1 ani1 = new Dog_Ex1();
        Animal_Ex1 ani2 = new Cat_Ex1();
        Animal_Ex1 ani3 = new Mongkey_Ex1();
        Animal_Ex1 ani4 = new Fish_Ex1();

        // 각각의 4가지 종류의 동물을 하나의 배열로 담으려면?
        // 무슨 타입으로 만들어야하죠? -> 부모타입으로 만들어야 함
        // 배열 정의, 타입을 지정하기를, 부모 타입으로 받겠다라고 했음.
        // 그러면, 자식 클래스는 올 수 있을까요? -> 정답 : 올 수 있음. 
        Animal_Ex1[] animals = { ani1, ani2, ani3, ani4 };

        // 질문 및 퀴즈, 각각 배열의 요소를 반복문을 이용해서, 각각의 sound 소리를 나게 할려면 어떻게 할까요?
        for (Animal_Ex1 animal_Ex1 : animals) {
            // 부모 타입 -> 자식 타입, 다운 캐스팅 하는 과정.
            if (animal_Ex1 instanceof Dog_Ex1) {
                Dog_Ex1 dog = (Dog_Ex1) animal_Ex1;
                dog.sound();
            }

            else if (animal_Ex1 instanceof Cat_Ex1) {
                Cat_Ex1 cat = (Cat_Ex1) animal_Ex1;
                cat.sound(); // // 부모 클래스(추상클래스), 재정의
                cat.eat(); // 부모 클래스 기본 기능 사용
                cat.move(); // Movealbe, 인터페이스를 구현, 기능 추가
                cat.out(); // Outable, 인터페이스를 구현, 기능 추가
            }

            else if (animal_Ex1 instanceof Mongkey_Ex1) {
                Mongkey_Ex1 mongkey = (Mongkey_Ex1) animal_Ex1;
                mongkey.sound();
            }

            else if (animal_Ex1 instanceof Fish_Ex1) {
                Fish_Ex1 fish = (Fish_Ex1) animal_Ex1;
                fish.sound();
            }
        }
    }
}
