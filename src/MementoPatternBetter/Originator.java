package MementoPatternBetter;

import java.util.EmptyStackException;

public class Originator {

    private StringBuilder text;

    private Memento state;

    private Caretaker caretaker = new Caretaker();


    public Originator() {
        this.text = new StringBuilder();
    }

    public void typeText(String string) {
        text.append(string);
        state = new Memento(text.toString());
        caretaker.addToHistory(state);
    }

    public String undo() {
        try {
            text.replace(0, text.length(), caretaker.undo().getState());
        } catch (EmptyStackException e) {
            text.replace(0, text.length(), "");
        }
        return text.toString();
    }

    public String redo() {
        text.replace(0, text.length(), caretaker.redo().getState());
        return text.toString();
    }

    public void printText() {
        System.out.println(text.toString());
    }

    class Memento {

        String mementoText;

        private Memento(String text) {
            this.mementoText = text;
        }

        private String getState() {
            return mementoText;
        }
    }
}
