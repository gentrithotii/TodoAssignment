package org.example.TodoAssignment.todo.interfaces;

import org.example.TodoAssignment.user.AppUser;

import java.util.ArrayList;

public interface IAppUserDAO {
    AppUser persist(AppUser appUser);

    AppUser findByUsername(String username);

    ArrayList<AppUser> findAll();

    void remove(String userName);
}
