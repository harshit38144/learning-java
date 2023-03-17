import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a = sc.nextInt();
        System.out.println("Enter Second no. : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Largest number is : "+a);
        }else{
            System.out.println("Largest number is : "+b);
        }
    }
}
