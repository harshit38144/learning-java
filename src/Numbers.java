public class Numbers {
    public static void main(String[] args) {
        System.out.println("Print the Numbers :");
        int n = 4;
        for (int i = 1; i >= n; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
