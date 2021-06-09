import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) 
	{
		int num= 0;
		int resersenum = 0;
		System.out.println("input your number and press enter:");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		while ( num != 0)
		{
			resersenum = resersenum * 10;
			resersenum = resersenum + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse of input number is: " +resersenum);
	}

}
