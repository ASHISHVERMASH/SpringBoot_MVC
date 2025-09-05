package com.VermaAshish.MVC.controllers;

import com.VermaAshish.MVC.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    /*@GetMapping(path = "/getSecretMessages")
    public String getMySuperSecretMessages() {
        return "secret messages: ";
    }*/

    @GetMapping("/{employeeId}")
    public EmployeeDTO  getEmployeeById(@PathVariable Long employeeId) {
        return new EmployeeDTO(employeeId ,"ashish" , "ashu@gmail.com" ,27 , LocalDate.of(2025,07,25),true );
    }

    // for Getting
    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortBy) {
        return "hello " + age+sortBy;
    }

    //for Creating
   /* @PostMapping
    public String createNewEmployee() {
        return "Hello From Developers Team";
    }*/

    @PostMapping
    public EmployeeDTO createNewEmployees(@RequestBody EmployeeDTO inputEmployee) {
       inputEmployee.setId(154L);
       return inputEmployee;
    }

    // for updating
    @PutMapping String updateEmployeeById() {
        return "Hello from Galaxy";
    }


}
