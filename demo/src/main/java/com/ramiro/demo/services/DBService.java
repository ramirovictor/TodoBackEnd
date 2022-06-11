package com.ramiro.demo.services;

import com.ramiro.demo.domain.Todo;
import com.ramiro.demo.repositores.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void databaseInstance() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Todo t1 = new Todo(null, "Study Java", "Whole life", sdf.parse("25/07/2022"), false);
        Todo t2 = new Todo(null, "Read Java", "Every week", sdf.parse("22/07/2022"), true);
        Todo t3 = new Todo(null, "Practice code", "Forever", sdf.parse("21/07/2022"), false);
        Todo t4 = new Todo(null, "Listen to podcasts Java", "Everyday", sdf.parse("27/07/2022"), true);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

    }
}
