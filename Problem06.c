/*
	Problem:Find the difference between the sum of the squares of the first one hundred natural 
	numbers and the square of the sum.
	gcc version: 4.4.1
	executed in 0.020s
*/

#include <stdio.h>
#include <math.h>


int main(int argc, char** argv)
{
	int i;
	int sum1;
	int sum2;
	sum1 = pow(((((1 + 100)*100)/2)),2); //using arithmetic progression sum formula
	sum2 = (100*(100+1)*(2*100+1)/6); //knowing that the sum of the n first square integers
									//is given(n(n+1)(2n+1))/6
	
	printf("sum1 = %d and sum2 = %d --- %d - %d=%d",sum1,sum2,sum1,sum2,sum1-sum2);
	return 0;
}
