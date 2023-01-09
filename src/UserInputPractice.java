import java.util.Scanner;
public class UserInputPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("eng");
        int a = in.nextInt();
        System.out.println("hindi");
        int b = in.nextInt();
        System.out.println("math");
        int c = in.nextInt();
        System.out.println("physics");
        int d = in.nextInt();
        System.out.println("chem");
        int e = in.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("total marks is "+sum);
        float per = sum/5;
        System.out.println("percentage of marks "+ per);

    }
}
