//Problem: What is the sum of the digits of the number 2^1000?

import java.math.BigDecimal;

public class Problem16 {

		
	
	public BigDecimal exp(int base,int exp){
		BigDecimal b = new BigDecimal(Integer.toString(base));
		
		return b.pow(exp);
	}
	
	
	int exp1(int n){
		int r = 1;
		for(int i = 0; i < n;i++){
			r*=2;
		}
		return r;
	}
	public int sumDigits(String strNumber){
		int sum = 0;
		for(int i = 0; i < strNumber.length();i++){
			sum+= Integer.parseInt(Character.toString(strNumber.charAt(i)));
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int sum = new Problem16().sumDigits(new Problem16().exp(2,1000).toString());
		System.out.println("The sum is " + sum);
	}

}
