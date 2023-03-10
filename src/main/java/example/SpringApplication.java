package example;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringApplication {


	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
	}

	/**
	 * Bean example for a spring application
	@Bean
	public CommandLineRunner demo(BuddyInfoRepository repository, AddressBookRepository repository2) {
		return (args) -> {

			AddressBook addressBook = new AddressBook();

			BuddyInfo buddy1 = new BuddyInfo("Bauer");
			BuddyInfo buddy2 = new BuddyInfo("Brian");
			BuddyInfo buddy3 = new BuddyInfo("Kim");
			BuddyInfo buddy4 = new BuddyInfo("Palmer");



			// save a few Buddies

			//buddy1 = repository.save(buddy1);
			//buddy2 = repository.save(buddy2);
			//buddy3 = repository.save(buddy3);
			//buddy4 = repository.save(buddy4);






			addressBook.addBuddy(buddy1);
			addressBook.addBuddy(buddy2);
			addressBook.addBuddy(buddy3);
			addressBook.addBuddy(buddy4);

			repository2.save(addressBook);



			// fetch all Buddies
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (BuddyInfo buddy : repository.findAll()) {
				log.info(buddy.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			BuddyInfo buddy = repository.findById(1L);
			log.info("Buddy found with findById(1L):");
			log.info("--------------------------------");
			log.info(buddy.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByName("Kim").forEach(bauer -> {
				log.info(bauer.toString());
			});

			log.info("");

			// fetch all Address books
			log.info("Address-book found with findAll():");
			log.info("-------------------------------");
			for (AddressBook addressBook1 : repository2.findAll()) {
				log.info(addressBook1.toString());
			}
			log.info("");

		};
	} */

}
