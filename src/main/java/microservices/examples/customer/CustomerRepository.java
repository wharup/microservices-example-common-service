package microservices.examples.customer;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    public List<Customer> findAll();
	public List<Customer> findAllById(Iterable<String> ids);
}
