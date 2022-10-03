package Day2;

import javax.swing.*;

public class MonthName {
    public static void main(String[] args) {

        int num = Integer.parseInt (JOptionPane.showInputDialog ("Enter any number equal to or between 1-12 to display the month"));

        switch (num) {
            case 1 -> System.out.println("The name of month number 1 is January");
            case 2 -> System.out.println("The name of month number 2 is February");
            case 3 -> System.out.println("The name of month number 3 is March");
            case 4 -> System.out.println("The name of month number 4 is April");
            case 5 -> System.out.println("The name of month number 5 is May");
            case 6 -> System.out.println("The name of month number 6 is June");
            case 7 -> System.out.println("The name of month number 7 is July");
            case 8 -> System.out.println("The name of month number 8 is August");
            case 9 -> System.out.println("The name of month number 9 is September");
            case 10 -> System.out.println("The name of month number 10 is October");
            case 11 -> System.out.println("The name of month number 11 is November");
            case 12 -> System.out.println("The name of month number 12 is December");
            default -> System.out.println("You have entered an invalid number");
        }
    } // main method
}



