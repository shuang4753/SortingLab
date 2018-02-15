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
		String[] merge1 = {"as", "babe", "donut", "kick"} ;
		String[] merge2 = {"apple", "gate", "lose", "think"};
		String[] merge4 = {"gate", "donut", "apple", "as", "think", "lose"};
		int[] quick1 = {1, 7, 9, 11, 19, 2, 5, 6, 11, 17, 8, 13, 14, 15, 20, 1, 3, 7, 14, 18};
				
	
		//Insertion Sort Test
		long start= System.nanoTime();
		sortingAlgorithms.insertionSort(insert1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("InsertionSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(insert1) + "\n");
		
		
		//Selection Sort Test
		start = System.nanoTime();
		sortingAlgorithms.selectionSort(selection2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("SelectionSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(selection2) + "\n");
		
		
		//Bubble Sort Test
		start = System.nanoTime();
		sortingAlgorithms.bubbleSort(bubble3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("BubbleSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(bubble3) + "\n");
		
		
		//Merge Test
		start = System.nanoTime();
		String[] merge3 = helperMethods.merge(merge1, merge2);
		System.out.print(Arrays.toString(merge3)+"\n\n");
		
		sortingAlgorithms.mergeSort(merge4);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Merge took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(merge4) + "\n");
		
		
		//QuickSort Test
		start = System.nanoTime();
		sortingAlgorithms.quickSort(quick1, 0, quick1.length-1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("QuickSort took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(quick1) + "\n");
		
	}
	
}
