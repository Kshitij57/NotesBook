package com.Student.Notebook.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.Notebook.Entity.Note;


public interface NotesbookRepository extends JpaRepository<Note, Long> {

	List<Note> getAllNotes();
    // Additional custom queries can be added if needed

	Note createNote();

	Note deleteNote();

	Note updateNote();

	Note deleteNoteById(Long id);


}

