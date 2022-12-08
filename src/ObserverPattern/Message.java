package ObserverPattern;

public class Message {
    private String messageText;
    private Priority priority;

    public Message(String messageText, Priority priority) {
        this.messageText = messageText;
        this.priority = priority;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Message: " +
                 messageText +
                " (Priority: " + priority +
                ')';
    }
}
