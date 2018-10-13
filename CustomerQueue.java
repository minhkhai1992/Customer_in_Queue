
public class CustomerQueue {
	private Customer first, last;
	private int counter;
	private int counterTotal;
	private int maxLength;
	
	public CustomerQueue() {
		first = last = null;
		counter = counterTotal = maxLength = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void enqueue(Customer c) {
		
		if (isEmpty()) {
			first = c;
		}else {
			last.setNext(c);
		}
		
		last = c;
		counter++;
		
		if (counter > maxLength) {
			maxLength = counter;
		}		
	}
	
	public Customer dequeue() {
		if (isEmpty()) {
			return null;
		}
		
		Customer temp = first;
		first = first.getNext();
		
		if (isEmpty()) {
			last = null;
		}
		counter--;
		counterTotal++;
		return temp;		
	}	
	
	public int getCounterTotal() {
		return counterTotal;
	}
	
	public int getMaxLength() {
		return maxLength;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public Customer getFront() {
		return first;
	}
	
}
