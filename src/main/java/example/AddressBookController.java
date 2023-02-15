package example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class AddressBookController {


    @Autowired
    private AddressBookRepository addressBookRepository;


    @RequestMapping(value ="/addressBook", method = RequestMethod.GET)
    public AddressBook createAddressBook(){
        if (addressBookRepository.findById(1L) == null){
            addressBookRepository.save(new AddressBook());
        }
        AddressBook addressBook = addressBookRepository.findById(1L);
        return addressBook;
    }



}
