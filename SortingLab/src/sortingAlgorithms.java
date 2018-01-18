
public class sortingAlgorithms {

	
	public static void bubbleSort(String[] list1)
	{
		int swapCount = 0;
		while (swapCount<0)
		{
			swapCount = 0;
			
			for (int i = 0; i<list1.length-1; i++)
			{
				if (list1[i].compareTo(list1[i+1])>0)
				{
					swapMethods.swap(list1, i, i+1);
					swapCount++;
				}
			}
		}
	}
	
	
	public static void insertionSort(int[] list1)
	{	
			
	}
	
	// 6    2    8    5
	public static void selectionSort(double[] list1)
	{
		int swapCount = 0;
		while (swapCount<0)
		{
			swapCount = 0;
			
			for (int i = 0; i<list1.length-1;)
			{
				if (list1[0]>list1[i])
				{
					swapMethods.swap(list1, 0, i);
					swapCount++;
					i++;
					list1[0] = list1[i];
				}
			}
		}
	}
}
