package com.booleanuk.extension;

import com.booleanuk.extension.Task;
import com.booleanuk.extension.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

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

        list.updateStatus(id);

        boolean isCompleted = false;

        for (Task t : list.taskList) {
            if (t.getID() == id){
                isCompleted = t.getIsCompleted();
            }
        }

        Assertions.assertTrue(isCompleted);
    }

    @Test
    public void getDateAndTimeTest(){
        TodoList list = new TodoList();

        Task task_1 = new Task("Pet the dog");

        LocalDateTime localDateTimeNow = LocalDateTime.now();

        // Add tasks to list
        list.addTask(task_1);

        LocalDateTime taskTime = list.getDateTime(1);

        Assertions.assertEquals(localDateTimeNow.getSecond(), taskTime.getSecond());
        Assertions.assertEquals(localDateTimeNow.getMinute(), taskTime.getMinute());
        Assertions.assertEquals(localDateTimeNow.getHour(), taskTime.getHour());
        Assertions.assertEquals(localDateTimeNow.getDayOfMonth(), taskTime.getDayOfMonth());
        Assertions.assertEquals(localDateTimeNow.getMonth(), taskTime.getMonth());
        Assertions.assertEquals(localDateTimeNow.getYear(), taskTime.getYear());
    }
}
