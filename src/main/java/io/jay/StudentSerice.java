package io.jay;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentSerice {

	
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveSyudent(Student student){
		return this.studentRepository.save(student);
	}
	
}
