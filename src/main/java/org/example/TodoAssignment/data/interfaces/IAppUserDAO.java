package org.example.TodoAssignment.data.interfaces;

import org.example.TodoAssignment.model.AppUser;

import java.util.ArrayList;

public interface IAppUserDAO {
    AppUser persist(AppUser appUser);

    AppUser findByUsername(String username);

    ArrayList<AppUser> findAll();

    void remove(String userName);
}
