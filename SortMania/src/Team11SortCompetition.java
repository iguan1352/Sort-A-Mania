
public class Team11SortCompetition {
	public static void main(String[] args)
	{
		/*int[] testList = {5, 1, 6, 2, 5, 3};
		System.out.println(challengeOne(testList));
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}*/
		
		int[][] testList = {{3, 1, 1, 5}, {6, 8, 10, 5}, {9, 2, -1, 0}, {8, 3, 1, 5}};
		System.out.println(challengeFour(testList));
	}
	
	public static int challengeOne(int[] list1)
	{
		selectionSort(list1);
		return (list1[list1.length/2 - 1] + list1[list1.length/2])/2;
	}
	
	public static int challengeTwo(String[] list1, String find)
	{
		bubbleSort(list1);
		for (int i = 0; i < list1.length; i++)
		{
			if(list1[i].compareTo(find) == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int challengeThree(int[] list1) 
	{ 
		insertionSort(list1); 
		return (list1[list1.length/2 - 1] + list1[list1.length/2])/2; 
	}
	
	public static int challengeFour(int[][] list1)
	{
		int[] medians = new int[4];
		for(int i =  0; i < list1.length; i++)
		{
			selectionSort(list1[i]); //sorts each row correctly (already tested)
			medians[i] = challengeOne(list1[i]);
		}	

		return challengeOne(medians);
		
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
	
	public static void bubbleSort(String[] list1)
	{
		boolean swap = false;
		while(!swap)
		{
			int numSwaps = 0;
			for(int i = 0; i < list1.length-1; i++)
			{
				String value;
				if(list1[i].compareTo(list1[i+1]) > 0)
				{
					value = list1[i+1];
					list1[i+1] = list1[i];
					list1[i] = value;
					numSwaps++;
				}		
			}
			if(numSwaps == 0) //the elements stops iterating when the number of swap is 0
			{
				swap = true;
			}
			
		}
	}
	
	public static void insertionSort(int[] list1)
	{
		for(int i = 0; i < list1.length-1; i++)
		{
			int value;
			if(list1[i] > list1[i+1]) //takes index i and compares it with with the index after i
			{
				//if index i is greater then it will swap with index i+1
				value = list1[i];
				list1[i] = list1[i+1];
				list1[i+1] = value;
				for(int j = i; j > 0; j--) //checks the value in the sub-sorted array(elements before i)
				{
					int value2;
					if(list1[j-1] > list1[j])
					{
						value2 = list1[j-1];
						list1[j-1] = list1[j];
						list1[j] = value2;
					}
				} 
			}
		}
	}
}
