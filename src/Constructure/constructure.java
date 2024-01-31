package Constructure;
class Const{
     private int age;
     private String name;

     Const(int age,String name)
     {
        this.age=age;
        this.name=name;
     }
     Const()
     {
        System.out.println("This is non parameterize constructure");
     }
     void disp()
     {
        System.out.println(age);
        System.out.println(name);
     }
}

public class constructure {
    public static void main(String[] args){
         Const s=new Const(5,"Harsh");
         s.disp();

         Const s1=new Const();
         s1.disp();
         
    }
}
