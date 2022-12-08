package SingletonPattern;

import ObserverPattern.Inbox;
import ObserverPattern.Message;
import ObserverPattern.Priority;

import java.util.ArrayList;
import java.util.List;

public class MessageSorter {

    private static MessageSorter instance = new MessageSorter();

    private MessageSorter() {
    }

    public static MessageSorter getInstance() {
        return instance;
    }

    public void sortMessages(Inbox inbox) {
        inbox.getImportantMessages().clear();
        inbox.getRegularMessages().clear();
        inbox.getSpamMessages().clear();
        inbox.getMessages().forEach(message -> {
            if (message.getPriority()==Priority.IMPORTANT) {
                inbox.getImportantMessages().add(message);
            } else if (message.getPriority()==Priority.SPAM) {
                inbox.getSpamMessages().add(message);
            } else {
                inbox.getRegularMessages().add(message);
            }
        });
    }

}
