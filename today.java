public class today{
	public static void main(String[] args){
		int[]array={1,2,3,4,5};
		int maxValue=max(array);
		int[]array1={97,95,93,96};
	System.out.println("最大值"+maxValue);
	int index=indexOf(array,2);
	System.out.println("2的下标"+index);
	double averageScore=average(array1);
	System.out.println("平均分"+averageScore);
	}
	public static int max(int[] array){
		int maxValue=array[0];
	  for(int i=0;i<array.length;i++)
	  {
		  if(array[i]>maxValue)
		  {
			  maxValue=array[i];
		  }
	  }
	  return maxValue;
	}
	public static int indexOf(int[]array,int key){
		for(int i=0;i<array.length;i++)
		{    
			if(array[i]==key)
			{
				return i;
			}
		}
		return -1;
}
public static double average(int[] scores){
	int minValue=scores[0];
	int maxValue=scores[0];
	int sum=0;
	for(int i=0;i<scores.length;i++)
	{    
		if(scores[i]>maxValue)
		  {
			  maxValue=scores[i];
		  }
		  if(scores[i]<minValue)
		  {
			  minValue=scores[i];
		  }
		  sum+=scores[i];
	}
	return (double)(sum-maxValue-minValue)/(scores.length-2);
}
}

	