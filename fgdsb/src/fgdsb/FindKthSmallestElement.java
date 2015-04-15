package fgdsb;

public class FindKthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-1/2);
	}

}

class MaxHeap{
	private int size;
	private int capacity;
	private int[] heap;
	
	public MaxHeap(int capacity){
		size = 0;
		this.capacity = capacity;
		heap = new int[capacity];
	}
	
	public int getMax(){
		if(size == 0){
			return Integer.MIN_VALUE;
		} else {
			return heap[0];
		}
	}
	
	public void insert(int val){
		if(size == 0){
			heap[0] = val;
			size++;
		} else if(size<capacity){
			heap[size] = val;
			int idx = (size-1)/2;
			while(idx>0 && val > heap[idx]){
				swap (size, idx);
				idx = (idx-1)/2;
			}
			if(idx==0 && val>heap[0]){
				swap (size, idx);
			}
			size++;
		} else {
			heap[0] = val;
			int idx = 0;
			while(idx < capacity){
				int bigger = idx;
				if(2*idx+2 < capacity){
					bigger = heap[2*idx+1]>heap[2*idx+2]?(2*idx+1):(2*idx+2);
				} else if(2*idx+1 < capacity){
					bigger = 2*idx+1;
				} else {
					break;
				}
				if(heap[bigger] > val){
					swap(idx, bigger);
					idx = bigger;
				} else {
					break;
				}
			}
		}
	}
	
	private void swap(int idx1, int idx2){
		int tmp = heap[idx1];
		heap[idx1] = heap[idx2];
		heap[idx2] = tmp;
	}
}