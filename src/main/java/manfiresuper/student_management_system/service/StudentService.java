package manfiresuper.student_management_system.service;

import java.util.List;

import manfiresuper.student_management_system.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentId(Long id);

    Student editStudent(Student student);

    void deleteStudentId(Long id);
}
