
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int first = 270, second = 1500;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first ); 
		System.out.println("Second number = " + second); 
		// Value of first is assigned to temporary
		float temporary = first;
		// Value of second is assigned to first
		first = second;
		// Value of temporary (which contains the initial value of first) is assigned to second
		float second1 = temporary;
		System.out.println("--After swap--"); 
		System.out.println("First number = " + first); 
		System.out.println("Second number = " + second1);

	}

}
