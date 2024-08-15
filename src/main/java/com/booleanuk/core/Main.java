package com.booleanuk.core;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String [] args) {

            TodoList list = new TodoList();

            list.setSorting(0);

            Task task_1 = new Task("Approach the monkey in the yard");
            Task task_2 = new Task("Run");
            Task task_3 = new Task("Workout");
            Task task_4 = new Task("Eat");

            // Add tasks to list
            list.addTask(task_1);
            list.addTask(task_2);
            list.addTask(task_3);
            list.addTask(task_4);

            list.viewTasks();

            list.setSorting(0);

            list.viewTasks();

            list.setSorting(1);

            list.viewTasks();

    }
}
