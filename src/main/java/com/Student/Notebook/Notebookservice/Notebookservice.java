package com.Student.Notebook.Notebookservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Notebook.Entity.Note;
import com.Student.Notebook.Entity.NoteDto;
import com.Student.Notebook.Repository.NotesbookRepository;

import java.util.List;

@Service
public class Notebookservice {

    private final NotesbookRepository notesbookRepository;

    @Autowired
    public Notebookservice(NotesbookRepository notesbookRepository) {
        this.notesbookRepository = notesbookRepository;
    }

    public List<Note> getAllNotes() {
        return notesbookRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return notesbookRepository.findById(id).orElse(null);
    }

    public Note createNote(NoteDto noteDto) {
        Note note = new Note();
        note.setTitle(noteDto.getTitle());
        note.setContent(noteDto.getContent());
        return notesbookRepository.save(note);
    }

    public Note updateNote(Long id, NoteDto noteDto) {
        Note existingNote = notesbookRepository.findById(id).orElse(null);
        if (existingNote != null) {
            existingNote.setTitle(noteDto.getTitle());
            existingNote.setContent(noteDto.getContent());
            return notesbookRepository.save(existingNote);
        } else {
            return null;
        }
    }

    public boolean deleteNote(Long id) {
        if (notesbookRepository.existsById(id)) {
            notesbookRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
