import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/*
import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){   
    	
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	nums.add(6);
    	//nums.add("5");
    	
    	for(Object n:nums)
    	{
    		int num=(Integer)n;
    		System.out.println(num+2);
    	}
    }
	//In HashSet we get values in random format and also we cant have duplicate value
	//HashSet just shows unique values
	//TreeSet gives sorted values
}
*/


public class sets {
    public static void main(String[] args){   
    	
//    	Set<Integer> nums=new HashSet<Integer>();  	
//    	Set<Integer> nums=new TreeSet<Integer>();
    	Collection<Integer> nums=new TreeSet<Integer>();
    	nums.add(62);
    	nums.add(54);
    	nums.add(82);
    	nums.add(21);
    	
    	//nums.add("5");
    	
    	Iterator<Integer> values = nums.iterator();
    	// Iterable is a interface above Collection 
    	while(values.hasNext())
    		System.out.println(values.next());
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(n);
//   	}
    }
}




    

