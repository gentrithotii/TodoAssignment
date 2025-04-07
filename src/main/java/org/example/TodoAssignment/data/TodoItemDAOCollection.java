package org.example.TodoAssignment.data;

import org.example.TodoAssignment.data.interfaces.ITodoItemDAO;
import org.example.TodoAssignment.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;

public class TodoItemDAOCollection implements ITodoItemDAO {

    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem findById(int id) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findAll() {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findAllByDoneStatus(boolean done) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByPersonId(int personId) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> fidByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByDeadlineAfter(LocalDate date) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
