package IteratorPattern;

public class NotificationIterator implements MyIterator{

    Notification[] notificationArray;

    int currentPosition = 0;

    public  NotificationIterator (Notification[] notifications)
    {
        this.notificationArray = notifications;
    }


    @Override
    public boolean hasNext() {
        if (currentPosition >= notificationArray.length || notificationArray[currentPosition] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification = notificationArray[currentPosition];
        currentPosition += 1;
        return  notification;
    }
}
