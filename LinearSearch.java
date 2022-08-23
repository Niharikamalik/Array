public class Main
{
	public static void main(String[] args) {
		int arr[] = {2,4,3,5,6},x=3;
		int n=arr.length;
		System.out.println(search(arr,n,x));
	}
	 static int search (int arr[],int n,int x){
        	for (int i=0;i<n;i++){
		    if (arr[i]==x)
		       return i;
        	}
        	return -1;
    }
}
