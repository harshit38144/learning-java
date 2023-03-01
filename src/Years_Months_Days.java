import java.sql.SQLOutput;
import java.util.Scanner;
public class Years_Months_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int D = in.nextInt();

        int Y = D/360;
       int R = D%365;
        int M = R/30;
        int d = R%30;
        System.out.println("number of years  in "+D+" days are "+Y+" years "+M+ " months and " +d+" days");

    }
}
