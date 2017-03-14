package com.example.jyw.practice_mvp.vp;

import com.example.jyw.practice_mvp.model.TaskRepository;
import com.example.jyw.practice_mvp.model.domain.ITaskRepository;
import com.example.jyw.practice_mvp.model.domain.Task;
import com.google.common.base.Preconditions;


public class MainPresenter {

    private IView view;
    private ITaskRepository taskRepository;

    public void attachView(IView fragment) {
        Preconditions.checkNotNull(fragment);
        this.view = fragment;
        this.taskRepository = TaskRepository.newInstance();
    }

    public void loadTask() {
        Task task = taskRepository.getTask(1);
        String titleToShow = task.getTitle() + "입니다";
        view.setTextTitle(titleToShow);
    }
}
