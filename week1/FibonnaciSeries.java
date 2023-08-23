package assignment.week1;

public class FibonnaciSeries {
	
	public static void main(String[] args) {

		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println("Fibonaci Series :");
		for(int i=1; i<=8; i++) {
			System.out.println(firstNum);
			sum = firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
		}
		
	}

	

}
