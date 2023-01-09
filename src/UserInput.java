import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        float b = in.nextFloat();
        float sum = a+b;
        System.out.println("the sum of two numbers is "+ sum);


    }
}
