import java.util.Scanner;
public class Two_D_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
        for(int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
