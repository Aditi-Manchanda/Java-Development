//Stream API

//with stream you can do any operation without changing existing values

import java.util.Arrays;
import java.util.List;

public class stream2 {
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

//  STREAM IS AN INTERFACE (Once a stream is used, we cant reuse it)


//    	Stream<Integer> s1=nums.stream();  
//    	Stream<Integer> s2= s1.filter(n ->n%2==0);    //get even numbers
//    	Stream<Integer> s3= s2.map(n->n*2);    //with map u can perform operation: here I am doubling the value
//    	int result=s3.reduce(0,(c,e)->c+e);    //reduce will give a value 
//    	
//    	s2.forEach(n -> System.out.println(n));
//    	s3.forEach(n -> System.out.println(n));
//    	
//    	s1.forEach(n-> System.out.println(n));
//   	s1.forEach(n-> System.out.println(n));
    	
    	int result=nums.stream()
    					.filter(n-> n%2==0)
    					.map(n->n*2)
    					.reduce(0, (c,e)-> c+e);
    	System.out.println(result);
    	
    	
    }
}
