public class Main
{
	public static void main(String[] args) {
		int arr[] = {12,3,24,6,8},n=5;
		System.out.println(secondLargest(arr,n));
	}
	static int  secondLargest(int arr[],int n){
	    int l=0,sl=-1;
	    for(int i=0 ;i<arr.length;i++){
	        if(arr[i]>l){
	            l=arr[i];
	        }
	    }
	    for(int i=0;i<arr.length;i++){
	        if (arr[i]>sl && arr[i]!=l){
	            sl=arr[i];
	        }
	    }
	    return sl;
	  }
}
