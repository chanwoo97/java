package ch02;

import java.util.Scanner;

import util.user.UserService;

public class ScannerTest2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        UserService.registerUser(scanner);
        UserService.loginUser(scanner);
        scanner.close();
    }    
}
