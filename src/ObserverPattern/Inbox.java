package ObserverPattern;

import IteratorPattern.NotificationBar;

import java.util.ArrayList;
import java.util.List;

public class Inbox {

    private List<Message> messages = new ArrayList<>();

    private List<Message> importantMessages = new ArrayList<>();
    private List<Message> regularMessages = new ArrayList<>();
    private List<Message> spamMessages = new ArrayList<>();
    private UserNotifier notifier;

    public void addObserver(UserNotifier userNotifier) {
        notifier = userNotifier;
    }

    public void receiveMessage(Message message) {
        messages.add(message);
        System.out.println("Message received: " + message);
        if (message.getPriority()==Priority.IMPORTANT) {
            notifier.notifyUser(message);
        }
    }

    public void deleteMessage(Message message) {
        messages.remove(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<Message> getImportantMessages() {
        return importantMessages;
    }

    public List<Message> getRegularMessages() {
        return regularMessages;
    }

    public List<Message> getSpamMessages() {
        return spamMessages;
    }
}
