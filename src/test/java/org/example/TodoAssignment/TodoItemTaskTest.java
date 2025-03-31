package org.example.TodoAssignment;

import org.example.TodoAssignment.todo.TodoItem;
import org.example.TodoAssignment.todo.TodoItemTask;
import org.example.TodoAssignment.user.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TodoItemTaskTest {
    private TodoItemTask task;

    @BeforeEach
    void setUp() {
        task = new TodoItemTask();
    }

    @Test
    @DisplayName("Test if task ID is retrieved correctly")
    void getId() {
        //Arrange
        int expected = 1;

        //Act
        int result = task.getId();

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if task is assigned")
    void isAssigned() {
        //Arrange
        task.setAssigned(true);

        //Act
        boolean result = task.isAssigned();

        //Assert
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test if assigned value changes")
    void setAssigned() {
        //Arrange
        boolean initial = task.isAssigned();
        boolean expected = !initial;

        //Act
        task.setAssigned(expected);
        boolean result = task.isAssigned();

        //Assert
        Assertions.assertNotEquals(initial, result);
        Assertions.assertEquals(expected, result);
    }

//    @Test
//    @DisplayName("Test if setting assignee to null throws exception")
//    void setAssignee_NullValue() {
//        //Act & Assert
//        Assertions.assertThrows(IllegalArgumentException.class, () -> task.setAssignee(null));
//    }

    @Test
    @DisplayName("Test if setting assignee correctly updates")
    void setAssignee() {
        //Arrange
        Person assignee = new Person("John", "Doe", "john.doe@example.com");

        //Act
        task.setAssignee(assignee);
        Person result = task.getAssignee();

        //Assert
        Assertions.assertEquals(assignee, result);
    }

//    @Test
//    @DisplayName("Test if setting todo item to null throws exception")
//    void setTodoItem_NullValue() {
//        //Act & Assert
//        Assertions.assertThrows(IllegalArgumentException.class, () -> task.setTodoItem(null));
//    }

    @Test
    @DisplayName("Test if setting todo item correctly updates")
    void setTodoItem() {
        //Arrange
        Person creator = new Person("John", "Doe", "john.doe@example.com");
        TodoItem todoItem = new TodoItem("Test Task", "Description", LocalDate.now().plusDays(5), false, creator);

        //Act
        task.setTodoItem(todoItem);
        TodoItem result = task.getTodoItem();

        //Assert
        Assertions.assertEquals(todoItem, result);
    }


    @Test
    @DisplayName("Test if getSummary returns expected value")
    void getSummary() {
        //Arrange
        String expected = "Add summary";

        //Act
        String result = task.toString();

        //Assert
        Assertions.assertEquals(expected, result);
    }
}
