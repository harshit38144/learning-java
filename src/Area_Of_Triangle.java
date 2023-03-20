import java.util.*;
public class Area_Of_Triangle {
    public static void main(String[] args) {
        //Area Of Triangle.......................................
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int base = sc.nextInt();
        System.out.println("Enter height : ");
        int height = sc.nextInt();
        int AOT = (base*height)/2;
        System.out.println("Area Of Triangle is : "+AOT);
    }
}
