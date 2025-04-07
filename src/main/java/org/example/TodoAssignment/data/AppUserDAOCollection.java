package org.example.TodoAssignment.data;

import org.example.TodoAssignment.data.interfaces.IAppUserDAO;
import org.example.TodoAssignment.model.AppUser;

import java.util.ArrayList;

public class AppUserDAOCollection implements IAppUserDAO {
    @Override
    public AppUser persist(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser findByUsername(String username) {
        return null;
    }

    @Override
    public ArrayList<AppUser> findAll() {
        return null;
    }

    @Override
    public void remove(String userName) {

    }

}
