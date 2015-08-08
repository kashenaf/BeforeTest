package Sorting;

public class InsertionSort {
	
	private static void insertionSort(int[] x){
		for(int i=1;i<x.length;i++){
			int temp=x[i];
			for(int j=i-1;j>=0 && temp<x[j];j--){
				x[j+1]=x[j];
				x[j]=temp;
			}
		}
	}
	public static void main(String[] args){
		int [] data={9,90,6,89,7,43,23,22,1,3,2};
		
		System.out.println("Unsorted Array:");
		
		for(int i=0;i<data.length;i++)
			System.out.printf("%d ", data[i]);
		
		System.out.println("\nSorted Array Using Insertion Sort:");
		insertionSort(data);
		for(int j=0;j<data.length;j++)
			System.out.printf("%d ",data[j]);
		
	}
	
}
