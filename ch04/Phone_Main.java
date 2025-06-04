package ch04;

public class Phone_Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(); //  기본 생성자 호출

        phone1.model = "갤럭시Z플립"; 
        phone1.price = "100만원"; 
        phone1.company = "삼성";
        phone1.showInfo(); 
    
        Phone phone2 = new Phone();
        phone2.model = "아이폰8";
        phone2.price = "100만원";
        phone2.company = "애플";
        phone2.showInfo();

        // 매개변수 생성자 사용
        // Phone phone3 = new Phone("갤럭시Z플립", "100만원", "삼성");
        // Phone phone4 = new Phone("아이폰8", "100만원", "애플");

        // phone3.showInfo();
        // phone4.showInfo();
    }
}
