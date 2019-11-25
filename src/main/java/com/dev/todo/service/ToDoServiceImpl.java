package com.dev.todo.service;

import com.dev.todo.model.ToDo;
import com.dev.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDo> getAllToDo() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo getToDoById(Long id) {
        return toDoRepository.getOne(id);
    }

    @Override
    public ToDo saveToDo(ToDo todo) {
        return toDoRepository.save(todo);
    }

    @Override
    public void removeToDo(ToDo todo) {
        toDoRepository.delete(todo);
    }
}
