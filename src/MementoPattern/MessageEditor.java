package MementoPattern;

// originator
public class MessageEditor {

    private MessageWindow messageWindow;

    private MessageWindowState savedMessageState;

    public MessageEditor(MessageWindow textWindow) {
        this.messageWindow = textWindow;
    }

    public void write(String text) {
        messageWindow.addText(text);
    }

    public void hitSave() {
        savedMessageState = messageWindow.save();
    }

    public void hitUndo() {
        messageWindow.restore(savedMessageState);
    }

    public void print(){
        System.out.println(messageWindow.getCurrentText());
    }

}
