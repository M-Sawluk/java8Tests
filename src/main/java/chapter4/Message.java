package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mike on 2017-06-01.
 */
public class Message implements Cloneable{

    String name;
    String message;
    List<String> recipients;
    EmailSite emailSite;

    public Message(String name, String message, ArrayList<String> recipients, EmailSite emailSite) {
        this.name = name;
        this.message = message;
        this.recipients = recipients;
        this.emailSite = emailSite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public Message clone() throws CloneNotSupportedException{
        return (Message) super.clone();
    }

    public void addRecipient(String recipient){
        this.recipients.add(recipient);
    }

    public EmailSite getEmailSite() {
        return emailSite;
    }

    public void setEmailSite(EmailSite emailSite) {
        this.emailSite = emailSite;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", recipients=" + recipients +
                ", emailSite=" + emailSite +
                '}';
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        Message.EmailSite em = new Message.EmailSite("GMAIL");
        Message.EmailSite em1 = new Message.EmailSite("o2");
        Message mes1 = new Message("Michal" , "Halo",
                new ArrayList<>(Arrays.asList("Karol","Marlej")),em);

        Message mes2= mes1.clone();

        System.out.println(mes1);
        System.out.println(mes2);

        mes2.addRecipient("Tomasz");

        System.out.println(mes1);
        System.out.println(mes2);

        mes2.setMessage("Hiho");

        System.out.println(mes1);
        System.out.println(mes2);

        mes1.setEmailSite(em1);

        System.out.println(mes1);
        System.out.println(mes2);

    }

    public static class EmailSite{

        String name;

        public EmailSite(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "EmailSite{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
