package pbs.internship.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import pbs.internship.crud.entity.Student;
import pbs.internship.crud.repository.CrudRepository;

import java.util.List;
@org.springframework.stereotype.Service
public class CrudService {

    @Autowired
    CrudRepository crudRepository;
    public List<Student> getAll() {
        return  crudRepository.getAll();
    }


    public String add(Student std) {
        return crudRepository.add(std);
    }

    public String update(Student std) {
        return crudRepository.update(std);
    }

    public String delete(int stdNo) {
        return crudRepository.delete(stdNo);
    }
}

