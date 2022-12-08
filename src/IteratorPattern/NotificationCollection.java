package IteratorPattern;

import java.time.LocalDateTime;

public class NotificationCollection implements MyCollection {

    static final int MAX_ITEMS = 10;
    int numberOfItems = 0;
    Notification[] notificationArray = new Notification[MAX_ITEMS];

    public void addNotification(String string)
    {
        Notification notification = new Notification(string);
        notification.setLocalDateTime(LocalDateTime.now());
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            notificationArray[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }
    @Override
    public MyIterator createIterator() {
        return new NotificationIterator(notificationArray);
    }
}
