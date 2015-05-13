#Problem: Find the sum of the digits in the number 100!

def fat(n):
	if(n == 1):
		return 1
	else:
		return n * fat(n-1)

		
sum = 0		
fat = fat(100)
fat = str(fat)
for i in range(len(fat)):
	sum += int(fat[i])

	
print("The sum is",sum) #outputs 648
