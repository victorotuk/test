
package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




public class te$t4 {
    
  static long [] Solution(int [] arr){

      
     
     long min = arr[0];
     long max = arr[arr.length - 1];
     
     //System.out.println("before the iteration max is "+max+" and min is "+min );
     
     for(int i = 0; i < arr.length; i++){
       if (arr[i] < min){
           min = arr[i];
           
       }else if(arr[i] > max){
           max = arr[i];
       }      
    }
    //System.out.println("arr.length is " +arr.length);
    //System.out.println("after the iteration max is "+max+" and min is "+min );
    
    long sum = 0;
    
    for(int i = 0; i < 5; i++){
      sum += arr[i];
  }
    
    System.out.println("sum is "+sum);
    
    long maxSum = sum - min;
    long minSum = sum - max; 
    
    //System.out.println("the maxsum is "+maxSum+" while the minsum is "+minSum);
    
    long [] output = {minSum,maxSum};
   return output;
}
    
      public static void main(String[] args) {
          
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long [] result = Solution(arr);
        for(int i = 0; i < result.length; i++){
        System.out.print(result[i] + " ");
        }
    }


}
