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
		String[] merge1 = {"babe", "donut", "kick", "lose"};
		String[] merge2 = {"apple", "gate", "think"};
		int[] quick1 = {7,1,6,8,2,10,4};
	
		//Insertion Sort Test
		long start= System.nanoTime();
		sortingAlgorithms.insertionSort(insert1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("InsertionSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(insert1));
		
		//Selection Sort Test
		start = System.nanoTime();
		sortingAlgorithms.selectionSort(selection2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("SelectionSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(selection2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		sortingAlgorithms.bubbleSort(bubble3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("BubbleSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(bubble3));
		
		//Merge Sort Test
		start = System.nanoTime();
		String[] merge3 = helperMethods.merge(merge1, merge2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("merge took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(merge3));
		
		//Partition Sort Test
		start = System.nanoTime();
		int pivotFinalPos = helperMethods.partition(quick1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition took: " + time + "nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos); 
		System.out.println(Arrays.toString(quick1));
	}

}
