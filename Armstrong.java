
public class Armstrong {
	public static void main(String[] args) {
		
		int number = 407, orignalNumber, remainder, result = 0;
		orignalNumber = number;
		
		while (orignalNumber != 0)
		{
           remainder = orignalNumber % 10; 
           result += Math.pow(remainder, 3); 
           orignalNumber /= 10;
           
		}
		if(result == number)
			System.out.println(number + "is an Armstrong number");
		else
			System.out.println(number + "is not an Armstrong number");
		
			
			
	}

}
