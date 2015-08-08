package Sorting;

public class ShellSort {
		
		private static void shellsort(int[] x){
			int temp,i,j;
			for(int increment=x.length/2;increment>0;increment/=2){
				for(i=increment;i<x.length;i++){
					temp=x[i];
					for(j=i;j>=increment;j-=increment){
						if(temp<x[j-increment]){
							x[j]=x[j-increment];
						}else{
							break;
						}
					}
					x[j]=temp;
				}
			}
			
			
		}
		
		public static void main(String[] args){
			int [] data={1,2,4,9,3,7,12,65,78,45,12,0,2,45,4};
			
			System.out.println("Unsorted data:");
			
			for(int i=0;i<data.length;i++)
				System.out.printf("%d ", data[i]);
			
			shellsort(data);
			
			System.out.println("\nSorted data using Shell Sort");
			for(int i=0;i<data.length;i++)
				System.out.printf("%d ", data[i]);
			
		}

	}


