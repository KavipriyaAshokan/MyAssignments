package assignment.week1;

public class PrimeNumber {
	public static void main(String[] args) {
		int Input = 13;
		boolean flag = false;
		for(int i=2;i<=Input/2;i++) {
			if (Input%i==0) {
				flag=true;
				break;
			}
			
		}
		if(!flag)
			System.out.println("Given number is a prime number");
		else
			System.out.println("Given number is not a prime number");
		
	}

}
