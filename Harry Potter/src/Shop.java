
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Shop {
	private Map<Integer, Integer> basket;

	public Shop() {
		this.basket = new HashMap<Integer, Integer>();
	}

	public void add(int book) {
		Integer quantity = this.basket.get(book);
		if (quantity == null) {
			quantity = 0;
		}
		this.basket.put(book, quantity + 1);
		
	}

	public Double getPrice() {
		double price = Double.valueOf(0);
		Map<Integer, Integer> checkOut = new HashMap<Integer, Integer>(this.basket);
		while (checkOut.size() > 0) {
			int diffBooks = 0;
			
		    Iterator<Entry<Integer, Integer>> it = checkOut.entrySet().iterator();
		    while (it.hasNext()) {
		    	Entry<Integer, Integer> pair = it.next();

				if (diffBooks == 4 && checkOut.size() == 4) 
					break;
				
				if (pair.getValue() == 1) 
					it.remove();
				else 
					pair.setValue(pair.getValue()-1);
				
				diffBooks++;
		    }
			
			switch (diffBooks){
				case 1 : price += Double.valueOf(8);break;
				case 2 : price += Double.valueOf(15.2);break;
				case 3 : price += Double.valueOf(21.6);break;
				case 4 : price += Double.valueOf(25.6);break;
				default: price += Double.valueOf(30);
			}
		}
		
		return price;
	}
}
