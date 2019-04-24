package repository;

import java.util.Objects;

/**
 * Created by Robert Burek
 */
public class ContactItem {
    private String name;
    private String surname;
    private String mail;
    private String phone;


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
