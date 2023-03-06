import java.sql.SQLOutput;
import java.util.Scanner;
public class Array_Question_4 {
    public static void main(String[] args) {
        /* Find Avg Of Array Elements
        a[5] = {1, 2, 3, 4, 5} ------> 15
        Avg = 15/5;
         */
        int a[] = new int[5];
        int sum = 0;
        int avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        for(int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        avg = sum/a.length;
        System.out.println("Sum is: "+sum+ " and Avg is: "+avg);
    }
}
