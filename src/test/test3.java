package test;

import java.io.*;
import java.util.*;
/**
 *
 * @author Victor
 */
public class test3 {
    
    static String solution(int n){
        
        int x = 0, l=n;
      
        while(x < n){
            for(int j=0; j<l-1; j++) System.out.print(" ");
            for(int i=0; i<=x; i++) System.out.print("#");
         x++;
         l--;
         System.out.println();
}
        return null;
    }
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = solution(n);
}
}
