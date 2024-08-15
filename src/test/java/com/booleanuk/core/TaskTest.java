package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void setTaskStatusTest(){
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
