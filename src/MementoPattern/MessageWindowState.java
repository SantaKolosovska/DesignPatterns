package MementoPattern;

// memento
public class MessageWindowState {

    private String text;

    public MessageWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
