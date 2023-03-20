import java.util.*;
public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
       // Perimeter Of Rectangle.................................
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter width of rectangle : ");
        int w = sc.nextInt();
        int POR = 2*(l+w);
        System.out.println("Perimeter Of Equilateral_Triangle is : "+POR);
    }
}
