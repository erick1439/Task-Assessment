package com.example.Task.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Task.Model.Task;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Optional<Task> getTaskById(Long id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    public Task createTask(Task task) {
        task.setId(tasks.size() + 1L);
        task.setCreateDate(new Date());
        tasks.add(task);

        return task;
    }

    public Task updateTask(Long id, Task updatedTask) {

        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setIsCompleted(updatedTask.getIsCompleted());
                task.setCompletionDate(updatedTask.getCompletionDate());
                return task;
            }
        }

        return null;
    }
    
}
