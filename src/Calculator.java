import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
       // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter first no. : ");
        a = sc.nextInt();
        System.out.println("Enter second no. : ");
        b = sc.nextInt();
        System.out.println("Enter operator : ");
        char op = sc.next().charAt(0);

        if(op == '+'){
            System.out.println(a+b);
        }
        else if(op == '-'){
            System.out.println(a-b);
        }
        else if(op == '*'){
            System.out.println(a*b);
        }
        else if(op == '/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("invalid");
        }
    }
}


