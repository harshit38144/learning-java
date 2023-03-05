import java.util.Scanner;
public class Practice_Question_7 {
    public static void main(String[] args) {

        //Print:
        //1 2 3 4 5 6
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of columns: ");
        int n = sc.nextInt();

        //Outer loop
        for (int i = 1; i <= n; i++){
            //Inner loop
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
