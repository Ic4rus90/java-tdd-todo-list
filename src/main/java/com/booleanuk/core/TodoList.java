package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class TodoList {
    public ArrayList<Task> taskList = new ArrayList<>();
    private Integer taskFilter = 0;

    public boolean addTask(Task task) {
        /*
        try - catch blocks are hardly necessary, but I wanted to experiment with different solutions.
         */
        try {
            this.taskList.add(task);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public int listSize(){
        return this.taskList.size();
    }


    public void viewTasks(){
        switch(this.taskFilter){
            case 0: {
                for (Task t : this.taskList) {
                    String taskName = t.getTaskName();
                    System.out.println(taskName);
                }
                break;
            }

            case 1: {
                for (Task t : this.taskList) {
                    if (!t.getIsCompleted()) {
                        String taskName = t.getTaskName();
                        System.out.println(taskName);
                    }
                }
                break;
            }

            case 2: {
                for (Task t : this.taskList) {
                    if (t.getIsCompleted()) {
                        String taskName = t.getTaskName();
                        System.out.println(taskName);
                    }
                }
                break;
            }

        }
    }

    public void setTaskFilter(int filterNumber){
        // 0 = all tasks, 1 = incomplete tasks, 2 = completed tasks.
        this.taskFilter = filterNumber;
    }

    public String searchTask(String task){
        for (Task t : this.taskList) {
            if (Objects.equals(t.getTaskName(), task)){
                return "Task was found in your list";
            }
        }
        return "Task does not exist";
    }


    public String removeTask(String task){
        for (Task t : this.taskList){
            if (Objects.equals(t.getTaskName(), task)){
                this.taskList.remove(t);
                return "Task removed";
            }
        }
        return "Task does not exist";
    }


    public void setSorting(Integer sortingChoice){
        // 0 for ascending, 1 for descending.
        ArrayList<Task> sorted = new ArrayList<>();

        if (sortingChoice == 0){
            this.taskList = this.taskList.stream()
                    .sorted(Comparator.comparing(Task::getTaskName))
                    .collect(Collectors.toCollection(ArrayList::new));
        }

        else if (sortingChoice == 1){
            this.taskList = this.taskList.stream()
                    .sorted((task_2, task_1) -> task_1.getTaskName().compareTo(task_2.getTaskName()))
                    .collect(Collectors.toCollection(ArrayList::new));
        }
    }
}
