package org.example.TodoAssignment.data.interfaces;

import org.example.TodoAssignment.models.Person;

import java.util.List;

public interface IPersonDAO {
    Person persist(Person person);

    Person findById(int id);

    Person findByEmail(String email);

    List<Person> findAll();

    void remove(int id);
}
