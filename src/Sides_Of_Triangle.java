import java.util.Scanner;
public class Sides_Of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of a triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("This is a Triangle.");
            if (a == b & a == c) {
                    System.out.println("this is equilateral triangle.");
            }
            else if (a==b || a==c || b==c){
                    System.out.println("this is Isosceles triangle");
            }
            else {
                    System.out.println("this is Scalene triangle.");
            }
        }
        else{
                System.out.println("This is NOT a Triangle.");
        }
    }
}

