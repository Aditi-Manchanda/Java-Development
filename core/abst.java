//Abstract Classes
abstract class Car{
    //abstract method can be implemented by abstract class so make the class abstract
    public abstract void drive();  //declared here and defined in subclass
    public void playMusic(){
        System.out.println("play music");

    //abstract class can have normal methods and no methods at all also
    }

}
class WagonR extends Car{   //concrete class
    //it is compulsory to define all abstract methods or you will have to make the subclass also abstract
    public void drive(){
        System.out.println("Driving...");
    }


}
//objects can be created of only concrete class
public class abst {
    public static void main(String[] args) {
        //cant create object of abstract class so
        Car obj=new WagonR();
        obj.drive();
        obj.playMusic();


    }
    
}
