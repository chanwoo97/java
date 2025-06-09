package D_250609.ch5_3;

public class Upcasting_Ex1 {
    // 부모 타입 <-> 자식 타입, 형 변환.
    // instanceof 연산자를 이용해서, (상속은 무슨 관계 1) Is A 2) has A ? -> 1번)
    // 부모 타입의 인스턴스가 맞는지 확인하는 연산자 : instanceof
    // 메소드 오버라이딩 : 부모 클래스 기능을 재정의, (이름, 매개변수, 번환형 동일, 내용물만 다름.)
    
    // 상속, 동물, 자동차 
    // 개는 동물이다, 전기차는 자동차이다. -> Is A 관계

    // 개는 동물 타입이다. 
    // 고양이는 동물 타입이다.
    // public class Animal() {}
    // public class Dog extends Animal {}
    // public class Cat extends Animal {}

    // 인스턴스 생성 : A a = new A();
    // Dog dog = new Dog();
    // Cat cat = new Cat();

    // 받는 타입을 : Animal로 받고, 실제 대입은 Dog, Cat
    // 다형성 (형이 다양하다.)
    // Animal dogAni = new Dog();  -> 받는게 Animal이라서 Dog는 Animal이다
    // Animal catAni = new Cat();

    // 질문? dogAni는 Animal? Dog? -> 정답 :  Animal
    // 질문? 실수 100.0은 실수? 정수? -> 정답 : 실수
    // double result = 100;


}
