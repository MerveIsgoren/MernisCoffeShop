package coffeShop.business.conretes;

import coffeShop.business.abstracts.BaseCustomerManager;
import coffeShop.business.abstracts.CustomerCheckService;
import coffeShop.entites.concretes.Customer;

public class StarbucksCustomManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService ;
	
	
	public StarbucksCustomManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {

		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks customer saved to database " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

}
