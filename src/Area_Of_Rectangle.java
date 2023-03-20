import java.util.Scanner;
public class Area_Of_Rectangle {
    public static void main(String[] args) {
        //Area Of Rectangle.................
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter width of rectangle : ");
        int w = sc.nextInt();
        int AOR = l*w;
        System.out.println("Area of rectangle is : "+AOR);
    }
}
