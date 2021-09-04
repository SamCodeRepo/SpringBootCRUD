package pbs.internship.crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pbs.internship.crud.entity.Student;
import pbs.internship.crud.service.CrudService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class CrudController {

    @Autowired
    CrudService crudService;
    @GetMapping("/get/all")
    public List<Student> getAll(){
        return  crudService.getAll();

    }

    @PostMapping("/add")
    public String  add(@RequestBody Student std){
        return  crudService.add(std);}

    @PutMapping ("/update")
    public String  update(@RequestBody Student std){
        return  crudService.update(std);}

    @DeleteMapping ("/delete")
    public String  delete(@RequestParam int stdNo){
        return  crudService.delete(stdNo);}
}