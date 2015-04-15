package fgdsb;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int second_largest(int[] arr) {
    	int max1 = Integer.MIN_VALUE;
    	int max2 = Integer.MIN_VALUE;
    	
    	for(int i=0;i<arr.length;i++){
    		if(arr[i] > max1){
    		    max2 = max1;
    			max1 = arr[i];
    		} else if(arr[i] < max1 && arr[i] > max2){
    			max2 = arr[i];
    		}
    	}
    	if(max2 != Integer.MIN_VALUE){
    		return max2;
    	} else {
    		return 0;
    	}
    }
}
