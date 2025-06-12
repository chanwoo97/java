package D_250612.member_project.main;

import java.util.Scanner;

import D_250612.member_project.ui.MemberUI;
import D_250612.member_project.service.UserService_ArrayList_version;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberUI.drawUI(scanner);
    }
}