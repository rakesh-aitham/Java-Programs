
public class Main {
	static int occurence(int lower, int upper, int digit)
	{
		int count = 0;
		for(int i=lower;i<=upper;i++)
		{
			int temp = i;
			System.out.print(temp+" ");
			while(temp > 0)
			{
				if(temp%10==digit)
					count++;
				temp=temp/10;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int lower = 1, upper = 11, digit = 1;
		int ans = occurence(lower, upper, digit);
		System.out.println("\n"+ans);

	}

}
