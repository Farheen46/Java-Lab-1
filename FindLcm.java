
public class FindLcm {
	public static void main(String[] args) {
		
		int number1 = 72, number2 = 120, lcm;
		lcm = (number1 > number2) ? number1 : number2;
		while (true) {
			if (lcm % number1 == 0 & lcm % number2 == 0) {
				System.out.printf ("the LCM of %d and %d is %d", number1, number2, lcm);
				
				break;
			}
			++lcm;
			}
		}
	}

