package com.Student.Notebook.Notebookserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Notebook.Entity.Note;
import com.Student.Notebook.Entity.NoteDto;
import com.Student.Notebook.Repository.NotesbookRepository;

@Service
public class  Notebookserviceimpl implements Notebookservice {

	@Autowired
	private NotesbookRepository notesbookrepository ;

	@Override
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		return notesbookrepository.getAllNotes();
				
	}

	@Override
	public Note getNoteById(Long id) {
		// TODO Auto-generated method stub
		return notesbookrepository.getById(id);
	}

	@Override
	public Note createNote(NoteDto noteDto) {
		// TODO Auto-generated method stub
		return notesbookrepository.createNote();
				
	}

	@Override
	public Note updateNote(Long id, NoteDto noteDto) {
		// TODO Auto-generated method stub
		return notesbookrepository.updateNote();
	}

	@Override
	public Note deleteNoteById(Long id) {
		// TODO Auto-generated method stub
		return notesbookrepository.deleteNoteById(id) ;
		
		
	}

	}



