public class Main
{
  public static void main (String[]args)
  {
    int arr[] = new int[5], cap = 5;
      arr[0] = 1;
      arr[1] = 3;
      arr[2] = 4;
      arr[3] = 5;
      arr[4] = 2;
      
    int n = arr.length;
    for (int i = 0; i < n; i++)
      {
	System.out.print (arr[i]);
      }
    System.out.println ();
    int x = 4;
    n = delete (arr,x,n);
    System.out.println ("After Deletion");
    for (int i = 0; i < n; i++)
      {
	System.out.print (arr[i]);
      }
  }
  static int delete(int arr[],int x, int n){
       int i;
      for(i=0;i<n;i++){
          if(arr[i]==x){
              break;
          }
      }
          if(i==n){
              return n;
          }
          for (int j=i;j<n-1;j++){
              arr[j]=arr[j+1];
          }
      
      return n-1;
  }

}
