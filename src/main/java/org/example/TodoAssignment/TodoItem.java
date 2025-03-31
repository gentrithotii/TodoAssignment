package org.example.TodoAssignment;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(String title, String description, LocalDate deadLine, boolean done, Person creator) {
        this.id++;
        setTitle(title);
        setDescription(description);
        setDeadLine(deadLine);
        setDone(done);
        setCreator(creator);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be Null or Empty");

        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty())
            throw new IllegalArgumentException("Description cannot be Null or Empty");

        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null || deadLine.toString().trim().isEmpty())
            throw new IllegalArgumentException("Deadline cannot be Null or Empty");

        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue() {
        return getDeadLine().isBefore(LocalDate.now());
    }
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
                .append("Name: ").append(getFirstName()).append(" ").append(getLastName()).append("\n")
                .append("Email: ").append(getEmail());

        return sb.toString();
    }

    public String getSummary() {
        return "Todo name: " + getTitle() + "\nDescription:  " + getDescription() + "\nThe deadline: " + getDeadLine() + "\nStatus is done: " + isDone() + "\nCreator: " + getCreator().getSummary();
    }
}
