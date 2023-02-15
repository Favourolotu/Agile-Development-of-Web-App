package example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public List<BuddyInfo> getBuddies(){
        return buddies;
    }
    public void addBuddy(BuddyInfo buddyInfo) {
        this.buddies.add(buddyInfo);
    }

    public BuddyInfo getBuddy(int i) {
        return this.buddies.get(i);
    }

    public void removeBuddy(int i) {
        BuddyInfo b = this.buddies.remove(i);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "buddies=" + buddies +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }
}