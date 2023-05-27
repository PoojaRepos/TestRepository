package program;

public class factorial {

	public static void main(String[] args) {

		
		int num = 8,fact =1;
		for (int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("The results of the factorial number is " + fact);
	}

}
