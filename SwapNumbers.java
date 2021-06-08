
public class SwapNumbers {

	public static void main(String[] args) {
		int first = 5700, second = 4590;
		
		System.out.println("--Before swap--"); 
		System.out.println("First number = " + first); 
		System.out.println("Second number = " + second);
		
		first = first - second; 
		second = first + second; 
		first = second - first;
		
		System.out.println("--After swap--"); 
		System.out.println("First number = " + first); 
		System.out.println("Second number = " + second);

	}

}
