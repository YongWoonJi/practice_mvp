package com.example.jyw.practice_mvp.model;

import com.example.jyw.practice_mvp.model.domain.ITaskRepository;
import com.example.jyw.practice_mvp.model.domain.Task;

import java.util.HashMap;


public class TaskRepository implements ITaskRepository {
    
    private static TaskRepository instance;
    private HashMap<Integer, Task> tasks;

    private TaskRepository() {
        
    }

    // master
    public static TaskRepository newInstance() {
        if (instance == null) {
            synchronized (TaskRepository.class) {
                if (instance == null) {
                    instance = new TaskRepository();
                }
            }
        }
        return instance;
    }

    public void insert() {

    }

    @Override
    public Task getTask(int id) {
//        return tasks.get(id);
        // aaa
        Task task = new Task();
        task.setTitle("title");
        task.setContent("내용");
        return task;
    }
}
