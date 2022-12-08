package ObserverPattern;

import IteratorPattern.Notification;
import IteratorPattern.NotificationCollection;

public class UserNotifier {

    Notification notification = new Notification("--- !!! You have received an important message. !!! --- ") ;

    NotificationCollection notificationCollection;

    public void addObserver(NotificationCollection notifications) {
        notificationCollection = notifications;
    }

    public void notifyUser(Message message) {
        System.out.println(notification.getNotificationText() + message.getMessageText());
        notificationCollection.addNotification(notification.getNotificationText());
    }

}
