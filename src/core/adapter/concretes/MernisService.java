package core.adapter.concretes;
import MernisReference.RVLKPSPublicSoap;
import core.adapter.abstracts.CheckServices;
import entities.concretes.Customer;

public class MernisService implements CheckServices {
    @Override
    public boolean checkCustomer(Customer customer) throws Exception {
        RVLKPSPublicSoap rvlkpsPublicSoap= new RVLKPSPublicSoap();
        return rvlkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getName(),customer.getLastName(),customer.getDateTime());
    }
}

