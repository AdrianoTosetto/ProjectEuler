/*
* Problem 21
* Question: https://projecteuler.net/problem=21
*
 */
package kdjsad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Problem3 {
    
    public ArrayList<Integer> getDivisors(int n){
        ArrayList divisors = new ArrayList<Integer>();
        for(int i = 1;i <= n/2;i++){
            if(n % i == 0 && n != i){
                divisors.add(i);
            }
        }
        
        return divisors;
    }
    public int sumList(ArrayList l){
        int sum = 0;
        for(int i = 0; i < l.size();i++){
            sum += (int)l.get(i);
        }
        
        return sum;
    }
    public boolean amicableNumbers(int a,int b){
        if(this.sumList(this.getDivisors(a)) == b){
            if(this.sumList(this.getDivisors(b)) == a){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int sum = 0;
        Problem3 p = new Problem3();
        for(int i = 0; i < 10000;i++){
            for(int j = i; j < 10000;j++){
                if(p.amicableNumbers(i, j) && j != i){
                    sum = sum +  i + j; 
                    System.out.println(i + " " + j);
                }
            }
        }
        
        System.out.println("The sum of all amicable numbers below 10000 is " + sum);
    }
}
