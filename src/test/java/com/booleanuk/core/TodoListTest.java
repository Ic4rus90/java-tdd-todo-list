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

        Assertions.assertTrue(out.toString().contains(taskName));
    }

}
