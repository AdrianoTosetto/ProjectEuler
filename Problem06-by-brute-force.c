/*
	Problem:Find the difference between the sum of the squares of the first one hundred natural 
	numbers and the square of the sum.
	Solution by brute force
	gcc version: 4.4.1
	executed in 0.022s
*/

#include <stdio.h>



int main(int argc, char** argv)
{
	int i;
	int sum1;
	int sum2;
	sum1 = 0;
	sum2 = 0;
	for(i = 1; i < 101;i++){
		sum1+=i;
	}
	sum1 = sum1*sum1;
	for(i = 1; i < 101;i++){
		sum2+= i*i;
	}
	printf("sum1 = %d and sum2 = %d --- %d - %d=%d",sum1,sum2,sum1,sum2,sum1-sum2);
	return 0;
}
