/*
* Problem 13
* Question: https://projecteuler.net/problem=13
*
 */
package kdjsad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Problem3 {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BigDecimal bd = new BigDecimal("0");
        String path = "C:\\Users\\adriano\\Desktop\\file.txt";
        FileReader file;
        file = new FileReader(path);
        BufferedReader reader = new BufferedReader(file);
        String line = "";
        while((line != null)){
            line = reader.readLine();
            
           if(line != null){
               bd = bd.add(new BigDecimal(line));
           }
        }
        System.out.println(bd.toString().substring(0, 10));
    }
}
