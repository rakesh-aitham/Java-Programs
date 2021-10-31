import java.util.*;
public class Prime {
	public static void main(String[] args)
	{/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int cn,count,i,j;
		for(i=1;i<=num;i++)
		{
			cn=i;
			count=0;
			for(j=1;i<=cn;j++)
			{
				if(cn%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(" "+cn);
			}
		}
		}

}
