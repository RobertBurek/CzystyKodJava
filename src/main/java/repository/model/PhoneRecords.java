package repository.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert Burek
 */
public class PhoneRecords {
    private List<String> phones;

    public PhoneRecords(String phone) {
        phones = new ArrayList<>();
        phones.add(phone);
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

//    @Override
//    public String toString() {
//        return "PhoneRecords{" +
//                "phones=" + phones +
//                '}';
//    }

    @Override
    public String toString() {
        String phoneString = "";
        for (String phone : phones) {
            phoneString += phone + ",";
        }
        return phoneString;
    }
}
