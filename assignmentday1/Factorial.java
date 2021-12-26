package week1.day1.assignmentday1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Declare your input as 5
		
		int number = 5;		
		
				// Declare an integer variable fact as 1
				
		int i,factorial =1;

				// Iterate from 1 to your input (tip: using loop concept)
				
		for (i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}

		System.out.println("factorial of  "+number+ " is " +factorial);

	}
	
	

}
