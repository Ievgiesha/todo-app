package com.homeexample.todoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

//@Inheritance(InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "task_groups")
public class TaskGroup {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @NotBlank(message = "Task group's description must  not be null")
    private String description;
    private boolean done;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "group")
    private Set<Task> tasks;
    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

   public TaskGroup() {
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Set<Task> getTasks() {
        return tasks;
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

   /* public void updateFrom(final TaskGroup sourse) {
        description = sourse.description;
        done = sourse.done;
    }*/


}
