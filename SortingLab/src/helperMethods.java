
public class helperMethods {

	/*Precondition: list1 and list2 are sorted already
	 * Compare first two indices and then place in a new array, list3, the lower value.
	 */
	
	public static int[] merge(int[] list1, int[] list2)
	{
		int bigLength=list1.length+list2.length;
		int[] list3 = new int[bigLength]; 
		for (int x=0; x<(list3.length); x++)
		{
			if (list1[x]<list2[x+bigLength/2])
			{
				swapMethods.swap(list3, index1, index2);
			}
		}
	}
}
