package test;

import java.util.Scanner;


public class Kangaroo {
  
    public static void main(String [] args){
        
      Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);  
        
    }

     static String kangaroo(int x1, int v1, int x2, int v2) {
     
         String ans = null;
         
         if(x2 > x1){
             if(v2 >= v1){
                 ans = "NO";
                 
             }else if((x1 - x2)%(v2 - v1)==0){
                 ans = "YES";
             }else{
                 ans = "NO";
             }
         }
         return ans;
     }
}
