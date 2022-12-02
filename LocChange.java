/* program to check the shift in ascending-descending array */

class LocChange{
    
    
    
    public static void main(String[] args){
        
        int[] arr= new int[10];
        
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 13;
        arr[3] = 20;
        arr[4] = 55;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        arr[8] = 15;
        arr[9] = 4;
        
        System.out.println(loc_change(arr,0,9));
    }
    
    
    static int loc_change(int[] arr, int s, int e){
        
        if(s==e)
            return s;
        
        int mid = (s+e-1)/2;
        
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            return mid;
            
        if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            return loc_change(arr,mid+1,e);
            
        if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
            return loc_change(arr,s,mid);
            
        return -1;
    }
    
}