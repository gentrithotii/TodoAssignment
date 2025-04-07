package org.example.TodoAssignment.seeddata;

import org.example.TodoAssignment.data.AppUserDAOCollection;
import org.example.TodoAssignment.data.PersonDAOCollection;
import org.example.TodoAssignment.data.TodoItemDAOCollection;
import org.example.TodoAssignment.data.TodoItemTaskDAOCollection;
import org.example.TodoAssignment.models.*;
import org.example.TodoAssignment.user.AppRole;

import java.time.LocalDate;

public class SeedData {

    public static void populate(PersonDAOCollection personDAO, AppUserDAOCollection userDAO, TodoItemDAOCollection itemDAO, TodoItemTaskDAOCollection taskDAO) {

        // AppUsers
        AppUser user1 = userDAO.persist(new AppUser("alice123", "passAlice", AppRole.ROLE_APP_USER));
        AppUser user2 = userDAO.persist(new AppUser("bob456", "passBob", AppRole.ROLE_APP_ADMIN));
        AppUser user3 = userDAO.persist(new AppUser("charlie789", "passCharlie", AppRole.ROLE_APP_USER));
        AppUser user4 = userDAO.persist(new AppUser("diana101", "passDiana", AppRole.ROLE_APP_ADMIN));
        AppUser user5 = userDAO.persist(new AppUser("edward202", "passEdward", AppRole.ROLE_APP_USER));

        // Persons
        Person p1 = personDAO.persist(new Person("Alice", "Andersson", "alice@example.com", user1));
        Person p2 = personDAO.persist(new Person("Bob", "Bengtsson", "bob@example.com", user2));
        Person p3 = personDAO.persist(new Person("Charlie", "Carlsson", "charlie@example.com", user3));
        Person p4 = personDAO.persist(new Person("Diana", "Dahl", "diana@example.com", user4));
        Person p5 = personDAO.persist(new Person("Edward", "Ek", "edward@example.com", user5));

        // TodoItems
        TodoItem t1 = itemDAO.persist(new TodoItem("Buy groceries", "Milk, eggs, bread", LocalDate.now().plusDays(1), false, p1));
        TodoItem t2 = itemDAO.persist(new TodoItem("Walk the dog", "30 minute walk in the park", LocalDate.now().plusDays(2), false, p2));
        TodoItem t3 = itemDAO.persist(new TodoItem("Finish project", "Wrap up Java project", LocalDate.now().plusDays(3), false, p3));
        TodoItem t4 = itemDAO.persist(new TodoItem("Call mom", "Check in with mom", LocalDate.now().plusDays(4), false, p4));
        TodoItem t5 = itemDAO.persist(new TodoItem("Book dentist", "Schedule appointment", LocalDate.now().minusDays(1), false, p5));
        TodoItem t6 = itemDAO.persist(new TodoItem("Clean the house", "Vacuum and mop the floors", LocalDate.now().plusDays(5), false, p1));
        TodoItem t7 = itemDAO.persist(new TodoItem("Study for exam", "Review chapters 4-6", LocalDate.now().plusDays(6), false, p2));
        TodoItem t8 = itemDAO.persist(new TodoItem("Go to gym", "Strength training for 45 minutes", LocalDate.now().plusDays(7), false, p3));
        TodoItem t9 = itemDAO.persist(new TodoItem("Prepare dinner", "Cook spaghetti and salad", LocalDate.now().plusDays(8), false, p4));
        TodoItem t10 = itemDAO.persist(new TodoItem("Renew library books", "Return overdue books", LocalDate.now().minusDays(2), false, p5));


        // TodoItemTasks
        taskDAO.persist(new TodoItemTask(t1, p1));
        taskDAO.persist(new TodoItemTask(t2, p2));
        taskDAO.persist(new TodoItemTask(t3, p3));
        taskDAO.persist(new TodoItemTask(t4, p4));
        taskDAO.persist(new TodoItemTask(t5, p5));
        taskDAO.persist(new TodoItemTask(t6, p1));
        taskDAO.persist(new TodoItemTask(t7, p2));
        taskDAO.persist(new TodoItemTask(t8, p3));
        taskDAO.persist(new TodoItemTask(t9, p4));
        taskDAO.persist(new TodoItemTask(t10, p5));

    }
}
