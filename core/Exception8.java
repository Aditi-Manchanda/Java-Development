//User Input using BufferReader and Scanner

import java.io.IOException;
import java.util.Scanner;

public class Exception8 {
    public static void main(String[] args) throws IOException{   	
    	
//    	System.out.println("Enter a number");
//      (to take input)
//    	int num=System.in.read();   //gives ASCII value 
//    	
//  	System.out.println(num);    //if input is 5 it displays 53 as ASCII value
//    	System.out.println(num-48);  //subtract 48 to give correct value not ASCII
    	
    	System.out.println("Enter a number");
    	
//    	InputStreamReader in=new InputStreamReader(System.in);
//    	BufferedReader bf=new BufferedReader(in);
    	
//    	int num=Integer.parseInt(bf.readLine());
//    	System.out.println(num);
//      bf.close();
//   	BufferedReader bf=new BufferedReader(null);   
// 	    System.out.println(num-48);
    	
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	System.out.println(num);
    }
}
