import java.util.*;

public class Customer {
	private int serviceTime;
	private Customer next;
	
	
	public Customer() {
		serviceTime = new Random().nextInt(5) + 1;
		next = null;
	}
	
	public void setNext(Customer c) {
		next = c;
	}
	
	public Customer getNext() {
		return next;
	}
	
	public void setServiceTime(int t) {
		serviceTime = t;
	}
	
	public int getServiceTime() {
		return serviceTime;
	}
	
	public void decServiceTime() {
		serviceTime--;
	}
	
}
