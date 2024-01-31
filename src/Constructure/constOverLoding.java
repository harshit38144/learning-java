package Constructure;
class Const1{
    private int age;
    private String name;

    Const1()
    {
        System.out.println("without parameters");
        age=21;
        name="Harsh";
    }
    Const1(String name)
    {
        System.out.println("Single parameter");
        this.name=name;
        age=24;
    }
    Const1(String name, int age)
    {
        System.out.println("parameterize");
        this.name=name;
        this.age=age;
    }
    void disp()
    {
        System.out.println(age);
        System.out.println(name);
    }
}
public class constOverLoding {
    public static void main(String[] args){
        Const1 obj = new Const1();
        obj.disp();
        Const1 obj1 = new Const1("ravn");
        obj1.disp();
        Const1 obj2 = new Const1("Hattori",23);
        obj2.disp();
    }
}
