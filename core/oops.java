class Calculator{ //create class
    int a=5; //put variable  //instance var
    public int add(int n1, int n2){ //put method   //n1,n2 are local var
        System.out.println("in add");
        System.out.println(a);
        int r= n1+n2;
        return r;
    } 
    public int add(int n1, int n2, int n3){        //method overloading- same name but diff input
        return n1+n2+n3;
    }
}

class Computer{ //class
    public void playMusic(){        //method
        //define behaviour here
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){
        return "Pen";
    }
}
    
public class oops {
    public static void main(String[] args) {
    
        //OBJECT ORIENTED PROGRAMMING
        //Object--> Properties & Behaviours
        //Class--> 
        int num1=4; 
        int num2=5;
        //int result = num1 + num2; //represent addition in seperate class

        Calculator calc = new Calculator(); //create object of type class
        calc.a=10;
        System.out.println(calc.a);  //value of a in object calc changes to 10
        int result= calc.add(num1, num2); //object reference

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);

    }
    
}
/* JVM MEMORY 
FIFO - Stack 
Heap
Every method has its own stack
Stack- 2 col (key,val)
obj is a ref var declared inside main and it will create an object inside heap memory
the var a=5 resides in heap memory
it will also have add(), playMusic(), getMeAPen() and have their address
obj.add() states there is a link btw main and heap
*/
