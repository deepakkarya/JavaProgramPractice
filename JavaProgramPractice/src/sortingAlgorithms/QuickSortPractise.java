package sortingAlgorithms;

public class QuickSortPractise {

	public static void main(String[] args) {
		
		int[] array= {10,9,8,7,6,5,4,3,2,1};
		System.out.println("Initial array");
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();
		quickSort(array,0,array.length-1);
		System.out.println("Final array");
		for(int i:array) {
			System.out.print(i+" ");
		}
		

	}

	private static void quickSort(int[] arr, int left, int right) {
		
		int index=partition(arr,left,right);
		
		if(left<index-1) {
			quickSort(arr,left,index-1);
		}
		if(index<right) {
			quickSort(arr,index,right);
		}
		
	}

	private static int partition(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int pivot=arr[(left+right)/2];
		while(arr[left]<pivot) {left++;}
		while(arr[right]>pivot) {right--;}
		
		if(left<=right) {
			int tmp=arr[left];
			arr[left]=arr[right];
			arr[right]=tmp;
		}
		left++;
		right--;
		
		return left;
	}

}
