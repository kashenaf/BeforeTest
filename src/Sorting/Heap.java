package Sorting;
import java.util.*;
public class Heap {
	
	private static int total;
	
	private static void swap(Comparable[] arr, int a, int b){
		Comparable temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	private static void heap(Comparable[] arr, int i){
		int left=i*2;
		int right=left+1;
		int grt=i;
		
		if(left<=total && arr[left].compareTo(arr[grt])>0) 
			grt=left;
		if(right<=total && arr[right].compareTo(arr[grt])>0)
			grt=right;
		if(grt!=i){
			swap(arr,i,grt);
			heap(arr,grt);
		}
	}
	public static void sort(Comparable[] arr){
		total=arr.length-1;
		
		for(int i=total/2;i>=0;i--)
			heap(arr,i);
		for(int i=total;i>0;i--){
			swap(arr,0,i);
			total--;
			heap(arr,0);
		}
	}
	
	
public static void main(String[] args){
				
		Integer [] arr= new Integer[] {1,2,4,9,3,7,12,65,78,45,12,0,2,45,4};
			
		System.out.println("Unsorted data:");
			
		for(int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		
		sort(arr);
				
		System.out.println("\nSorted data using Shell Sort");
		for(int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);		
		}
}
