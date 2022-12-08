package MementoPatternBetter;

import java.util.EmptyStackException;
import java.util.Stack;

public class Caretaker {
    Stack<Originator.Memento> undoHistory = new Stack<>();

    Stack<Originator.Memento> redoHistory = new Stack<>();

    public void addToHistory(Originator.Memento memento) {
        undoHistory.push(memento);
    }

    public Originator.Memento undo() throws EmptyStackException {
        if (!undoHistory.empty()) {
            redoHistory.push(undoHistory.pop());
        }
        return undoHistory.peek();
    }

    public Originator.Memento redo() {
        if (!redoHistory.empty()) {
            Originator.Memento redo = redoHistory.peek();
            undoHistory.push(redoHistory.pop());
            return redo;
        } else {
            return undoHistory.peek();
        }
    }
}
