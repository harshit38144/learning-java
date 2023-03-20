import java.util.*;
public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        //Area_Of_Parallelogram.................................
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth of rectangle : ");
        int b = sc.nextInt();
        System.out.println("Enter height of rectangle : ");
        int h = sc.nextInt();
        int AOP = b*h;
        System.out.println("Area of rectangle is : "+AOP);
    }
}
