import mapper.EntitiesConverter;
import models.CustomerDTO;
import models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        EntitiesConverter entitiesConverter = new EntitiesConverter();
        Person person = new Person();
        person.setLastname("salvatierra");
        person.setName("alejandro");
        person.setAge(18);
        Person person2 = new Person();
        person.setLastname("salvatierra");
        person.setName("alejandroxxxxxx");
        person.setAge(22);
        Person person3 = new Person();
        person.setLastname("salvatierra");
        person.setName("alejandro");
        person.setAge(25);
        CustomerDTO customer = entitiesConverter.mapToCustomer(person);
        System.out.println(customer);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);

        List<CustomerDTO> customers = persons.stream()
                .map(entitiesConverter::mapToCustomer)//uso el operador :: que es equivalente a hacer person -> entitiesConverter.mapToPerson(person)
                .filter(a  -> "alejandro".equals(a.getCustomerName()) && a.getAge() > 18)
                .collect(Collectors.toList());
        customers.forEach(System.out::println);
    }
}
