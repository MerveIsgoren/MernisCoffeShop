package coffeShop.business.conretes;

import coffeShop.business.abstracts.BaseCustomerManager;
import coffeShop.entites.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Nero customer save to database" + customer.getFirstName() + customer.getLastName());
		
	}

}
