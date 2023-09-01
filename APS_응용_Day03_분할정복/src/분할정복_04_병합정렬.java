import java.util.Arrays;

public class Main{
	
	public static int[] sorted;
	public static int[] arr;
	
	public static void main(String[] args) {
		
		arr = new int[] {3,1,2,5,4,7,6,9,8,10};
		sorted = new int [arr.length];
		
		mergeSort(arr, 0, 9);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		
		if(left >= right) return;
		
		int mid = (left + right) / 2;
		
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		
		merge(arr,left,mid,right);
		
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int l = left;
		int r = mid+1;
		int idx = left;
		
		while(l<=mid && r<=right) {
			
			if(arr[l] < arr[r]) sorted[idx++] = arr[l++];
			else sorted[idx++] = arr[r++];
			
			if(l>mid) {
				while(r<=right) {
					sorted[idx++] = arr[r++];
				}
			}
			else if (r>right) {
				while(l<=mid) {
					sorted[idx++] = arr[l++];
				}
			}
			
		}
		
		for(int i=left; i<=right; i++) {
			arr[i] = sorted[i];
		}
	
	}

}
