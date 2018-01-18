
public class sortingAlgorithms {

	
	public static void bubbleSort(int[] elements)
	{
		int swapCount = 0;
		while (swapCount<0)
		{
			swapCount = 0;
			
			for (int i = 0; i<elements.length-1; i++)
			{
				if (elements[i]<elements[i+1])
				{
					swapMethods.swap(elements, i, i+1);
					swapCount++;
				}
			}
		}
	}
}
