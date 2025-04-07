package org.example.TodoAssignment.data.interfaces;

import org.example.TodoAssignment.models.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface ITodoItemDAO {
    TodoItem persist(TodoItem todoItem);

    TodoItem findById(int id);

    List<TodoItem> findAll();

    List<TodoItem> findAllByDoneStatus(boolean done);

    List<TodoItem> findByTitleContains(String title);

    List<TodoItem> findByPersonId(int personId);

    List<TodoItem> findByDeadlineBefore(LocalDate date);

    List<TodoItem> findByDeadlineAfter(LocalDate date);

    void remove(int id);


}
