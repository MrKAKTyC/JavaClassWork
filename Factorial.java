
public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	private static int factorial(int f) 
	{
		if(f==1) 
		{
			return 1;
		}
		return factorial(f-1)*f;
	}

}
