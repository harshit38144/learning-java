import java.util.Scanner;
public class Array_Question_8 {
    public static void main(String[] args) {

        // write a java program to reverse a number

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("Enter Elements: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Elements in reverse: ");
        /*for(int i = 0; i < a.length;i++){

            System.out.println();
        }*/for(int j = a.length-1; j >= 0 ; j--){
            System.out.print(a[j]+" ");
        }
    }
}
