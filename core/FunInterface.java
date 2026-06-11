//Functional Interface

//Interfaces--> Normal, Functional, Marker
//2 or more methods: normal interface
//Single abstract method (SAM): functional interface
//no methods or blank interface: marker interface

//by default interfaces have public abstract methods


@FunctionalInterface
//makes sure it is SAM
interface A
{
	void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class FunInterface {
    public static void main(String[] args) {
    	//instantiate A by implementing A using anonymous inner class
    	A obj=new A()
    	{    	
    		public void show()
    		{
    			System.out.println("in Show");
    		}
    	};
 //   	A obj=new A();
 //   	A obj=new B();
    	obj.show();
    }
}

//Lambda Expressions can only be used with Functional Interfaces
