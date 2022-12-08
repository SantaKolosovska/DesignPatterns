package MementoPattern;

import java.util.Objects;

// caretaker?
public class MessageWindow {

    private StringBuilder currentText;

    public MessageWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public MessageWindowState save() {
        return new MessageWindowState(currentText.toString());
    }

    public void restore(MessageWindowState save) {
        if (Objects.nonNull(save)) {
            currentText = new StringBuilder(save.getText());
        } else {
            System.out.println("Undo impossible");
        }
    }

    public StringBuilder getCurrentText() {
        return currentText;
    }

    @Override
    public String toString() {
        return currentText.toString();
    }
}
