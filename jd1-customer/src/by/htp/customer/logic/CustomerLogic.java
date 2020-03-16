package by.htp.customer.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.customer.bean.Customer;

public class CustomerLogic {
	
	/*
	 * Метод сортирует указанный массив клиентов в алфавитном порядке
	 */
	public void sortByName(Customer[] c) {
		for (int i = 0; i < c.length - 1; i++) {
			Customer minName = c[i];
			int minNameNumber = i;
			
			for (int j = i + 1; j < c.length; j++) {
				if(isALessThanB(c[j], minName)) {
					minName = c[j];
					minNameNumber  = j;
				}
			}
			
			c[minNameNumber] = c[i];
			c[i] = minName;
		}
	}
	
	/*
	 * Метод возвращает клиента из двух указанных у которго ФИО расположено 
	 * раньше в алфавитном порядке
	 */
	private boolean isALessThanB(Customer a, Customer b) {
		if (a.getSurname().compareTo(b.getSurname()) == 0) {
			if (a.getName().compareTo(b.getName()) == 0) {
				if (a.getMidName().compareTo(b.getMidName()) > 0) {
					return false;
				} else {
					return true;
				}
			} else if (a.getName().compareTo(b.getName()) > 0) {
				return false;
			} else {
				return true;
			}
		} else if(a.getSurname().compareTo(b.getSurname()) > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/*
	 * Метод возвращает коллекцию клиентов, у которых номер кредитной карточки находится
	 * в заданном интервале
	 */
	public List<Customer> findCardInInterval(Customer[] c, int start, int end) {
		List<Customer> result = new ArrayList<Customer>();
		for(Customer item : c) {
			int cardNum = item.getCardNumber();
			if((cardNum >= start) && (cardNum <= end)) {
				result.add(item);
			}
		}
		return result;
	}

}
