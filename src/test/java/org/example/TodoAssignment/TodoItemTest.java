package org.example.TodoAssignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {
    private TodoItem todoItem;

    @BeforeEach
    void setUp() {
        todoItem = new TodoItem("Test Title", "Test Description", LocalDate.now().plusDays(1), false, new Person("John", "Doe", "john.doe@example.com"));
    }

    @Test
    @DisplayName("Test if ID is retrieved correctly")
    void getId() {
        //Arrange
        int expected = todoItem.getId();

        //Act
        int result = todoItem.getId();

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if title is retrieved correctly")
    void getTitle() {
        //Act & Assert
        Assertions.assertEquals("Test Title", todoItem.getTitle());
    }

    @Test
    @DisplayName("Test if title can be changed")
    void setTitle() {
        //Arrange
        String expected = "New Title";

        //Act
        todoItem.setTitle(expected);
        String result = todoItem.getTitle();

        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if setting null title throws exception")
    void setTitle_NullValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> todoItem.setTitle(null));
    }

    @Test
    @DisplayName("Test if setting empty title throws exception")
    void setTitle_EmptyValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> todoItem.setTitle(" "));
    }

    @Test
    @DisplayName("Test if description is retrieved correctly")
    void getDescription() {
        Assertions.assertEquals("Test Description", todoItem.getDescription());
    }

    @Test
    @DisplayName("Test if description can be changed")
    void setDescription() {
        String expected = "New Description";
        todoItem.setDescription(expected);
        Assertions.assertEquals(expected, todoItem.getDescription());
    }

    @Test
    @DisplayName("Test if setting null description throws exception")
    void setDescription_NullValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> todoItem.setDescription(null));
    }

    @Test
    @DisplayName("Test if setting empty description throws exception")
    void setDescription_EmptyValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> todoItem.setDescription(" "));
    }

    @Test
    @DisplayName("Test if deadline is set correctly")
    void setDeadLine() {
        LocalDate expected = LocalDate.now().plusDays(10);
        todoItem.setDeadLine(expected);
        Assertions.assertEquals(expected, todoItem.getDeadLine());
    }

    @Test
    @DisplayName("Test if setting null deadline throws exception")
    void setDeadLine_NullValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> todoItem.setDeadLine(null));
    }

    @Test
    @DisplayName("Test if todo item is marked as done")
    void setDone() {
        todoItem.setDone(true);
        Assertions.assertTrue(todoItem.isDone());
    }

    @Test
    @DisplayName("Test if creator is retrieved correctly")
    void getCreator() {
        Assertions.assertNotNull(todoItem.getCreator());
    }

    @Test
    @DisplayName("Test if setting null creator is allowed")
    void setCreator_NullValue() {
        todoItem.setCreator(null);
        Assertions.assertNull(todoItem.getCreator());
    }

    @Test
    @DisplayName("Test if overdue detection works")
    void isOverdue() {
        TodoItem overdueItem = new TodoItem("Test", "Desc", LocalDate.now().minusDays(1), false, new Person("Jane", "Doe", "jane.doe@example.com"));
        Assertions.assertTrue(overdueItem.isOverdue());
    }

    @Test
    @DisplayName("Test if summary is formatted correctly")
    void getSummary() {
        String summary = todoItem.toString();
        Assertions.assertTrue(summary.contains("Test Title"));
        Assertions.assertTrue(summary.contains("Test Description"));
    }
}
