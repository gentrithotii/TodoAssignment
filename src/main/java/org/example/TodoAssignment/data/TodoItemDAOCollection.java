package org.example.TodoAssignment.data;

import org.example.TodoAssignment.data.interfaces.ITodoItemDAO;
import org.example.TodoAssignment.models.TodoItem;
import org.example.TodoAssignment.models.TodoItemTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDAOCollection implements ITodoItemDAO {
    private final List<TodoItem> todoItemList;

    public TodoItemDAOCollection() {
        this.todoItemList = new ArrayList<>();
    }

    List<TodoItem> getTodoItemList() {
        return todoItemList;
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        getTodoItemList().add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem todoItem : getTodoItemList()) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return getTodoItemList();
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> listByStatusDone = new ArrayList<>();
        for (TodoItem todoItem : getTodoItemList()) {
            if (todoItem.isDone() == done) {
                listByStatusDone.add(todoItem);
            }
        }
        return listByStatusDone;
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        List<TodoItem> titleContains = new ArrayList<>();
        for (TodoItem todoItem : getTodoItemList()) {
            if (todoItem.getTitle().toLowerCase().contains(title.toLowerCase())) {
                titleContains.add(todoItem);
            }
        }
        return titleContains;
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        List<TodoItem> todoItemsByPersonId = new ArrayList<>();
        for (TodoItem todoItem : getTodoItemList()) {
            if (todoItem.getCreator().getId() == personId) {
                todoItemsByPersonId.add(todoItem);
            }
        }
        return todoItemsByPersonId;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        List<TodoItem> listByDeadlineBefore = new ArrayList<>();
        for (TodoItem todoItem : getTodoItemList()) {
            if (todoItem.getDeadLine().isBefore(date)) {
                listByDeadlineBefore.add(todoItem);
            }
        }
        return listByDeadlineBefore;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        List<TodoItem> listByDeadlineAfter = new ArrayList<>();
        for (TodoItem todoItem : getTodoItemList()) {
            if (todoItem.getDeadLine().isAfter(date)) {
                listByDeadlineAfter.add(todoItem);
            }
        }
        return listByDeadlineAfter;
    }

    @Override
    public void remove(int id) {
        getTodoItemList().removeIf((todoItem) -> todoItem.getId() == id);
    }
}
