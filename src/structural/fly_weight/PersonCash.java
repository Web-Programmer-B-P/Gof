package structural.fly_weight;

import java.util.WeakHashMap;

public class PersonCash {
    private static final WeakHashMap<String, PersonWorkInfo> persons = new WeakHashMap<>();

    public PersonWorkInfo getPersonInfo(String address) {
        PersonWorkInfo personWorkInfo = persons.get(address);
        if (personWorkInfo == null) {
            personWorkInfo = createPersonInfo(address);
            persons.put(address, personWorkInfo);
        }
        return personWorkInfo;
    }

    public int getSize() {
        return persons.size();
    }

    private PersonWorkInfo createPersonInfo(String hostelAddress) {
        switch (hostelAddress) {
            case "stree1" :
                return new PersonWorkInfo("programmer", "street1");
            case "street2" :
                return new PersonWorkInfo("worker", "street2");
            default:
                throw new IllegalArgumentException("Unknown Address");
        }
    }
}
