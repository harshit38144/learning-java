import java.util.Scanner;
public class Practice_Question_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks of maths: ");
        int a = sc.nextInt();

        System.out.println("Enter your marks of physics: ");
        int b = sc.nextInt();

        System.out.println("Enter your marks of chem: ");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("your overall percentage is: "+ avg);

        if (avg >= 40 ) {
            System.out.println("Congratulations! you are pass");
        }
        else if (avg >= 33) {
            System.out.println("you are pass but your marks is not so good");
        }
        else {
            System.out.println("you are fail");
        }
    }
}
