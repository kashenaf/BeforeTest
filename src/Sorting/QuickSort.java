package Sorting;

public class QuickSort {
	
	private int array[];
	private int length;
	
	public void sort(int[] inputArr){
		if(inputArr==null||inputArr.length==0){
			return;
		}
		this.array=inputArr;
		length=inputArr.length;
		quickSort(0,length-1);
	}
	
	private void quickSort(int lowerIndex, int higherIndex){
		int i=lowerIndex;
		int j=higherIndex;
		//calculate pivot number
		int pivot=array[lowerIndex+(higherIndex-lowerIndex)/2];
		//divide into two arrays
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumber(i,j);
				//moves index to next
				i++;
				j--;
			}
		}
		//recursives quickSort method
		if(lowerIndex<j)
			quickSort(lowerIndex,j);
		if(i<higherIndex)
			quickSort(i,higherIndex);
	}
	private void exchangeNumber(int i, int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public static void main(String a[]){
		QuickSort quick = new QuickSort();
		int [] input = {85,4,26,98,235,45,65,4,9,7,3,456,71,710,78,961,1};
		System.out.println("Unsorted Array:");
		for(int i:input)
			System.out.print(i+" ");
			
			quick.sort(input);
	
		System.out.println("\nSorted Array:");
		for (int i: input)
			System.out.print(i+" ");
	}
}
