package org.example.TodoAssignment;

import org.example.TodoAssignment.data.AppUserDAOCollection;
import org.example.TodoAssignment.data.PersonDAOCollection;
import org.example.TodoAssignment.data.TodoItemDAOCollection;
import org.example.TodoAssignment.data.TodoItemTaskDAOCollection;
import org.example.TodoAssignment.seeddata.SeedData;


public class Main {
    public static void main(String[] args) {

        PersonDAOCollection personDAO = new PersonDAOCollection();
        AppUserDAOCollection userDAO = new AppUserDAOCollection();
        TodoItemDAOCollection todoItemDAO = new TodoItemDAOCollection();
        TodoItemTaskDAOCollection todoItemTaskDAO = new TodoItemTaskDAOCollection();

        SeedData.populate(personDAO, userDAO, todoItemDAO, todoItemTaskDAO);

//        System.out.println(" " + personDAO.findAll());
        System.out.println(todoItemDAO.findByPersonId(2));

    }
}
