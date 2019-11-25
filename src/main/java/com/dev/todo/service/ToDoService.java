package com.dev.todo.service;

import com.dev.todo.model.ToDo;

import java.util.List;

public interface ToDoService {
    public List<ToDo> getAllToDo();
    public ToDo getToDoById(Long id);
    public ToDo saveToDo(ToDo todo);
    public void removeToDo(ToDo todo);
}
