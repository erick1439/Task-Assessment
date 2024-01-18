package com.example.Task.Model;

import java.util.Date;

public class Task {

    private Long id;
    private String title;
    private String description;
    private boolean isCompleted;
    private Date createDate;
    private Date completionDate;

    public Task(Long id, String title, String description, boolean isCompleted, Date createDate, Date completionDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.createDate = createDate;
        this.completionDate = completionDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsCompleted() {
        return this.isCompleted;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.util.Date date) {
        this.createDate = date;
    }

    public Date getCompletionDate() {
        return this.completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }    
}
