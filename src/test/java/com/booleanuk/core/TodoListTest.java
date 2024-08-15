package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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



}
