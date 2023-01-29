package manfiresuper.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import manfiresuper.student_management_system.entity.Student;
import manfiresuper.student_management_system.repository.StudentRepository;

@SpringBootApplication //(exclude = {ErrorMvcAutoConfiguration.class})
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String...args) throws Exception {
		// Student student1 = new Student("M Shreyaskumar", "Sharma", "shreyaskumar.12010414@lpu.in");
		// studentRepository.save(student1);

		// Student student2 = new Student("Ekpreet", "Singh", "manfiresuper@gmail.com");
		// studentRepository.save(student2);

		// Student student3 = new Student("Rishsi", "Humper", "humpingdog@gmail.com");
		// studentRepository.save(student3);
	}

}
