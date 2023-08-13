package adhocthinking;

import java.util.*;
public class MinAndMaxElements {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		solution(a);
		sc.close();
	}
	public static void solution(int a[])
	{
		int n = a.length;
		int mini = Integer.MAX_VALUE;
		int maxi = Integer.MIN_VALUE;
		int i;
		
		if(n==0) 
		{
			mini = -1;
			maxi = -1;
			System.out.println("The array is empty");
		}
		else if(n==1)
		{
			mini = a[0]; 
			maxi = a[1];
			System.out.println("The arrays contians single element");
		}
		else
		{
			if(a[0]<=a[1])
			{
				mini = a[0];
				maxi = a[1];
			}
			else
			{
				mini = a[1];
				maxi = a[0];
			}
			if(n>2)
			{
				for(i=2;i<n-1;i=i+2)
				{
					if(a[i]<=a[i+1])
					{
						if(a[i]<mini)
							mini = a[i];
						if(a[i+1]>maxi)
							maxi = a[i+1];
					}
					else
					{
						if(a[i]>maxi)
							maxi = a[i];
						if(a[i+1]<mini)
							mini = a[i+1];
					}
				}
				//if the array contains odd no. of elements
				if(i<n) 
				{
					if(a[i]<mini)
						mini=a[i];
					else if(a[i]>maxi)
						maxi = a[i];		
				}
			}	
		}
		System.out.println("Minimum = "+mini+"\nMaximum = "+maxi);
		
	}
}
