package de.neuefische.todoapp.service;

import de.neuefische.todoapp.data.Description;
import de.neuefische.todoapp.db.ToDoNoteDb;
import de.neuefische.todoapp.enums.Status;
import de.neuefische.todoapp.model.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ToDoNoteService {

    public final ToDoNoteDb toDoNotes;

    @Autowired
    public ToDoNoteService(ToDoNoteDb toDoNotes){
        this.toDoNotes = toDoNotes;

    }

    public List<ToDoItem> getAllNotes(){
        return toDoNotes.getAllNotes();

    }

    public ToDoItem addNote(Description description){

        String uuid = UUID.randomUUID().toString();
        String message = description.getDescription();
        ToDoItem newNote = new ToDoItem(uuid, message, Status.OPEN);
        return toDoNotes.addNotetoDb(newNote);
    }

}
