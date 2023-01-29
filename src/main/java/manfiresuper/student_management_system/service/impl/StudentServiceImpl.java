package manfiresuper.student_management_system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import manfiresuper.student_management_system.entity.Student;
import manfiresuper.student_management_system.repository.StudentRepository;
import manfiresuper.student_management_system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentId(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentId(Long id) {
        studentRepository.deleteById(id);
    }
    
}
