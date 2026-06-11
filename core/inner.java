//Inner Class

class A{
    int age;
    public void show(){
        System.out.println("in show");

    }
    //you can make inner class static but not outer class
    class B{
        public void config(){
            System.out.println("in config");
        }

    }
}
public class inner {
    public static void main(String a[]){
        A obj= new A();
        obj.show();

        //B obj1=new B();  error
        //you need object of outer class to create an object of inner class
        //B belongs to class A so we write it like below

        A.B obj1= obj.new B(); 
        obj1.config();


    }
    
}
