package singleton.undoredo;

public class Client1 {

    void run() {
        UndoRedoHistory.getInstance().undo();
    }
}
