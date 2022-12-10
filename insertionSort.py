
def insertionSort(A):
	for j in range(1,len(A)):
		key = A[j]	
		i=j-1
		while i>=0 and A[i]>key:
			A[i+1]=A[i]
			i=i-1
		A[i+1] = key



def main():
	A = [5,2,4,6,1,3,9,7,5]
	insertionSort(A)
	
	for i in range(0,len(A)):
		print(A[i])


main()