package mapper;

import models.CustomerDTO;
import models.Person;

public class EntitiesConverter {
    public CustomerDTO mapToCustomer(Person person){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerName(person.getName());
        customerDTO.setCustomerLastName(person.getLastname());
        return customerDTO;
    }
}
