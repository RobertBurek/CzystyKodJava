package repository.model;

import java.util.Objects;

/**
 * Created by Robert Burek
 */
public class ContactItem {
    private String name;
    private String surname;
    private String mail;
    private String phone;

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
        this.mail = mail;
        this.phone = phone;
    }

    public ContactItem() {
    }

    // 1 metoda - statyczne metody wytwórcze
    public static ContactItem fromString(String from) {
        //rozbijamy stringa na pola i przypisujemy je obiektowi
        ContactItem contactItem = new ContactItem();
        String[] args = from.split(",");
        contactItem.setName(args[0]);
        contactItem.setSurname(args[1]);
        contactItem.setMail(args[2]);
        contactItem.setPhone(args[3]);
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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
