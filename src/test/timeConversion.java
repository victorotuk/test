package test;

import java.util.Scanner;

public class timeConversion{
    
    static String timeConversion(String s){
        
    String [] a = s.split(":");
    String hours = a[0];
    String minutes = a[1];
    String seconds = a[2].substring(0, 2);
    String AMPM = a[2].substring(2,4);
    
    if(AMPM.equals("AM")){
        return((hours.equals("12")?"00":hours)+":"+minutes+":"+seconds);
    }
    
          
        return ((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);  
    }
    
    public static void main (String [] args){
    
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
    
    
}