package org.example.TodoAssignment.data.interfaces;

import org.example.TodoAssignment.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ITodoItemDAO {
    TodoItem persist(TodoItem todoItem);

    TodoItem findById(int id);

    ArrayList<TodoItem> findAll();

    ArrayList<TodoItem> findAllByDoneStatus(boolean done);

    ArrayList<TodoItem> findByTitleContains(String title);

    ArrayList<TodoItem> findByPersonId(int personId);

    ArrayList<TodoItem> fidByDeadlineBefore(LocalDate date);

    ArrayList<TodoItem> findByDeadlineAfter(LocalDate date);

    void remove(int id);


}
