package com.Student.Notebook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.Notebook.Entity.Note;
import com.Student.Notebook.Entity.User;


public interface NotesbookRepository extends JpaRepository<Note, Long> {
    // Additional custom queries can be added if needed
}

