class Human{
    //Encapsulation
    private int age;     //making it private makes it accessible to only this class
    String name;

    //Constructor
    //public Human(){} can create a blank constructor as default
    public Human(){    //constructor has same name as class name  //default
        System.out.println("in constructor");
        //never returns anything
        age=12;
        name="John";  //default values if nth else is assigned
    }
    public Human(int a, String n){       //parameterized constructor
        age=a;
        name=n;
    }
    public Human (String name){     //in this case age=0
        this.name=name;
    }

    //private data can be accessed through methods
    public int getAge(){
        return age;
    }
    public void setAge(int a){  // a is local variable
        age=a;                  // age is instance variable
    }
    public void setName(String name, Human obj){   //passing refernce of old object
        //Human obj1 = new Human();    we are creating an new object and it doesnt work
        //name=name;   if above line is not done then both name are taken as local variable 
        Human obj1=obj; 
        obj1.age=age;
        //above two lines can be replaced with this.age=age; and then you dont need to pass obj in setName
        //this represents current object
    }
}


public class oops2 {
    public static void main(String[] args) {
        Human obj= new Human();
        Human obj1= new Human();  //irrespective of whether constructor is called or not it will be automatically called and so for 2 objects it will print in constructor twice
        Human obj2= new Human(18, "Navin");
        //obj.setAge(24);
        //obj.age=11;
        //obj.name="Navin";
        //obj.setName("Navin",obj);

        System.out.println(obj.getAge()); //we can access method
        System.out.println(obj.name);
    }
    
}
