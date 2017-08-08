import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseForHarryPotter {
	@Test
	public void testBuying1Book1() {
		Shop basket = new Shop();
		basket.add(1);
		assertEquals(Double.valueOf(8), basket.getPrice());
	}
	
	@Test
	public void testBuying1Book2() {
		Shop basket = new Shop();
		basket.add(2);
		assertEquals(Double.valueOf(8), basket.getPrice());
	}
	@Test
	public void testBuying1Book3() {
		Shop basket = new Shop();
		basket.add(3);
		assertEquals(Double.valueOf(8), basket.getPrice());
	}
	@Test
	public void testBuying1Book4() {
		Shop basket = new Shop();
		basket.add(4);
		assertEquals(Double.valueOf(8), basket.getPrice());
	}
	@Test
	public void testBuying1Book5() {
		Shop basket = new Shop();
		basket.add(5);
		assertEquals(Double.valueOf(8), basket.getPrice());
	}
	
	@Test
	public void testBuying2Book12() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(2);
		assertEquals(Double.valueOf(15.2), basket.getPrice());
	}
	
	@Test
	public void testBuying2Book34() {
		Shop basket = new Shop();
		basket.add(3);
		basket.add(4);
		assertEquals(Double.valueOf(15.2), basket.getPrice());
	}
	
	@Test
	public void testBuying3Book123() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(2);
		basket.add(3);
		assertEquals(Double.valueOf(21.6), basket.getPrice());
	}
	@Test
	public void testBuying3Book135() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(3);
		basket.add(5);
		assertEquals(Double.valueOf(21.6), basket.getPrice());
	}
	
	@Test
	public void testBuying4Book1345() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(3);
		basket.add(4);
		basket.add(5);
		assertEquals(Double.valueOf(25.6), basket.getPrice());
	}
	@Test
	public void testBuying5Book() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(2);
		basket.add(3);
		basket.add(4);
		basket.add(5);
		assertEquals(Double.valueOf(30), basket.getPrice());
	}
	
	@Test
	public void testBuying2SameBook() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(1);
		assertEquals(Double.valueOf(16), basket.getPrice());
	}
	
	@Test
	public void testBuying3SameBook() {
		Shop basket = new Shop();
		basket.add(3);
		basket.add(3);
		basket.add(3);
		assertEquals(Double.valueOf(24), basket.getPrice());
	}
	
	@Test
	public void testBuying2SameBook1Diff() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(1);
		basket.add(3);
		assertEquals(Double.valueOf(23.2), basket.getPrice());
	}
	@Test
	public void testBuying2SameBook2Diff() {
		Shop basket = new Shop();
		basket.add(2);
		basket.add(2);
		basket.add(3);
		basket.add(5);
		assertEquals(Double.valueOf(29.6), basket.getPrice());
	}
	@Test
	public void testBuying2SameBook2Diff_2() {
		Shop basket = new Shop();
		basket.add(4);
		basket.add(3);
		basket.add(4);
		basket.add(1);
		assertEquals(Double.valueOf(29.6), basket.getPrice());
	}
	
	@Test
	public void testBuying3SameBookAll() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(1);
		basket.add(2);
		basket.add(2);
		basket.add(3);
		basket.add(3);
		basket.add(4);
		basket.add(5);
		assertEquals(Double.valueOf(51.2), basket.getPrice());
	}
	
	@Test
	public void testBuying2SameAllBook() {
		Shop basket = new Shop();
		basket.add(1);
		basket.add(1);
		basket.add(2);
		basket.add(2);
		basket.add(3);
		basket.add(3);
		basket.add(4);
		basket.add(4);
		basket.add(5);
		basket.add(5);
		assertEquals(Double.valueOf(60), basket.getPrice());
	}
}
