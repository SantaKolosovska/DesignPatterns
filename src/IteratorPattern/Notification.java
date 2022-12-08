package IteratorPattern;

import java.time.LocalDateTime;

public class Notification {

    private String notificationText;
    private LocalDateTime localDateTime;

    public Notification(String notification) {
        this.notificationText = notification;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        if (localDateTime.equals(null)) {
            return notificationText;
        } else {
            return notificationText + this.getLocalDateTime();
        }
    }
}
