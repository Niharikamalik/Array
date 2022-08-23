class Solution {
  void swap(int[]arr,int a,int b)
  { 
      int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
      
  }
    void pushZerosToEnd(int[] arr, int n) {
        
        // code here
        int count =0;
        for(int i=0;i<n;i++)
        if(arr[i]!=0){
            swap(arr,i,count);
            count++;
        }
    }
}
