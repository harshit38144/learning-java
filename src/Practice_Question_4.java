import java.util.Scanner;
public class Practice_Question_4 {
    public static void main(String[] args) {

        //print:
        //*
        //**
        //***
        //****
        //*****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Columns: ");
        int i = sc.nextInt();

        //Outer loop
        for (int a = 1; a<=i; a++){
            //Inner loop
            for (int b = 1; b<=a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
