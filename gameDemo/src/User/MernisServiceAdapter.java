package User;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{
	
	public boolean validate(User user) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalId()),
					user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), 
					user.getBirthYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	

}
