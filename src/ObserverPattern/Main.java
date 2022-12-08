package ObserverPattern;

import FacadePattern.UserInterface;
import IteratorPattern.NotificationBar;
import IteratorPattern.NotificationCollection;
import SingletonPattern.MessageSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Observer pattern
        System.out.println("");
        System.out.println("*** OBSERVER ***");
        System.out.println("");

        Inbox inbox = new Inbox();
        UserNotifier userNotifier = new UserNotifier();

        NotificationCollection notifications= new NotificationCollection();
        userNotifier.addObserver(notifications);
        inbox.addObserver(userNotifier);

        Message message1 = new Message("text1", Priority.REGULAR);
        Message message2 = new Message("text2", Priority.REGULAR);
        Message message3 = new Message("spam 1", Priority.SPAM);
        Message message4 = new Message("important message 1", Priority.IMPORTANT);
        Message message5 = new Message("text5", Priority.REGULAR);
        Message message6 = new Message("important message 2", Priority.IMPORTANT);

        ArrayList<Message> listOfMessages = new ArrayList<>(Arrays.asList(message1, message2, message3, message4, message5, message6));

        listOfMessages.forEach(message -> inbox.receiveMessage(message));

        // Singleton pattern
        System.out.println("");
        System.out.println("*** SINGLETON ***");
        System.out.println("");

        MessageSorter messageSorter = MessageSorter.getInstance();
        messageSorter.sortMessages(inbox);

        List<Message> importantMessages = inbox.getImportantMessages();
        List<Message> spam = inbox.getSpamMessages();
        List<Message> regularMessages = inbox.getRegularMessages();

        System.out.println("There are " + importantMessages.size() + " important messages, " + regularMessages.size()
                + " regular messages and " + spam.size() + " spam messages in your inbox.");

        // Facade pattern
        System.out.println("");
        System.out.println("*** FACADE ***");
        System.out.println("");

        UserInterface userInterface = new UserInterface(inbox);

        System.out.println("* All messages *" );
        userInterface.viewAllMessages();

        System.out.println();
        System.out.println("* Regular messages *");
        userInterface.viewRegularMessages();

        System.out.println();
        System.out.println("* Important messages *");
        userInterface.viewImportantMessages();

        System.out.println();
        System.out.println("* Spam messages *");
        userInterface.viewSpamMessages();

        System.out.println();
        System.out.println("Number of messages in inbox before deletion: " + userInterface.viewNumberOfMessages());
        userInterface.deleteMessage(inbox.getMessages().get(listOfMessages.size()-1));
        System.out.println("Number of messages in inbox after deletion: " + userInterface.viewNumberOfMessages());

        // Iterator pattern
        System.out.println("");
        System.out.println("*** ITERATOR ***");
        System.out.println("");

        System.out.println("--- Notification bar ---");
        NotificationBar notificationBar = new NotificationBar(notifications);
        notificationBar.showAllNotifications();

    }
}
