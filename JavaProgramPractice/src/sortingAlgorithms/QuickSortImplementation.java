package sortingAlgorithms;

public class QuickSortImplementation {
	
	public static void quickSort(int[] arr,int left,int right) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int index=partition(arr,left,right);
		
		if(left<index-1) {
			
			quickSort(arr,left,index-1);
			}
		if(index<right) {
			quickSort(arr,index,right);
			
			}
		
	}
	public static int counter=0;
	public static int partition(int[] arr, int left, int right) {
		
		int pivot=arr[(left+right)/2];
		while(left<=right) {
			while(arr[left]<pivot) {left++;}
			while(arr[right]>pivot) {right--;}
			
			if(left<=right) {
				int tmp=arr[left];
				arr[left]=arr[right];
				arr[right]=tmp;
				
				left++;
				right--;
				
			}
		}
		
		return left;
	}

	public static void main(String[] args) {
		
		int[] array=new int[] {10,9,8,6,5,4,3,2,1};
		quickSort(array,0,array.length-1);
		System.out.println("Final array");
		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}

}
