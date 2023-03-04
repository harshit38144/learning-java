import java.util.Scanner;
public class Practice_Question_5 {
    public static void main(String[] args){

        //print:
        //*****
        //****
        //***
        //**
        //*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of columns: ");
        int n = sc.nextInt();

        //Outer loop
        for(int i = 1; i<=n; i++){
            //Inner loop
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
