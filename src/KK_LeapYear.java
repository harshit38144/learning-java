import java.util.Scanner;
public class KK_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int a = sc.nextInt();
        if(a%4==0){
            System.out.println("this is not a leap year.");
        }
        else{
            System.out.println("this is a leap year.");
        }
    }
}
