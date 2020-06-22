package com.homeexample.todoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name="project_steps")
public class ProjectStep {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @NotBlank(message = "ProjectStep description must  not be null")
    private String description;
    private int daysToDeadline;

    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

     void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDaysToDeadline(int daysToDeadline) {
        this.daysToDeadline = daysToDeadline;
    }

    public void setProjects(Project projects) {
        this.project = projects;
    }

    public int getDaysToDeadline() {
        return daysToDeadline;
    }

    public Project getProjects() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
