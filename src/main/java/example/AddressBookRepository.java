package example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

    List<AddressBook> findById(String name);
    AddressBook findById(long id);
}