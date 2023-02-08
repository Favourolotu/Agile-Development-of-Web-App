package example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;


@Controller
public class AddressBookController {

    @RequestMapping (value = "/addressBook", method = RequestMethod.GET)
    public String buddyInfo(@RequestParam(value = "name", defaultValue = "Josh") String name, Model model) {

        model.addAttribute("addressBook", name);
        // TODO create a new buddy info with details provided and add to an address book from repo.
        return "addressBook";
    }


}
