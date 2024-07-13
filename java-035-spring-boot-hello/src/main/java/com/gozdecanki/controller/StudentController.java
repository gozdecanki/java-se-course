package com.gozdecanki.controller;

import com.gozdecanki.model.Student;
import com.gozdecanki.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//   http://localhost:8090/api/v1

@RestController
@RequestMapping("/api/v1")
public class StudentController {


    // IoC - Kontrolü Spring'e ver.
    // DI - Bağımlılıkların enjeksiyonu.


    // Servis enjekte ediliyor. Eski
 /*
    @Autowired
    StudentService studentService;
*/
    // Servis enjekte ediliyor. Yeni
    // the StudentController has a dependency on a StudentService
    private final StudentService studentService;

    // a constructor so that the Spring container can inject a StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // GET

    //   http://127.0.0.1:8090/api/v1/hello
    //   http://localhost:8090/api/v1/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot - Student Controller ";
    }

    // API
    // GET  - SELECT ALL
    //   http://localhost:8090/api/v1/students              // v1
    //   http://localhost:8090/api/v1/student/all           // v2
    @GetMapping({"students", "/student/all"})
    public List<Student> getStudents() {
        return studentService.getStudents();
    }


    // GET  - SELECT WHERE
    //   http://localhost:8090/api/v1/student/1
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable (name = "id") Long id) {
        return studentService.getStudent(id);
    }


    // POST  - INSERT
    //   http://localhost:8090/api/v1/student
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return null;
    }

    // PUT - UPDATE
    //   http://localhost:8090/api/v1/student/1
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {

        Student studentInfo = studentService.getStudent(id);
        if(studentInfo==null)
            return null;
        studentInfo.setId(id);
        studentInfo.setFirstName(student.getFirstName());
        studentInfo.setLastName(student.getLastName());
        studentInfo.setEmail(student.getEmail());
        return studentService.updateStudent(studentInfo);
    }

    // DELETE - DELETE
    //   http://localhost:8090/api/v1/student/1
    @DeleteMapping ("/student/{id}")
    public String deleteStudent(@PathVariable Long id) {
         return studentService.deleteStudent(id);
    }

}