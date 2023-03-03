public class Break {
    public static void main(String[] args) {
        //break using loops
        int n = 60;
        for (int i = 0; i <= n; i++){
            System.out.println(i);
            if (i == 50){
                System.out.println("i'm great");
                break;
            }
        }
    }
}
