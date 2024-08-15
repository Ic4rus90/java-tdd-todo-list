package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;

public class TaskTest {

    public void changeTaskStatusTest(){
        Task task = new Task("Finish coding assignment");

        // Assert that isCompleted is false by default
        Assertions.assertFalse(task.getIsCompleted());

        // Assert that executing changeTaskStatus changes status to true
        task.changeTaskStatus();
        Assertions.assertTrue(task.getIsCompleted());

        // Assert that executing it once more will change status back to false
        task.changeTaskStatus();
        Assertions.assertFalse(task.getIsCompleted());
    }
}
