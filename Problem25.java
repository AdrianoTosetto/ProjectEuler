/*
* Problem 25
* What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
*
 */
package kdjsad;

import java.math.BigDecimal;


public class Problem25 {
   
    public void fibonacci(){
        BigDecimal f1 = new BigDecimal("1");
        BigDecimal f2 = new BigDecimal("1");
        BigDecimal f3 = new BigDecimal("0");
        f3 = f3.add(f1).add(f2);
        int index = 3;
        while(f3.toString().length() <  1000){
           
            f1 = f1.subtract(f1);
            f1 = f1.add(f2);
            f2 = f2.subtract(f2);
            f2 = f2.add(f3);
            f3 = f3.subtract(f3);
            f3 = f3.add(f1).add(f2);
            index++;
           // System.out.println(f3);
        }
        System.out.println("The index of the first term in the Fibonacci sequence to contain 1000 digits is");
        System.out.println(index);
        
    }
    
    public static void main(String[] args){
        new Problem25().fibonacci();
    }
}
