package org.example.TodoAssignment.todo;

import org.example.TodoAssignment.user.Person;

import java.util.Objects;

public class TodoItemTask {
    private static int sequencer = 0;
    private final int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask() {
        this.id = getNextId();
    }

    private int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return getId() == that.getId() && isAssigned() == that.isAssigned() && Objects.equals(getTodoItem(), that.getTodoItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), isAssigned(), getTodoItem());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append("\n")
                .append("Todo item: ").append(getTodoItem()).append("\n")
                .append("Assigned status: ").append(assigned).append("\n");


        return sb.toString();
    }
}
