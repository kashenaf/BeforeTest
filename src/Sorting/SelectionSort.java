package Sorting;

public class SelectionSort {
	
	private static void insertionSort(int[] x){
		for(int i=0;i<x.length-1;i++){
			int index=i;
			for(int j=i+1;j<x.length;j++)
				if(x[j]<x[index])
					index=j;
					
			int temp=x[index];
			x[index]=x[i];
			x[i]=temp;
		}
	}
	
	public static void main(String[] args){
		
		int [] data={9,2,90,45,32,7,5,4,34};
		
		System.out.println("Unstorted Algorithm");
		
		for(int i=0;i<data.length;i++)
			System.out.printf("%d ", data[i]);
		
		insertionSort(data);
		
		System.out.println("\n Sorted Array using Selection Sort");
		for(int j=0;j<data.length;j++)
			System.out.printf("%d ", data[j]);
	}
}
