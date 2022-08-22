import java.util.Scanner;

class Main 
{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter "+n*m+ " values for array ");
        for (int i=0 ;i<n;i++){
            for(int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        }
         for (int i=0 ;i<n;i++){
            for(int j=0;j<m;j++)
               System.out.print(arr[i][j]+" ");
               
            System.out.println();   
        }
    }
}
