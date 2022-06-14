package Assignments.week1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int a=13;
		boolean flag=false;
		
		for(int i=2;i<=a/2;i++) {
			
			int remainder=a%i;
			
			if(remainder==0) {
				flag=true;
				break;
			}
		}	
			
			if(flag==true) {
				System.out.println("Not Prime");
			}
			else {
				System.out.println("Prime");
			}
			
			
	}

}
