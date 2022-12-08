package IteratorPattern;

public class NotificationBar {

    private NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void showAllNotifications() {
        MyIterator myIterator = notifications.createIterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }

}
