//Inner Class, Abstract Class, Anonymous Inner Class combined

abstract class A{
    public abstract void show();
}

//entire purpose of B is to implement show so lets try smth else
/* class B extends A{
    public void show(){
        System.out.println("in B show");
    }
} */

public class combined {
    public static void main(String[] args) {
        //implement method/interface only once
        A obj= new A(){
            public void show(){
                System.out.println("in B show");
            }
        };
        obj.show();
        
    }
    
}
