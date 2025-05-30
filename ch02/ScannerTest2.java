package ch02;

import java.util.Scanner;

import util.UserService;
import util.UserService1;

public class ScannerTest2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        UserService.registerUser(scanner);
        UserService1.loginUser(scanner);
        scanner.close();
    }    
}
