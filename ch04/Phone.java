package ch04;

public class Phone {
    // 멤버 변수
    String model; // 모델
    String price; // 가격
    String company; // 제조사

    // 기본 생성자
    public Phone() {
        this.model = "모델명";
        this.price = "0만원";
        this.company = "제조사";
    }

    // 매개변수 생성자
    public Phone(String model, String price, String company) {
        this.model = model;
        this.price = price;
        this.company = company;
    }
    
    // 메소드
    public void showInfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
        System.out.println("-------------------------");
    }

    // 생성자 오버로딩
     public Phone(String model) {
        this.model = model;
        this.price = "0만원";
        this.company = "제조사";
    }

    public Phone(String model, String price) {
        this.model = model;
        this.price = price;
        this.company = "제조사";
    }

    

}
