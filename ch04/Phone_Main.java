package ch04;

public class Phone_Main {
    public static void main(String[] args) {
        // Phone phone1 = new Phone(); //  기본 생성자 호출

        // phone1.model = "갤럭시Z플립"; 
        // phone1.price = "100만원"; 
        // phone1.company = "삼성";
        // phone1.showInfo(); 
    
        // Phone phone2 = new Phone();
        // phone2.model = "아이폰8";
        // phone2.price = "100만원";
        // phone2.company = "애플";
        // phone2.showInfo();

        // // 매개변수 생성자 사용
        // Phone phone3 = new Phone("Z플립", "100만원", "삼성");
        // phone3.showInfo();
        
        // Phone phone4 = new Phone("아이폰", "100만원", "애플");
        // phone4.showInfo();

        // Phone phone1 = new Phone();
        // Phone phone2 = new Phone("아이폰15");
        // Phone phone3 = new Phone("아이폰15", "100만원");
        // Phone phone4 = new Phone("아이폰15", "100만원", "애플");

        // phone1.showInfo();
        // phone2.showInfo();
        // phone3.showInfo();
        // phone4.showInfo();
        
        Phone[] phones = new Phone[3];
        
        Phone phone1 = new Phone("아이폰1", "100만원", "애플");
        Phone phone2 = new Phone("아이폰2", "200만원", "애플");
        Phone phone3 = new Phone("아이폰3", "300만원", "애플");
        
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        
        // phone 주소 확인. System.identityHashCode(주소) 입력하는게 정확한 위치가 나옴.
        System.out.println("phone1 주소 : " + System.identityHashCode(phone1));
        System.out.println("phone2 주소 : " + System.identityHashCode(phone2));
        System.out.println("phone3 주소 : " + System.identityHashCode(phone3));

        // 반복문을 이용해서, 순회해서 출력
        for (int i = 0; i < phones.length; i++) {
            phones[i].showInfo();
            System.out.println("----------------");
        }
        
        // 직접 할당
        Phone[] phones2 = {phone1, phone2, phone3};

        


    }
}
