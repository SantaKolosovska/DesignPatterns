package MementoPattern;

public class Main {

    public static void main(String[] args) {
        MessageEditor messageEditor = new MessageEditor(new MessageWindow());
        messageEditor.write("I wrote something. ");
        messageEditor.write("Can you read it? ");
        //messageEditor.hitSave();
        messageEditor.print();

        messageEditor.write("No, I can't");
        messageEditor.print();

        messageEditor.hitUndo();
        messageEditor.print();
    }
}
