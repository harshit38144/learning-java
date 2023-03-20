import java.util.Scanner;
public class Area_Of_Circle {
    public static void main(String[] args) {
        //Area Of Circle Java Program...................................
        Scanner sc = new Scanner(System.in);
        float pie = 3.141592653f;
        System.out.println("Enter radius of circle: ");
        float a = sc.nextInt();
        float b = a*a;
        float c = pie*b;
        System.out.println("Area of circle is : ");
        System.out.println(c);
    }
}
