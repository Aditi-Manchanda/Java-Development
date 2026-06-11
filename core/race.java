//Race Condition

//Threads and Mutation together are bad try to work on threads with immutable objects


class Counter
{
	int count;
//	public void increment()
	public synchronized void increment()
	//synchronized keyword makes sure only one thread works at a time and we get apt result
	//using this the count will be 2000 for sure
	{
		count++;
	}
}

public class race {
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    	
    	t1.join();
    	t2.join();
    	
    	System.out.println(c.count); //it gives different output every time and none is 2000 which we expected
		//t1 called 1000 times and t2 called 1000 times
		//main is printing count before t1 and t2 come back and their work is complete
		//to make main wait we write the join method
		//still they dont give 2000 every time as threads are unpredictable
    }
}

    

