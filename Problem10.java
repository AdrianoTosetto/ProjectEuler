/*
    * Solution for Euler Project problem number 20
    * Problem: Find the sum of all the primes below two million.
    *
 */
package kdjsad;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Sieve {
    public ArrayList<Integer> generatePrimesList(int limit){
        ArrayList primes = new ArrayList<Integer>();
        int index = 0;
        primes.add(2); //2 is the only prime that is even, so we add only odd numbers to the list
        int currentPrime = (int)primes.get(0);
        for(int i = 3; i <= limit;i+=2){
            primes.add(i);
        }
        while(currentPrime*currentPrime < limit){
            currentPrime = (int)primes.get(index);
            for(int i = 1; i < primes.size();i++){
                if((int)primes.get(i) % currentPrime == 0 && currentPrime != (int)primes.get(i)){
                    primes.remove(i);
                    
                }
            }
            
            index++;
        }
        
        return primes;
    }
    
    public BigDecimal sumPrimes(ArrayList<Integer> primes){
        BigDecimal sum = new BigDecimal("0");
        for(int i = 0; i < primes.size();i++){
            sum = sum.add(new BigDecimal(primes.get(i).toString()));
        }
        
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of all primes below 2000000 is ");
        System.out.println(new Sieve().sumPrimes(new Sieve().generatePrimesList(2000000)));
    }
    
}
