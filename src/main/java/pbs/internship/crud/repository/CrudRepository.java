package pbs.internship.crud.repository;

import pbs.internship.crud.entity.Student;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Repository
public class CrudRepository {
    public List<Student> student=new ArrayList<Student>();

    public List<Student> getAll() {
        return student;
    }


    public String add(Student std) {
        student.add(std);
        return "Successfully added";
    }

    public String update(Student std) {
        student.stream().filter(s -> s.getStudentId() ==std.getStudentId()).forEach(s -> {
          s.setAddress(std.getAddress());
          s.setName(std.getName());
        });
        return "Successfully Updated";
    }

    public String delete(int stdNo) {
        student.remove(stdNo-1);
        return "Successfully Deleted";
    }
}
