class Mobile{
    String brand;  //instance variable
    int price;
    static String name;  //same for all objects

    //to instantiate variable
    public Mobile(){  //called by each object seperately
        brand=""; //default values
        price=200;
       // name="Phone"; dont use
    }

    //static block will be called before method
    //first class loads then objects are instantiated and class loads only once
    //static block is called when class is loaded

    //if there is no object neither static block is called nor the constructors as class is not loaded
    //to load class irrespective of object is created or not we have a class "class" inside main

    static {   //static block //called only once
        name="Phone";
        System.out.println("in static block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    //static method
    public static void show1(){
        System.out.println("in static method");
        //System.out.println(brand + " : " + price + " : " + name);
        //this wont work as brand and price are non static variable and they dont have access in static method
    }
        public static void show1(Mobile obj){  //use non static variable with object reference
            System.out.println(obj.brand + " : " + obj.price + " : " + name);

        }
}


public class fundamentals {
    public static void main(String a[]){  //main is static bcz to call main we dont need object of the class fundamentals
        //Class.forName("Mobile");  //just instantiates the object but does not create it so the class is loaded
        Mobile obj1= new Mobile();
        obj1.brand= "Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone"; //bcz it is static call with class name itself

        Mobile obj2 = new Mobile();
        obj2.brand= "Samsung";
        obj2.price=1700;
        Mobile.name="SmartPhone";

        Mobile.name="Phone";

        obj1.show();
        obj2.show();

        Mobile.show1();
        //if u pass obj1 in mobile.show1 then u can use non instance variable in show1
        Mobile.show1(obj1);

    }
}
