package D_250611.member_project.main;

import java.util.Scanner;

import D_250611.member_project.ui.MemberUI;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberUI.drawUI(scanner);
    }
}