package fgdsb;

public class WiggleSort {

	public static void main(String[] args){
		
	}
	
	public void wiggle_sort(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(i%2 == 1){
				if(arr[i]<arr[i-1]){
					swap(arr, i, i-1);
				}
			} else {
				if(arr[i]>arr[i-1]){
					swap(arr, i, i-1);
				}
			}
		}
	}
	private void swap(int[] arr, int idx1, int idx2){
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
}
