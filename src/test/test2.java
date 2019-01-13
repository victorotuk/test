package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test2 {

    
     static int diagDiff( int n, int a[][]){
     int sum1 = 0;
     int sum2 = 0;
     int i=0;
        
        
            for(int j = n-1; j >= 0; j--)
            {
            sum1 += a[i][i];
                
            sum2 += a[i][j];
                
            i++;
            }
            
               
         int diff= Math.abs(sum1 - sum2);
        //diff= sum1; 
        return diff;
 }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
         Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[][] a = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j=0; j< n; j++){
          a[i][j]= in.nextInt();
        }
        }
        
        int result = diagDiff(n, a);
        System.out.println(result);
        
    }
}