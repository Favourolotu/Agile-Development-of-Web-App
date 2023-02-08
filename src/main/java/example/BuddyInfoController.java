package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;


@RestController
public class BuddyInfoController {
    @Autowired
    private BuddyInfoRepository buddyInfoRepository;
    @Autowired
    private AddressBookRepository addressBookRepository;

    @RequestMapping (value = "/buddyInfo", method = RequestMethod.GET)
    public String buddyInfo( Model model) {

        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo("Bauer");
        BuddyInfo buddy2 = new BuddyInfo("Brian");
        BuddyInfo buddy3 = new BuddyInfo("Kim");
        BuddyInfo buddy4 = new BuddyInfo("Palmer");


        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        addressBook.addBuddy(buddy3);
        addressBook.addBuddy(buddy4);

        addressBookRepository.save(addressBook);

        String allBuddies = "";
        for (BuddyInfo buddy : buddyInfoRepository.findAll()) {

            allBuddies += buddy.toString() + "\n";

        }
        return allBuddies;
    }

}