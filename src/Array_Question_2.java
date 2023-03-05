import java.util.Scanner;
public class Array_Question_2 {
    public static void main(String[] args) {
        /* Find sum of array elements
        a[3] = {1,2,3} -----> 6
         */
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        int sum = 0;
        System.out.println("Enter elements: ");
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
            sum = a[i]+sum;
        }
        System.out.println("addition of elements in array: "+sum);
    }
}
