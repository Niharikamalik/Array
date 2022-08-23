public class Main
{
	public static void main(String[] args) {
		int arr[] = {12,3,24,6,8};
		System.out.println("Before reverse");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After reverse");
		reverse(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
	static void reverse(int arr[]){
	    int low = 0 ,high=arr.length-1;
	    while(low<high){
	        int temp;
	        temp= arr[low];
	        arr[low]=arr[high];
	        arr[high]=temp;
	        low++;
	        high--;
	    }
	}
}
