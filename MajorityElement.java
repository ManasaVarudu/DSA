package adhocthinking;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println(solution(a));
		sc.close();
	}
	public static int solution(int a[])
	{
		int maj = a[0];
		int freq = 1;
		int i;
		for(i=0;i<a.length-1;i++)
		{
			if(freq==0)
				{freq=1;maj = a[i];}
			if(a[i]==a[i+1])
				{freq++;}
			else
				freq--;	
		}
		if(freq==0)
		{freq=1;maj = a[i];}
		
		return maj;
	}

}
