import java.util.Scanner;
public class Array_Question_7 {
    public static void main(String[] args) {

        //some confusion in this code
        /* Write a program to find out weather a given integer is present in an array or not */

        int[] a = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements: ");

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int j : a) {
            System.out.println(j);
        }
        for (int j : a) {
            System.out.println("Enter the value you want to find: ");
            int v = sc.nextInt();
            if (v == j) {
                System.out.println("value found");
            } else {
                System.out.println("value not found");
            }
            System.out.println();
        }
    }
}
