package com.Student.Notebook.Notebookserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Student.Notebook.Repository.NotesbookRepository;

@Service
public class  Notebookserviceimpl implements Notebookservice {

	@Autowired
	private NotesbookRepository notesbookrepository ;
	
	
}
