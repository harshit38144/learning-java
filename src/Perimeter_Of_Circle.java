import java.util.*;
public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        //Perimeter Of Circle........................................
        Scanner sc = new Scanner(System.in);
        float pie = 3.141592653f;
        System.out.println("Enter radius of circle : ");
        float r = sc.nextInt();
        float POC = 2*pie*r;
        System.out.println("Perimeter Of Circle is : "+POC);
    }
}
