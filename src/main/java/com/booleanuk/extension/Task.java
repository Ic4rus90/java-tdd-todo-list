package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private Boolean isCompleted;
    private int id;
    private static int counter = 1;
    private LocalDateTime dateTime;

    public Task(String taskName){
        this.taskName = taskName;
        this.isCompleted = false;
        this.id = counter++;
        this.dateTime = LocalDateTime.now();
    }

    public String getTaskName() {
        return this.taskName;
    }

    public Integer getID() { return this.id; }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void changeTaskStatus(){
        this.isCompleted = !this.isCompleted;
    }
}
