import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("0 --> Rock");
        System.out.println("1 --> Paper");
        System.out.println("2 --> Scissor");

        System.out.println("What do you choose: ");
        int user_choice = sc.nextInt(3);

        int comp_choice = rand.nextInt(3);
        System.out.println("Computer choose: "+comp_choice);

        if (comp_choice == user_choice){
            System.out.println("it's a draw");
        }
        else if (comp_choice == 1 && user_choice ==2){
            System.out.println("You won");
        } else if (comp_choice == 2 && user_choice == 1){
            System.out.println("Computer won");
        } else if (comp_choice == 0 && user_choice == 1){
            System.out.println("Computer Won");
        } else if (comp_choice == 1 && user_choice == 0){
            System.out.println("You Won");
        } else if (comp_choice == 0  && user_choice == 2){
            System.out.println("Computer Won");
        } else if (comp_choice == 2 && user_choice == 0){
            System.out.println("Computer Won");
        }
        System.out.println("Game Over");
    }
}




