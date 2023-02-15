package example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SPAController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;


    @GetMapping("/startPage")
    public String defaultDisplay(Model model) {
        model.addAttribute("addressBook", new AddressBook());
        model.addAttribute("buddy", new BuddyInfo());
        return "defaultView";
    }

    @PostMapping("/addBuddy")
    public String addBuddy(@ModelAttribute("buddy") BuddyInfo buddyInfo) {
        AddressBook addressBook = addressBookRepository.findById(1L);
        addressBook.addBuddy(buddyInfo);
        addressBookRepository.save(addressBook);
        return "buddyInfo";
    }

    @PostMapping("/createAddressBook")
    public String createAddressBook(Model model){
        if (addressBookRepository.findById(1L) == null){
            addressBookRepository.save(new AddressBook());
        }
        AddressBook addressBook = addressBookRepository.findById(1L);
        model.addAttribute("addressBook", addressBook);
        return "addressBook";
    }

    @GetMapping("/spaStartPage")
    public String spaDisplay(Model model) {
        model.addAttribute("addressBook", new AddressBook());
        model.addAttribute("buddy", new BuddyInfo());
        return "spaView";
    }

    /*@PostMapping("/updateStartPage")

    public String updateDisplay(Model model, BuddyInfo buddyInfo) {
        AddressBook addressBook = addressBookRepository.findById(1L);
        addressBook.addBuddy(buddyInfo);
        addressBookRepository.save(addressBook);
        //model.addAttribute("buddy", new BuddyInfo());
        return "spaView";
    }

     */
}
