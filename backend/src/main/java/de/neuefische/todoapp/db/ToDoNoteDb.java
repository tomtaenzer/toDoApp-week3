package de.neuefische.todoapp.db;

import de.neuefische.todoapp.enums.Status;
import de.neuefische.todoapp.model.ToDoItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoNoteDb {

    List<ToDoItem> toDoNoteList = new ArrayList<>(List.of(new ToDoItem("4", "Moin", Status.OPEN)));

    public List<ToDoItem> getAllNotes(){
        return toDoNoteList;
    }

    public ToDoItem addNotetoDb(ToDoItem toDo ){
        toDoNoteList.add(toDo);
        return toDo;

    }

    public void clearDb(){
        toDoNoteList.clear();
    }
}
