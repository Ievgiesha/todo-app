package com.homeexample.todoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NotBlank(message = "Project description must  not be null")
    private String description;

    @OneToMany(mappedBy = "project")
    private Set<TaskGroup> groups;

    public Set<ProjectStep> getSteps() {
        return steps;
    }

    public void setSteps(Set<ProjectStep> steps) {
        this.steps = steps;
    }

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "project")
    private Set<ProjectStep> steps;


    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public Set<TaskGroup> getGroups() {
        return groups;
    }

   public void setGroups(Set<TaskGroup> groups) {
        this.groups = groups;
    }

    public Set<TaskGroup> getTaskGroups() {
        return groups;
    }

    public void setTaskGroups(Set<TaskGroup> taskGroups) {
        this.groups = taskGroups;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ProjectStep> getProjectStep() {
        return steps;
    }

    public void setProjectStep(Set<ProjectStep> projectStep) {
        this.steps = projectStep;
    }
}
