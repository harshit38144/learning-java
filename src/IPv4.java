import java.util.Scanner;

public class IPv4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine();
        a= a.replace(".","[.]");
        System.out.println(a);

    }
}
