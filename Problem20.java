
import java.math.BigDecimal;

public class Problem20 {

		
	//Solution in Java for Project Euler number 20 problem
	public BigDecimal factorial(int n){
		BigDecimal fat = new BigDecimal("1");
		for(int i = 2; i <= n;i++){
			fat = fat.multiply(new BigDecimal(i));
		}
		
		return fat;
	}
	
	
	public int sumDigits(String strNumber){
		int sum = 0;
		for(int i = 0; i < strNumber.length();i++){
			sum+= Integer.parseInt(Character.toString(strNumber.charAt(i)));
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int sum = new Problem20().sumDigits(new Problem20().factorial(100).toString());
		System.out.println("The sum is " + sum);
	}

}
