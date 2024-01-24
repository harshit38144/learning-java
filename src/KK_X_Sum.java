import java.util.Scanner;
public class KK_X_Sum {
    public static void main(String[] args) {
        try (//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            System.out.println("Enter a number ");
            int s=sc.nextInt();
            while(s!=0){
                s=sc.nextInt();
                sum= sum+s;

            }System.out.println(sum);
        }
    }
}
