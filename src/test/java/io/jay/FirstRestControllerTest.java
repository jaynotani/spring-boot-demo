package io.jay;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

@DataJpaTest
public class FirstRestControllerTest {

	@Autowired
	StudentSerice studentService;
	
	@Test
	public void testSaveSyudent() {
		Student student = new Student();
		student.setName("Jay");
		student.setRollNo("29");
		Student returnObj = this.studentService.saveSyudent(student);
		assertEquals("Jay", returnObj.getName());
	}

}
