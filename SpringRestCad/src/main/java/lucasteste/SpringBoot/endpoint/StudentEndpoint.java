package lucasteste.SpringBoot.endpoint;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lucasteste.SpringBoot.Error.CustomErrorType;
import lucasteste.SpringBoot.Util.DateUtil;
import lucasteste.SpringBoot.model.Student;

@RestController
@RequestMapping("students")
public class StudentEndpoint {
	 private final DateUtil dateUtil;

	    @Autowired
	    public StudentEndpoint(DateUtil dateUtil) {
	        this.dateUtil = dateUtil;
	    }

	    @RequestMapping(method = RequestMethod.GET)
	    public ResponseEntity<?> listAll() {
	        System.out.println("--------------" + dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
	        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
	    }
	    @GetMapping(path = "/{id}")
	    public ResponseEntity<?> getStudentByID(@PathVariable("id") int id) {
	        Student student = new Student();
	        student.setId(id);
	        int index = Student.studentList.indexOf(student);
	        if(index == -1)
	            return new ResponseEntity<>(new CustomErrorType("Student not Found"), HttpStatus.NOT_FOUND);
	        return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);
	    }

	    @PostMapping
	    public ResponseEntity<?> save(@RequestBody Student student) {
	        Student.studentList.add(student);
	        return new ResponseEntity<>("Conta criada com sucesso!" + student, HttpStatus.OK);
	    }

	     @DeleteMapping
	        public ResponseEntity<?> delete(@RequestBody Student student){
	            Student.studentList.remove(student);
	            return new ResponseEntity<>(HttpStatus.OK);
	    }

	    // Comando para fazer um update
	    @PutMapping
	    public ResponseEntity<?> update(@RequestBody Student student){
	        Student.studentList.remove(student);
	        Student.studentList.add(student);
	        return new ResponseEntity<>(HttpStatus.OK);

	    }
}
