package Sorting;

public class BubbleSort {
	
	private static void bubbleSort(int[] x){
		
		int temp=0;
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length-1;j++){
				if(x[j]>x[j+1]){
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
	
	}
	public static void main(String [] args){
		
		int [] data={2,23,99,87,5,4,52,20};
		
		System.out.println("Unsorted Array:");
		for(int i=0;i<data.length;i++)
			System.out.printf("%d ",data[i]);
		
		bubbleSort(data);
		System.out.println("\nSorted Array: Using Bubble Sort");
		
		for(int i=0;i<data.length;i++)
			System.out.printf("%d ",data[i]);
		
	}
}
