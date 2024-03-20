class Human1{

    private String name;
    int age;

    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1{
    void disp(){
        System.out.println(age);
        
    }

}
public class employee {

    public static void main(String[] args) {
        Student1 st1=new Student1();
        st1.sleep();
        st1.disp();
    }
}