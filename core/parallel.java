//Parallel Stream 

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallel {
    public static void main(String[] args) {
        
        int size= 10_000;
        List<Integer> nums = new ArrayList<>(10000);

        Random ran=new Random();
        ran.nextInt(100);

        for (int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));

        }
        System.out.println(nums);

        long startSeq= System.currentTimeMillis();

        int sum1=nums.stream()
                    .mapToInt(i -> i*2)
                    .reduce(0,(c,e) -> c+e);

        long endSeq= System.currentTimeMillis();
        
        int sum2= nums.stream()
                       .mapToInt(i -> i*2)    //returns int stream
                       .sum();

        long startPara= System.currentTimeMillis();

        int sum3= nums.parallelStream()
                       .mapToInt(i -> i*2)   
                       .sum();

        long endPara= System.currentTimeMillis();

        System.out.println(sum1+" "+sum2+" "+sum3);
        System.out.println("Seq1 : "+(endSeq-startSeq));
        System.out.println("Seq2 : "+(startPara-endSeq));
        System.out.println("Seq3 : "+(endPara-startPara));

        //Parallel stream will create threads and so it can take longer or shorter than normal


 
    }
    
}
