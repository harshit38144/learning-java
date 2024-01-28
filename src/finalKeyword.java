public class finalKeyword {
    public static void main(String[] args) {
        final int a = 10;
        //a = 20;
        System.out.println(a);

        final StringBuffer sb = new StringBuffer("Harsh ");
        sb.append("Kumar");
        //sb = new StringBuffer("Harshit");
        System.out.println(sb);
    }
}
