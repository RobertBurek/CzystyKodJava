package repository.model;

import java.util.Objects;

/**
 * Created by Robert Burek
 */
public class ContactItem {
    private String name;
    private String surname;
    private MailRecords mail;
    private PhoneRecords phone;

    // 3 metoda
//    public ContactItem newCreateContact() {
//        return new ContactItem.Builder.
//                .setNameNew("npJacek")
//                .setSurnameNew("npMonowolski")
//                .setMailNew("npJacecM@wp.pl")
//                .setPhoneNew("np222-333-4444").build();
//    }
//    private ContactItem setNameNew(String name) {
//        this.name = name;
//        return this;
//    }
//    private ContactItem setSurnameNew(String surname) {
//        this.surname = surname;
//        return this;
//    }
//    private ContactItem setMailNew(String mail) {
//        this.mail = mail;
//        return this;
//    }
//    private ContactItem setPhoneNew(String phone) {
//        this.phone = phone;
//        return this;
//    }

    // 2 metoda  - construktor o elementach tego samego typu (można pomyśleć o Builder)
    public ContactItem(String name, String surname, String mail, String phone) {
        this.name = name;
        this.surname = surname;
        this.mail = new MailRecords(mail);
        this.phone = new PhoneRecords(phone);
    }

    public ContactItem() {
    }

    /**
     * Tworzy kontakt z jednym telefonem i jednym mailem
     *
     * @param fromCSV CSV String
     * @return kontakt
     */


    // 1 metoda - statyczne metody wytwórcze
    public static ContactItem fromString(String fromCSV) {
        //rozbijamy stringa na pola i przypisujemy je obiektowi
        ContactItem contactItem = new ContactItem();
        String[] args = fromCSV.split(",");
        contactItem.setName(args[0]);
        contactItem.setSurname(args[1]);
        contactItem.setMail(new MailRecords(args[2]));
        contactItem.setPhone(new PhoneRecords(args[3]));
        return contactItem;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public MailRecords getMail() {
        return mail;
    }

    public void setMail(MailRecords mail) {
        this.mail = mail;
    }

    public PhoneRecords getPhone() {
        return phone;
    }

    public void setPhone(PhoneRecords phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactItem that = (ContactItem) o;
        return name.equals(that.name) &&
                surname.equals(that.surname) &&
                mail.equals(that.mail) &&
                phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, mail, phone);
    }

    @Override
    public String toString() {
        return "ContactItem{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
