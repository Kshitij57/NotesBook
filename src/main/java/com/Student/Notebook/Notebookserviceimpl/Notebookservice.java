package com.Student.Notebook.Notebookserviceimpl;

import java.util.List;

import com.Student.Notebook.Entity.Note;
import com.Student.Notebook.Entity.NoteDto;

public interface Notebookservice {

	 List<Note> getAllNotes();

	    Note getNoteById(Long id);

	    Note createNote(NoteDto noteDto);

	    Note updateNote(Long id, NoteDto noteDto);

	    Note deleteNoteById(Long id);
}
