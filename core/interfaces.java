//Interfaces

//When a class has only abstract methods then we can create interface

/* abstract class A{

    public abstract void show();
    public abstract void config();
} */

//By default every method in interface is public abstract

interface A{
    //we can declare variable here but only final and static by default
    //it is so bcz interface dont have their own memory
    int age=44;
    String area="Mumabi";

    //int a; gives error as not final or static

    void show();
    void config();
    //how to instantiate?

}
interface Z{

}
interface X extends Z{
    //inheritance is valid in interface

}
class B implements A,Z{
    //you implement an interface
    //when you implement, you need to compulsorily define the methods
    //class can implememnt more than one interface

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

}

public class interfaces {
    public static void main(String[] args) {
        A obj;
        // obj=new A(); error 
        obj=new B();

        obj.show();
        obj.config();

        // A.area="Hyderabad"
        //error bcz area is final and static


    }
    
}
