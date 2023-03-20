import java.util.*;
public class Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Area_Of_Rhombus.....................................................
        System.out.println("Enter the value of D1 : ");
        int D1 = sc.nextInt();
        System.out.println("Enter the value of D2 : ");
        int D2 = sc.nextInt();
        int AOR = (D1*D2)/2;
        System.out.println("Area of Rhombus is : " + AOR);
    }
}