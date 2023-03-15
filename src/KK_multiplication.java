import java.util.Scanner;
public class KK_multiplication {
    public static void main(String[] args) {
        //Take a number as input and print the multiplication table for it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Multiplication table of given number is: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(a*i);
        }
    }
}
