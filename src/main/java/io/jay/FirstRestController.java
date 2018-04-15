package io.jay;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstRestController {
	
	@Autowired
	StudentRepository studentRepository;

	@RequestMapping("/hello")
	public String sayHi(){
		return "Hello";
	}
	
	//@RequestMapping("/error")
	public String printError(){
		return "THis is due to some error occured";
	}
	
	@RequestMapping(value="/save", method= RequestMethod.POST)
	public void saveStudent(@RequestBody Student student){
		studentRepository.save(student);
		
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		List<Student> studentList = new ArrayList<Student>();
		this.studentRepository.findAll()
		.forEach(studentList::add);
		return studentList;
		
	}
	
	@RequestMapping(value="/get")
	public Student getStudent(String rollNo){
		return this.studentRepository.findOne(rollNo);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void updateStudent(@RequestBody Student student){
		this.studentRepository.save(student);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteStudent(String rollNo){
		this.studentRepository.delete(rollNo);
	}
}
