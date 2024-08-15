package com.booleanuk.extension;

public class Task {
    private String taskName;
    private Boolean isCompleted;

    public Task(String taskName){
        this.taskName = taskName;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void changeTaskStatus(){
        this.isCompleted = !this.isCompleted;
    }
}
