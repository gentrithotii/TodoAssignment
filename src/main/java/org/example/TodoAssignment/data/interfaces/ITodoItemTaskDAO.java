package org.example.TodoAssignment.data.interfaces;

import org.example.TodoAssignment.model.TodoItemTask;

import java.util.ArrayList;

public interface ITodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask todoItemTask);

    TodoItemTask findById(int id);

    ArrayList<TodoItemTask> findAll();

    ArrayList<TodoItemTask> findByAssignedStatus(boolean status);

    ArrayList<TodoItemTask> findByPersonId(int personId);


}
