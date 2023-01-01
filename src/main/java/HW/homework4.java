package HW;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        int i = 0, b =10;
        System.out.println("First task : ");
        while (i < b){
            i+=2;
            System.out.println(i);
        }

        System.out.println("\nSecond task : ");
        for ( int c = 10; c > 0; c-=2){
            System.out.println(c);
        }
        System.out.println("\nThird task    :  ");
        System.out.println("Enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int numb_user = input.nextInt();
        int sum =0;
        if (numb_user>=1){
            for (int count = 0; count <= numb_user; count++) {
                sum += count;
            }
            System.out.println("Sum = " + sum);
            }
        else
            System.out.println("Not positive value. Plese try again!");

    }
}
