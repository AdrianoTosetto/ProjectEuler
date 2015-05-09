/*
	Problem: A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	a*a + b*b = c*c. For example, 32 + 42 = 9 + 16 = 25 = 52.
	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
*/

#include <stdio.h>

int main(int argc, char** argv){
	
	int i;
	int j;
	int k;
	for(i = 1; i < 1000;i++){
		for(j = i; j < 1000;j++){
			for(k = j; k < 1000;k++){
				if(i*i + j*j == k*k && i + j + k == 1000){
					printf("%d * %d * %d = %d\n",i,k,j,i*j*k);
				}
			}
		 }		
	}
	return 0;
}
