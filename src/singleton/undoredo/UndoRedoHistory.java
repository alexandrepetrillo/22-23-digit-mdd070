package singleton.undoredo;

import java.util.ArrayList;
import java.util.List;

public class UndoRedoHistory {

    private static final UndoRedoHistory instance = new UndoRedoHistory();

    public static UndoRedoHistory getInstance() {
        return instance;
    }

    private List<String> actions = new ArrayList<>();

    private UndoRedoHistory() {

    }

    public void undo() {

    }

    public void redo() {

    }

}
