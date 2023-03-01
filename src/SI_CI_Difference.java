public class SI_CI_Difference {
    public static void main(String[] args) {
        float p = 50, r = 5, t = 1, A;
        float SI = p*r*t/100;
        A=(float)(p*(Math.pow((1+r/100), t)));
        System.out.println("SI ="+(float)SI);
        System.out.println("CI="+A);
       // System.out.println("CI ="+CI);
    }
}
