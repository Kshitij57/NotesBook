package com.Student.Notebook.Entity;

public class NoteDto {

    private String title;
    private String content;

    // Constructors, getters, and setters

    public NoteDto() {
        // Default constructor
    }

    public NoteDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

