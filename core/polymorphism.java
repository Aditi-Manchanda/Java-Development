/*
Poly->Many
Morphism->Behaviour

2 types- compile time and run time
Compile Time
    Overloading
    add(int,int)
    add(int,int,int)

Run Time
    Overriding
    A add(int,int)
    B add(int,int)
*/
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show"); 
        //ref of type A but object of B 
        //So, it'll call 
    }
}
class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

class Computer{

}
class Laptop extends Computer{

}

public class polymorphism {
    public static void main(String[] args) {
        //B obj = new B();
        A obj = new B();   //obj type is A but implementation is 
        //possible to create refernce of superclass and object of subclass
        obj.show();

        obj=new C(); 
        obj.show(); //now it'll call in show C

        //obj.show is behaving differently with diff objects and it is decided at runtime so it is runtime polymorphism
        //this is called dynamic method dispatch
        //only works with inheritance

        Computer obj1= new Laptop(); //type as parent but object is child
    }
    
}
