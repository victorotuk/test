package test;

import java.util.*;


public class test7 {
    
     
     
    static String solution (int T, int x, int y){
       // bear in mind that we want to identify the position of the particle in the array.
      

       
       String victor =""; 
       
       int pos = 1;
       int [][] board = new int [15][15];
        
       
       
       board[x][y]= pos; 
        //System.out.print("this is position"+board[1][4]);
       for(){}; 
        
    return victor;
    }
    
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // we are declaring T and setting constraints for T, which is 
        int T = 0;
        int x,y;
        while( T < 1 || T > 225){
            T = sc.nextInt();
        }
        //we use a while loop to set the constraints for x and y
        for(int i = 0; i<T; i++){
          x = 0; y=0;
          while((x < 1 || x > 15) && (y < 1 || y > 15) ){
          x = sc.nextInt();
          y = sc.nextInt();
       }//i was worried about how the sytem would scan in the values for x and y with the spaces but it turns out, that is done automatically.
         //System.out.println(x+" "+y);
    }
        
        
    }
}
