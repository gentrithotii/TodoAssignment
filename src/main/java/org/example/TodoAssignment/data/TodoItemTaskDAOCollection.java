package org.example.TodoAssignment.data;


import org.example.TodoAssignment.data.interfaces.ITodoItemTaskDAO;
import org.example.TodoAssignment.model.TodoItemTask;

import java.util.ArrayList;

public class TodoItemTaskDAOCollection implements ITodoItemTaskDAO {

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findByAssignedStatus(boolean status) {
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findByPersonId(int personId) {
        return null;
    }
}
