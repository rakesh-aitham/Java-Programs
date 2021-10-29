
public class Main {
	static void altTab(int a[], int n, int k)
	{
		int index = 0;
		index = k%n; // 3%5=3
		int x = index;
		int id = a[index];
		while(x>0)
		{
			int p = x;
			x--;
			a[p]=a[x];
		}
		a[0]=id;
	}
	public static void main(String[] args) {
		int a[] = {3,5,2,4,1};
		int n = a.length;
		int k=3;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");// 3 5 2 4 1
		}
		altTab(a,n,k);
		System.out.println("\n");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");// 4 3 5 2 1 
		}
	}

}
