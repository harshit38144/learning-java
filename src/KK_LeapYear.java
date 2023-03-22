import java.util.Scanner;
public class KK_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        long a = sc.nextInt();
        long c = a%100;
        if(c==0){
            if (a%400==0)
                System.out.println("This is a century year and a leap year");
            else
                System.out.println("This is a century year but not a leap year");
        }
        else
            System.out.println("this is not a leap year.");

    }
}
