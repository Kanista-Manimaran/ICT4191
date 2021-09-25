package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Produces;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Department;
import lk.ac.vau.Repo.DeparmentRepo;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/Department")
@Produces(MediaType.APPLICATION_XML)


public class DeparmentController {

	DeparmentRepo cont;
	
	public List<Department> getAll(){
		return cont.findAll();
	
	}
	
	@GetMapping("/{Id}")
	public Department get(@PathVariable("Id") String Id) {
		return cont.findById(Id).get();
	
	}
	
	@PostMapping
	public void add(@RequestBody Department dept) {
		cont.save(dept);
	
	}
	
	@PutMapping
	public void update(@PathVariable("Id") String Id) {
		cont.deleteById(Id);
	
	}
	
	@DeleteMapping("{Id}")
	public void dlete(@RequestBody Department dept) {
		cont.save(dept);
	
	}
	
	
	
	
	
	
}
