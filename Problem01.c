/*  
  returns the sum of all numbers below 1000 that are ultiples of 3 or 5
*/
#include <stdio.h>

int main(int argc, char** argv){
	int i;
	int sum;
	sum = 0;
	for(i = 3; i < 1000;i+=1){
		if(i % 3 == 0 || i % 5 == 0){
			sum+=i;
		}
	}
	
	printf("The sum is equal to %i",sum); // result 233168
	
	return 0;
}
