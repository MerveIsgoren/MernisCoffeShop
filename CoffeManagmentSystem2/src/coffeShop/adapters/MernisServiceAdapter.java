package coffeShop.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import coffeShop.business.abstracts.CustomerCheckService;
import coffeShop.entites.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client  = new KPSPublicSoapProxy();
		
		boolean result =true;
		
		try {
			result =  client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.firstName.toUpperCase(new Locale("tr")),customer.getLastName().toUpperCase(new Locale("tr")) , customer.getTimeOfBirth());
		} catch ( RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return result;
	}

}
