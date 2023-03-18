import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String a = sc.nextLine();
        for(int i = 0; i < a.length(); i++){
            System.out.println(a.charAt(i));
        }

    }
}
