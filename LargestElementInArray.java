public class Main
{
	public static void main(String[] args) {
		int arr[] = {12,3,24,6,8};
		System.out.println(largest(arr));
	}
	static int largest (int arr[]){
	    int res = 0;
	    for (int i=0;i<arr.length;i++){
	        if(arr[i]>arr[res])
	           arr[res]=arr[i];
	       
	    }
	     return arr[res];    
	}
}
