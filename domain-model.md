# Domain model

## Core 

### User stories

`I want to add tasks to my todo list.` v 
`I want to see all the tasks in my todo list.` v
`I want to change the status of a task between incomplete and complete.` v
`I want to be able to get only the complete tasks.` v
`I want to be able to get only the incomplete tasks.` v
`I want to search for a task and receive a message that says it wasn't found if it doesn't exist.` v
`I want to remove tasks from my list.` v 
`I want to see all the tasks in my list ordered alphabetically in ascending order.` v
`I want to see all the tasks in my list ordered alphabetically in descending order.` v


## Extension
`I want to be able to get a task by a unique ID.`
`I want to update the name of a task by providing its ID and a new name.`
`I want to be able to change the status of a task by providing its ID.`
`I want to be able to see the date and time that I created each task.`

## Task Class

### Variables
| Variables             | Description                                             |
|-----------------------|---------------------------------------------------------|
| `String taskName`     | Contains the name of the task.                          | 
| `Boolean isCompleted` | Returns true if the task is completed and false if not. |


### Methods
| Methods                                            | Scenario                                         | Outputs |
|----------------------------------------------------|--------------------------------------------------|---------|
| `Void setTaskStatus(boolean completed/incomplete)` | User changes the status of the task.             | -       |

## TODO Class

### Variables
| Variables                  | Description                                                                                                                                |
|----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| `List<Task task> taskList` | List containing the tasks.                                                                                                                 | 
| `Integer taskFilter`       | Allows the user to set preferences regarding what tasks are shown. 0 for all tasks, 1 for incomplete tasks and 2 for completed tasks.      |
| `Integer sorting`          | Allows the user to set preferences regarding the sorting of the tasks. 0 for alphabetically ascending and 1 for alphabetically descending. |


### Methods
| Methods                                  | Scenario                                                                                                               | Outputs                          |
|------------------------------------------|------------------------------------------------------------------------------------------------------------------------|----------------------------------|
| `Boolean addTask(Task task)`             | User adds task to the Todo list.                                                                                       | Return true                      |
| `Void viewTasks()`                       | User does not have any tasks in the list.                                                                              | Return `Todo list is empty`.     |
|                                          | User has tasks in the list.                                                                                            | Return todo list.                |
| `String searchTask(String task)`         | User searches for existing task.                                                                                       | Return `Task found in your list` |
|                                          | User searches for task that does not exist.                                                                            | Return `Task does not exist`     |
| `String removeTask(String task)`         | User removes an existing task from the list.                                                                           | Return `Task removed`            |
|                                          | User attempts to remove a task which does not exist from the list.                                                     | Return `Task does not exist`     |
| `Void setFilter(Integer filterChoice)`   | User changes if they want to see incomplete tasks, complete tasks or all tasks. See taskFilter variable for more info. | -                                | 
| `Void setSorting(Integer sortingChoice)` | User changes the sorting of the list. See sorting variable for more info.                                              | -                                |

