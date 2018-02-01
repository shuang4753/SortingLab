
public class sortingAlgorithms {

	
	public static void bubbleSort(String[] list1)
	{
		
		int swapCount = 1;
		while (swapCount !=0)
		{
			swapCount = 0;
			
			for (int i = 0; i<list1.length-1; i++)
			{
				if (list1[i].compareTo(list1[i+1]) > 0)
				{
					swapMethods.swap(list1, i, i+1);
					swapCount++;
				}
			}
		}
	}
	
	
	public static void insertionSort(int[] list1)
	{
		int swapCount = 1;
		while (swapCount != 0)
		{
			swapCount = 0;
			
			for (int x =0; x<list1.length-1; x++)
			{
				int indexOfMin=0;
				if (list1[indexOfMin]>list1[x+1])
				{
					swapMethods.swap(list1, x+1, x);
					swapCount++;
				}
			}
		}
	}
		
	
	public static void selectionSort(double[] list1)
	{
		for (int x = 0; x<list1.length-1; x++)
		{
			int indexOfMin=x;
			for (int y = x +1; y<list1.length; y++)
			{
				if(list1[indexOfMin]>list1[y])
				{
					 indexOfMin=y;
				}
			}
			swapMethods.swap(list1, indexOfMin, x);
		}
		
	}
}
