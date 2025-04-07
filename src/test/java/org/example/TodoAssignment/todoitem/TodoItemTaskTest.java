package org.example.TodoAssignment.todoitem;

import org.example.TodoAssignment.models.TodoItem;
import org.example.TodoAssignment.models.TodoItemTask;
import org.example.TodoAssignment.user.AppRole;
import org.example.TodoAssignment.models.AppUser;
import org.example.TodoAssignment.models.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TodoItemTaskTest {
    private TodoItemTask task;

    @BeforeEach
    void setUp() {
        AppUser appuser = new AppUser("gentrithotii", "password123", AppRole.ROLE_APP_ADMIN);
        Person person = new Person("Gentrit", "Hoti", "gentrit@test.com", appuser);
        TodoItem item = new TodoItem("Clean the House", "Clean the house first and second floor", LocalDate.now().plusDays(1), false, person);
        task = new TodoItemTask(item, person);
    }

    @Test
    @DisplayName("Test if task ID is retrieved correctly")
    void getId() {
        //Arrange
        int expected = 5;

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

    @Test
    @DisplayName("Test if setting assignee to null throws exception")
    void setAssignee_NullValue() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.setAssignee(null));
    }

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

    @Test
    @DisplayName("Test if setting todo item to null throws exception")
    void setTodoItem_NullValue() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.setTodoItem(null));
    }

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
    @DisplayName("Test TodoItemTask equals method")
    void testTodoItemTaskEquals() {
        // Arrange
        Person person = new Person("Gentrit", "Hoti", "gentrit@test.com");
        TodoItem item = new TodoItem("Clean the House", "Clean the house first and second floor", LocalDate.now().plusDays(1), false, person);
        TodoItemTask task1 = new TodoItemTask(item, person);
        TodoItemTask task2 = new TodoItemTask(item, person);
        TodoItemTask task3 = new TodoItemTask(new TodoItem("Different Task", "Description", LocalDate.now(), false, person), person);

        // Act & Assert
        Assertions.assertEquals(task1, task2);
        Assertions.assertNotEquals(task1, task3);
        Assertions.assertNotEquals(task1, null);
    }

    @Test
    @DisplayName("Test TodoItemTask hashCode method")
    void testTodoItemTaskHashCode() {
        // Arrange
        Person person = new Person("Gentrit", "Hoti", "gentrit@test.com");
        TodoItem item = new TodoItem("Clean the House", "Clean the house first and second floor", LocalDate.now().plusDays(1), false, person);
        TodoItemTask task1 = new TodoItemTask(item, person);
        TodoItemTask task2 = new TodoItemTask(item, person);

        // Act & Assert
        Assertions.assertEquals(task1.hashCode(), task2.hashCode());
    }

    @Test
    @DisplayName("Test TodoItemTask toString method")
    void testTodoItemTaskToString() {
        // Arrange
        Person person = new Person("Gentrit", "Hoti", "gentrit@test.com");
        TodoItem item = new TodoItem("Clean the House", "Clean the house first and second floor", LocalDate.now().plusDays(1), false, person);
        TodoItemTask task = new TodoItemTask(item, person);
        String expected = "Id: " + task.getId() + "\n" + "Todo item: " + item + "\n" + "Assigned status: " + task.isAssigned() + "\n";

        // Act
        String result = task.toString();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    //TODO hashCode and equals method check
}
