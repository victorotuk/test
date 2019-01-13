package test;

import java.util.Scanner;


public class magicSquare {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[][] s = new int[3][3];
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                s[i][j] = in.nextInt();
            }
        }
        // Print the minimum cost of converting 's' into a magic square
        
        // We need to check the sum of the rows, columns and diagonals in the array to see if they are different;
        
        // We want to be able to check if they are different
        
        // we want to say that if they are different then check how much the difference is to make the sum 
        // smaller and equal to each other
        // , or larger and equal to 15.
        
        // to check the step above  we would have to, know the difference in every 
        
       int min=0;
       int max;
       int sum=0;
       int total;
       int i=0;
       int j=0;
                
       int topRow = s[i][j] + s[i][j+1] + s[i][j+2];
       System.out.println("the top row comes out to ="+ topRow);
       
       int secRow = s[i+1][j] + s[i+1][j+1] + s[i+1][j+2];
       System.out.println("the sec row comes out to ="+ secRow);
       
       int lastRow = s[i+2][j] + s[2][1] + s[2][2];
       System.out.println("the last row comes out to ="+ lastRow);
       
       int firstCol = s[0][0] + s[1][0] + s[2][0];
       System.out.println("the 1st col comes out to ="+ firstCol);
       
       int secCol = s[0][1] + s[1][1] + s[2][1];
       System.out.println("the 2nd  col comes out to ="+ secCol);
       
       int thirdCol = s[0][2] + s[1][2] + s[2][2];
       System.out.println("the third col comes out to ="+ thirdCol);
       
       int lefDi = s[0][0] + s[1][1] + s[2][2];
       System.out.println("the  left diagoanl comes out to ="+ lefDi);
       
       int rightDi = s[0][2] + s[1][1] + s[2][0];
       System.out.println("the right diagonal comes out to ="+ rightDi);
       
       
       
       }
    
}
       
      
           
       
       
                
              // divertex
         
    
    

