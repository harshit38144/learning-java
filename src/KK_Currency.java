import java.util.Scanner;
public class KK_Currency {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupees: ");
        int a = sc.nextInt();
        float dlr = a/82f;
        System.out.println("$"+dlr);

    }
}
