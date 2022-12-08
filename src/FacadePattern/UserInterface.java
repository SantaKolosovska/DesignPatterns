package FacadePattern;

import ObserverPattern.Inbox;
import ObserverPattern.Message;
import SingletonPattern.MessageSorter;

import java.util.List;

public class UserInterface {
    private Inbox inbox;
    private MessageSorter messageSorter = MessageSorter.getInstance();
    private List<Message> allMessages;

    public UserInterface(Inbox inbox) {
        this.inbox = inbox;
        allMessages = inbox.getMessages();
        messageSorter.sortMessages(inbox);
    }

    public void viewAllMessages() {
        if (allMessages.size() > 0) {
            allMessages.forEach(System.out::println);
        } else {
            System.out.println("No messages in inbox");
        }
    }

    public void viewImportantMessages() {
        List<Message> importantMessages = inbox.getImportantMessages();
        if (importantMessages.size() > 0) {
            importantMessages.forEach(System.out::println);
        }
    }

    public void viewSpamMessages() {
        List<Message> spam = inbox.getSpamMessages();
        if (spam.size() > 0) {
            spam.forEach(System.out::println);
        }
    }

    public void viewRegularMessages() {
        List<Message> regularMessages = inbox.getRegularMessages();

        if (regularMessages.size() > 0) {
            regularMessages.forEach(System.out::println);
        }
    }

    public void deleteMessage(Message message) {
        inbox.deleteMessage(message);
        System.out.println("! Message has been deleted !");
    }

    public Integer viewNumberOfMessages() {
        return allMessages.size();
    }
}
