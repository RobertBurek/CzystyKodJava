package repository.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert Burek
 */
public class MailRecords {
    private List<String> mails;

    public MailRecords(String mail) {
        mails = new ArrayList<>();
        mails.add(mail);
    }

    public List<String> getMails() {
        return mails;
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }

//    @Override
//    public String toString() {
//        return "MailRecords{" +
//                "mails=" + mails +
//                '}';
//    }

    @Override
    public String toString() {
        String mailString = "";
        for (String mail : mails) {
            mailString += mail + ",";
        }
        return mailString;
    }
}
