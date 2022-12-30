package HW;

import java.util.Scanner;

public class homework2 {
    public static void main (String[] args){
        int a = 5, b = -2, c = 25;
//1 task
        System.out.println("Max number is : " + Math.max(a, b) + " which we give by the Math!\n");

        int max1;//second way with 3 numbers
        if(a > b)
            max1=a;
        else
            max1=b;
        if(max1>c)
            System.out.println("Max number is : " + max1 + " which we give by the if-else!");
        else
            System.out.println("Max number is : " + c + " which we give by the if-else!\n");

//2 task

        int max3 = Math.max(Math.max(a,b), c);
        int min3 = Math.min(Math.min(a,b), c);
        int mid3 = a + b + c - (min3 + max3);
        System.out.println("Average number is : " + mid3);
        System.out.println("Max number is     : " + max3);
        System.out.println("Min number is     : " + min3);

//3 task
        int g_morning_start = 1,g_morning_finish = 12;
        int g_day_start = 12, g_day_finish = 20;
        int g_night_start = 20, g_night_finish = 24;
        Scanner input = new Scanner(System.in);
        int user_num = input.nextInt();
        if ((user_num >= g_morning_start) && (user_num <=g_morning_finish)){
            if (user_num == g_day_start){
                System.out.println("Good morning! ");
                System.out.println("Good day! ");
            }
            else
                System.out.println("Good morning! ");
        }
        else if ((user_num >= g_day_start) && (user_num <=g_day_finish)){
            if (user_num == g_night_start){
                System.out.println("Good day! ");
                System.out.println("Good night! ");
            }
            else
                System.out.println("Good day! ");
        }
        else if ((user_num >= g_night_start) && (user_num <=g_night_finish)){
            System.out.println("Good night! ");
        }
        else
            System.out.println("Number is not correct for this application :(");

    }

    /*int max;
    max = (a > b)?a:b;
    max= (max > c)?max:c;
        System.out.println("Max number is     : " + max + " which we give by the ternary operator!");

    int min;
    min = (a < b)?a:b;
    min= (min < c)?min:c;
        System.out.println("Min number is     : " + min + " which we give by the ternary operator!\n");
     */
}
