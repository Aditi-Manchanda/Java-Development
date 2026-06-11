//Wrapper Classes

/*Every primitive type has a class
int->Integer
char->Character
double->Double*/
public class wrapper {
    public static void main(String[] args) {
        int num=7;
        // Integer num1= new Integer(num);  //Boxing:taking a primitive value and saving in a wrapper object
        Integer num1=8;  //autoboxing

        int num2= num1.intValue(); //unboxing

        // int num2=num1;   auto-unboxing
        
        String str="12";
        // System.out.println(str*2); error as operations not poss in str
        int num3= Integer.parseInt(str);
        System.out.println(num3*2); //24

    }
    
}
