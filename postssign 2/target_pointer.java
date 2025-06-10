package datastructures;
import java.util.Arrays;

public class target_pointer {
		    public static void main(String[] args) {
		      int[] a = {4,5,2,6,9,10};
		      int t = 8;
		      Arrays.sort(a);
		      int l=0, r=a.length-1;
		      while(l<r){
		        int s = a[l]+a[r];
		        if(s==t){System.out.println(a[l]+" "+a[r]); return;}
		        else if(s<t) l++; else r--;
		      }
		      System.out.println("No pair");
		    }
		  }