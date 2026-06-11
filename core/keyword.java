// Final- variable, method, class
class Calc{
    final public void show(){
        System.out.println("in Calc show");

    }
    public void add(int a, int b){
        System.out.println(a+b);

    }
} 
//class AdvCalc extends Calc{}
//making a class final stops inheritance so it gives an error if Calc is final

class AdvCalc extends Calc{
    /*public void show(){
        System.out.println("in AdvCalc show");
    } */ 
   //cant override a final method
}
public class keyword {
    public static void main(String[] args) {

        Calc obj= new Calc();
        obj.show();
        obj.add(4,5);


        //final variable
        int num=8;
        num=9;
        System.out.println(num);

        final int no=5;
        // no=6;  this will give error as a final variable value cant be changed
        
    }
    
}
