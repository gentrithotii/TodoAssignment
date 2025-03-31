package org.example.TodoAssignment.user;

import java.util.Objects;

public class AppUser {
    private String userName;
    private String password;
    private AppRole role;

    public AppUser(String userName, String password, AppRole role) {
        setUserName(userName);
        setPassword(password);
        setRole(role);
    }

    //TODO Check for lower and uppercase on username error handling

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null || userName.trim().isEmpty())
            throw new IllegalArgumentException("Username can't be null or empty ");

        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty())
            throw new IllegalArgumentException("Password can't be null or empty ");

        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(getUserName(), appUser.getUserName()) && getRole() == appUser.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getRole());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ").append(getUserName()).append("\n")
                .append(getRole().toString());

        return sb.toString();
    }
}
