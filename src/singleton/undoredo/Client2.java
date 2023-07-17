package singleton.undoredo;

public class Client2 {

    void run() {
        UndoRedoHistory.getInstance().redo();
    }
}
