import java.util.Scanner;
class arrayy{
    public static void main(String[] args) {
        int [] ar = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<ar.length; i++){
        System.out.println("Please enter a marks of student");
        ar[i]=sc.nextInt();
        }

        for(int i = 0; i<ar.length; i++){
            System.out.print(ar[i] +" ");
        }
    }
}