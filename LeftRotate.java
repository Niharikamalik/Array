class LeftRotate{
  void leftRotate{
    if (n == 0)
         return;
    k = k % n;
    if (k > n)
     return;
    long temp[]=new long[k];
    for (int i = 0; i < k; i++)
     {
       temp[i] = arr[i];
     }
    for (int i = 0; i < n - k; i++)
    {
      arr[i] = arr[i + k];
   }
    for (int i = n - k; i < n; i++)
   {
     arr[i] = temp[i - n + k];
   } 
  }
}
