package org.example.TodoAssignment.data;

import org.example.TodoAssignment.data.interfaces.IPersonDAO;
import org.example.TodoAssignment.model.Person;

import java.util.ArrayList;

public class PersonDAOCollection implements IPersonDAO {
    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public ArrayList<Person> findAll() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
