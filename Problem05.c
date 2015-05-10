/*
	Problem: What is the smallest positive number that is evenly divisible by all of the 
	numbers from 1 to 20?
	gcc version:4.4.1
	executed in: 4.313 //bad,too bad, I know it
*/


#include <stdio.h>
#include <stdbool.h>

bool is_divided_by_1_to_20(int n);


int main(int argc, char** argv)
{
	for(int i = 1;;i++){
		if(is_divided_by_1_to_20(i)){
			printf("%d",i);
			break;
		}
	}
	return 0;
}

bool is_divided_by_1_to_20(int n){
	
	for(int i = 2; i < 21;i++){
		if(!(n % i == 0)){
			return false;
		}
	}
	
	return true;
}
