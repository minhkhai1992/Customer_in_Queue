import java.util.*;

import javax.naming.ldap.Rdn;
public class StoreSimulator {
	public static void main(String[] args) {
		

		final int hours = 60;
		
		
		CustomerQueue inLine = new CustomerQueue();
		Random rdn = new Random();
		
		System.out.println("The Store Simulator will Adding OR Removing !!!");
		System.out.println("From Queue will run in 1 hours");
		System.out.println("-------------------------");
		
		for (int i = 0; i < hours; i++) {
			if (rdn.nextInt(4) == 1) {
				inLine.enqueue(new Customer());
				System.out.println("New Customer is added into queue line.\nThe number queue line: " + inLine.getCounter());
			}
			
			if (inLine.isEmpty() == false) {
				inLine.getFront().decServiceTime();
				
				if (inLine.getFront().getServiceTime() == 0) {
					inLine.dequeue();
					System.out.println("Customer had removed from the line. The line now is : " + inLine.getCounter());
				}								
			}			
		}
		System.out.println("Total Completed Service is " + inLine.getCounterTotal());
		System.out.println("Total Queue: " + inLine.getMaxLength());
		System.out.println("Total currently in line: " + inLine.getCounter());
		
		
		
	}	
	
}
