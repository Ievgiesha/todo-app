package com.homeexample.todoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

//@Inheritance(InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "tasks")
public class Task {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @NotBlank(message = "Task description must  not be null")
    private String description;
    private boolean done;
    private LocalDateTime deadline;
    @Embedded
    private Audit audit = new Audit();

    @ManyToOne
    @JoinColumn(name="task_group_id")
    private TaskGroup group;



    Task() {
    }
    public Task(String description, LocalDateTime deadline) {
        this.description = description;
        this.deadline = deadline;
    }

    public TaskGroup getGroup() {
        return group;
    }

    public void setGroup(TaskGroup group) {
        this.group = group;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void updateFrom(final Task sourse) {
        description = sourse.description;
        done = sourse.done;
        deadline = sourse.deadline;
        group = sourse.group;
    }


}
