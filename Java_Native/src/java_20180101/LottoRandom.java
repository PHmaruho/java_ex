package java_20180101;

public class LottoRandom {
	static final int MAX_NUMBER = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum, sum = 0;
		int[] lotto = new int[MAX_NUMBER];
		boolean judge = true;
		
		while(judge) {
			if(sum == 0) {
				for(int i=0; i<MAX_NUMBER ; i++) {
					inputNum = (int) (Math.random()*45) + 1;
					for(int j=0 ; j<i ; j++) {
						if(inputNum == lotto[j]) {
							inputNum = (int) (Math.random()*45) + 1;
						}
					}
					lotto[i] = inputNum;
					sum += inputNum;
				}
				if(!(sum>150 && sum<170)) {
					sum = 0;
					for(int y=0 ; y<MAX_NUMBER ; y++) { lotto[y] = 0; }
				}
			} else if(sum >150) {
				judge = false;
			}
		}
		for(int i=0 ; i<MAX_NUMBER ; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}
