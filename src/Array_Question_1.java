import java.util.Scanner;

public class Array_Question_1 {
    public static void main(String[] args) {

        /* copy array elements
           a[i] = {10,20,30,40,50} ------> a[j] = {10,20,30,40,50}
        */

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        System.out.println("Enter the first array elements: ");
        for(int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("First array elements are: ");
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Second array elements are:");
        for(int i = 0; i<a.length; i++){
            b[i] = a[i];
            System.out.println(b[i]);

        }
    }
}
