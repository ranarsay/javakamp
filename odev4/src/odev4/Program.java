package odev4;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Program {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "hilal", "anarsay", LocalDate.of(1999,2,18), "12345678910");
		
		customerManager.save(customer);
		
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		Customer customer2 = new Customer(1, "hilal", "anarsay", LocalDate.of(1999,2,18), "12345678910");
		
		customerManager2.save(customer2);
	}

}
