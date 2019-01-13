package test;

import java.util.*;
/**
 *
 * @author vick
 */
public class Test {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
       
        int a = ((a0>b0)?1:0)+((a1>b1)?1:0)+((a2>b2)?1:0);
        int b = ((a0<b0)?1:0)+((a1<b1)?1:0)+((a2<b2)?1:0);
        int [] Z = {a,b};
        
        return Z;// Complete this function
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        
        
        }

    }//once you create a lake the frogs cone(ambigous, make the environment and find clues for the user to find it.
//)

//it is because when tunneling a particle you have to move according to certain conditions. like going steady and accurate.abstract
}
