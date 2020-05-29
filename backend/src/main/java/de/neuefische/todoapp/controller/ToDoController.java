package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.data.Description;
import de.neuefische.todoapp.enums.Status;
import de.neuefische.todoapp.model.ToDoItem;
import de.neuefische.todoapp.service.ToDoNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("api/todo")
public class ToDoController {

    private final ToDoNoteService toDoNoteService;

    @Autowired
    public ToDoController(ToDoNoteService toDoNoteService){
        this.toDoNoteService = toDoNoteService;
    }

    @GetMapping
    public List<ToDoItem> getToDos(){

       /* List<ToDoItem> listOfToDos = new ArrayList<>();
        listOfToDos.add(new ToDoItem("1", "How are you?", Status.OPEN));
        listOfToDos.add(new ToDoItem("2", "How are you doing?", Status.IN_PROGRESS));
        listOfToDos.add(new ToDoItem("3", "How was it done?", Status.DONE));
       */

        return toDoNoteService.getAllNotes();
    }

    @PutMapping
    public ToDoItem addANote(@RequestBody Description description){
        return toDoNoteService.addNote(description);
    }
}
