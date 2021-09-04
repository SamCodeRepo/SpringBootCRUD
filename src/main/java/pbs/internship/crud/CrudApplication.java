package pbs.internship.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pbs.internship.crud.entity.Student;
import pbs.internship.crud.repository.CrudRepository;

import java.util.Arrays;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	@Autowired
	CrudRepository crudRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student(1, "Mahdi Mohammadi","No.185 10th West St");
		Student student2=new Student(2, "Saeed Moghaddami","No.185 10th West St");
		crudRepository.student.addAll(Arrays.asList(student1,student2));
	}
}
