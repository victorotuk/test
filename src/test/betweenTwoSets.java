package test;

import java.util.Scanner;

public class betweenTwoSets {
    
    //https://www.hackerrank.com/challenges/between-two-sets/problem

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

    static int gcd(int a, int b){
        while( a > 0 && b > 0 ){
            if( a >= b ){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        return a+b;
    }
    
    static int lcm(int a, int b){
    
        return (a/gcd(a,b))*b;
    
    }
    
  static int getTotalX(int[] a, int[] b) {
      
        //find the lcm of the elements in a[]
        //find the gcd of the elements in b[]
        //count the number 
        
        int multiple = 0;
        int totalX =0;
        
        for( int i : b){
            multiple = gcd(multiple, i);
        }
        
        int factor = 1;
        
        for (int i: a){
            factor = lcm(factor, i);
            if(factor > multiple){
                return 0;
            }
        }
        
        if(multiple % factor !=0){
        return 0;
        }
        
        for(int i = factor; i < multiple; i++){
            if(multiple % i == 0 && i % factor == 0){
                totalX++;
            }
        }
        return totalX;
    }
}
