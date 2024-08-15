package com.booleanuk.core;

public class Main {
    public static void main(String [] args) {
        TodoList list = new TodoList();

        Task task_1 = new Task("Walk the dog");
        Task task_2 = new Task("Go to the store");

        list.addTask(task_1);
        list.addTask(task_2);
    }
}
