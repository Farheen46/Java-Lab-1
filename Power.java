
public class Power {

	public static void main(String[] args) {
		int base = 4, exponent = 3;
		
		long result = 1;
		
		while (exponent != 0) {
			result *= base;
			--exponent;
		}
		System.out.println("answer =" + result);
	}
}
