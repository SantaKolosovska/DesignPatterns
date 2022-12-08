package MementoPatternBetter;

public class Main {

    public static void main(String[] args) {
        Originator messageEditor = new Originator();
        messageEditor.typeText("This is a ");
        messageEditor.typeText("beginning of");
        messageEditor.typeText(" a new sentence");
        messageEditor.printText();

        messageEditor.undo();
        messageEditor.printText();
        messageEditor.undo();
        messageEditor.printText();
        messageEditor.undo();
        messageEditor.printText();

        messageEditor.redo();
        messageEditor.printText();
        messageEditor.redo();
        messageEditor.printText();
        messageEditor.redo();
        messageEditor.printText();

        messageEditor.typeText(", and this ");
        messageEditor.typeText("is the end.");
        messageEditor.printText();
        messageEditor.undo();
        messageEditor.typeText("is NOT the end");
        messageEditor.printText();
    }

}
