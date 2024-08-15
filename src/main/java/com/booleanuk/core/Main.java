package com.booleanuk.core;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String [] args) {
        TodoList list = new TodoList();

        list.setTaskFilter(1);

        Task task_1 = new Task("Walk the dog");
        Task task_2 = new Task("Run");
        Task task_3 = new Task("Workout");
        Task task_4 = new Task("Eat");

        // Sets task 2 and 3 to completed
        task_2.changeTaskStatus();
        task_3.changeTaskStatus();

        // Add tasks to list
        list.addTask(task_1);
        list.addTask(task_2);
        list.addTask(task_3);
        list.addTask(task_4);

        list.viewTasks();
    }
}
