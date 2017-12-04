
public class Team11SortCompetition {
	public static void main(String[] args)
	{
		int[] testList = {5, 1, 6, 2, 4, 3};
		System.out.println(standardSort(testList));
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}
	}
	
	public static int[] selectionSort(int[] list1)
	{
		int value = 0;
		while(value != list1.length)
		{
			for(int i = 0; i < list1.length; i++)
			{
				int swap;
				int min = list1[i];
				int minPos = i;
				for(int j = i; j < list1.length; j++) //finds the minimum value in an array
				{
					if(min > list1[j])
					{
						min = list1[j];
						minPos = j;
					}
				}
				if(list1[value] > min) 
				{
					swap = list1[value];
					list1[value] = min;
					list1[minPos] = swap;
					value++;
				}
				else 
				{
					value++;
				}
			}
		}
		return list1;
	}
	
	
	public static double standardSort(int[] list1)
	{
		selectionSort(list1);
		return (double)(list1[2] + list1[3])/2;
	}
}
