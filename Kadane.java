import java.util.*;


class Kadane{


public static void main(String[] args){



	int[] ar = new int[4];
	
	ar[0] = -2;
	ar[1] = 3;
	ar[2] = -1;
	ar[3] = 2;
	
	
	int sum = kadane_sum(ar);
	
	
	System.out.println("Sum: "+ sum);

}


static int kadane_sum(int[] arr){
	
	
	int currSum =0;
	int maxSum = Integer.MIN_VALUE;
	
	
	
	for(int i=0;i<arr.length;i++){
		
		currSum +=arr[i];
		
		if(currSum > maxSum){
			maxSum = currSum;
		}
		
		if(currSum <0){
			currSum=0;
		}
	}
	
	return maxSum;
}

}