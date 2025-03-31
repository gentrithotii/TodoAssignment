package org.example.TodoAssignment;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    TodoItemTask() {
        this.id++;
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
    public int hashCode() {
        //Don't include Person object(s)
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //Don't include Person object(s)
        return super.equals(obj);
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
