import java.util.*;
public class Angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of angle a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of angle b : ");
        int b = sc.nextInt();
        System.out.println("Enter value of angle c : ");
        int c = sc.nextInt();
        if (a + b + c == 180) {
            System.out.println("this is a triangle : ");

            if (a == b & a == c) {
                System.out.println("this is equilateral triangle.");
            }
            else if(a==90 || b==90 || c==90){
                System.out.println("this is a right angle triangle");
            }
            else if (a==b || a==c || b==c){
                System.out.println("this is Isosceles triangle");
            }
            else {
                System.out.println("this is Scalene triangle.");
            }
        }
        else {
                System.out.println("This is not a triangle.");
        }
    }
}