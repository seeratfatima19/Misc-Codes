
class MaxSubarray{

public static void main(String[] args){

	int[] ar = new int[10];
	
	/*
	int max =100;
	int min= -100;
	
	for(int i=0;i<10;i++){
		
		ar[i]= Math.random() * (max-min+1) + min;
	}
	*/
	
	ar[0] = 100;
	ar[1] = -10;
	ar[2] = 6;
	ar[3] = 33;
	ar[4] = -8;
	ar[5] = 44;
	ar[6] = -23;
	ar[7] = 19;
	ar[8] = 15;
	ar[9] = -2;
	
	
	int[] arr = max_subarray(ar);
	
	int sum =0;
	
	for(int i=0;i<arr.length;i++){
		
		sum+=arr[i];
		System.out.print(arr[i]+" , ");
	}
	
	System.out.println("Sum: "+ sum);
}


static int[] max_subarray(int[] ar){
	
	int start=0,end=0,max=0,sum=0;
	
	for(int i=0;i<ar.length-1;i++){
		
		sum =ar[i];
		
		for(int j=i+1;j<ar.length;j++){
			
			sum+= ar[j];
			
			if(sum>max){
				
				max = sum;
				start = i;
				end =j;
			}
		}
	}
	
	int arr[]= new int[end-start+1];
	int ind = start;
	for(int j=0;j<arr.length;j++){
		
		arr[j] = ar[ind];
		ind++;
		
	}
	
	return arr;
}



}