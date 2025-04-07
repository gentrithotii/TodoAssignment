package org.example.TodoAssignment;

import org.example.TodoAssignment.data.AppUserDAOCollection;
import org.example.TodoAssignment.data.PersonDAOCollection;
import org.example.TodoAssignment.data.TodoItemDAOCollection;
import org.example.TodoAssignment.data.TodoItemTaskDAOCollection;
import org.example.TodoAssignment.models.TodoItem;
import org.example.TodoAssignment.models.TodoItemTask;
import org.example.TodoAssignment.seeddata.SeedData;
import org.example.TodoAssignment.user.AppRole;
import org.example.TodoAssignment.models.AppUser;
import org.example.TodoAssignment.models.Person;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        PersonDAOCollection personDAO = new PersonDAOCollection();
        AppUserDAOCollection userDAO = new AppUserDAOCollection();
        TodoItemDAOCollection todoItemDAO = new TodoItemDAOCollection();
        TodoItemTaskDAOCollection todoItemTaskDAO = new TodoItemTaskDAOCollection();

        SeedData.populate(personDAO, userDAO, todoItemDAO, todoItemTaskDAO);


    }
}
