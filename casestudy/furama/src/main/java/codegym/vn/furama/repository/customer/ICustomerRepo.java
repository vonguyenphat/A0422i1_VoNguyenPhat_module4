package codegym.vn.furama.repository.customer;

import codegym.vn.furama.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer,Integer> {
}
