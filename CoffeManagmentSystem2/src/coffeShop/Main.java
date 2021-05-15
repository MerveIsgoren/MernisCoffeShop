package coffeShop;

import coffeShop.adapters.MernisServiceAdapter;
import coffeShop.business.abstracts.BaseCustomerManager;
import coffeShop.business.conretes.CustomerCheckManager;
import coffeShop.business.conretes.NeroCustomerManager;
import coffeShop.business.conretes.StarbucksCustomManager;
import coffeShop.entites.concretes.Customer;

public class Main {
	public static void main(String[] args) {
		
		BaseCustomerManager customerManagerStarbucks = new StarbucksCustomManager(new MernisServiceAdapter());
		customerManagerStarbucks.save(new Customer(1, "Merve", "Ýsgören", 1992, "1234567891"));
		
		BaseCustomerManager customerManagerNero = new NeroCustomerManager();
		customerManagerNero.save(new Customer(2, "Seda", "Sultan", 1991,"12345678985"));
		

	}
}
