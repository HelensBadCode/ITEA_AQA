package HW;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int curr_year = 2022;
        System.out.println("Enter your year of birthed : ");
        Scanner reader = new Scanner(System.in);
        int birthday_year = reader.nextInt();
        int years = curr_year - birthday_year;

        if (birthday_year > 0){
            System.out.println("You are " + years + " years old!"  );
        }
        else
            System.out.println("Incorrect value. Try again!");
    }
}
