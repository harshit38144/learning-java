import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        /* print array elements in reverse order
             input a[5] = 10,20,30,40,50 ----> 50,40,30,20,10
         */
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter elements: ");

        for(int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array elements: ");
        for(int i = a.length-1; i >= 0; i--){
            System.out.println(a[i]);
        }
    }
}
