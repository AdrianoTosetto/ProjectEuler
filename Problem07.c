/*
  Problem: What is the 10 001st prime number?
  gcc version:4.4.1
  executed in: 3.108 s // bad, too bad, I know
*/

#include <stdio.h>
#include <math.h>
#include <stdbool.h>

bool is_prime(int n);

int main(int argc, char** argv)
{
	int i;
	i = 0;
	int next;
	next = 1;
	int prime;
	
	while(i < 10002){
		next++;
		if(is_prime(next)){
			i++;
			prime = next;
		}
		
	}
	
	printf("%d",prime); //outputs 104743
	return 0;
	
}

bool is_prime(int n){
	if(n < 2) return false;
	int i;
	for(i = 2; i < n/2;i++){
		if(n % i == 0) return false;
	}

	return true;
}
