package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;


@RestController
public class BuddyInfoController {
    @Autowired
    private AddressBookRepository addressBookRepository;


    @RequestMapping(value = "/getBuddyInfo", method = RequestMethod.GET)
    public BuddyInfo getBuddy(@RequestParam("id") Integer id){
        AddressBook addressBook = addressBookRepository.findById(1L);
        return addressBook.getBuddy(id-1);
    }

    @RequestMapping(value = "/addBuddyInfo", method = RequestMethod.POST)
    public BuddyInfo addBuddy(@RequestParam("name") String name){
        if (addressBookRepository.findById(1L) == null){
            addressBookRepository.save(new AddressBook());
        }
        AddressBook addressBook = addressBookRepository.findById(1L);
        BuddyInfo buddyInfo = new BuddyInfo(name);
        addressBook.addBuddy(buddyInfo);
        addressBookRepository.save(addressBook);
        return buddyInfo;
    }

}