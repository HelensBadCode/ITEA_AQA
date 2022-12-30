package HW;

public class homework1 {
    public static void main(String[] args) {
        String name = "Olena ", surename = "Turcheniuk";
        String fullname = name + surename;
        System.out.println("Hello " + fullname + ":)");

        double numb1 = 5.24, numb2 = 3.88;
        double sum = numb1 + numb2;
        System.out.println("Sum is : " + sum);


        int numb3 = 777;
        int hundred = numb3/100;
        int ten = numb3 % 10;
        int one_count =numb3/10 % 10;
        System.out.println("Hundred : " + hundred);
        System.out.println("Ten : " + ten);
        System.out.println("One : " + one_count);


    }
}
