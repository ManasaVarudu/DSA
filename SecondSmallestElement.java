package adhocthinking;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Random;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int inp[] = new int[n]; 
//	     Random r = new Random();
//	     for(int i=0;i<n;i++)
//	     inp[i]=r.nextInt();
	     for(int i=0;i<n;i++)
	     inp[i]=sc.nextInt();
	     
	     System.out.println(Arrays.toString(inp));
	     System.out.println(secondSmallest(inp,n));
	     sc.close();

	}
	public static int secondSmallest(int inp[],int n)
	{
		int tt[] = new int[(2*n)-1]; //tt --> tournament tree
		// filling the tt array from right to left
		int j = tt.length-1;
		for(int i=inp.length-1;i>=0;i--)
		{
			tt[j]= i;
			j--;
		}
		
		//Tree construction
		// Finding first smallest element
			for(int i=tt.length-1;i>=2;i=i-2)
			{
				
				if(inp[tt[i]]<=inp[tt[i-1]])
					tt[(i-1)/2] = tt[i];
				else
					tt[(i-1)/2] = tt[i-1];
			}
			
		// replacing first largest value with infinity and comparing the respective portion
		//Finding second smallest element
		
		inp[tt[0]] = Integer.MAX_VALUE;
		int f_ind = tt.length-(n-tt[0]);
		while(f_ind>0) 
		{
			if(f_ind%2 ==0)
			{
				//compare with left element
				if(inp[tt[f_ind]]< inp[tt[f_ind-1]])
					tt[(f_ind-1)/2] = tt[f_ind];
				else
					tt[(f_ind-1)/2] = tt[f_ind-1];
				
				
			}
			else
			{
				//compare with right element
				if(inp[tt[f_ind]]< inp[tt[f_ind+1]])
					tt[(f_ind-1)/2] = tt[f_ind];
				else
					tt[(f_ind-1)/2] = tt[f_ind+1];
			}
			f_ind = (f_ind-1)/2;
		}
		
		
		
		
		
		System.out.println(Arrays.toString(tt));
		return inp[tt[0]];
	}

}
