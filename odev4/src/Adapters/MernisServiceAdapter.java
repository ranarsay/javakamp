package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try {

			if (client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth())) {

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

}
