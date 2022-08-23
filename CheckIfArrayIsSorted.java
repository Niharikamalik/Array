public class Main
{
	public static void main(String[] args) {
		int arr[] = {12,3,24,6,8},n=5;
		System.out.println(sortArray(arr,n));
	}
	static boolean sortArray (int arr[],int n){
	    
	    for (int i=1;i<arr.length;i++){
	        if (arr[i]<arr[i-1]){
	            return false ;
	        }
	       
	    }
	    return true ;
	  }
}
