
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
			
				if (list1[index1].compareTo(list2[index2])>0)
				{
					list3[index3] = list2[index2];
					index2++;
				}
			}
			
			else
			{
				
			}
				
		}
		return list3;
	}
}
