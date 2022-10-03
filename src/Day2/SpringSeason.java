package Day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the Day and month");
        int day = object.nextInt();
        int month = object.nextInt();
        if ((month == 3 && day >= 20 && day <= 31))
            System.out.println("True");
        else if ((month == 4 && day >= 1 && day <= 30))
            System.out.println("True");
        else if ((month == 5 && day >= 1 && day <= 31))
            System.out.println("True");
        else if ((month == 6 && day >= 1 && day <= 20))
            System.out.println("True");
        else
            System.out.println("False");
    }
}



