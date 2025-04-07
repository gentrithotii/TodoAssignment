package org.example.TodoAssignment.data.interfaces;

import org.example.TodoAssignment.model.Person;

import java.util.ArrayList;

public interface IPersonDAO {
    Person presist(Person person);

    Person findById(int id);

    Person findByEmail(String email);

    ArrayList<Person> findAll();

    void remove(int id);
}
