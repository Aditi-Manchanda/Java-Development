//Ducking Exception using throws

/*
Throws Keyword

d()throws exception{
	//critical code
}
e()throws exception{{
	//critical code
} 
c(){
	//
	//
	try{
		d();
		e();
	}	
	catch{
	}
}

//main can also handle the exception - Ducking

*/

class NavinException extends Exception
{
	public NavinException(String string)
	{
		super(string);
	}
}

class A
{
	public void show() throws ClassNotFoundException
	{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
		
		Class.forName("Calc");
	}
}

//instead of class A we can do it in main also
public class Exception7 {
	
	static {
		System.out.println("Class Loader");
	}
	
    public static void main(String[] args) {
    	
//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find the class");
//    	}
    	
    	A obj=new A();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
			//it prints the entire stack as to which method is printing which method so that you can track easily 
    	}
    	
    	
    }
}
