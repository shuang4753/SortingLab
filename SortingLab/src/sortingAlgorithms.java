
public class sortingAlgorithms {

	
	public static void bubbleSort(String[] list1)
	{
		int swapCount = 1;
		while (swapCount>0)
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
	
	
	//public static void insertionSort(int[] list1)
	{	
			
	}
	
	
	/*public static void selectionSort(double[] list1)
	{
		for (int i = 0; i<list1.length-1;)
		{
			double min=list1[0];			
			if (min>list1[i])
			{
				swapMethods.swap(list1, 0, i);
				i++;
				min = list1[i];
			}
		}
	}*/
}
