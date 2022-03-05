package business.concretes;

import business.abstracts.IcustomerServices;
import core.adapter.abstracts.CheckServices;
import core.adapter.concretes.MernisService;
import entities.concretes.Customer;

public class StarbucksCustomerManager implements IcustomerServices{
     private final CheckServices checkServices;

    public StarbucksCustomerManager(CheckServices checkServices) {
        this.checkServices=checkServices;
    }

    @Override
    public void add(Customer customer) throws Exception {
       if (this.checkServices.checkCustomer(customer)){
          System.out.println("ekleme işlemi gerçekleşti");
      }
      else {
          System.out.println(" ekleme işlemi olmadı hata var bilgilerde");
      }
    }
}
