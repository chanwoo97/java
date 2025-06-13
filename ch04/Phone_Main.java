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


/*
Phone_Main 클래스 쉽게 이해하기
1. 역할
Phone_Main 클래스는 Phone 클래스를 이용해서 실제 휴대폰 객체를 만들고
여러 휴대폰 객체를 모아 배열에 넣은 뒤
배열에 들어있는 휴대폰 정보를 반복해서 출력하는 역할을 합니다.

2. 주요 내용 정리
(1) 객체 만들기
Phone phone1 = new Phone("아이폰1", "100만원", "애플");
Phone phone2 = new Phone("아이폰2", "200만원", "애플");
Phone phone3 = new Phone("아이폰3", "300만원", "애플");
new Phone(...)를 통해 Phone 객체를 3개 만들었어요.
각각 다른 모델명, 가격, 제조사를 넣어서 휴대폰을 만들었습니다.

(2) 배열에 객체 넣기
Phone[] phones = new Phone[3];
phones[0] = phone1;
phones[1] = phone2;
phones[2] = phone3;
Phone 객체 3개를 저장할 수 있는 배열을 만들고,
각 객체를 배열의 요소에 차례대로 넣었습니다.

(3) 주소 출력하기
System.out.println("phone1 주소 : " + System.identityHashCode(phone1));
System.out.println("phone2 주소 : " + System.identityHashCode(phone2));
System.out.println("phone3 주소 : " + System.identityHashCode(phone3));
각 객체의 메모리 주소(실제로는 객체를 가리키는 고유 번호)를 출력해요.
같은 객체는 같은 주소를 갖고, 다르면 다른 주소가 나옵니다.

(4) 반복문으로 객체 정보 출력하기
for (int i = 0; i < phones.length; i++) {
    phones[i].showInfo();
    System.out.println("----------------");
}
배열 phones 안에 있는 각 객체에 대해
showInfo() 메서드를 호출해 휴대폰 정보를 출력합니다.

3. 정리 및 요약
| 단계 | 설명                 | 코드 예시                              |
| -- | ------------------ | ---------------------------------- |
| 1  | 휴대폰 객체 생성          | `new Phone("아이폰1", "100만원", "애플")` |
| 2  | 객체 3개를 배열에 넣기      | `phones[0] = phone1;` 등            |
| 3  | 각 객체의 메모리 주소 출력    | `System.identityHashCode(phone1)`  |
| 4  | 반복문으로 모든 휴대폰 정보 출력 | `phones[i].showInfo();`            |


전체 흐름 그림으로 보기
+-----------------------+                 +------------------------+
|  Phone 객체 생성 단계   |                 |  배열에 저장 단계         |
|-----------------------|                 |------------------------|
| phone1 = new Phone(...)|   ------------> | phones[0] = phone1;     |
| phone2 = new Phone(...)|                 | phones[1] = phone2;     |
| phone3 = new Phone(...)|                 | phones[2] = phone3;     |
+-----------------------+                 +------------------------+

       |                                             |
       | 메모리 주소 출력                             | 배열 순회 반복문
       v                                             v

+------------------------------+         +-----------------------------------+
| phone1 주소 출력               |         | for (i=0 to phones.length) {       |
| phone2 주소 출력               |         |   phones[i].showInfo() 출력         |
| phone3 주소 출력               |         | }                                 |
+------------------------------+         +-----------------------------------+

       |                                             |
       +-------------------+-------------------------+
                           |
                           v

                +---------------------+
                | 휴대폰 정보 화면 출력  |
                +---------------------+

추가 설명
객체는 설계도로부터 만들어진 실체입니다. phone1, phone2 등 각각의 휴대폰이에요.
배열은 여러 개의 객체를 한 곳에 모아둔 상자 같은 역할을 합니다.
메서드 호출 (showInfo())은 객체에게 “너의 정보를 보여줘!”라고 요청하는 행동입니다.
*/