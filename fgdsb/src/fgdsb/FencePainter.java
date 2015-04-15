package fgdsb;

public class FencePainter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int num_colors(int n, int k) {
    	if(n == 0){
    		return 0;
    	}
    	if(n == 1){
    		return k;
    	}
    	int[] twosame = new int[n];
    	int[] twodiff = new int[n];
    
    	twosame[1] = k;
    	twodiff[1] = k*(k-1);
    	
    	for(int i=2;i<n;i++){
    		twosame[i] = twodiff[i-1];
    		twodiff[i] = (twosame[i-1] + twodiff[i-1]) * (k-1);
    	}
    	return twosame[n-1]+twodiff[n-1];
    }
}
