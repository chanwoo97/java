package homework;

public class CarModel {
    String name;     
    String company;
    String year;
    String registrationDate;

    public CarModel(String name, String company, String year, String registrationDate) {
        this.name = name;
        this.company = company;
        this.year = year;
        this.registrationDate = registrationDate;
    }

    public void showInfo() {
        System.out.println("차량명: " + this.name);
        System.out.println("제조사: " + this.company);
        System.out.println("연식: " + this.year);
        System.out.println("등록일: " + this.registrationDate);
        System.out.println("------------------------");
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
