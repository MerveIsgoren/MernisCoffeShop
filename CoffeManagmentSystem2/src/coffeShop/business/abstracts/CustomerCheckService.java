package coffeShop.business.abstracts;

import coffeShop.entites.concretes.Customer;

public interface  CustomerCheckService {
	 
	boolean checkIfRealPerson(Customer customer);
}
