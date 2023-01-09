import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your subject fot maths as 'm' for phy 'p' for bio 'b'");
        char ch = in.next().charAt(0);
        int m = 12;
        int p = 11;
        int b = 9;
        if (ch == 'm' )
            System.out.println(m+8);
        else if (ch == 'p')
            System.out.println(p+8);
        else if (ch == 'b')
            System.out.println(b+8);
        else
            System.out.println("invalid sub");
    }
}