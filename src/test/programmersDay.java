
package test;

import java.util.Scanner;

public class programmersDay {
    
       private static String cal;
       private static String programmersDay;
       private static int months = 31+31+30+31+30+31+31;
       private static int feb;
       private static int sept;

    static String solve(int year)
    
    {
        
        if(year == 1918)
        {
            
            
            cal = "Julian";
        
            if(year % 4 == 0){
            feb = 29 - 13;
            }else{
            feb = 28 - 13;
            }
          
            
        }
        
        else if(year < 1918){
            
            
            cal = "Julian";
            
            if (year % 4 == 0){
            feb = 29;
            }else{
            feb =28;
            }
            
            
        }
        else{
            
            
            cal = "Gregorian";
            
            if( (year % 400 == 0)  ||  ((year % 4 == 0) && !(year % 100 == 0)) )
            {
                feb = 29;
            }else{
                feb = 28;
            }
            
            
        }
        
        //________________________________________________________________
     
            sept = 256 - (months+feb); 
            
            programmersDay = (sept+"."+"09."+year);
            
       
    return programmersDay;
}

    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        
        while(year  < 1700 || year > 2700){
            year = in.nextInt();
        }
        
        String result = solve(year);
        System.out.println(result);
        
    }
}
