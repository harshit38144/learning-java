import java.util.Scanner;
import java.util.Arrays;
public class Array_Question_5 {
    public static void main(String[] args) {

        /* Sort array elements in Ascending Order
        int a[5] = {3,5,2,7,1} ------> {1, 2, 3, 5, 7}
         */

        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        //using sort method
        Arrays.sort(a);
        System.out.println("array elements are: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
