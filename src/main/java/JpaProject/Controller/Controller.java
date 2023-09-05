package JpaProject.Controller;
import java.lang.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import JpaProject.Entity.employeeDet;
import JpaProject.Repo.Implentationclass;
import JpaProject.Repo.service;

@RestController
public class Controller {
		@Autowired
		service serve;
		
		@GetMapping("/test")
		public String show()
		{
			return "I am Good Girl!"; 
		}
			@GetMapping("/employee10")
		
		//get the course
	  public List<employeeDet> getnfo()
	  {

		 return this.serve.getdetails();
	  }
		//get particular course by id 
		@GetMapping("/employee10/{empid}")
		public employeeDet getInfo(@PathVariable long empid)
		{
			return this.serve.getDetails(empid);
		}
		//post the course
		@PostMapping("/employee10")
		public employeeDet addemploye(@RequestBody employeeDet empl)
		{
			 
			return this.serve.addemployee(empl);
		}
		//update course
		@PutMapping("/employee10")
		public employeeDet updateemployee(@RequestBody employeeDet employ)
		{ 
			return this.serve.updateemployee(employ);
		}
		//delete course
		@DeleteMapping("/employee10/{empid}")
		public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long empid)
		{
			try {
			this.serve.deleteemployee(empid);
			return new ResponseEntity<>(HttpStatus.OK);
		    }catch(Exception e)
			{
		    	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}

