import java.util.Scanner;
public class Practice_Question_3 {
    public static void main(String[] args) {

        //print:
        //*****
        //*****
        //*****
        //*****
        //*****

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thr rows : ");
        int i = sc.nextInt();

        System.out.println("Enter thr column : ");
        int j = sc.nextInt();

        for (int a = 1; a <= i; a++){
            for (int b = 1; b <= j; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
