//Naming Conventions

//Camel Casing
//class and interface - Calc, Runable (start with capital letter)
//variable and method- marks, show()  (start with small letter)
//constants- PIE, BRAND (all letters capital)
//showMyMarks (more readable)
//in obj.show obj is refernce not object

/*
A= obj     reference creation
obj=new A()  creating object and assigning value to it
*/

/*
new A().show()  //anonymous object
new A().show() //cant create a duplicate object and cant be accessed again
*/


//Inheritance

/*
Parent--> Super/Base class
Child--> Sub/Derived class
*/

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
class AdvCalc extends Calc{ //if diff file with name AdvCalc.java then this class can be public
    public int multi(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}
class SciCalc extends AdvCalc{
    public double power(int n1, int n2){  //pow returns double value
        return Math.pow(n1,n2);
    }

}
public class funda2 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1=obj.add(4,5);
        int r2=obj.sub(7,3);

        System.out.println(r1+ " " + r2);

        SciCalc obj1= new SciCalc();
        int a1=obj1.add(4,5);
        int a2=obj1.sub(7,3);
        int a3=obj1.multi(3,5);
        int a4=obj1.div(15,4);
        double a5= obj1.power(4,2);

        System.out.println(a1+ " " + a2+ " " + a3+ " " + a4+ " " + a5);

        /*
         Multiple Inheritance doesnt work in Java
        If there are two parent classes A and B then the child class C cant inherit from both
        */


        B objb= new B();
        B objj= new B(5); //it will print in A and in B int as default of A will be called
    }
    
}

class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();  // it is there by default even if u dont mention so that is why it is printing in A
        //it means call the default constructor of super class
        //super(5);    this will call parameterized constructor of A
        System.out.println("in B");
    }
    public B(int n){
        this(); //executes constructor for same class
        //it will give in A, in B, in B int
        //super(5); 
        System.out.println("in B int");
    }
}
//it calls constructor of sub class and super class both if u call consstructor of sub class

//Method Overriding
class M{
    public void show(){
    }
    public void config(){
    }
}
class N extends M{
    public void show(){  //this overrides method of M
    }
}