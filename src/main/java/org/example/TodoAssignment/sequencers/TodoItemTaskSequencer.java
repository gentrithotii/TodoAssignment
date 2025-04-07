package org.example.TodoAssignment.sequencers;

public class TodoItemTaskSequencer {
    private static int currentId;

    public static int nextInt() {
        return ++currentId;
    }

    public static int getCurrentId() {
        return TodoItemTaskSequencer.currentId;
    }

    public static void setCurrentId(int currentId) {
        TodoItemTaskSequencer.currentId = currentId;
    }
}
