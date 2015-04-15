package fgdsb;

public class Powerof4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean power_of_4(int number) {
    	int i=0;
    	int tmp = number;
    	boolean hasone = false;
    	
    	while(i<32){
    		if((tmp & 1) == 1){
    			if(i%2 == 1){
    				return false;
    			} else {
    				if(!hasone){
    					hasone = true;
    				} else {
    					return false;
    				}
    			}
    		}
    		tmp = tmp >>1;
    		i++;
    	}
    	return true;
    }
}
