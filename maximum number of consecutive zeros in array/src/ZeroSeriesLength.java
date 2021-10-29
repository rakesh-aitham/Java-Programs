
public class ZeroSeriesLength {

	public static void main(String[] args) {
		int[] values = {1,2,0,0,2,4,0,2,0,0,0,5,0,0,0,0,0,0,7,0};
		int tempLength = 0;
		int maxLength = 0;
		
		for(int i=0;i<values.length;i++)
		{
			if(values[i]==0)
			{
				tempLength++;
			}
			else
			{
				tempLength=0;
			}
			if(tempLength>maxLength)
			{
				maxLength = tempLength;
			}
		}
		System.out.println("Maximum number of consecutive zeros:"+maxLength);
	}

}
