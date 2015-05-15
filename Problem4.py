#Problem 4 from Project Euler
#Problem: Find the largest palindrome made from the product of two 3-digit numbers

def isPalindrome(s):
	s = str(s)
	reverse = s[::-1]
	return s == reverse
	
	
largest = -1;
for i in range(100,999):
	for j in range(100,999):
		if(isPalindrome(i*j)):
			if(largest < i*j):
				largest = i*j
				
			
print ("the largest palindrome made from the product of two 3-digit numbers is ",largest) #outputs 	906609
