/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]= {10,20,40,30,50};
	    int []rarr= new int[arr.length];
	    int j =0 ;
	    for(int i=arr.length-1; i>=0; i--){
	         rarr[j]=arr[i];
	         j+=1;
	    }
	    for(int i=0; i<rarr.length; i++){
	        System.out.println(rarr[i]);
	    }
	  	}
}
