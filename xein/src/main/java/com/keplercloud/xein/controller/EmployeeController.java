package com.keplercloud.xein.controller;

import com.keplercloud.xein.model.Employee;
import com.keplercloud.xein.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MHS DILSHAN
 */

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeRepository controller;

    @GetMapping("/")
    public List<Employee> getAll(){
        return controller.findAll();
    }

    @PostMapping("/add")
    public Employee addEmp(@RequestBody Employee e){
        return controller.save(e);
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable int id){
        return controller.getOne(id);
    }

    @GetMapping("/delete/{id}")
    public Employee delete(@PathVariable int id){
        Employee e =controller.getOne(id);
         controller.delete(e);
         return e;
    }



}
