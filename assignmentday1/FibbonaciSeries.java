package week1.day1.assignmentday1;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int number1=0,number2=1,number3;
		 int i,count=10;
		 
		 System.out.print(number1+" "+number2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i) 
		 {    
			 number3=number1+number2;    
		  System.out.print("  "+number3);    
		  
		  number1=number2;    
		  number2=number3;    
		  
		 }
	}

}
