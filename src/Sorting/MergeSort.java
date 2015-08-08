package Sorting;

public class MergeSort {
	//Variables
	private int[] array;
	private int[] tempMergeArr;
	private int length;
	
	private void mergeSort(int[] x){
		this.array=x;
		this.length=x.length;
		this.tempMergeArr=new int[length];
		doMergeSort(0,length-1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle= lowerIndex + (higherIndex - lowerIndex)/2;
			//Sorts left side of the array
			doMergeSort(lowerIndex,middle);
			//sorts left side of the array
			doMergeSort(middle+1, higherIndex);
			//Merges the arrays
			mergeParts(lowerIndex,middle,higherIndex);
		}
	}
	private void mergeParts(int lowerIndex, int middle, int higherIndex){
		for (int i=lowerIndex; i<=higherIndex;i++){
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		while(i<=middle && j<= higherIndex){
			if(tempMergeArr[i]<=tempMergeArr[j]){
				array[k]=tempMergeArr[i];
				i++;
			}else{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
			
	public static void main(String[] args){
		
		MergeSort merge=new MergeSort();
		
		int [] data={1,2,4,9,3,7,12,65,78,45,12,0,2,45,4};
			
		System.out.println("Unsorted data:");
			
		for(int i=0;i<data.length;i++)
			System.out.printf("%d ", data[i]);
				
		merge.mergeSort(data);
				
		System.out.println("\nSorted data using Shell Sort");
		for(int i=0;i<data.length;i++)
			System.out.printf("%d ", data[i]);		
		}
	}

