package com.example.universityeventmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.universityeventmanagement.model.Student;
import com.example.universityeventmanagement.service.StudentService;




@RestController
@RequestMapping("/api/v2")
public class StudentController {
    
    @Autowired
	private StudentService service;

    @GetMapping("/find-all")
	public List<Student> findAll() {
		return service.findAll();
		
	}
	
	@GetMapping("/find-student/StudentId/{id}")
	public Student findStudnet(@PathVariable int id) {
		return StudentService.findStudent(id);
		
	}
    @PostMapping("add-Student")
	 public void addRestaurant(Student UserDetails) {
		 
        StudentService.addUser(UserDetails);
	}

    @PutMapping("update-Student/{id}")
    public void updateTodo(@PathVariable int userid, @RequestBody Student user) {
        StudentService.updateById(userid,user);
    }

    @DeleteMapping("/delete/{StudentId}")
	    public void deleteTodo(@PathVariable int RestaurantId) {
            StudentService.deleteById(RestaurantId);
	}
}
