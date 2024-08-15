package com.booleanuk.extension;

import com.booleanuk.core.Task;
import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListTest {
    @Test
    public void searchTaskTest(){
        TodoList list = new TodoList();

        Task task_1 = new Task("Pet the dog");
        Task task_2 = new Task("Take out the garbage");

        // Add tasks to list
        list.addTask(task_1);
        list.addTask(task_2);

        String success = "Task was found in your list";
        String fail = "Task does not exist";

        String exists = list.searchTask(1);
        String doesNotExist = list.searchTask(4);

        Assertions.assertEquals(success, exists);
        Assertions.assertEquals(fail, doesNotExist);
    }

}
