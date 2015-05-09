/*
	it finds the sum of the even-valued terms of Fibonacci Sequence that are below to 4000000
*/

#include <stdio.h>
#define LIMIT 4000000


int main(int argc, char** argv)
{
	int a;
	int b;
	int c;
	int sum;
	a   = 1;
	b   = 1;
	c   = a + b;
	sum = 0;
	while(c <= LIMIT){		
		c = a + b;
		a = b;
		b = c;
		if(c % 2 == 0) sum += c;
		
	}
	printf("The sum is %d",sum); // outputs 4613732
	return 0;
}
