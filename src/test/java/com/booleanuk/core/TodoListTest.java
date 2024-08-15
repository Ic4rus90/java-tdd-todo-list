package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListTest {
    @Test
    public void addTaskTest() {
        TodoList list = new TodoList();
        Task task = new Task("Walk the dog");
        Assertions.assertTrue(list.addTask(task));

        int oldListSize = list.listSize();
        Task task2 = new Task("Create a list");
        list.addTask(task2);
        int newListSize = list.listSize();
        Assertions.assertEquals(newListSize, oldListSize + 1);
    }

    @Test
    public void viewTasksTest(){
        TodoList list = new TodoList();
        String taskName = "Walk the dog";
        Task task = new Task(taskName);
        list.addTask(task);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        list.viewTasks();

        Assertions.assertTrue(out.toString().contains(taskName));

        String taskName2 = "Go to the store";
        Task task2 = new Task(taskName2);
        list.addTask(task2);

        ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out2));

        list.viewTasks();

        Assertions.assertTrue(out2.toString().contains(taskName));
        Assertions.assertTrue(out2.toString().contains(taskName2));
    }

    @Test
    public void viewTasksTest2(){
        /*
        Test if only completed tests are returned, when this is set in preferences.
         */
        TodoList list = new TodoList();

        list.setTaskFilter(2);

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

        // Get output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        list.viewTasks();

        Assertions.assertTrue(out.toString().contains(task_2.getTaskName()));
        Assertions.assertTrue(out.toString().contains(task_3.getTaskName()));
        Assertions.assertFalse(out.toString().contains(task_1.getTaskName()));
        Assertions.assertFalse(out.toString().contains(task_4.getTaskName()));
    }

    @Test
    public void viewTasksTest3(){
        /*
        Test if only incomplete tests are returned, when this is set in preferences.
         */
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

        // Get output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        list.viewTasks();

        Assertions.assertTrue(out.toString().contains(task_1.getTaskName()));
        Assertions.assertTrue(out.toString().contains(task_4.getTaskName()));
        Assertions.assertFalse(out.toString().contains(task_2.getTaskName()));
        Assertions.assertFalse(out.toString().contains(task_3.getTaskName()));
    }

    @Test
    public void searchString(){
        TodoList list = new TodoList();

        String exists = list.searchTask("Walk the dog");
        String doesNotExist = list.searchTask("Vacuum the racoon");

        Task task_1 = new Task("Walk the dog");
        Task task_2 = new Task("Run");

        // Add tasks to list
        list.addTask(task_1);
        list.addTask(task_2);

        String successString = "Task was found in your list";
        String failString = "Task does not exist";

        String stringExists = list.searchTask(exists);
        String stringDoesNotExist = list.searchTask(doesNotExist);

        Assertions.assertEquals(successString, stringExists);
        Assertions.assertEquals(failString, stringDoesNotExist);
    }
}
