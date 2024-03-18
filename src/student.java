//Concept of inheritence
class id{
    int age;
    void sleep(){
        age = 22;
        System.out.println(age);
        System.out.println("Hello there");
    }
}
class Pass extends id{

}

class student{
    public static void main(String[] args){

        Pass obj=new Pass();
        obj.sleep();
        // id abj=new id();
        // abj.sleep();

    }
}