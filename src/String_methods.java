public class String_methods {
    public static void main(String[] args) {
        String name = "  HarShiT  ";

        //to show length of the string
        int v = name.length();
        System.out.println(v);

        //for capital letter
        String w = name.toUpperCase();
        System.out.println(w);

        //for small later
        String x = name.toLowerCase();
        System.out.println(x);

        //removes the spaces
        String y = name.trim();
        System.out.println(y);

        //include 2nd index of string and exclude 6th index of string
        String z = name.substring(4,8);
        System.out.println(z);


        //old char is replaced by new char
        System.out.println(name.replace('a','o'));

    }
}
