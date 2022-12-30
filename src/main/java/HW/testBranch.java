package HW;

public class testBranch {
    public static void main(String[] args) {
        /*Scanner input =  new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();

        double s = a * b;
        double P = 2 * (a + b);
        System.out.println("S = " + s);
        System.out.println("P = " + P);
        if (s > b){
            System.out.println( s);
        }*/

        int a = 0;
        int b = 7;
        int c = -2;
        int count = 0;
        int count2 = 0;
        int count_null =0;
        if (a>0){
            count++;
        } else if (a==0) {
            count_null++;
        } else {
            count2++;
        }
        if (b>0){
            count++;
        }
        else if (b==0) {
            count_null++;
        }
        else {
            count2++;
        }
        if (c>0){
            count++;
        }
        else if (c==0) {
            count_null++;
        }
        else {
            count2++;
        }
        System.out.println("Count plus numbers : " + count);
        System.out.println("Count minus numbers : " + count2);
        System.out.println("Count zero numbers : " + count_null);
    }
}
