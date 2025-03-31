package org.example.TodoAssignment;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person gentritHoti = new Person("Gentrit", "Hoti", "Gentrit@test.com");
        TodoItem todoItem = new TodoItem("Hair cut", "Get a haircut at the city", LocalDate.of(2025, 3, 26), false, gentritHoti);
        System.out.println(todoItem);
        System.out.println(gentritHoti);
    }
}
