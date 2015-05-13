#What is the sum of the digits of the number 2^1000?

number    = pow(2,1000)
strNumber = str(number) 
sum = 0;

for i in range(len(strNumber)):
	sum+=int(strNumber[i])

	
	
print("The sum is ",sum)
