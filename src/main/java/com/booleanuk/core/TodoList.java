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
        for (Task t : taskList) {
            String taskName = t.getTaskName();
            System.out.println(taskName);
        }
    }

    public void setTaskFilter(int filterNumber){
        // 0 = all tasks, 1 = incomplete tasks, 2 = completed tasks.
        this.taskFilter = filterNumber;
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
