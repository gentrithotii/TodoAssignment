package org.example.TodoAssignment.model;

import org.example.TodoAssignment.sequencers.TodoItemIdSequencer;

import java.util.Objects;

public class TodoItemTask {
    private final int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;


    public TodoItemTask(TodoItem todoItem, Person assignee) {
        this.id = TodoItemIdSequencer.nextId();
        setTodoItem(todoItem);
        setAssignee(assignee);
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
        if (todoItem == null) {
            throw new IllegalArgumentException("Can't set empty Todo!");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null) {
            setAssigned(false);
            throw new IllegalArgumentException("Can't assign null to Assignee ");
        } else {
            setAssigned(true);
            this.assignee = assignee;
        }
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
                .append("Assigned status: ").append(isAssigned()).append("\n");
        return sb.toString();
    }
}
