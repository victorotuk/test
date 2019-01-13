
package test;

import java.util.*;


 
class a {
    
    static double [] plusMinus(int n, int [] a){
    
        double totalPositiveNumbers = 0;
        double totalNegativeNumbers =0;
        double zros = 0;
        
        
        for(int i =0; i < n; i++){
            if( a[i] > 0){
                
                totalPositiveNumbers++;
                
            }else if(a[i]<0){
                
                totalNegativeNumbers++;
                
            }else{
                
                zros++;
                
            }
        }
        
        System.out.println("the total number of positive numbers are "+totalPositiveNumbers);
        System.out.println("the total number of positive numbers are "+totalNegativeNumbers);
        System.out.println("the total number of positive numbers are "+zros);

        
       
        double fractionPos = totalPositiveNumbers/n; 
        double fractionNeg = totalNegativeNumbers/n;
        double fractionZros = zros/n;
               
        System.out.println("frac of pos = "+fractionPos+" frac of neg ="+fractionNeg+" frac of zro = "+fractionZros);
        
        double [] solArr = {fractionPos, fractionNeg, fractionZros};
        
        return solArr;
        
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i = 0; i < n; i++){
               a[i] = sc.nextInt();
            }
            
            
            double [] result = plusMinus(n, a);
            
        for(int i =0; i<result.length;i++){
        System.out.println(result[i]);
      }
}
        
       
}
