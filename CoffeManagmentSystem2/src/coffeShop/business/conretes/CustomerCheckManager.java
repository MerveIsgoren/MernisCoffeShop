package coffeShop.business.conretes;

import coffeShop.business.abstracts.CustomerCheckService;
import coffeShop.entites.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
