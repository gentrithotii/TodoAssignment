package org.example.TodoAssignment.user;

import org.example.TodoAssignment.model.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {
    private AppUser appUser;

    @BeforeEach
    void setUp() {
        appUser = new AppUser("gentrithotii", "gentrit123", AppRole.ROLE_APP_USER);
    }

    @Test
    @DisplayName("Test if it returns username")
    void getUserNameTest() {
        // Arrange
        String expected = "gentrithotii";

        // Act
        String result = appUser.getUserName();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if username has been changed")
    void setUserNameTest() {
        // Arrange
        String expected = "gentrit";

        // Act
        appUser.setUserName(expected);
        String result = appUser.getUserName();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if username handles null values")
    void setUserNameNullTest() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> appUser.setUserName(null), "Username can't be null or empty");
    }

    @Test
    @DisplayName("Test if username handles empty values")
    void setUserNameEmptyTest() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> appUser.setUserName(""), "Username can't be null or empty");
    }

    @Test
    @DisplayName("Test if it returns the correct password")
    void getPasswordTest() {
        // Arrange
        String expected = "gentrit123";

        // Act
        String result = appUser.getPassword();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if password can be changed")
    void setPasswordTest() {
        // Arrange
        String expected = "test123";

        // Act
        appUser.setPassword(expected);
        String result = appUser.getPassword();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if password handles null values")
    void setPasswordNullTest() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> appUser.setPassword(null), "Password can't be null or empty");
    }

    @Test
    @DisplayName("Test if password handles empty values")
    void setPasswordEmptyTest() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> appUser.setPassword(""), "Password can't be null or empty");
    }

    @Test
    @DisplayName("Test role getter and setter")
    void testRoleGetterSetter() {
        // Arrange
        AppRole expectedInitial = AppRole.ROLE_APP_USER;
        AppRole expectedUpdated = AppRole.ROLE_APP_ADMIN;

        // Act & Assert
        assertEquals(expectedInitial, appUser.getRole());
        appUser.setRole(expectedUpdated);
        assertEquals(expectedUpdated, appUser.getRole());
    }

    @Test
    @DisplayName("Test role handles null values")
    void setRoleNullTest() {
        // Act
        appUser.setRole(null);
        AppRole result = appUser.getRole();

        // Assert
        assertNull(result);
    }

    @Test
    @DisplayName("Test AppUser equals method")
    void testEquals() {
        // Arrange
        AppUser user1 = new AppUser("gentrithotii", "password123", AppRole.ROLE_APP_USER);
        AppUser user2 = new AppUser("gentrithotii", "password456", AppRole.ROLE_APP_USER);
        AppUser user3 = new AppUser("anotherUser", "password123", AppRole.ROLE_APP_USER);

        // Act & Assert
        assertEquals(user1, user2);
        assertNotEquals(user1, user3);
        assertNotEquals(user1, null);
    }

    @Test
    @DisplayName("Test AppUser hashCode method")
    void testHashCode() {
        // Arrange
        AppUser user1 = new AppUser("gentrithotii", "password123", AppRole.ROLE_APP_USER);
        AppUser user2 = new AppUser("gentrithotii", "password456", AppRole.ROLE_APP_USER);

        // Act & Assert
        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    @DisplayName("Test AppUser toString method")
    void testToString() {
        // Arrange
        String expected = "Username: gentrithotii\nROLE_APP_USER";

        // Act
        String result = appUser.toString();

        // Assert
        assertEquals(expected, result);
    }
}
