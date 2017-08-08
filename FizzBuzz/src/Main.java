
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String FizzBuzz(int i) {
		if(i % 3 == 0 && i % 5 == 0)
			return "FizzBuzz";
		if(i%3 == 0)
			return "Fizz";
		if(i%5 == 0)
			return "Buzz";
		return Integer.toString(i);
	}

}
