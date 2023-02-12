package com.example.universityeventmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.universityeventmanagement.model.Student;



@Service
public class StudentService {
    
    
        private static final  List<Student> students=new ArrayList<>();
        private static int id=0;
        
        static {
            Student s1=new Student(++id,"Bhargav","Kanzariya",23,"IC");
            students.add(s1);
            Student s2=new Student(++id,"Jay","Patel",23,"EC");
            students.add(s2);
            Student s3=new Student(++id,"Trishir","Patel",23,"Civil");
            students.add(s3);
            Student s4=new Student(++id,"Ajay","Jadeja",23,"EC");
            students.add(s4);
            Student s5=new Student(++id,"Karan","Parekh",25,"IT");
            students.add(s5);
            Student s6=new Student(++id,"Arun","Menon",22,"IC");
            students.add(s6);
        
            
        }
    
        public List<Student> findAll() {
        
            return students;
        }
        public static Student findStudent(int StudentId) {
            for(Student student : students) {
                if(student.getStudentId()==StudentId) {
                    return student;
                }
            }
            return null;
        }
        public static void addUser(Student UserDetails) {
			students.add(UserDetails);
			
		}

		public static void deleteById(int UserId) {
			students.remove(UserId);
			
		}

		public static void updateById(int UserId, Student user1) {
		
			Student userUpdate=findStudent(UserId);

			userUpdate.setFirstname(user1.getFirstname());
			userUpdate.setLastname(user1.getLastname());
			userUpdate.setAge(user1.getAge());
			userUpdate.setDepartment(user1.getDepartment());
			
		}
}
