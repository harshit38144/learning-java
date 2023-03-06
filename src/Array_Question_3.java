import java.util.Scanner;
public class Array_Question_3 {
    public static void main(String[] args) {

        //This code is incomplete

        /*Search Array Elements
        a[5] = {10, 20, 30, 40, 50}
        Search item 20 -----> Item found
         */
        int a[] = new int[5];
        int n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for(int i = 0; i < a.length; i++) {
             a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        System.out.println("Search element: ");
        n = sc.nextInt();
        for(int i = 0; i < a.length; i++) {
            if (n==a[i]){
                count++;
            }
        }
            if(count<0){
                System.out.println("Item Found");
            }
            else {
                System.out.println("Item not found");

            }
        }
    }

