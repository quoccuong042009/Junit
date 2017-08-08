import static org.junit.Assert.*;
import org.junit.Test;


public class FizzBuzzTestCase {
	@Test
	public void testFB1Return1(){
		String res = Main.FizzBuzz(1);
		assertEquals("1",res);
	}
	@Test
	public void testFB2Return2(){
		String res = Main.FizzBuzz(2);
		assertEquals("2",res);
	}
	@Test
	public void testFB3ReturnFizz(){
		String res = Main.FizzBuzz(3);
		assertEquals("Fizz",res);
	}
	@Test
	public void testFB5ReturnBuzz(){
		String res = Main.FizzBuzz(5);
		assertEquals("Buzz",res);
	}
	@Test
	public void testFB15ReturnFizzBuzz(){
		String res = Main.FizzBuzz(15);
		assertEquals("FizzBuzz",res);
	}

}
