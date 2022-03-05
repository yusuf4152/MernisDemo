package core.adapter.abstracts;
import entities.concretes.Customer;
public interface CheckServices {
  boolean checkCustomer(Customer customer) throws Exception;
}
