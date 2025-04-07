package org.example.TodoAssignment.sequencers;

public class PersonIdSequencer {
    private static int currentId = 1;

    public static int nextId() {
        return currentId++;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}
