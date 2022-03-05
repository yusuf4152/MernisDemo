package business.concretes;

import business.abstracts.IcustomerServices;
import entities.concretes.Customer;

public class NeroCustomerManager implements IcustomerServices {
    @Override
    public void add(Customer customer) {
        System.out.println("neroya eklendi direkt ");
    }
}
