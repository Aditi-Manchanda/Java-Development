//Lambda Expression

@FunctionalInterface
interface A
{
//	void show();
	void show(int i);
//	void show(int i,int j);
	

}


public class lambda {
    public static void main(String[] args) {
    	
 //   	A obj=() -> System.out.println("in Show");  //if more than one statement use curly brackets
 //   	obj.show();
    	
 //the above can replace line 21 to 28
//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
    	
//if method show accepts a value
//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);
    	
//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);
    	
    	A obj=i -> System.out.println("in show "+i);
    	obj.show(5);
		//dont even need to method type of variable
    }
}
