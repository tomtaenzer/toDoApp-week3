package de.neuefische.todoapp.model;


import de.neuefische.todoapp.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoItem {

    private String id;
    private String description;
    private Status status;


}
