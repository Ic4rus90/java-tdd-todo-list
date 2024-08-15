package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> taskList = new ArrayList<>();
    private Integer taskFilter = 0;
    private Integer sorting = 0;

    public boolean addTask(Task task) {
        /*
        try - catch blocks are hardly necessary, but I wanted to experiment with different solutions.
         */
        try {
            taskList.add(task);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public int listSize(){
        return taskList.size();
    }


    public void viewTasks(){

    }
    /*

    public String searchTask(String task){

    }

    public String removeTask(String task){

    }

    private void setFilter(Integer filterChoice){

    }

    private void setSorting(Integer sortingChoice){

    }
 */
}
