//Upcasting and Downcasting

/*
Typecasting
double d=4.5;
int i= (int)d;
*/
class A{
    public void show(){
        System.out.println("in A show");
    }

}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }

}

public class upcast {
    public static void main(String[] args) {
        A obj = (A) new B(); //upcasting as refer to A
        obj.show(); // in A show

        B obj1=(B)obj; //Downcasting
        obj1.show2();
        
    }
    
}
