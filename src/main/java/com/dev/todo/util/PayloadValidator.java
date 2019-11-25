package com.dev.todo.util;

import com.dev.todo.model.ToDo;

public class PayloadValidator {

    public static boolean validateCreatePayload(ToDo toDo){
        if (toDo.getId() > 0){
            return false;
        }
        return true;
    }
}
