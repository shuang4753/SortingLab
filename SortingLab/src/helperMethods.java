
public class helperMethods {

	/*Precondition: list1 and list2 are sorted already
	 * Compare first two indices and then place in a new array, list3, the lower value.
	 */
	
	public static String[] merge(String[] list1, String[] list2)
	{
		int bigLength=list1.length+list2.length;
		String[] list3 = new String[bigLength]; 
		int index1 = 0;
		int index2 = 0;
		
		for (int index3=0; index3<(list3.length); index3++)
		{
			if (index1<list1.length && index2<list2.length) 
			{
				if (list1[index1].compareTo(list2[index2])<0)
				{
					list3[index3]=list1[index1];
					index1++;
				}
			
				else 
				{
					list3[index3] = list2[index2];
					index2++;
				}
			}
			
			else
			{
				if (index2<list2.length)
				{
					list3[index3]=list2[index2];
					index2++;
				}
				
				if (index1<list1.length)
				{
					list3[index3]=list1[index1];
					index1++;
				}
			}
		}
		return list3;
	}
	
	/*Choose a pivot. Splits the array <list1> into two arrays where the values to the 
	 * left of index of pivot is less than value of pivot
	 * right of index of pivot is greater than value of pivot
	 */
	public static int partition(int[] list1, int front, int back)
	{
		int pivotIndex = front;
		int pivotValue = list1[pivotIndex];
		int checkIndex = back -1;

		while (pivotIndex != checkIndex)
		{	
			int checkValue = list1[checkIndex];
			if (pivotIndex < checkIndex)
			{
				if (pivotValue < checkValue)		
				{
					checkIndex--;
				}
				
				if (pivotValue > checkValue)
				{
					swapMethods.swap(list1, pivotIndex, checkIndex);
					int temp = pivotIndex;
					pivotIndex=checkIndex;
					checkIndex=temp;
					checkIndex++;
				}
			}
			
			else 
			{
				
				
				
				if (pivotValue > checkValue)		
				{
					
					checkIndex++;
				}
				
				if (pivotValue < checkValue)
				{
					swapMethods.swap(list1, pivotIndex, checkIndex);
					int temp = pivotIndex;
					pivotIndex=checkIndex;
					checkIndex=temp;
					checkIndex--;
				}
			}
		}
		return pivotIndex;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
