public class Main
{
  public static void main (String[]args)
  {
    int arr[] = new int[5], cap = 5;
      arr[0] = 1;
      arr[1] = 3;
      arr[2] = 4;
    int n = 3;
    for (int i = 0; i < n; i++)
      {
	System.out.print (arr[i]);
      }
    System.out.println ();
    int x = 2, pos = 2;
    n = insert (arr, cap, n, x, pos);
    System.out.println ("After insertion ");
    for (int i = 0; i < n; i++)
      {
	System.out.print (arr[i]);
      }
  }
  static int insert(int arr[],int cap,int n, int x,int pos){
      if(n==cap)
          return n;
      int idx = pos-1;
      for(int i=n-1;i>=idx;i--){
          arr[i+1]=arr[i];
      }
      arr[idx]=x;
      
      return n+1;
  }

}
