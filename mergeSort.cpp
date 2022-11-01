#include<iostream>

using namespace std;
#define INFINI_TY 25567

void merge(int*& arr, int p, int q, int r)
{
	int n1= q-p+1;
	int n2 = r-q;
	int* left = new int[n1+1];
	int* right = new int[n2+1];
	
	for(int i=0;i<n1;i++)
	{
		left[i]=arr[p+i];
	}
	
	for(int i=0;i<n2;i++)
	{
		right[i]=arr[q+i+1];
	}
	
	left[n1]= INFINI_TY;
	right[n2]= INFINI_TY;
	
	
	int i=0,j=0;
	
	for(int k=p;k<=r;k++)
	{
		if(left[i]<right[j])
		{
			arr[k]=left[i];
			i++;
		}
		
		else{
			
			arr[k] = right[j];
			j++;
		}
	}
}




void mergeSort(int*& arr, int p ,int r)
{
	if(p<r)
	{
		int q = (p+r)/2;
		mergeSort(arr,p,q);
		mergeSort(arr,q+1,r);
		merge(arr,p,q,r);
		
	}
	
	return;
	
}

void mergeSort(int*& arr,int sz)
{
	mergeSort(arr, 0,sz-1);
}


int main()
{
	int* arr;
	int sz;
	
	cout<<"Enter the size of array: ";
	cin>>sz;
	
	arr= new int[sz];
	cout<<"Enter array elements: ";
	cout<<endl;
	
	for(int i=0;i<sz;i++){
		
		cin>>arr[i];
	
	}
	
	mergeSort(arr,sz);
	
	cout<<"Sorted array is: ";
	cout<<endl;
	
	
	for(int i=0;i<sz;i++){
		
		cout<<arr[i]<<"  ";
	
	}
	return 0;
}