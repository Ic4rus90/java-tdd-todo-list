package com.booleanuk.extension;

import com.booleanuk.extension.Task;
import com.booleanuk.extension.TodoList;
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

        Task exists = list.searchTask(1);

        Assertions.assertEquals(exists.getTaskName(), task_1.getTaskName());
    }

    @Test
    public void updateTaskTest(){
        TodoList list = new TodoList();

        Task task_1 = new Task("Pet the dog");
        Task task_2 = new Task("Take out the garbage");

        // Add tasks to list
        list.addTask(task_1);

        int id = 1;

        list.updateTask(id, task_2.getTaskName());

        Assertions.assertEquals(task_2.getTaskName(), list.taskList.getFirst().getTaskName());
    }

    @Test
    public void updateStatusTest(){
        TodoList list = new TodoList();

        Task task_1 = new Task("Pet the dog");

        // Add tasks to list
        list.addTask(task_1);

        int id = 1;

        for (Task t : list.taskList) {
            if (t.getID() == id){
                t.changeTaskStatus();
            }
        }

        boolean isCompleted = false;

        for (Task t : list.taskList) {
            if (t.getID() == id){
                isCompleted = t.getIsCompleted();
            }
        }

        Assertions.assertTrue(isCompleted);
    }


}
