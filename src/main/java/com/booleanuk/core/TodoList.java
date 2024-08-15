package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> taskList = new ArrayList<>();
    private Integer taskFilter = 0;
    private Integer sorting = 0;

    public boolean addTask(Task task) {
    }

    public int listSize(){
        return taskList.size();
    }


    public String viewTasks(){

    }

    public String searchTask(String task){

    }

    public String removeTask(String task){

    }

    private void setFilter(Integer filterChoice){

    }

    private void setSorting(Integer sortingChoice){

    }
}
