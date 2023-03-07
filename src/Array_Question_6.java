import java.util.Scanner;

public class Array_Question_6 {
    public static void main(String[] args) {
        /* Create an array of 5 integer and calculate their sum */

        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Sum of given elements are: ");
        for(int i = 0; i < a.length; i++){
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }
}
