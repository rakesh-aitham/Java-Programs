/*
Minimum Gifts

A Company has decided to give some gifts to all of its employees. For that, the company has given some rank to each employee. Based on that rank, the company has made certain rules to distribute the gifts.
The rules for distributing the gifts are:
Each employee must receive at least one gift.
Employees having higher ranking get a greater number of gifts than their neighbors.
What is the minimum number of gifts required by the company?

Constraints
1 < T < 10
1 < N < 100000
1 < Rank < 10^9

Input

First line contains integer T, denoting the number of test cases.
For each test case:
First line contains integer N, denoting the number of employees.
Second line contains N space separated integers, denoting the rank of each employee.

Output

For each test case print the number of minimum gifts required on a new line.

Example 1

Input

2

5

1 2 1 5 2

2

1 2

Output

7

3

Explanation

For test case 1, adhering to the rules mentioned above,
Employee # 1 whose rank is 1 gets one gift
Employee # 2 whose rank is 2 gets two gifts
Employee # 3 whose rank is 1 gets one gift
Employee # 4 whose rank is 5 gets two gifts
Employee # 5 whose rank is 2 gets one gift
Therefore, total gifts required is 1 + 2 + 1 + 2 + 1 = 7

Similarly, for testcase 2, adhering to rules mentioned above,
Employee # 1 whose rank is 1 gets one gift
Employee # 2 whose rank is 2 gets two gifts
Therefore, total gifts required is 1 + 2 = 3
 */
import java.util.Scanner;
public class Gifts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			int gifts[] = new int[n];
			gifts[0] = 1;
			// Left to right 
			for(int i=1;i<n;i++)
			{
				if(arr[i]>arr[i-1])
					gifts[i] = gifts[i-1]+1;
				else
					gifts[i] = 1;
			}
			// Right to left
			for(int i=n-2;i>=0;i--)
			{
				if(arr[i]>arr[i+1] && gifts[i]<=gifts[i+1])
					gifts[i] = gifts[i+1]+1;
			}
			long total = 0;
			for(int gift : gifts)
				total=total+gift;
			System.out.println(total);
		}
	}
}

