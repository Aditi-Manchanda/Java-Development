//Anonymous Inner Class

class A{
    public void show(){
        System.out.println("in A show");
    }
}
/*class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}*/
public class annonIn {
    public static void main(String[] args) {
        //create object like this
        A obj= new A()
        {
            public void show(){
                System.out.println("in new show");
            } 
        };
        
        obj.show();
        
    }
    
}
