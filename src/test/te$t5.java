package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class te$t5 {
    
    static int birthdayCakeCandles(int n, int[] ar) {
        int candleCount=0;
        int max = ar[0];
        
        if (n >= 1 && n <= 10000000){
          for (int i = 0; i < n; i++) 
          {
             if(ar[i] > max){
                 
                max = ar[i];  
                
            } 
          } 
          for (int i = 0; i < n; i++){
              if(max == ar[i]){
                  candleCount++;
              }
          }
          
          //System.out.println("max is " +max);
            
        }else{
            
         System.out.println("n is out of bounds");
         
        }
        
        
        
        return candleCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
