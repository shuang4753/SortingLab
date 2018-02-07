import java.util.Arrays;
/*Author: Simon Huang
 *Date: 2/1/18
 *Lab: SortingLab 
 */
public class Runner {

	public static void main(String[] args)
	{
		//Testing arrays
		int[] insert1 = {1,4,4,5,2,4,3,17,0};
		double[] selection2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 17.0, 0.0};
		String[] bubble3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		String[] merge1 = {"apple", "donut", "chicken", "lose"};
		String[] merge2 = {"think", "story", "motherboard"};
		
		
		
		
		//Insertion Sort Test
		long start= System.nanoTime();
		sortingAlgorithms.insertionSort(insert1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(insert1));
		
		//Selection Sort Test
		start = System.nanoTime();
		sortingAlgorithms.selectionSort(selection2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(selection2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		sortingAlgorithms.bubbleSort(bubble3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(bubble3));
		
		//Merge Sort Test
		start = System.nanoTime();
		String[] merge3 = helperMethods.merge(merge1, merge2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test 4 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(merge3));
	}

}
