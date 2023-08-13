package adhocthinking;
import java.util.*;
public class Nextpermutation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int a[] = new int[n];
	     
	     for(int i=0;i<n;i++)
	     a[i]=sc.nextInt();
	     nextPermutation(a);
	     
	     System.out.println(Arrays.toString(a));
	     sc.close();
	}
	
	  public static void nextPermutation(int a[])
	    {
	        int i;
	        int n = a.length;
	        for( i=n-1;i>0;i--) 
	        	if(a[i-1]<a[i])break;

	        if(i<0)return;
	            
	        int maxi = i;
	        for(int j=i;j<n;j++)
	        {
	            if(a[i-1]<a[j] && a[j]<=a[maxi])
	            maxi = j;
	        }
	        
	        swap(a,i-1,maxi);
	        reverse(a,i,n-1);
	        
	        
	    }
	    public static void reverse(int a[], int i,int j)
	    {
	       while(i<j)
	       {
	           swap(a,i,j);
	           ++i;--j;
	       }
	    }
	    public static void swap(int a[],int i, int j)
	    {
	        int x = a[i];
	        a[i] = a[j];
	        a[j] = x;
	    }

}
