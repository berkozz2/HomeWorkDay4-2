package UI;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Berk");
		customer1.setLastName("Ozmenekse");
		customer1.setNationalityId("12345678910");
		customer1.setDateOfBirth(1990);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
	}

}
