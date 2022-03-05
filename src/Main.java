import business.abstracts.IcustomerServices;
import business.concretes.StarbucksCustomerManager;
import core.adapter.concretes.MernisService;
import entities.concretes.Customer;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        IcustomerServices customerManager= new StarbucksCustomerManager(new MernisService());
        customerManager.add(new Customer(1,"43183833812","yusuf islam","demir", 2001));
    }
}
