package org.example;

import java.util.Scanner;

public class Cli {
    public static void askName(){
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        Scanner sc = new Scanner(System.in);
    }
}
