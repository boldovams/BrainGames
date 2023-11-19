package org.example;
import org.example.games.*;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        System.out.println("Please enter the game number and press Enter");
        //System.out.println("1 - Greet");
        System.out.println("1 - Even");
        System.out.println("2 - Calc");
        System.out.println("3 - GCD");
        System.out.println("4 - Progression");
        System.out.println(("0 - Exit"));
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String gameChoice = scanner.nextLine();
        switch (gameChoice){
            //case "1" -> Cli.askName();
            case "1" -> Even.initiateEven();
            case "2" -> Calc.initiateCalc();
            case "3" -> GCD.initiateGCD();
            case "4" -> Progression.initiateProgression();
            default -> System.out.println("exit");
        }
    }


}
