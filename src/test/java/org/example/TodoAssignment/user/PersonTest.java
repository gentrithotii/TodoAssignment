package org.example.TodoAssignment.user;

import org.example.TodoAssignment.models.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Gentrit", "Test", "Gentrit.test@test.com");
    }

    @Test
    @DisplayName("")
    void getId() {
    }

    @Test
    @DisplayName("Test if lastname Changes")
    void setLastName() {
        //Arrange
        String initialValue = person.getLastName();
        String expected = "Gentrit";

        //Act
        person.setLastName(expected);
        String result = person.getLastName();

        //Assert
        Assertions.assertNotEquals(initialValue, result);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if first name changes")
    void setFirstName() {
        //Arrange
        String initial = person.getFirstName();
        String expected = "new last name";

        //Act
        person.setFirstName(expected);
        String result = person.getFirstName();

        //Assert
        Assertions.assertNotEquals(initial, result);
        Assertions.assertEquals(expected, result);
    }


    @Test
    @DisplayName("Test if email changes")
    void setEmail() {
        //Arrange
        String initial = person.getEmail();
        String expected = "geni@geni.com";

        //Act
        person.setEmail(expected);
        String result = person.getEmail();

        //Assert
        Assertions.assertNotEquals(initial, result);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if setting last name to null throws exception")
    void setLastName_NullValue() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setLastName(null));
    }

    @Test
    @DisplayName("Test if setting last name to empty string is handled correctly")
    void setLastName_EmptyString() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setLastName(""));
    }

    @Test
    @DisplayName("Test if setting first name to null throws exception")
    void setFirstName_NullValue() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setFirstName(null));
    }

    @Test
    @DisplayName("Test if setting first name to empty string is handled correctly")
    void setFirstName_EmptyString() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setFirstName(""));
    }

    @Test
    @DisplayName("Test if setting email to null throws exception")
    void setEmail_NullValue() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setEmail(null));
    }

    @Test
    @DisplayName("Test if setting email to empty string is handled correctly")
    void setEmail_EmptyString() {
        //Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setEmail(""));
    }

    @Test
    @DisplayName("Test Person equals method")
    void testEquals() {
        //TODO remove Id from Equals

        // Arrange
        Person person1 = new Person("gentrithotii", "hoti", "gentrit@hoti.com");
        Person person2 = new Person("gentrithotii", "hoti", "gentrit@hoti.com");
        Person person3 = new Person("anotherUser", "password123", "gentrit@hoti.com");

        // Act & Assert
        assertEquals(person1, person2);
        assertNotEquals(person1, person3);
        assertNotEquals(person1, null);
    }

    @Test
    @DisplayName("Test Person hashCode method")
    void testHashCode() {
        //TODO Check

        // Arrange
        Person person1 = new Person("Gentrit", "Hoti", "gentrit@hoti.com");
        Person person2 = new Person("Gentrit", "Hoti", "gentrit@hoti.com");

        // Act & Assert
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    @DisplayName("Test Person  toString method")
    void testToString() {
        //Arrange
        String expected = "Id: 1\nName: Gentrit Test\nEmail: Gentrit.test@test.com";
        //Act
        String result = person.toString();
        //Assert
        Assertions.assertEquals(expected, result);
    }
}