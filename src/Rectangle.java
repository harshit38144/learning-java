public class Rectangle {
    public static void main(String[] args) {
        int l = 22, b = 16;
        int ar = l*b;
        int p = 2*(l+b);
        double d = Math.sqrt(l*l+b*b);
        System.out.println("area of rectangle is "+ar);
        System.out.println("perimeter of rectangle is "+p);
        System.out.println("diagonal of rectangle is "+d);
    }
}
