package org.example.TodoAssignment;

import org.example.TodoAssignment.models.TodoItem;
import org.example.TodoAssignment.models.TodoItemTask;
import org.example.TodoAssignment.user.AppRole;
import org.example.TodoAssignment.models.AppUser;
import org.example.TodoAssignment.models.Person;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        AppUser gentritUser = new AppUser("Gentrithotii", "test123", AppRole.ROLE_APP_ADMIN);
        Person gentritPerson = new Person("Gentrit", "Hoti", "Gentrit@test.com", gentritUser);
        TodoItem todoItem = new TodoItem("Hair cut", "Get a haircut at the city", LocalDate.of(2025, 4, 1), false, gentritPerson);
        TodoItemTask todoItemTask = new TodoItemTask(todoItem, gentritPerson);

        System.out.println(gentritPerson);
        System.out.println(gentritUser);
        System.out.println(todoItemTask);

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SingeltonTest firstSingelton = SingeltonTest.getSingeltonTest();
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SingeltonTest firstSecond = SingeltonTest.getSingeltonTest();
//            }
//        });
//
//        thread1.start();
//        thread2.start();

    }
}
