package coffeShop.business.abstracts;

import coffeShop.entites.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void save(Customer customer) ;

}
