package by.htp.customer.view;

import java.util.List;

import by.htp.customer.bean.Customer;

public class View {	
	
	public void print(Customer[] c) {
		for(Customer item : c) {
			System.out.println(item.toString());
		}
	}
	
	public void print(List<Customer> c) {
		for(Customer item : c) {
			System.out.println(item.toString());
		}
	}
}
