import java.util.*;

class QuickSort{


public static void main(String[] args){

	int ar[]= new int[10];

	ar[0]=6;
	ar[1]=8;
	ar[2]=2;
	ar[3]=4;
	ar[4]=5;
	ar[5]=3;
	ar[6]=9;
	ar[7]=20;
	ar[8]=13;
	ar[9]=11;
	
	quickSort(ar,0,9);
	
	System.out.println("Sorted array is: ");
	for(int i=0;i<10;i++){
	
		System.out.print(ar[i]+", ");

	}

}


static void quickSort(int[] ar, int s, int e){

if(s<e){

	int q = partition(ar,s,e);
	quickSort(ar,s,q-1);
	quickSort(ar,q+1,e);

}


}//end sort

static int partition(int[] ar, int s, int e){

int x= ar[s];
int i=s;
int j = e;


while(true){

	while(!(ar[j]<=x))
		j--;		
	
	while(!(ar[i]>=x))
		i++;

	if(i<j){

	int tmp = ar[i];
	ar[i] = ar[j];
	ar[j]=tmp;
		
	}

	else
		return j;


}//end while



}

}//end class