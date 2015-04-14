package fgdsb;

public class AplusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AplusB q = new AplusB();
		System.out.println(q.plus_num(5, 2));
	}

    public int plus_num(int a, int b) {
        int sum = 0;
        int carry = 0;
        
        int i = 0;
        while(i<32){
        	int atmp = (a>>i)&1;
        	int btmp = (b>>i)&1;
        	if(atmp == 1 && btmp == 1 && carry == 1){
        		carry = 1;
        		sum = sum | (1<<i);
        	} else if(atmp == 0 && btmp ==0 && carry == 0){
        		carry = 0;
        	} else if((atmp ^ btmp ^ carry) == 0){
        		carry = 1;
        	} else{
        		carry = 0;
        		sum = sum | (1<<i);
        	}
        	i++;
        }
        return sum;
    }
}
